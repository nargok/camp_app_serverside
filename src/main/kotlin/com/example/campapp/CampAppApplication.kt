package com.example.campapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CampAppApplication

fun main(args: Array<String>) {
	runApplication<CampAppApplication>(*args)
}
