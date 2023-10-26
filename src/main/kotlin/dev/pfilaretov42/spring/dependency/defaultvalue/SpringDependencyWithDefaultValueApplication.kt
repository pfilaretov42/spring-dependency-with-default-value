package dev.pfilaretov42.spring.dependency.defaultvalue

import jakarta.annotation.PostConstruct
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class SpringDependencyWithDefaultValueApplication

fun main(args: Array<String>) {
    runApplication<SpringDependencyWithDefaultValueApplication>(*args)
}

@Component
class FordPrefect(
    private val humans: List<Human> = emptyList(),
) {
    @PostConstruct
    fun init() {
        log.info("humans: $humans")
    }

    companion object {
        private val log = LoggerFactory.getLogger(FordPrefect::class.java)
    }
}

interface Human

@Component
class ArthurDent(
    private val fordPrefect: FordPrefect,
) : Human {
    override fun toString() = "Arthur"
}

@Component
class TrishaMcMillan(
    private val fordPrefect: FordPrefect,
) : Human {
    override fun toString() = "Trisha"
}