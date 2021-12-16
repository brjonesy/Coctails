package com.example.view

import com.example.Styles
import com.example.controller.DrinksController
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    val controller: DrinksController by inject()

    init {
        controller.listPayload(drinkName = "margarita")

    }
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
        }
    }
}
