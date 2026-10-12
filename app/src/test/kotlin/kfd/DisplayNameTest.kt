package kfd

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DisplayNameTest {
    @Test
    fun name() {
        assertEquals("Анна", displayName(" Анна "))
    }

    @Test
    fun name1() {
        assertEquals("Гость", displayName(""))
    }

    @Test
    fun name2() {
        assertEquals("Гость", displayName(" "))
    }

    @Test
    fun preservesName() {
        assertEquals("Анна", displayName("Анна"))
    }

    @Test
    fun handlesNull() {
        assertEquals("Гость", displayName(null))
    }
}
