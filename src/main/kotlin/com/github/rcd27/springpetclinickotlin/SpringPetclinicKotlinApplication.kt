package com.github.rcd27.springpetclinickotlin

import com.github.rcd27.springpetclinickotlin.controller.MyController
import com.github.rcd27.springpetclinickotlin.controller.PropertyInjectionController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringPetclinicKotlinApplication

fun main(args: Array<String>) {
    val ctx = runApplication<SpringPetclinicKotlinApplication>(*args)
    val controller = ctx.getBean("myController") as MyController
    controller.hello()

    val propertyInjectionController = ctx.getBean("propertyInjectionController") as PropertyInjectionController
    propertyInjectionController.process()
}

