package demo.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

/**
 *
 *
 * @author Claudio E. de Oliveira<claudioed.oliveira@gmail.com>
 */
@Document(collection = "products")
class ProductModel {

    @Id
    var id: String = UUID.randomUUID().toString();

    var name: String = ""

    var description: String = ""

    constructor()

    constructor(name: String, description: String) {
        this.name = name
        this.description = description
    }

}