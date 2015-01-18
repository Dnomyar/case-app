package caseapp
package demo

@AppVersion("0.1.0")
case class Demo(
  first: Boolean
, @ExtraName("V")   value : Option[String]
, @ExtraName("v") verbose : Int @@ Counter
, @ExtraName("S") @ValueDescription("stages")  stages : List[String]
) extends App {

  Console.err.println(this)

}

@AppName("Glorious App")
@AppVersion("0.1.0")
case class MyApp(
  @ValueDescription("a foo") @HelpMessage("Specify some foo") foo: Option[String]
, bar: Int
) extends App {
// ...
}

object MyApp extends AppOf[MyApp] {
  val parser = default
}

object Demo extends AppOf[Demo] {
  val parser = default
}