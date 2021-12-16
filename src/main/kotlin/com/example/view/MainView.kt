package com.example.view

import com.example.Styles
import com.example.controller.DrinksController
import com.example.model.DrinksPayload
import javafx.geometry.Orientation
import javafx.scene.layout.VBox
import tornadofx.*

class MainView : View("Coctails") {
    val controller: DrinksController by inject()

    var drinksPayload = DrinksPayload()

    init {
        controller.listPayload(drinkName = "margarita")

    }
    override val root = borderpane{
        style{
            //backgroundColor += c(colorString = "#666699")
        }
        hbox{
            label("Működik") {
                addClass(Styles.heading)
            }
        }
        center = vbox {
            currentDrinksView()
        }
    }

    private fun VBox.currentDrinksView() = vbox{
        form{
            paddingAll = 20.0
            fieldset {
                field("Enter a coctail", Orientation.VERTICAL){
                    textfield(controller.selectedDrink.nameDrink) {
                        validator {
                            if (it.isNullOrBlank())
                                error("The coctail field cannot be blank")
                            else null
                        }
                    }
                }
            }
        }
    }
}
