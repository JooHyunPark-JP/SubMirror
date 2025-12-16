package com.example.submirror.subMirrorMainFunction.subscrption.Data

import androidx.room.PrimaryKey

data class SubscriptionEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = 0L,
)