package devpaul.business.empresaexample.network;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRecomendaciones {
    @GET("mostrarTodo")
    Call<recomendaciones> getRecomendaciones();
}
