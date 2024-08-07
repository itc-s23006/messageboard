package jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao

import jp.ac.it_college.std.s23006.messageboard.domain.model.Message
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class MessageEntity(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<MessageEntity>(MessagesTable)

    var threadId by MessagesTable.threadId
    var userId by MessagesTable.userId
    var message by MessagesTable.message
    var postedAt by MessagesTable.postedAt
    var updatedAt by MessagesTable.updatedAt
    var deleted by MessagesTable.deleted

    fun toModel(): Message {
        return Message(
            id.value,
            userId,
            message,
            postedAt,
            updatedAt,
            deleted
        )
    }

    fun updateFromModel(model: Message) {
        userId = model.user
        message = model.message
        postedAt = model.postedAt
        updatedAt = model.updatedAt
        deleted = model.deleted
    }
}