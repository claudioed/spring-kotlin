package demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * @author Claudio E. de Oliveira
 * @date 24/01/17.
 * @email claudioed.oliveira@gmail.com
 * Project spring-kotlin
 */
@SpringBootApplication
open class KotlinApplication {

    companion object{
        @JvmStatic fun main(args: Array<String>){
            SpringApplication.run(KotlinApplication::class.java,*args)
        }
    }

}