package com.example.mangasosical.utils.constant

object ApiConstant {


    object URL {
        const val BASE = "http://14.225.7.221:7979"
    }

    object TIMEOUT {
        const val CONNECT = 10L
        const val READ = 10L
        const val WRITE = 10L
    }

    object ENDPOINT {
        const val AUTH = "auth"
        const val USER = "user"
        const val SEARCH = "search"
        const val SEARCH_USER = "$USER/search"
        const val POST = "post"
        const val FOLLOW = "follow"
        const val USER_CURRENT = "$USER/current"
        const val AUTH_LOGIN = "$AUTH/login"
        const val AUTH_LOGOUT = "$AUTH/logout"
        const val AUTH_REGISTER = "$AUTH/register"
        const val AUTH_RESET_PASSWORD = "$AUTH/reset-password"
        const val POST_CREATE_NEW_POST = "$POST/create_new_post"
        const val POST_GET_ALL = "$POST/get_all"
        const val GET_ALL_BY_USER_NAME = "$POST/get_all_by_username"
        const val GET_ALL_BY_USER_ID = "$POST/get_all_by_user_id"
        const val CHANGE_PASSWORD = "$USER/change-password"
    }

    object FILED {
        const val EMAIL = "email"
        const val OLD_PASSWORD = "oldPassword"
        const val TOKEN = "token"
        const val NEW_PASSWORD = "newPassword"
        const val PAGE = "page"
        const val ID_BOOK = "idBook"
        const val ID = "id"
        const val URL = "url"
        const val CAPTION = "caption"
        const val FILES = "files"
    }

    object TYPEOFBILL {
        const val PENDING = 1
        const val ACCEPT = 2
        const val DELIVERY = 3
        const val SUCCESS = 4
        const val DESTROY = 5
        const val LOST = 6
        const val ALL = 0
    }

    object SHIPPINGMETHOD {
        const val COD = 1
        const val PAYMENT = 2
    }

    object ERROR {
        const val COD = 1
        const val PAYMENT = 2
    }

    const val AUTHORIZATION = "Authorization"
    const val BEARER = "Bearer"
}