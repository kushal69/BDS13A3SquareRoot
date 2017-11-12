package com

object SquareRoot {
  def getSquareRoot(userInput: Double): Double = {
    var x: Double = userInput;
    var y: Double = 1;
    var e: Double = 0.000001

    while (x - y > e) {
      x = (x + y) / 2;
      y = userInput / x;
    }
    x;
  }

  def main(args: Array[String]) {
    // Taking input from user
    print("Enter a Number to find approx. Square Root : ");
    val userInput = scala.io.StdIn.readInt();

    println("Square Root of " + userInput + " is : " + getSquareRoot(userInput));
  }
}