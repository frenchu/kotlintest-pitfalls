package com.pawelweselak.kotlintestpitfalls

import io.kotlintest.shouldBe
import io.kotlintest.specs.BehaviorSpec

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
