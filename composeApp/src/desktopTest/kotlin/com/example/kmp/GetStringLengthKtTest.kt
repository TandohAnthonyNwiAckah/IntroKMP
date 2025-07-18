package com.example.kmp


import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.Test

class GetStringLengthKtTest {

    @Test
    fun testGetStringLength() {
        assertThat(getStringLength("JOHN")).isEqualTo(4 )
    }

}