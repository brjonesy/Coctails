package com.example.controller

import com.example.model.Drink
import com.example.model.DrinkModel
import com.example.model.DrinksPayload
import com.example.util.appid
import javafx.collections.FXCollections
import javafx.collections.FXCollections.*
import javafx.collections.ObservableList
import tornadofx.Controller
import tornadofx.Rest
import tornadofx.toModel
import java.util.*

class DrinksController: Controller() {
    val selectedDrink: DrinkModel by inject()

    //var allDrinks = ObservableList<DrinksPayload> = emptyObservableList<DrinksPayload>()

    val api: Rest by inject()

    init {
        api.baseURI= "https://www.thecocktaildb.com/api/json/v2/9973533/search.php"
    }

    fun listPayload(drinkName: String): List<DrinksPayload>{
        val drink : ObservableList<DrinksPayload> = api.get("?s=$drinkName")
            .list().toModel<DrinksPayload>()
        drink[0].drinkList.drinks.forEach{
            print("Load drink:  ${it.nameDrink}")
        }

        return drink
    }

}