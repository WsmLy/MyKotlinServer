package com.olq.service.controller

import com.olq.service.service.IUserService
import com.olq.service.service.impl.UserServiceImpl
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import javax.annotation.Resource

@Controller
@RequestMapping
class UserController{

    @Resource
    private val userService:IUserService=UserServiceImpl()

    @RequestMapping("/user")
    @ResponseBody
    fun selectUser(uid:Integer):String{
        return userService.selectUser(uid).toString()

    }

}