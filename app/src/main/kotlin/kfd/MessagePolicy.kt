package kfd

fun canSendMessage(
    text: String?,
    maxLength: Int = 140
): Boolean {
    return (text != null && text.isNotEmpty() && text.length <= maxLength)
}