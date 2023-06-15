package com.welltron.upgrade

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UpgradeApplication

fun main(args: Array<String>) {
    runApplication<UpgradeApplication>(*args)
}
