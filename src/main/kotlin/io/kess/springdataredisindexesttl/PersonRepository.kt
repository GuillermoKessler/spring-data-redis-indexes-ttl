package io.kess.springdataredisindexesttl

import org.springframework.data.repository.CrudRepository

interface PersonRepository : CrudRepository<Person, String>