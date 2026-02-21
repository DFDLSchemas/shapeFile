val root = (project in file("."))
  .settings(
    name := "dfdl-shp",

    organization := "com.mitre",

    version := "0.1.0-SNAPSHOT"
  )
  .daffodilProject()
