package com.example.openaiapichatbot.response

data class MessageRequest(
    val model: String,
    val max_tokens: Int,
    val messages: List<Message>
)