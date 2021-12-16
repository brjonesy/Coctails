package com.example.controller

import com.example.model.DrinkModel
import com.example.model.DrinksPayload
import javafx.collections.ObservableList
import tornadofx.Controller
import tornadofx.Rest
import tornadofx.toModel

class DrinksController: Controller() {
    val selectedDrink: DrinkModel by inject()

    //var allDrinks = ObservableList<DrinksPayload> = emptyObservableList<DrinksPayload>()

    private val api: Rest by inject()

    init {
        api.baseURI= "https://www.thecocktaildb.com/api/json/v2/9973533/search.php"
    }

    fun listPayload(drinkName: String): List<DrinksPayload>{
        val drinkPayload : ObservableList<DrinksPayload> = api.get("?s=$drinkName")
            .list().toModel<DrinksPayload>()
        drinkPayload[0].allDrinks[0].drinks[0].
        forEach{
            print("Load drink:  ${it.}")
        }

        return drink
    }

}