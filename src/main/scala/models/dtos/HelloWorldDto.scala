import zio.json._

case class HelloWorldDto(message: String)
implicit val encoder: JsonEncoder[HelloWorldDto] = DeriveJsonEncoder.gen[HelloWorldDto]
