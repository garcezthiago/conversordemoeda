package br.com.thiagogarcez.conversordemoeda.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Map;

import br.com.thiagogarcez.conversordemoeda.R;
import br.com.thiagogarcez.conversordemoeda.listener.RateListener;
import butterknife.ButterKnife;

/**
 * Created by garcez on 24/09/17.
 */

public class RateAdapter extends RecyclerView.Adapter<RateViewHolder> {
    private Map<String, String> mapRate;
    private RateListener rateListener;


    public RateAdapter(Map<String, String> rate, RateListener rateListener) {
        this.mapRate = rate;
        this.rateListener = rateListener;
    }

    @Override
    public RateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rate_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        return  new RateViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RateViewHolder holder, int position) {
        String key = (String) mapRate.keySet().toArray()[position];
        String value = (String) mapRate.values().toArray()[position];

        holder.bind(key, value, rateListener);
    }

    @Override
    public int getItemCount() {
        return mapRate != null ? mapRate.size() : 0;
    }
}

 class RateViewHolder extends RecyclerView.ViewHolder {
    final TextView textDescription;
    final TextView textValue;

    public RateViewHolder(View v) {
        super(v);

        textDescription = (TextView) v.findViewById(R.id.textDescription);
        textValue = (TextView) v.findViewById(R.id.textValue);
    }

    public void bind(String key, String value, final RateListener rateListener){
        textDescription.setText(key.toUpperCase());
        textValue.setText(value);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rateListener.onItemClick(
                        textDescription.getText().toString(),
                        textValue.getText().toString());
            }
        });
    }

}
