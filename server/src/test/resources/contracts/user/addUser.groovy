package user

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name 'should_return_status_created' //最终生成测试时的方法名
    request {
        method 'post'
        url '/users'
        body([
                id      : 1,
                username: 'acey'
        ])
        headers {
            contentType(applicationJsonUtf8())
        }
    }
    response {
        status 201
    }
}
