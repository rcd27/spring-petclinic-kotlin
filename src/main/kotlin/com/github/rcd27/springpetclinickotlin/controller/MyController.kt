package com.github.rcd27.springpetclinickotlin.controller

import org.springframework.stereotype.Controller

@Controller
class MyController {

    public fun hello(): String {
        println("hello... and")
        return "Fuck off"
    }
}