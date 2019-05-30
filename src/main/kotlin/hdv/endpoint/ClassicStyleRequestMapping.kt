package hdv.endpoint

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@RestController
class ClassicStyleRequestMapping {

    @GetMapping("/flux")
    fun flux(): Flux<String> = Flux.just("Geitie", "aapie", "cowie")

    @GetMapping("/mono")
    fun mono(): Mono<String> = Mono.just("maar 1")
}
