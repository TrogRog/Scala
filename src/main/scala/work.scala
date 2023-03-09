import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readInt
import scala.util.Random

object work extends App {


  // ========================================================
  /* Напишите программу , которая считывает с клавиатуры три целых числа и выводит на экран:
      a) их среднее арифметическое;
      b) максимальное из введенных чисел*/
  println("Введите последовательно 3 числа")
  val x, y, z: Int = readInt()
  println(s"Вы ввели : $x  $y  $z")

  val ar = Array(x, y, z)
  val avar = ar.sum / 3
  val max = ar.max

  println("среднее значение = " + avar)
  println("максимальное значенме = " + max)
  println()
  // ========================================================
  //Реализовать генератор чисел Фибоначчи
  println("Введите сколько значений чисел Фибоначчи печатать?")
  val n = readInt()
  var arr123 = ListBuffer[BigInt]()
  for (i <- 1 to n) arr123 += fibs(i)
  for (b <- arr123) print(b + " ")

  def fibs(num: Int): BigInt = {
    def go(num: Int, acc: BigInt = 1): BigInt = {
      if (num > 2) go(num - 1, acc) + go(num - 2, acc)
      else acc
    }

    go(num)
  }

  println()
  println()


  //===================================================
  /*Напишите программу, которая генерирует массив из не менее чем 100
  чисел, заполненных случайными целыми числами на интервале [0; K].
  Константа К задается в «теле»программы.Подсчитайте количество
    простых чисел и чисел, кратных 3. Отсортируйте массив.*/

  println("Введите вверхний предел значений в массиве")
  val k = readInt()
  val myArrayRand = Array.fill(100)(Random.nextInt(k))
  for (m <- myArrayRand) print(m + " ")
  println()

  var count3 = 0
  for (i <- myArrayRand.filter(_ % 3 == 0)) count3 += 1
  println("Колличество значений кратных 3 : " + count3)
  println()

  val sortMyArray = myArrayRand.sorted
  println("Сортировка")
  for (m <- sortMyArray) print(m + " ")
  println()
  println()

  var count = 0
  for (r <- sortMyArray) {
    if (r > 1) {
      var flag = 0
      for (k <- 2 until r) {
        if (r % k == 0) flag = 1
      }
      if (flag == 0) {
        print(r + " ")
        count += 1
      }
    } else if (r == 1) {
      print(r + " ")
      count += 1
    }

  }
  println()
  println(s"Простых чисел: $count")
  println()


  //========================================================
  /*Массив целых чисел, в котором каждое число встречается два раза, и лишь одно число
    встречается один раз.
    Найти данное число.*/
  var oneNum = Array(1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 5, 4, 3, 2, 1)
  for (m <- oneNum) print(m + " ")
  println()

  oneNum = oneNum.sorted
  var select = 0
  for (i <- 1 until oneNum.length by 2) {
    if (oneNum(i - 1) != oneNum(i) && select == 0) {
      println("Число в одном экземпляре : " + oneNum(i - 1))
      select = 1
    }
  }
  if (select == 0) println("Число в одном экземпляре : " + oneNum.last)
}
