package com.example.mumuk.data.repository

import android.content.Context
import com.example.mumuk.data.api.RetrofitClient
import com.example.mumuk.data.model.userinfo.PatchUserInfoRequest
import com.example.mumuk.data.model.userinfo.PatchUserInfoResponse
import retrofit2.Call

class UserInfoRepository(context: Context) {
    private val userInfoApiService = RetrofitClient.getUserInfoApi(context)

    fun patchUserInfo(request: PatchUserInfoRequest): Call<PatchUserInfoResponse> {
        return userInfoApiService.patchUserInfo(request)
    }

    fun getUserInfo(): Call<PatchUserInfoResponse> {
        return userInfoApiService.getUserInfo()
    }
}
