
//    object oriented programing ->
//
//    inheritance -> переводится как ⟪Наследование, Наследие⟫
//    → этот класс может оставить свои элементы другому классу
//
//
//
//
//
//
//
//
//
    /*Inheritance - Nasil aliw - Nasledovaniye;
- bir klass ozindegi elementlerin basqa
klassqa nasil qaldiriwi mumkin; */

    /*
    class - bul shablon, ozgeriwshiler funckiyalarga iye boladi
            - properties - elementleri*/

    //parent class
    /*open class Car{
        var type: String = ""
        var name: String = ""
        var createdYear: Int = 1995

        fun drive(){
            println("Someone is driving $name")
        }
    }*/

    //child class
    /*open class TransportCar: Car()  {
        var seats: Int = 20
        fun showSeats(){
            println(seats)
        }
    }
    class BigTC: TransportCar() //no properties
*/

//Animal  - atasi
//Pet - balasi
//Domestic - aqligi

    /*open class Animal{
        val name: String = ""
        val age: Int = 3
        val homeAddress: String = ""
        val CatsFur: String = ""
    }*/



// Abstration in OOP is this → Когда проект основывается на рейльный мир и создает
// для этого схожие классы
//
//
//
//
//
//

//Polymorphism → является 4-ым принципом OOP →
//    Задача бывает одной но выполнение будут разными, пульт















fun main(){
/*
    val usaPerson = Person()
    usaPerson.nation = "American"
    usaPerson.language = "English language"
    usaPerson.speaking()
    usaPerson.Culture()*/



}




/*
open class Person {
    var nation : String = ""
    var language : String = ""
    var healthStatus : String = ""

    open fun speaking(){
        println("$nation speaks $language")
    }
    open fun Culture(){
        println("$nation's culture is beautiful")
    }

}

class DuoLingoPerson : Person(){
    var secondLanguage : String = "russian"
    override fun speaking() {

    }
}*/



open class VideoGame{
    var nameOfGame : String = ""
    var type : String = ""
    open fun playing() {

    }
}


