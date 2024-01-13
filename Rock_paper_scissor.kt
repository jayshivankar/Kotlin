package com.example.kotlin_project

fun main(){
    var playerchoice = ""
    var computerchoice = ""
    println("Enter your choice -> rock ,paper or scissors ")
    playerchoice = readln()
    val randomNumber = (1..3).random()
    if (randomNumber == 1){
        computerchoice = "rock"
    }
    if (randomNumber == 2){
        computerchoice = "paper"
        }
    if (randomNumber == 3){
        computerchoice = "scissors"
        }
    println(computerchoice)


    if (playerchoice ==  computerchoice){
        println("it's a tie")
    }
    else if (playerchoice == "paper" && computerchoice == "rock"){
        println("player wins")
    }
    else if (playerchoice == "rock" && computerchoice == "scissors"){
        println("player wins")
    }
    else if(playerchoice == "scissors" && computerchoice == "paper"){
        println("player wins")
    }
    else{
        println("computer wins")
    }





    }
