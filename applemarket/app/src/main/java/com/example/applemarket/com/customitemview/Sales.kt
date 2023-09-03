package com.example.applemarket.com.customitemview

import android.os.Parcelable

@Parcelize
data class Sales(
    val Image: Int,
    val ItemTitle: String,
    val ItemDetail: String,
    val SellerName: String,
    val Price: Int,
    val Address: String,
    var InterestCnt: Int,
    val ChatCnt: Int,
    var isLike: Boolean
)  : Parcelable

annotation class Parcelize
