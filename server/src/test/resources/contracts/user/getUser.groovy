package user

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name 'should_return_user'  //最终生成测试时的方法名
    request {
        method 'GET'
        url value(
                consumer(regex('/users/\\d+')),
                producer('/users/1'))
    }
    response {
        status 200
        body([
                id      : 1L,
                username: "acey",
        ])
        testMatchers {
            jsonPath('$.id', byRegex(number()))
            jsonPath('$.username',byRegex(onlyAlphaUnicode()))
        }
        headers {
            contentType(applicationJsonUtf8())
        }
    }
}
