import zio._

object HelloZIO extends ZIOAppDefault:
  def run = Console.printLine("Hello, World!")
