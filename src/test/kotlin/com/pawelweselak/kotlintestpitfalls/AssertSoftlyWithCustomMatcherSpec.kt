package com.pawelweselak.kotlintestpitfalls

import io.kotest.assertions.assertSoftly
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.Matcher
import io.kotest.matchers.MatcherResult
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import org.assertj.core.api.Assertions

class AssertSoftlyWithCustomMatcherSpec : StringSpec({

    "will execute all assertions" {
        assertSoftly {
            "You will never know..." should startsWith("I")
            2 + 2 shouldBe 5
        }
    }
})

private fun startsWith(prefix: String) = object : Matcher<String> {
    override fun test(value: String): MatcherResult =
        try {
            Assertions.assertThat(value).startsWith(prefix)
            matcherResult(passed = true, prefix = prefix)
        } catch (e: AssertionError) {
            matcherResult(passed = false, prefix = prefix)
        }
}

private fun matcherResult(passed: Boolean, prefix: String) =
    MatcherResult(
        passed,
        "doesn't starts with $prefix",
        "shouldn't start with $prefix"
    )
