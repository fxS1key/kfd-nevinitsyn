package kfd

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MessagePolicyTest {
    @Test
    fun acceptsShortMessage() {
        assertTrue(canSendMessage("Привет"))
    }

    @Test
    fun acceptsNullMessage() {
        assertFalse(canSendMessage(null))
    }

    @Test
    fun rejectsEmptyMessage() {
        assertFalse(canSendMessage(""))
    }

    @Test
    fun acceptsMessageAtMaxLength() {
        assertTrue(canSendMessage("a".repeat(140)))
    }
}