// src/main/scala/progscala2/concurrency/futures/future-fold.sc
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.Duration
import scala.concurrent.ExecutionContext.Implicits.global

val futures = (0 to 9) map {
  i => Future {
    val s = i.toString
    print(s)
    s
  }
}

val f = Future.reduce(futures)((s1, s2) => s1 + s2)

val n = Await.result(f, Duration.Inf)
