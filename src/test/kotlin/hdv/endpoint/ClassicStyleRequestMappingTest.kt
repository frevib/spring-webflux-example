package hdv.endpoint

//import org.junit.Test
//import org.junit.runner.RunWith
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.test.web.reactive.server.expectBody


//@RunWith(SpringRunner::class)
@ExtendWith(SpringExtension::class)
//@WebFluxTest(ClassicStyleRequestMapping::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureRestDocs
//@AutoConfigureWebTestClient
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
