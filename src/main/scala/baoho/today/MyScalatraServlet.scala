package baoho.today

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {

  get("/") {
    "Hello Bao Ho"
  }

}
