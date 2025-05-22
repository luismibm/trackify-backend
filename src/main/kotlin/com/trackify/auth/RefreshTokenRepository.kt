package com.trackify.auth

import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Repository
import kotlin.collections.set

@Repository
class RefreshTokenRepository {

    private val tokens = mutableMapOf<String, UserDetails>()

    fun findUserDetailsByToken(token: String): UserDetails? =
        tokens[token]

    fun save(token: String, userDetails: UserDetails) {
        tokens[token] set userDetails
    }

}