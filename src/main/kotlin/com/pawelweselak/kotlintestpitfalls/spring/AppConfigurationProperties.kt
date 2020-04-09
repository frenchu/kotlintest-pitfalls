package com.pawelweselak.kotlintestpitfalls.spring

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "sample.app")
data class AppConfigurationProperties(
    val name: String
)
