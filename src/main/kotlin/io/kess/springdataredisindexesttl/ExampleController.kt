package io.kess.springdataredisindexesttl

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/example")
class ExampleController (
    private val repository: PersonRepository
    ) {

    @PostMapping
    fun create(@RequestBody body: PersonRequest) {
        val person = Person(firstname = body.firstname, lastname = body.lastname, ttl = 60)
        repository.save(person);
    }

}