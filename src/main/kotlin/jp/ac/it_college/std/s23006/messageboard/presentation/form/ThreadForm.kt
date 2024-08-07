package jp.ac.it_college.std.s23006.messageboard.presentation.form

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable
import jp.ac.it_college.std.s23006.messageboard.domain.model.Thread

@Serializable
data class GetThreadListResponse(val threadsList: List<ThreadInfo>)

@Serializable
data class ThreadInfo(
    val id: Long,
    val title: String,
    val createdAt: LocalDateTime
) {
    constructor(model: Thread) : this(model.id, model.title, model.createdAt)
}

@Serializable
data class PostThreadRequest(
    val title: String,
    val message: String,
)

@Serializable
data class CreatedThreadResponse(
    val id: Long
)

@Serializable
data class PutThreadUpdateRequest(
    val title: String,
)

@Serializable
data class ThreadUpdateResponse(
    val id: Long,
    val title: String,
)

@Serializable
data class ThreadDeleteResponse(
    val id: Long,
    val title: String,
    val updatedAt: LocalDateTime,
)