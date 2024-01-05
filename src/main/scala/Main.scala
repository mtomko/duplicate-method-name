import cats.syntax.all._

object Main {

  final case class Packet(flag: Int)

  def main(args: Array[String]): Unit = {
    Left(()).recoverWith { _ =>
      List.empty[Packet].find(_.flag == 1) match {
        case None    => Left(())
        case Some(_) => Right(())
      }
    }
  }

}
