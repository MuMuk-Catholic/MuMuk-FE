package com.example.mumuk.data.repository

import android.content.Context
import com.example.mumuk.data.api.RetrofitClient
import com.example.mumuk.data.model.health.HealthGoalsResponse
import com.example.mumuk.data.model.health.ToggleHealthGoalRequest
import com.example.mumuk.data.model.health.ToggleHealthGoalResponse
import retrofit2.Call

class HealthRepository(context: Context) {
    private val healthApiService = RetrofitClient.getHealthApi(context)

    fun getHealthGoals(): Call<HealthGoalsResponse> {
        return healthApiService.getHealthGoals()
    }

    fun toggleHealthGoals(req: ToggleHealthGoalRequest): Call<ToggleHealthGoalResponse> {
        return healthApiService.toggleHealthGoals(req)
    }
}
