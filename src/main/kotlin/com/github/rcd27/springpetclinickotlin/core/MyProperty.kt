package com.github.rcd27.springpetclinickotlin.core

import org.springframework.stereotype.Service

@Service // annotations! Annotations everywhere!
class MyProperty : TalkingProperty {
    override fun saySomething() {
        println("Some stuff")
    }
}