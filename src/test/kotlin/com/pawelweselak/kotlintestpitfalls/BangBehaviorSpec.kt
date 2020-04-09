package com.pawelweselak.kotlintestpitfalls

import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.BehaviorSpec

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