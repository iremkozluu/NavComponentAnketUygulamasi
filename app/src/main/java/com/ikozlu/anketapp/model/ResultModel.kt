package com.ikozlu.anketapp.model

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class ResultModel (
    val user: UsersModel,
    val age:Int,
    val height:Float,
    val weight:Int,
    val water:String,
    val step:Int

):Parcelable
