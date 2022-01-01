package com.example.link.android.Di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
import io.ktor.client.engine.android.*

@Module
@InstallIn(SingletonComponent::class)
object AppModules {

    @Provides
    fun HttpClient(): HttpClient{
        return HttpClient(Android){
//            install(JsonFeature){
//
//            }
        }

    }
}