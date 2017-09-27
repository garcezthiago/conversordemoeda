package br.com.thiagogarcez.conversordemoeda;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CalculatorActivity extends AppCompatActivity {

    private String name;
    private String value;

    @BindView(R.id.editText)
    EditText editText;
    @BindView(R.id.textTax)
    TextView textTax;
    @BindView(R.id.buttonCalculator)
    Button buttonCalculator;
    @BindView(R.id.textResult)
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        value = intent.getStringExtra("value");

        textTax.setText(name + " = " + value);

        buttonCalculator.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Calculator();
            }
        });

    }

    private void Calculator(){
        Double number = Double.parseDouble(editText.getText().toString());
        Double tax = Double.parseDouble(value);
        Double result = number * tax;
        String texto = String.format("Total: %.2f", result);
        textResult.setText(texto);

        ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE))
                .hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public void BackMainActivity(View view){
        finish();
    }





}
