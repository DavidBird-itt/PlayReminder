// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/temp/PlayReminder/conf/routes
// @DATE:Sun Apr 28 21:05:51 IST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
