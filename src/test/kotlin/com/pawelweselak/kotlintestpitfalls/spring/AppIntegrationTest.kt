package com.pawelweselak.kotlintestpitfalls.spring

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class AppIntegrationTest(props: AppConfigurationProperties) : StringSpec({

    "should read name property" {
        props.name shouldBe "WesApp"
    }
})