package br.com.mercadolivro.mercadolivro.controller

import br.com.mercadolivro.mercadolivro.controller.request.PostCustomerRequest
import br.com.mercadolivro.mercadolivro.model.Customer
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customer")
class CustomerController {

    @GetMapping
    fun getCustomer(): Customer{
        return Customer("1", "teste", "abc@email.com")
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody customer: PostCustomerRequest) {
        println(customer)
    }
}