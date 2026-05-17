package com.example.mumuk.data.model.allergy

import com.google.gson.annotations.SerializedName

data class AllergyOption(
    @SerializedName("id") val id: Int,
    @SerializedName("allergyType") val allergyType: String
)