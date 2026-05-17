package com.example.mumuk.data.model.health

import com.google.gson.annotations.SerializedName

data class HealthGoal(
    @SerializedName("healthGoalType") val healthGoalType: String
)