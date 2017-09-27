package br.com.thiagogarcez.conversordemoeda.api;

import br.com.thiagogarcez.conversordemoeda.model.Currency;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by garcez on 23/09/17.
 */

public interface CurrencyAPI {

    public static final String BASE_URL = "http://api.fixer.io/";

    @GET("latest?base=BRL")
    Call<Currency> listCurrency();
}
