package hdv.endpoint

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.test.web.reactive.server.expectBody


@RunWith(SpringRunner::class)
@WebFluxTest(ClassicStyleRequestMapping::class)
class ClassicStyleRequestMappingTest {

    @Autowired
    lateinit var webClient: WebTestClient

    @Test
    fun flux() {
        webClient
            .get()
            .uri("/flux")
            .exchange()
            .expectStatus().isOk
            .expectBody<String>()
            .isEqualTo("Geitieaapiecowie")
    }

    @Test
    fun mono() {
        webClient
            .get()
            .uri("/mono")
            .exchange()
            .expectStatus().isOk
            .expectBody<String>()
            .isEqualTo("maar 1")
    }
}
