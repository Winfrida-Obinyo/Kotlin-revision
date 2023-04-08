fun main() {
    ages(14)
    ages(45)
    ages(79)
}
//Write a program in Kotlin that asks the user to enter their age and prints a message
// based on their age. If the age is less than 18, print "You are not old enough to vote".
// If the age is between 18 and 65, print "You are eligible to vote".
// If the age is greater than 65, print "You are a senior citizen".
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
//Write a program in Kotlin that asks the user to enter a password.
//If the password is "password123", print "Access granted".
//If the password is incorrect, print "Access denied".
