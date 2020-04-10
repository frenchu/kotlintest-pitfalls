package com.pawelweselak.kotlintestpitfalls

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class SampleSpec : StringSpec({

    "test1" {
        2 + 2 shouldBe 4
    }

    "test2" {
        2 + 2 shouldNotBe 5
    }
})