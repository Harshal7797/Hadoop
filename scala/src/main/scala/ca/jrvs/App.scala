package ca.jrvs

object App {
  def main(args: Array[String]) {
    println("Hello Worldd!")
    println("concat arguments = " + foo(args))
  }

  def foo(x: Array[String]) = x.foldLeft("")((a, b) => a + b)
}