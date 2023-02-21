package interfaces

import com.example.retrofit.model
import okhttp3.Response
import retrofit2.Call
import retrofit2.http.GET
interface ApiInterface {

    @GET( "/photos")
     fun getQuotes() : Call<List<model>>

}