package com.pawelweselak.kotlintestpitfalls

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class BangBehaviorSpec : BehaviorSpec({

    Given("given") {
        When("when") {
            Then("then") {
                2 + 2 shouldBe 4
            }
        }
    }

    Given("!given - Bang this test") {
        When("when") {
            Then("then in banged given") {
                2 + 2 shouldBe 4
            }
        }
    }

    Given("given - Bang only then") {
        When("when") {
            Then("then - Don't bang") {
                2 + 2 shouldBe 4
            }
            Then("!then - Bang") {
                2 + 2 shouldNotBe 5
            }
        }
    }
})