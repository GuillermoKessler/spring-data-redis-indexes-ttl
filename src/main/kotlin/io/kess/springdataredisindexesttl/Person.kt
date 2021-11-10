package io.kess.springdataredisindexesttl

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.TimeToLive
import org.springframework.data.redis.core.index.Indexed

@RedisHash("people")
data class Person (
    @Id
    val id: String? = null,
    @Indexed
    val firstname: String,
    val lastname: String,
    @TimeToLive
    val ttl: Long
)