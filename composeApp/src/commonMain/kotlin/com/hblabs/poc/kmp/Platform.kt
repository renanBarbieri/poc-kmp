package com.hblabs.poc.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform