package com.talkdesk.industries.hlsproviders.integrationsfallback

import com.talkdesk.industries.common.annotation.ExcludeFromJacocoGeneratedReport
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class SwimmPocApplication

@BLABLABLA
fun main(args: Array<String>) {
    @Suppress("SpreadOperator")
    runApplication<SwimmPocApplication>(*args)
}

fun rand(from: Int, to: Int) : Int {
    return random.nextInt(to - from) + from
}
