// ex 1
def signum(x: Int) = if (x > 0) 1 else if (x < 0) -1 else 0
// 
// 
// ex 2
// Unit
// 
// 
// ex 3
// Unit
// 
// 
// ex 4
for (i <- 10 to 0 by -1)
  println(i)
//
//
// ex 5
def countdown(n: Int) {
  for(i <- n to 0 by -1) println(i)
}
// 
// 
// ex 6
var res:Long = 1
for (c <- "Hello") res *= c.toInt
print(res)
//
//
// ex 7
// ??, StringOps.product, but take implicit parameter Numeric[?]
// 
// 
// ex 8
def f(a: String) : Long = {
  var r:Long = 1
  for (x <- a) r *= x.toInt
  r
}
//
//
// ex 9
def f(a : String) : Long = {
  if (a.length <= 0) 
    0
  else if (a.length == 1)
    a.head
  else
    a.head * f(a.tail)
}
//
//
// ex 10
def f(x:Double, n:Int): Double = {
  if (n == 0) 1
  else if (n > 0 && n % 2 == 0) { 
    val t = (f(x, n / 2))
    t * t
  }
  else if (n > 0 && n % 2 == 1)
    x * f(x, n - 1)
  else
    1/f(x, -n)
}