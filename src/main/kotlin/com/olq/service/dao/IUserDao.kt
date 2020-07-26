package com.olq.service.dao

import com.olq.service.model.UserBean

interface IUserDao{

    fun selectUser(uid:Integer):UserBean

}