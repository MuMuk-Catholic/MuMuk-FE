package com.example.mumuk.data.model.allergy

import com.google.gson.annotations.SerializedName

data class ToggleAllergyResult(
    @SerializedName("allergyType") val allergyType: String,
    @SerializedName("action") val action: String
)

data class ToggleAllergyResponseData(
    @SerializedName("allergyOptions") val allergyOptions: List<AllergyOption>
)

data class ToggleAllergyResponse(
    @SerializedName("status") val status: String,
    @SerializedName("code") val code: String,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: ToggleAllergyResponseData
)