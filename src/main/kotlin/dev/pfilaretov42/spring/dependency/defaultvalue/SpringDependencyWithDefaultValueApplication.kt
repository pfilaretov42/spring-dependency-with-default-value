package dev.pfilaretov42.spring.dependency.defaultvalue

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDependencyWithDefaultValueApplication

fun main(args: Array<String>) {
    runApplication<SpringDependencyWithDefaultValueApplication>(*args)
}
