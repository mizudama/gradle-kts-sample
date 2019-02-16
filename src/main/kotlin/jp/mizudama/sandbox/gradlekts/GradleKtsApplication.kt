package jp.mizudama.sandbox.gradlekts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GradleKtsApplication

fun main(args: Array<String>) {
    runApplication<GradleKtsApplication>(*args)
}

