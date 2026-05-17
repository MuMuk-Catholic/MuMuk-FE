package com.example.mumuk.data.repository

import android.content.Context
import com.example.mumuk.data.api.RetrofitClient
import com.example.mumuk.data.model.allergy.AllergyOptionsResponse
import com.example.mumuk.data.model.allergy.ToggleAllergyRequest
import com.example.mumuk.data.model.allergy.ToggleAllergyResponse
import retrofit2.Call

class AllergyRepository(context: Context) {
    private val allergyApiService = RetrofitClient.getAllergyApi(context)

    fun getAllergyOptions(): Call<AllergyOptionsResponse> {
        return allergyApiService.getAllergyOptions()
    }

    fun toggleAllergies(req: ToggleAllergyRequest): Call<ToggleAllergyResponse> {
        return allergyApiService.toggleAllergies(req)
    }
}
