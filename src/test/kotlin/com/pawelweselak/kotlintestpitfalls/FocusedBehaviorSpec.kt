package com.pawelweselak.kotlintestpitfalls

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class FocusedBehaviorSpec : BehaviorSpec({

    Given("given") {
        When("when") {
            Then("then") {
                2 + 2 shouldBe 4
            }
        }
    }

    Given("f:given - Focus this test") {
        When("when") {
            Then("then - Focus given") {
                2 + 2 shouldBe 4
            }
        }
    }

    Given("given - Focus only then") {
        When("when") {
            Then("then") {
                2 + 2 shouldBe 4
            }
            Then("f:then - Focus then") {
                2 + 2 shouldBe 4
            }
        }
    }
})