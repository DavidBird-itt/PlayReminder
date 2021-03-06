// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/temp/PlayReminder/conf/routes
// @DATE:Sun Apr 28 21:05:51 IST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def addProperty(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addProperty")
    }
  
    // @LINE:47
    def createAccount(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createAccount")
    }
  
    // @LINE:42
    def addLandlord(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addLandlord")
    }
  
    // @LINE:49
    def addMemberSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addMemberSubmit")
    }
  
    // @LINE:58
    def cancelRent(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cancelRent/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:45
    def deleteLandlord(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteLandlord/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:37
    def addPropertySubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addPropertySubmit")
    }
  
    // @LINE:44
    def updateLandlord(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateLandlord/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:53
    def addAdmin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addAdmin")
    }
  
    // @LINE:41
    def viewUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewUsers")
    }
  
    // @LINE:25
    def viewProperty(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewProperty/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:55
    def updateAdmin(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:43
    def addLandlordSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addLandlordSubmit")
    }
  
    // @LINE:39
    def updateProperty(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateProperty/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:56
    def deleteAdmin(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:38
    def deleteProperty(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteProperty/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:51
    def deleteMember(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteMember/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:50
    def updateMember(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateMember/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:34
    def searchDB(min:Integer = 0, max:Integer = 0): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "searchQuery" + play.core.routing.queryString(List(if(min == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("min", min)), if(max == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("max", max)))))
    }
  
    // @LINE:32
    def memberProfile(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "memberProfile/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:31
    def landlordProfile(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "landlordProfile/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:48
    def addMember(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addMember")
    }
  
    // @LINE:28
    def properties(style:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "properties/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("style", style)))
    }
  
    // @LINE:26
    def viewApartment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "apartment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:29
    def contact(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contact")
    }
  
    // @LINE:54
    def addAdminSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addAdminSubmit")
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:16
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def loginSubmit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:20
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:16
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:61
  class ReverseShoppingCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:62
    def addToBasket(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addToBasket/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:66
    def viewOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:65
    def placeOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "placeOrder")
    }
  
    // @LINE:63
    def removeOne(itemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removeOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)))
    }
  
    // @LINE:61
    def showBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "showBasket")
    }
  
    // @LINE:64
    def emptyBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "emptyBasket")
    }
  
  }


}
