import cats.implicits._

object Main {

  final case class Packet(flag: Int)

  val packets: List[Packet] = List()

  lazy val either: Either[Unit, Unit] = {
    Left(()).recoverWith { _ =>
      packets.find(_.flag == 1) match {
        case None    => Left(())
        case Some(_) => Right(())
      }
    }
  }

  def main(args: Array[String]): Unit = {
    either match {
      case Left(_)  => println("doh")
      case Right(_) => println("yay")
    }
  }

}
