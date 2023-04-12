package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method POST()
        url "/tests"
        headers {
            contentType(multipartFormData())
        }
        multipart(
                file: named(
                        name: $("test.txt"),
                        content: $("test content")
                ),
                payload : named(
                        name: $("payload"),
                        content: $('{"test1": "text.txt"}'),
                        contentType: $("application/json")
                )
        )
    }
    response {
        status CREATED()
        headers {
            contentType(applicationJson())
        }
        body("""
            {
                "status": "ok"
            }
        """)
    }
}
