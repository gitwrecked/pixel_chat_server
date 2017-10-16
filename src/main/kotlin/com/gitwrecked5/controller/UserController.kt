package com.gitwrecked5.chat.chat_app

import com.gitwrecked5.domain.User
import com.gitwrecked5.service.Impl.UserService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HomeControllerKot(val userService : UserService) {

	@RequestMapping(value = "/user")
		fun getHouse(): User{
		return userService.getUser()
	}
	
}