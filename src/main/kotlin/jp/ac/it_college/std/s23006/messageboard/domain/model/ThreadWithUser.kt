package jp.ac.it_college.std.s23006.messageboard.domain.model

import kotlinx.datetime.LocalDateTime

data class ThreadWithUser(
    val id: Long,
    val title: String,
    val user: User,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
)