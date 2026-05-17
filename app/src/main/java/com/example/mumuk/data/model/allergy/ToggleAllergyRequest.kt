package com.example.mumuk.data.model.allergy

import com.google.gson.annotations.SerializedName

data class ToggleAllergyRequest(
    @SerializedName("allergyTypeList") val allergyTypeList: List<String>
)