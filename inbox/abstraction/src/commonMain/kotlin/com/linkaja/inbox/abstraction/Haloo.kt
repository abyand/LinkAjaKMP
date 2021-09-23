package com.linkaja.inbox.abstraction

class Haloo {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}