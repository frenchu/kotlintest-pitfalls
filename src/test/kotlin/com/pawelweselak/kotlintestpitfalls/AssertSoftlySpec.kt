package com.pawelweselak.kotlintestpitfalls

import io.kotlintest.*
import io.kotlintest.specs.StringSpec
import org.assertj.core.api.Assertions.assertThat

class AssertSoftlySpec : StringSpec({
    "should execute all assertions, but it doesn't" {
        assertSoftly {
            assertThat("You will never know...").startsWith("I")
            2 + 2 shouldBe 5
        }
    }
})
