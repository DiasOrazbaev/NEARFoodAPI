package org.nearfood.dao

import io.ktor.server.config.*

object DatabaseFactory {
    fun init(config: ApplicationConfig) {
        val driverClassName = config.property("ktor.database.driverClassName").getString()
    }
}