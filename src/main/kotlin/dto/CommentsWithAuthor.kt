package dto

data class CommentsWithAuthor(
    val comment: Comment,
    val author: Author,
){
    override fun toString(): String {
        var s  = "\tCommentWithAuthor\n"
        s += "\tcomments=$comment\n"
        s += "\tauthor=$author\n"
        s += "\t***********************************"
        return s
    }
}
