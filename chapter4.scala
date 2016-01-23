// ex 1
val items = Map("A" -> 10, "B" -> 20, "C" -> 30)
val items2 = for ((k,v) <- items) yield (k, v * 0.9)

// ex 2
import scala.collection.mutable.HashMap
val in = new java.util.Scanner(new java.io.File("impatient/chapter3.scala"))
val counter = new HashMap[String, Int]()
while (in.hasNext()) {
  val k = in.next()
  if (counter.contains(k))
    counter(k) += 1
  else
    counter += (k -> 1)
  }

// ex 3
val in = new java.util.Scanner(new java.io.File("impatient/test.txt"))
var counter = new scala.collection.immutable.HashMap[String,Long]()
while (in.hasNext()) {
  val k = in.next()
  var v = 0
  if (counter.contains(k)) {
    v += 1
    counter -= k
  }
  counter += (k->v)
}

// ex 4
import scala.collection.immutable.SortedMap
val in = new java.util.Scanner(new java.io.File("impatient/test.txt"))
var counter = SortedMap[String,Long]()
while (in.hasNext()) {
  val k = in.next()
  var v = 0
  if (counter.contains(k)) {
    v += 1
    counter -= k
  }
  counter += (k->v)
}

// ex 5
import scala.collection.JavaConversions.mapAsScalaMap
val in = new java.util.Scanner(new java.io.File("impatient/test.txt"))
val counter : scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]
while (in.hasNext()) {
  val k = in.next()
  if (counter.contains(k))
    counter(k) += 1
  else
    counter += (k -> 1)
  }

// ex 6
import scala.collection.mutable.LinkedHashMap
val counter = LinkedHashMap("Monday" -> java.util.Calendar.MONDAY)
counter += ("Tuesday" -> java.util.Calendar.TUESDAY)
for( (k, v) <- counter)
  println(k)


// ex 7
import scala.collection.JavaConversions.propertiesAsScalaMap
val propos: scala.collection.Map[String, String] = System.getProperties()
val maxLen = propos.keys.map(_.length).max
for((k, v) <- propos) println(k + " " * (maxLen + 2 - k.length) + "|" +v)


// ex 8
def minmax(values: Array[Int]) = (values.min, values.max)


// ex 9
def lteqgt(values: Array[Int], v: Int) = {
  var lt = 0;
  var eq = 0;
  for (x <- values) {
    if (x < v)
      lt += 1
    else if (x == v)
      eq += 1
  }
  (lt, eq, values.length - lt - eq)
}

// ex 10
for ((k, v) <- "Hello".zip("World"))
  println(k)