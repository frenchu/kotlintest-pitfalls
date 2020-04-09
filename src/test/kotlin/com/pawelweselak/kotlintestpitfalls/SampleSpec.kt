package com.pawelweselak.kotlintestpitfalls

import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.StringSpec

class SampleSpec : StringSpec({

    "test1" {
        2 + 2 shouldBe 4
    }

    "test2" {
        2 + 2 shouldNotBe 5
    }
})