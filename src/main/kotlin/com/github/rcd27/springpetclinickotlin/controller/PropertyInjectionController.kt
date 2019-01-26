package com.github.rcd27.springpetclinickotlin.controller

import com.github.rcd27.springpetclinickotlin.core.MyProperty
import com.github.rcd27.springpetclinickotlin.core.TalkingProperty
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class PropertyInjectionController {

    @Autowired
    lateinit var property : MyProperty

    fun process() {
        property.saySomething()
    }
}