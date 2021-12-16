package com.example.model

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*
import javax.json.JsonObject

class Drink : JsonModel {
    val idDrinkProperty = SimpleIntegerProperty()
    var idDrink: Int by idDrinkProperty

    val nameDrinkProperty = SimpleStringProperty()
    var nameDrink: String by nameDrinkProperty

    val categoryProperty = SimpleStringProperty()
    var category: String by categoryProperty

    val ibaProperty = SimpleStringProperty()
    var iba: String by ibaProperty

    val alcoholicProperty = SimpleStringProperty()
    var alcoholic: String by  alcoholicProperty

    val glassProperty = SimpleStringProperty()
    var glass: String by glassProperty

    val instructionsProperty = SimpleStringProperty()
    var instructions: String by instructionsProperty

    val thumbnailProperty = SimpleStringProperty()
    var thumbnail: String by thumbnailProperty

    val ingredient1Property = SimpleStringProperty()
    var ingredient1:String by ingredient1Property

    val ingredient2Property = SimpleStringProperty()
    var ingredient2:String by ingredient2Property

    val ingredient3Property = SimpleStringProperty()
    var ingredient3:String by ingredient3Property

    val ingredient4Property = SimpleStringProperty()
    var ingredient4:String by ingredient4Property

    val ingredient5Property = SimpleStringProperty()
    var ingredient5:String by ingredient5Property

    val ingredient6Property = SimpleStringProperty()
    var ingredient6:String by ingredient6Property

    val measure1Property = SimpleStringProperty()
    var measure1:String by measure1Property

    val measure2Property = SimpleStringProperty()
    var measure2:String by measure2Property

    val measure3Property = SimpleStringProperty()
    var measure3:String by measure3Property

    val measure4Property = SimpleStringProperty()
    var measure4:String by measure4Property

    val measure5Property = SimpleStringProperty()
    var measure5:String by measure5Property

    val measure6Property = SimpleStringProperty()
    var measure6:String by measure6Property

    override fun updateModel(json: JsonObject) {
        with(json){
            idDrink = getInt("id")
            nameDrink = getString("strDrink")
            category = getString("strCategory")
            iba = getString("strIBA")
            alcoholic = getString("strAlcoholic")
            glass = getString("strGlass")
            instructions = getString("strInstructions")
            thumbnail = getString("strDrinkThumb")
            ingredient1 = getString("strIngredient1")
            ingredient2 = getString("strIngredient2")
            ingredient3 = getString("strIngredient3")
            ingredient4 = getString("strIngredient4")
            ingredient5 = getString("strIngredient5")
            ingredient6 = getString("strIngredient6")
            measure1 = getString("strMeasure1")
            measure2 = getString("strMeasure2")
            measure3 = getString("strMeasure3")
            measure4 = getString("strMeasure4")
            measure5 = getString("strMeasure5")
            measure6 = getString("strMeasure6")
        }
    }

    override fun toString() = nameDrink!!
}

class DrinkModel: ItemViewModel<Drink>(){
    val id = bind(Drink::idDrinkProperty)
    val nameDrink = bind(Drink::nameDrink)
    val category = bind(Drink::category)
    val iba = bind(Drink::iba)
    val alcoholic = bind(Drink::alcoholic)
    val glass = bind(Drink::glass)
    val instructions = bind(Drink::instructions)
    val thumbnail = bind(Drink::thumbnail)
    val ingredient1 = bind(Drink::ingredient1)
    val ingredient2 = bind(Drink::ingredient2)
    val ingredient3 = bind(Drink::ingredient3)
    val ingredient4 = bind(Drink::ingredient4)
    val ingredient5 = bind(Drink::ingredient5)
    val ingredient6 = bind(Drink::ingredient6)
    val measure1 = bind(Drink::measure1)
    val measure2 = bind(Drink::measure2)
    val measure3 = bind(Drink::measure3)
    val measure4 = bind(Drink::measure4)
    val measure5 = bind(Drink::measure5)
    val measure6 = bind(Drink::measure6)
}
