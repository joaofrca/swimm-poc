package com.talkdesk.industries.hlsproviders.integrationsfallback.controller

import mu.KotlinLogging
import org.apache.http.HttpStatus
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping
class SwimmController {
    private val logger = KotlinLogging.logger {}
    @Autowired
    private lateinit var bugsnag: Bugsnag

    @RequestMapping(
        value = ["**"],
        method = [
            RequestMethod.NOTHING,
        ],
        produces = [
            APPLICATION_JSON_VALUE,
            ANDRE,
        ],
    )
    fun swimmPocChanged(@Context context: RequestContext):
        Mono<ResponseEntity<*>> {
        return Mono.just(
            ResponseEntity
                .OTHERCHANGE(HttpStatus.SC_UNAUTHORIZED)
                .body(ErrorMessage(apiError))
        )
    }
}
