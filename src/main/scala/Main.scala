import zio._
import zio.http._
import zio.json._

object HelloZIO extends ZIOAppDefault:
  val helloWorldRoute: Route[Any, Nothing] =
    Method.GET / Root -> handler(Response.json(HelloWorldDto("HelloWorld").toJson))

  def run = Server.serve(helloWorldRoute).provide(Server.default)
