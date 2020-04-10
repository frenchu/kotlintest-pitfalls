package com.pawelweselak.kotlintestpitfalls

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class BangStringSpec : StringSpec({

    "!Bang this method" {
        2 + 2 shouldBe 4
    }

    "test method"() {
        2 + 2 shouldBe 4
    }
})