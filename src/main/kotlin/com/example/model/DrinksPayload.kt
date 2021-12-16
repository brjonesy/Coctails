package com.example.model

import javafx.beans.property.SimpleListProperty
import javafx.beans.property.SimpleObjectProperty
import tornadofx.JsonModel
import tornadofx.property
import tornadofx.toModel
import javax.json.JsonObject

class DrinksPayload: JsonModel {

    val drinksListProperty = SimpleObjectProperty<DrinkList>()
    var drinkList: DrinkList by property{drinksListProperty}


    override fun updateModel(json: JsonObject) {
        with(json){
            drinkList = getJsonObject("city").toModel()


        }
    }
}