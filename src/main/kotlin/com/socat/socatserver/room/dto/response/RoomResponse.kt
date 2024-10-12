package com.socat.socatserver.room.dto.response

import java.time.LocalDateTime

data class RoomResponse(
    val roomId: String,
    val roomName: String,
    val createdAt: LocalDateTime
)