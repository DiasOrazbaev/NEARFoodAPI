package org.nearfood.model

import org.jetbrains.exposed.sql.Table

@kotlinx.serialization.Serializable
data class Store(
    val id: Int,
    val name: String,
    val address: String,
    val latitude: Double,
    val longitude: Double
)

object Stores: Table() {
    val id = integer("id").autoIncrement()
    val name = varchar("name", 128).uniqueIndex()
    val address = varchar("address", 255)
    val latitude = double("latitude")
    val longitude = double("longitude")

    override val primaryKey = PrimaryKey(id)
}