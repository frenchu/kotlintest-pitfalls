package com.pawelweselak.kotlintestpitfalls

import io.kotlintest.shouldBe
import io.kotlintest.specs.BehaviorSpec

class DuplicatedGivenSpec : BehaviorSpec({

    Given("duplicated given") {
        When("2 + 2") {
            val result = 2 + 2
            Then("result is 4") {
                result shouldBe 4
            }
        }
    }

    Given("duplicated given") {
        When("2 + 2 * 2") {
            val result = 2 + 2 * 2
            Then("result is 6") {
                result shouldBe 6
            }
        }
    }
})