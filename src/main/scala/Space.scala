import scala.io.Source

class Executing(s: String) {

  val filename = s

  def execute = {
    val lines = Source.fromFile(s).getLines
    val com = lines.flatMap(c => c.split("\\s+"))
    com match {
      case "R" => board.createArrow(com(1), com(2).toInt, com(3).toInt)
      case "L" => board.rotate(com(1).toInt, com(2).toInt)
      case "A" => board.move(com(1).toInt, com(2).toInt)
      case _ => println("Wrong command")
    }

    board.printBoard()
    println("_" * 10)
  }
}



class robot(cor: (Int, Int), s: String) {
  var orientation = s

  def rotate(d: Char) = {
    orientation match {
      case "north" => d match {
        case 'L' => orientation = "west"
        case 'R' => orientation = "east"
      }
    }
    orientation match {
      case "west" => d match {
        case 'L' => orientation = "south"
        case 'R' => orientation = "noth"
      }
    }

    orientation match {
      case "south" => d match {
        case 'L' => orientation = "east"
        case 'R' => orientation = "west"
      }
    }
    orientation match {
      case "east" => d match {
        case 'L' => orientation = "north"
        case 'R' => orientation = "south"
      }
    }
  }
32
  def move(s: String) = {

  }
}