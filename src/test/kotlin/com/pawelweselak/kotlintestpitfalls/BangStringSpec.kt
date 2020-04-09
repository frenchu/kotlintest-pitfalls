package com.pawelweselak.kotlintestpitfalls

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class BangStringSpec : StringSpec({

    "!Bang this method" {
        2 + 2 shouldBe 4
    }

    "test method"() {
        2 + 2 shouldBe 4
    }
})