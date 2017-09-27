package br.com.thiagogarcez.conversordemoeda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import br.com.thiagogarcez.conversordemoeda.adapter.RateAdapter;
import br.com.thiagogarcez.conversordemoeda.api.ClientCurrencyAPI;
import br.com.thiagogarcez.conversordemoeda.listener.RateListener;
import br.com.thiagogarcez.conversordemoeda.model.Currency;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements RateListener{

    @BindView(R.id.textTitle)
    TextView textTitle;
    @BindView(R.id.rcvRates)
    RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setupList();
    }

    private void setupList() {
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Currency();

    }

    private void Currency() {

        ClientCurrencyAPI.getInstance().api.listCurrency().enqueue(new Callback<Currency>() {
            @Override
            public void onResponse(Call<Currency> call, Response<Currency> response) {
                if (!response.isSuccessful()) {
                    Log.e("Erro: ", response.message());
                    Toast.makeText(getApplicationContext(),"Verifique sua internet.",Toast.LENGTH_LONG).show();
                } else {
                    Currency m = response.body();
                    //textView.setText(m.rates.toString());

                    recyclerView.setLayoutManager(layoutManager);
                    adapter = new RateAdapter(m.rates.getListRate(), MainActivity.this);
                    recyclerView.setAdapter(adapter);

                    //Toast.makeText(getApplicationContext(),m.rates.toString(),Toast.LENGTH_LONG).show();

                }
            }

            @Override
            public void onFailure(Call<Currency> call, Throwable t) {
                Log.e( "Erro: " , t.getMessage());
                Toast.makeText(getApplicationContext(),"Conexao falhou",Toast.LENGTH_LONG).show();

            }
        });
    }

    @Override
    public void onItemClick(String name, String value) {
        Intent calculadorActivity = new Intent(this, CalculatorActivity.class);
        calculadorActivity.putExtra("name" ,name);
        calculadorActivity.putExtra("value" ,value);
        startActivity(calculadorActivity);
    }
}
