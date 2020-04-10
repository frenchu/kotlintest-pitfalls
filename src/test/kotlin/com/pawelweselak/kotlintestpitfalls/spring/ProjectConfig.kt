package com.pawelweselak.kotlintestpitfalls.spring

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.extensions.Extension
import io.kotest.spring.SpringAutowireConstructorExtension

class ProjectConfig : AbstractProjectConfig() {
  override fun extensions(): List<Extension> = listOf(SpringAutowireConstructorExtension)
}
