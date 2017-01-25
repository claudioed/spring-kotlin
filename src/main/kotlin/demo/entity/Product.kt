package demo.entity

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

/**
 * @author Claudio E. de Oliveira
 * @date 24/01/17.
 * @email claudioed.oliveira@gmail.com
 * Project spring-kotlin
 */
@Document(collection = "products")
class Product(val name: String, val description: String, @Id val id: String = UUID.randomUUID().toString()){

    companion object{
        @JvmStatic @JsonCreator fun createProduct(@JsonProperty("name") name: String, @JsonProperty("description") description: String, @JsonProperty("id")id: String) = Product(name,description,id)
    }

}