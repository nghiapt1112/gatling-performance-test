package se.callistaenterprise.goblog

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.concurrent.duration._

object Scenarios {

  val rampUpTimeSecs = 10

  /*
   *	HTTP scenarios
     */
  /**
    * GET : request data
    * POST: tao moi, CREATE
    * PUT: update
    * DELETE: delete
    */


  // Browse
  val browse_guids = csv("accounts.csv").circular
  val scn_Browse = scenario("Todos List")
    .during(Conf.duration) {
      feed(browse_guids)
        .exec(
          http("Todos List")
            .get("/todos/" + "${todoId}")
            .headers(Headers.http_header)
            .check(status.is(200))
        )
        .pause(3)
    }

  val scn_Browse2 = scenario("Todos List___2")
    .during(Conf.duration) {
      feed(browse_guids)
        .exec(
          http("Todos List_xx")
            .get("/thao_test/" + "${todoId}")
            .headers(Headers.http_header)
            .check(status.is(200))
        )
        .pause(3)
    }
}