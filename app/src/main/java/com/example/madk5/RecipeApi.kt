package com.example.madk5

import retrofit2.http.GET
import retrofit2.http.Query

interface RecipeApi {
    @GET("recipes")
    suspend fun getRecipes(
        @Query("limit") limit: Int,
    ): RecipeResponse
}