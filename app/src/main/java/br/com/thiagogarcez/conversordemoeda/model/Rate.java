package br.com.thiagogarcez.conversordemoeda.model;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by garcez on 23/09/17.
 */

public class Rate {
    @SerializedName("AUD")
    public String aud;
    @SerializedName("BGN")
    public String bgn;
    @SerializedName("CAD")
    public String cad;
    @SerializedName("CHF")
    public String chf;
    @SerializedName("CNY")
    public String cny;
    @SerializedName("CZK")
    public String czk;
    @SerializedName("DKK")
    public String dkk;
    @SerializedName("GBP")
    public String gbp;
    @SerializedName("HKD")
    public String hkd;
    @SerializedName("HRK")
    public String hrk;
    @SerializedName("HUF")
    public String huf;
    @SerializedName("IDR")
    public String idr;
    @SerializedName("ILS")
    public String ils;
    @SerializedName("INR")
    public String inr;
    @SerializedName("JPY")
    public String jpy;
    @SerializedName("KRW")
    public String krw;
    @SerializedName("MXN")
    public String mxn;
    @SerializedName("MYR")
    public String myr;
    @SerializedName("NOK")
    public String nok;
    @SerializedName("NZD")
    public String nzd;
    @SerializedName("PHP")
    public String php;
    @SerializedName("PLN")
    public String pln;
    @SerializedName("RON")
    public String ron;
    @SerializedName("RUB")
    public String rub;
    @SerializedName("SEK")
    public String sek;
    @SerializedName("SGD")
    public String sgd;
    @SerializedName("THB")
    public String thb;
    @SerializedName("TRY")
    public String tryCoin;
    @SerializedName("USD")
    public String usd;
    @SerializedName("ZAR")
    public String zar;
    @SerializedName("EUR")
    public String eur;

    @Override
    public String toString() {
        return "Rate{" +
                "aud='" + aud + '\'' +
                ", bgn='" + bgn + '\'' +
                ", cad='" + cad + '\'' +
                ", chf='" + chf + '\'' +
                ", cny='" + cny + '\'' +
                ", czk='" + czk + '\'' +
                ", dkk='" + dkk + '\'' +
                ", gbp='" + gbp + '\'' +
                ", hkd='" + hkd + '\'' +
                ", hrk='" + hrk + '\'' +
                ", huf='" + huf + '\'' +
                ", idr='" + idr + '\'' +
                ", ils='" + ils + '\'' +
                ", inr='" + inr + '\'' +
                ", jpy='" + jpy + '\'' +
                ", krw='" + krw + '\'' +
                ", mxn='" + mxn + '\'' +
                ", myr='" + myr + '\'' +
                ", nok='" + nok + '\'' +
                ", nzd='" + nzd + '\'' +
                ", php='" + php + '\'' +
                ", pln='" + pln + '\'' +
                ", ron='" + ron + '\'' +
                ", rub='" + rub + '\'' +
                ", sek='" + sek + '\'' +
                ", sgd='" + sgd + '\'' +
                ", thb='" + thb + '\'' +
                ", tryCoin='" + tryCoin + '\'' +
                ", usd='" + usd + '\'' +
                ", zar='" + zar + '\'' +
                ", eur='" + eur + '\'' +
                '}';
    }

    public Map<String, String> getListRate() {
        Map<String,String> mapRate=new HashMap<String,String>();
        mapRate.put("aud", aud );
        mapRate.put("bgn",bgn );
        mapRate.put("cad",cad );
        mapRate.put("chf",chf );
        mapRate.put("cny",cny );
        mapRate.put("czk",czk );
        mapRate.put("dkk",dkk );
        mapRate.put("gbp",gbp );
        mapRate.put("hkd",hkd );
        mapRate.put("hrk",hrk );
        mapRate.put("huf",huf );
        mapRate.put("idr",idr );
        mapRate.put("ils",ils );
        mapRate.put("inr",inr );
        mapRate.put("jpy",jpy );
        mapRate.put("krw", krw );
        mapRate.put("mxn", mxn );
        mapRate.put("myr", myr );
        mapRate.put("nok", nok );
        mapRate.put("nzd", nzd );
        mapRate.put("php", php );
        mapRate.put("pln", pln );
        mapRate.put("ron", ron );
        mapRate.put("rub", rub );
        mapRate.put("sek", sek );
        mapRate.put("sgd", sgd );
        mapRate.put("thb", thb );
        mapRate.put("tryCoin", tryCoin );
        mapRate.put("usd", usd );
        mapRate.put("zar", zar );
        mapRate.put("eur", eur );
        return mapRate;
    }

}
