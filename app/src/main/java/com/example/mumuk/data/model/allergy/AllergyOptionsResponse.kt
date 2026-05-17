package com.example.mumuk.data.model.allergy

import com.google.gson.annotations.SerializedName

data class AllergyOptionsResponseData(
    @SerializedName("allergyOptions") val allergyOptions: List<AllergyOption>
)

data class AllergyOptionsResponse(
    @SerializedName("status") val status: String,
    @SerializedName("code") val code: String,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: AllergyOptionsResponseData
)