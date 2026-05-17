package com.example.mumuk.data.model.health

import com.google.gson.annotations.SerializedName

data class ToggleHealthGoalRequest(
    @SerializedName("healthGoalTypeList") val healthGoalTypeList: List<String>
)