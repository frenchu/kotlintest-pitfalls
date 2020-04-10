package com.pawelweselak.kotlintestpitfalls

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.core.test.TestCase
import io.kotest.matchers.shouldBe

class IsTopLevelSpec : BehaviorSpec({

    Given("2 and 2") {
        When("sum") {
            val result = 2 + 2
            Then("result is 4") {
                result shouldBe 4
            }
        }
    }

    Given("2, 2 and 2") {
        When("2 + 2 * 2") {
            val result = 2 + 2 * 2
            Then("result is 6") {
                result shouldBe 6
            }
        }
    }
}) {
    override fun beforeTest(testCase: TestCase) {
        if (testCase.isTopLevel()) {
            println("It will be printed before entering top-level ${testCase.name}")
        }
        println("It will be printed before entering ${testCase.name}")
    }
}