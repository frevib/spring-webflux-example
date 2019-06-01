package hdv.endpoint

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router
import java.net.URL

@Configuration
class NonBlockingRouters {

    @Bean
    fun hetWeer() = router {
        GET("/hetweer") {
            val result = URL("https://www.pietsweer.nl").readText()
            ServerResponse
                .ok()
                .body(BodyInserters.fromObject(result+ "aap")) }
    }
}
