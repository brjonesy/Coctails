package com.example.model

import javafx.beans.property.SimpleListProperty
import javafx.beans.property.SimpleObjectProperty
import tornadofx.JsonModel
import tornadofx.property
import tornadofx.toModel
import javax.json.JsonObject

class DrinksPayload: JsonModel {

    val drinksProperty = SimpleListProperty<Drinks>()
    var allDrinks: List<Drinks> by property(drinksProperty)


    override fun updateModel(json: JsonObject) {
        with(json){
            allDrinks = getJsonObject("drinks").toModel()


        }
    }
}