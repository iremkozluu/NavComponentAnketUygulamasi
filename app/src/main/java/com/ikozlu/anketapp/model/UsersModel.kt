package com.ikozlu.anketapp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UsersModel(
    val nameSurname:String,
    val email:String,
    val phone:Number
):Parcelable
