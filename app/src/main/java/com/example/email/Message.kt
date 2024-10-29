package com.example.email

// Message.kt
data class Message(
    val sender: String,
    val subject: String,
    val time: String,
    val isStarred: Boolean
)
