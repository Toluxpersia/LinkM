package com.example.link

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}