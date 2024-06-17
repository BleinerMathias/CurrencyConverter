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
        "x-rapidapi-key: c41b657a7fmsh2e68703716b0594p1ac981jsn96a08f2cc0be"
    )
    @GET("list")
    fun getCurrencyList(): Call<CurrencyList> // Realiza a chamada para obter a lista de moedas (assincrona)

    @Headers(
        "x-rapidapi-host: currency-converter5.p.rapidapi.com",
        "x-rapidapi-key: c41b657a7fmsh2e68703716b0594p1ac981jsn96a08f2cc0be"
    )
    @GET("convert")
    fun convertCurrency(
        @Query("from") from: String,
        @Query("to") to: String,
        @Query("amount") amount: String
    ): Call<ConversionResult>


}