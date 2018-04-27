package se.callistaenterprise.goblog

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.concurrent.duration._

class LoadTest extends Simulation {
// LOAD config
  setUp(
    Scenarios.
      scn_Browse.
      inject(rampUsers(Conf.users) over (Scenarios.rampUpTimeSecs seconds))
      .protocols(Conf.httpConf),
    Scenarios.
      scn_Browse2.
      inject(rampUsers(Conf.users) over (Scenarios.rampUpTimeSecs seconds))
      .protocols(Conf.httpConf)
  )
}