package com.pawelweselak.kotlintestpitfalls

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class DuplicatedStringSpec : StringSpec({

    "duplicated method" {
        2 + 2 shouldBe 4
    }

    "duplicated method" {
        2 + 2 * 2 shouldBe 6
    }
})