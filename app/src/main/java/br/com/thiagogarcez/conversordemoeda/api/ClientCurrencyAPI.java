package br.com.thiagogarcez.conversordemoeda.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by garcez on 26/09/17.
 */

public class ClientCurrencyAPI {
    private static ClientCurrencyAPI clientAPI;
    public CurrencyAPI api;

    public ClientCurrencyAPI() {
        api = new Retrofit.Builder()
                .baseUrl(CurrencyAPI.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(CurrencyAPI.class);

    }

    public static ClientCurrencyAPI getInstance() {
        if(clientAPI == null)
            clientAPI = new ClientCurrencyAPI();
        return clientAPI;
    }


}
