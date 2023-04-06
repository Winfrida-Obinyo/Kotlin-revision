fun main() {
    ages(14)
    ages(45)
    ages(79)
}
fun ages(age:Int){
    if (age in 1..17){
        println("You are not old enough to vote")
    }
    else if (age in 18..65){
        println("You are eligible to vote")
    }
    else{
        println("You are a senior citizen")
    }
}