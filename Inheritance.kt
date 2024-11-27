open class Animal
{
    fun makesound()
    {
        println("I can Make Sound....")
    }
}

class Dog : Animal()
{
    fun self()
    {
        println("I am Dog...")
    }
}

class Cat : Animal()
{
    fun self()
    {
        println("I am Cat...")
    }
}


fun main()
{
    var d=Dog()
    var c=Cat()

    d.self()
    d.makesound()

    println("-----------------------------------")

    c.self()
    c.makesound()
}