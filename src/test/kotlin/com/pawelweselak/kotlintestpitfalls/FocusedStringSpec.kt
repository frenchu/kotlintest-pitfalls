package com.pawelweselak.kotlintestpitfalls

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class FocusedStringSpec : StringSpec({

    "f:I want to focus this method" {
        2 + 2 shouldBe 4
    }

    "test method" {
        2 + 2 shouldBe 4
    }
})