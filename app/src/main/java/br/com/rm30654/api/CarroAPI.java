package br.com.rm30654.api;

/**
 * Created by rm30654 on 19/10/2016.
 */

import java.util.List;

import br.com.rm30654.model.Carro;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CarroAPI {
    @GET("/carros/tipo/{tipo}")
    Call<List<Carro>> findBy(@Path("tipo") String tags);
}