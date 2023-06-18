package br.com.mercadolivro.mercadolivro.controller

import br.com.mercadolivro.mercadolivro.model.Customer
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customer")
class CustomerController {

    @GetMapping
    fun getCustomer(): Customer{
        return Customer("1", "teste", "abc@email.com")
    }
}