name := "user_management"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "mysql" % "mysql-connector-java" % "5.1.34",
  "commons-io" % "commons-io" % "2.4",
  "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.13",
  "org.codehaus.jackson" % "jackson-core-asl" % "1.9.13"
)

play.Project.playJavaSettings
