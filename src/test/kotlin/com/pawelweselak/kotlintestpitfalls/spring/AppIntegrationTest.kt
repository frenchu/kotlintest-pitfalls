package com.pawelweselak.kotlintestpitfalls.spring

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AppIntegrationTest(props: AppConfigurationProperties) : StringSpec({
    "should read name property" {
        props.name shouldBe "WesApp"
    }
})