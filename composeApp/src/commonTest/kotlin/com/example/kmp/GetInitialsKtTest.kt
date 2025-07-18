package com.example.kmp
import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test


class GetInitialsKtTest {

    @Test
    fun testGetInitials() {

        val name = "John"

        val fullName = "John Doe"

        assertThat(getInitials(name)).isEqualTo("JO")

        assertThat(getInitials(fullName)).isEqualTo("JD")
    }
}