package demo.repository

import demo.entity.Product
import org.springframework.data.repository.CrudRepository

/**
 * @author Claudio E. de Oliveira
 * @date 24/01/17.
 * @email claudioed.oliveira@gmail.com
 * Project spring-kotlin
 */
interface ProductRepository : CrudRepository<Product,String>