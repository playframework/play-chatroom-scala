name := """play-chatroom-scala"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.11"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += "org.webjars" % "flot" % "0.8.3"
libraryDependencies += "org.webjars" % "bootstrap" % "3.3.6"

lazy val akkaVersion = "2.4.11"
libraryDependencies += "com.typesafe.akka" %% "akka-http-core" % akkaVersion
libraryDependencies += "com.typesafe.akka" %% "akka-http-experimental" % akkaVersion
libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % akkaVersion

libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test
libraryDependencies += "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test

