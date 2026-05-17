package com.example.mumuk.data.model.userinfo

import com.google.gson.annotations.SerializedName

data class PatchUserInfoResponse(
    @SerializedName("status") val status: String,
    @SerializedName("code") val code: String,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: UserInfoData?
) {
    data class UserInfoData(
        @SerializedName("gender") val gender: String?,
        @SerializedName("height") val height: Int?,
        @SerializedName("weight") val weight: Int?
    )
}