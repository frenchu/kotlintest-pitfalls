package com.pawelweselak.kotlintestpitfalls.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
class App

fun main(vararg args: String) {
    runApplication<App>(*args)
}
