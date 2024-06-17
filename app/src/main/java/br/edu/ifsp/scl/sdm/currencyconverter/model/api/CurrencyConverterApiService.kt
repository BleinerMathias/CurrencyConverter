package br.edu.ifsp.scl.sdm.currencyconverter.model.api

import br.edu.ifsp.scl.sdm.currencyconverter.model.domain.ConversionResult
import br.edu.ifsp.scl.sdm.currencyconverter.model.domain.CurrencyList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface CurrencyConverterApiService {

    @Headers(
        "x-rapidapi-host: currency-converter5.p.rapidapi.com",
        "x-rapidapi-key: 31677dd32cmsha0c2b6ef9d2f51bp185cc2jsn473bd24418c2"
    )
    @GET("list")
    fun getCurrencyList(): Call<CurrencyList> // Realiza a chamada para obter a lista de moedas (assincrona)

    @Headers(
        "x-rapidapi-host: currency-converter5.p.rapidapi.com",
        "x-rapidapi-key: 31677dd32cmsha0c2b6ef9d2f51bp185cc2jsn473bd24418c2"
    )
    @GET("convert")
    fun convertCurrency(
        @Query("from") from: String,
        @Query("to") to: String,
        @Query("amount") amount: Double
    ): Call<ConversionResult>


}