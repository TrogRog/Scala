package home

/*
Дан список координат в трёхмерном пространстве.
Вам нужно написать класс Point, который будет описывать точку в
трёхмерном пространстве и объект-компаньон со следующими функциями:
- apply - фабрика, принимает три координаты и возвращает экземпляр типа Point;
- average - принимает List[Point] и вычисляет усреднённую точку между всеми координатами,
 либо точку с началом осей координат, если её невозможно рассчитать;
- show - принимает Point и превращает её в строку, состоящую из координат разделённых через пробел.
Для каждой строки будет вызвана функция apply, затем для всех точек будет вызвана функция average.
На выход будет передан результат функции show, примененный к усреднённой точке.

*/

class Point(val x: Double, val y: Double, val z: Double) {}

object Point {
  def apply(x: Double, y: Double, z: Double): Point = new Point(x, y, z)

  def average(points: List[Point]): Point = {
    if (points.isEmpty) Point(0, 0, 0)
    else {
      val size = points.size
      new Point(points.map(_.x).sum / size, points.map(_.y).sum / size, points.map(_.z).sum / size)
    }
  }

  def show(point: Point): String = point.x + " " + point.y + " " + point.z
}
