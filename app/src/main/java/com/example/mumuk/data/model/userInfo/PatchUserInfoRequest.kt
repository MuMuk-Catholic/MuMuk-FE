package com.example.mumuk.data.model.userinfo

import com.google.gson.annotations.SerializedName

data class PatchUserInfoRequest(
    @SerializedName("gender") val gender: String?,
    @SerializedName("height") val height: Int?,
    @SerializedName("weight") val weight: Int?
)