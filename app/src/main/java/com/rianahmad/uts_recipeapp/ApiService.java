package com.rianahmad.uts_recipeapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("search.php")
    Call<RecipeResponse> getRecipes(@Query("s") String query);
}

