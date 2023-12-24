package home

//1.1
def sqr(x: Int) = x * x

val (x, y, z) = (1, 2, 3)

println(s"Квадрат числа $x равен " + sqr(x))
println(s"Квадрат числа $y равен " + sqr(y))
println(s"Квадрат числа $z равен " + sqr(z))


//1.2
def square(radius: Int) = sqr(radius) * 3.14
val radius1 = 10
println(s"Радиус окружности равен $radius1. Площадь равна " + square(radius1))


//1.3
def cFar(temper1: Int) = (temper1 - 273.15) * 9 / 5 + 32
val temper1 = 100
println(s"Температура в градусах Цельсия $temper1 соответствует Фаренгейта " + cFar(temper1))


//1.4
def longStr(str: String) = str.length
val b = "Какой то текст и его длина - "
println(b + longStr(b))

//1.5

def distance(d1: (Int, Int), d2: (Int, Int)) = {
  val c = Math.sqrt(sqr((d2._1 - d1._1)) + sqr((d2._2 - d1._2)))
  println(s"Дистанция между точками $d1 и $d2 равно $c")
}

val x = (2, -5)
val y = (-4, 3)
distance(x, y)

//2.1
def chetNechet(p: Int) = if (p % 2 == 0) println(s"Число $p четное") else println(s"Число $p нечетное")

chetNechet(10)
chetNechet(9)
chetNechet(-999)

//2.2
def detect(p: Int) = {
  if (p > 0) println(s"Число $p положительное")
  else if (p < 0) println(s"Число $p отрицательное")
  else println(s"Число является нулем")
}

detect(10)
detect(0)
detect(-999)

//2.3
def printFor1(p1: Int) = for (i <- 1 to p1) println(i)
def printFor2(p1: Int) = for (i <- 1 until p1) println(i)
printFor1(10)
printFor2(10)

//2.4
def table(t1: Int, t2: Int) = for (i <- 1 to t1; j <- 1 to t2 if i == 5 && i * j < 10) println(i * j)
table(10, 10)

//2.5

