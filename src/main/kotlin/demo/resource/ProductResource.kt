package demo.resource

import demo.entity.Product
import demo.repository.ProductRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * @author Claudio E. de Oliveira
 * @date 24/01/17.
 * @email claudioed.oliveira@gmail.com
 * Project spring-kotlin
 */
@RestController
@RequestMapping("/api/product")
class ProductResource(val productRepository: ProductRepository) {

    @GetMapping("/")
    fun all() = productRepository.findAll()

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun add(@RequestBody request: Product) = productRepository.save(request)

}