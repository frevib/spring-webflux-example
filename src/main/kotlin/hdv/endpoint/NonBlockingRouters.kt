package hdv.endpoint

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router
import reactor.core.publisher.Flux

@Configuration
class NonBlockingRouters {
    @Bean
    fun route() = router {
        GET("/w00t") { it_ -> ServerResponse.ok().body(BodyInserters.fromObject("w00t")) }
    }
}
