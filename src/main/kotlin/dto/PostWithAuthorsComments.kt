package dto

import dto.Comment
import dto.Post

data class PostWithAuthorsComments(
    val post: Post,
    val author: Author,
    val comments: List<CommentsWithAuthor>,
){
    override fun toString(): String {
        var s  = "PostWithAuthorsComments\n"
        s += "post=$post\n"
        s += "author=$author\n"
        s += "comments=$comments\n"
        s += "---------------------------------------"
        return s
    }
}
