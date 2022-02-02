fun main(args: Array<String>) {
    var choice = menu()
    var go = validate(choice)
    if (go == 1){
        println("Please enter your business name: ")
        var bName = readLine()!!.toString()
        println("Please enter your contact name: ")
        var bContact = readLine()!!.toString()
        println("Please enter your phone number: ")
        var bNumber = readLine()!!.toString()
        info(name = bName, contact = bContact, phone = bNumber)
    }
    else{
        println("Please enter you name: ")
        var rName = readLine()!!.toString()
        println("Please enter your phone number: ")
        var rNumber = readLine()!!.toString()
        info(name = rName, phone = rNumber)
    }

}
fun info(name: String, contact: String, phone: String){
    println("Your business name is: " + name + "\nYour contact name is: " + contact + "\nYour phone number is: " + phone)
}
fun info(name: String, phone: String){
    println("Your name is: " + name + "\nYour phone number is: " + phone)
}
fun menu(): Int{
    println("Please make a selection\n1. Business Customer\n2. Residential Customer")
    var x = readLine()!!.toInt()
    return x
}
fun validate (x: Int): Int{
    var y = x
    while ((y < 1) or (y > 2)) {
        println("This is not a valid selection")
        println("Please make a selection\n1. Business Customer\n2. Residential Customer")
        y = readLine()!!.toInt()
    }
        return y
}