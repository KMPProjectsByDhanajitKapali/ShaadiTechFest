package com.example.shaadihackfest.remote

import io.ktor.client.*

expect class HttpClientFactory {
    fun create(): HttpClient
}
