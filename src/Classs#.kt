class `user` {
    val name: String = ""
    val email: String = ""
}

fun main(){
    val tree = Tree()
    tree.name = "Pine"
    tree.age = 6
    tree.hasFruit()
    tree.ShowAge()
}


class Tree {
    var name: String = ""
    var age: Int = 0

    fun hasFruit(){
        println("$name has a fruit")
    }
    fun hasntFruit(){
        println("$name hasnt a fruit")
    }
    fun ShowAge(){
        println("$name have to $age y.o.")
    }

}


