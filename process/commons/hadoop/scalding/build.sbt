name := "predictionio-process-commons-hadoop-scalding"

javacOptions ++= Seq("-source", "1.6", "-target", "1.6", "-Xlint:deprecation", "-Xlint:unchecked")

parallelExecution in Test := false

libraryDependencies += "org.apache.hadoop" % "hadoop-core" % "1.0.4"

libraryDependencies += "com.twitter" %% "scalding-core" % "0.8.6"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.2",
  "org.joda" % "joda-convert" % "1.3.1"
)

// for compiling mongotap
libraryDependencies ++= Seq(
  "com.google.guava" % "guava" % "17.0",
  "org.mongodb" %% "casbah" % "2.7.2",
  "io.prediction" % "mongo-hadoop-core" % "1.1.0"
)

resolvers += "Concurrent Maven Repo" at "http://conjars.org/repo"
