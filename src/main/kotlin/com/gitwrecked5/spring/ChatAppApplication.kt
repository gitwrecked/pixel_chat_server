package com.gitwrecked5.chat.chat_app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com")
class ChatAppApplication

fun main(args: Array<String>) {
    SpringApplication.run(ChatAppApplication::class.java, *args)
}
