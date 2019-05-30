package hdv.endpoint

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono


@RestController
class ClassicStyleRequestMapping {

    @GetMapping("/geit")
    fun geit(): Mono<String> = Mono.just("Geitie")
}
