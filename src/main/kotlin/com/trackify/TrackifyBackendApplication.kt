package com.trackify

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TrackifyBackendApplication

fun main(args: Array<String>) {
    runApplication<TrackifyBackendApplication>(*args)
}
