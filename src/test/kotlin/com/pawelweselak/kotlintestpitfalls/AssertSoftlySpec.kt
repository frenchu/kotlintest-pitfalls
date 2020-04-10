package com.pawelweselak.kotlintestpitfalls

import io.kotest.assertions.assertSoftly
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.assertj.core.api.Assertions.assertThat

class AssertSoftlySpec : StringSpec({
    "should execute all assertions, but it doesn't" {
        assertSoftly {
            assertThat("You will never know...").startsWith("I")
            2 + 2 shouldBe 5
        }
    }
})
