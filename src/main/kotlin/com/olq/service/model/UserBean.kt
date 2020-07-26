package com.olq.service.model

data class UserBean(val uid:Int=0,var username:String?=null,var password:String?=null){


    override fun toString(): String {
        return "UserBean(uid=$uid, username='$username', password='$password')"
    }
}

//class UserBean{
//    val uid:Int=0
//    val username:String?=null
//    val password:String?=null
//    override fun toString(): String {
//        return "UserBean(uid=$uid, username='$username', password='$password')"
//    }
//}