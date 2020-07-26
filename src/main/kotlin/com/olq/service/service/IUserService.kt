package com.olq.service.service

import com.olq.service.model.UserBean

interface IUserService{

    fun selectUser(uid:Integer):UserBean
}