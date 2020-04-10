package com.pawelweselak.kotlintestpitfalls

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class ConfigOnThenSpec : BehaviorSpec({

    Given("Given") {
        When("When") {
            then("then must start with lowercase").config(invocations = 5) {
                2 + 2 shouldBe 4
            }
        }
    }

    given("given") {
        `when`("when in backticks in order to compile") {
            then("then").config(invocations = 5) {
                2 + 2 shouldBe 4
            }
        }
    }
})
