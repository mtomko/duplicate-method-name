import cats.syntax.all._

object Main {

  def main(args: Array[String]): Unit = {
    Left(()).recoverWith { _ =>
      List.empty[Int].find(_ == 1) match {
        case None    => Left(())
        case Some(_) => Right(())
      }
    }
  }

}
