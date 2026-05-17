package com.example.mumuk.data.model.health

import com.google.gson.annotations.SerializedName

data class ToggleHealthGoalResponseData(
    @SerializedName("healthGoalList") val healthGoalList: List<HealthGoal>
)

data class ToggleHealthGoalResponse(
    @SerializedName("status") val status: String,
    @SerializedName("code") val code: String,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: ToggleHealthGoalResponseData
)