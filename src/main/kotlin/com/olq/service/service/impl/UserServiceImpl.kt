package com.olq.service.service.impl

import com.olq.service.dao.IUserDao
import com.olq.service.model.UserBean
import com.olq.service.service.IUserService
import org.springframework.stereotype.Service
import javax.annotation.Resource

@Service
class UserServiceImpl:IUserService{

    @Resource
   private val userDao:IUserDao?=null

    override fun selectUser(uid:Integer): UserBean {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return userDao!!.selectUser(uid)
    }

}