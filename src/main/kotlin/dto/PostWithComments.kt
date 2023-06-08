package dto

import dto.Comment
import dto.Post

data class PostWithComments(
    val post: Post,
    val comments: List<Comment>,
)
