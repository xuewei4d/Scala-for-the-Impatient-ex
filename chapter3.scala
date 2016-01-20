// ex 1 
import scala.util.Random
val n = 10
val a = (for (i <- 0 to 10) yield Random.nextInt).toArray

// ex 2
val a = Array(1,2,3,4,5)
for (i <- 0 until (a.length - 1, 2)) {
  val t = a(i)
  a(i) = a(i+1)
  a(i+1) = t
}


// ex 3
val a = Array(1,2,3,4,5,6)
(for (i <- 0 until a.length)
  yield {
    if (i % 2 == 0 && i < a.length - 1)
      a(i + 1)
    else if (i % 2 == 0 && i == (a.length - 1))
      a(i)
    else 
      a(i-1)
  }).toArray

a.grouped(2).flatMap(_.reverse).toArray

// ex 4
a.filter(_ > 0) ++ a.filter(_ <= 0)

// ex 5
a.sum / a.length

// ex 6
a.sortWith(_ > _)

// ex 7
a.distinct

// ex 8
val indexes = for( i <- 0 until a.length if a(i) < 0) yield i
indexes.reverse.dropRight(1).foreach(a.remove(_))

// ex 9
a.filter(_.startsWith("America/")).map(_.drop("America/".length))

// ex 10
import java.awt.datatransfer._
import collection.JavaConversions.asScalaBuffer
import collection.mutable.Buffer

val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
val res: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)