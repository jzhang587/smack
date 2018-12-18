package com.capra.smack.Utilities

const val BASE_URL = "https://smackchat587.herokuapp.com/v1/"
const val SOCKET_URL = "https://smackchat587.herokuapp.com/"
const val URL_REGISTER = "${ BASE_URL}account/register"
const val URL_LOGIN = "${BASE_URL}account/login"
const val URL_cREATE_USER = "${BASE_URL}user/add"
const val URL_GET_USER = "${BASE_URL}user/byEmail/"
const val URL_GET_CHANNELS = "${BASE_URL}/channel/"

// Broadcast Constants
const val BROADCAST_USER_DATA_CHANGE = "BROADCAST_USER_DATA_CHANGE"