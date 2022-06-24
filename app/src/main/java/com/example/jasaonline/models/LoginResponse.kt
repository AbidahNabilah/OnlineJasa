package com.example.jasaonline.models

import android.os.Message

data class LoginResponse(
    val message: String,
    val error: Boolean,
    val data: User
)