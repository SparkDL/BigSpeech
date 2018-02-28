name := "BigSpeech"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.intel.analytics.bigdl" % "bigdl-SPARK_2.2" % "0.4.0",
  "org.apache.hadoop" % "hadoop-client" % "2.2.0"
)
