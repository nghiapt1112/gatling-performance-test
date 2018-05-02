package se.callistaenterprise.goblog

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object Conf {
  var users = System.getProperty("users", "10").toInt
  val baseUrl = System.getProperty("baseUrl", "http://localhost:12345")
  var httpConf = http.baseURL(baseUrl)
  var duration = System.getProperty("duration", "10").toInt
}