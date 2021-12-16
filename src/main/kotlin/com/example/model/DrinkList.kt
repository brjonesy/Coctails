package com.example.model

import javafx.beans.property.SimpleListProperty
import javafx.beans.property.SimpleObjectProperty
import tornadofx.JsonModel
import tornadofx.property
import tornadofx.toModel
import javax.json.JsonObject

class DrinkList: JsonModel {
    val drinksProperty = SimpleListProperty<Drink>()
    var drinks: List<Drink> by property(drinksProperty)


    override fun updateModel(json: JsonObject) {
        with(json){
            drinks = getJsonArray("drinks").toModel()
        }
    }
}


