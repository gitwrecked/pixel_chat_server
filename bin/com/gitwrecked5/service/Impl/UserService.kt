package com.gitwrecked5.service.Impl

import com.gitwrecked5.domain.User
import org.springframework.stereotype.Service

@Service
class UserService {
	
	fun getUser() : User{
		return User("test",2)
	}
	
}