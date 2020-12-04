package cn.visual.androidjacoco.service

import org.junit.Assert.assertEquals
import org.junit.Test

class ExampleTest {
    @Test
    fun should_return_correct_number_when_call_add_method() {
        val example = Example()
        val first = 2
        val second = 2

        val result = example.add(first, second)

        assertEquals(4, result)
    }
}