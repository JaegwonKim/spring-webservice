package com.zecgwon.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController 는 @ResponseBody 를 모든 메소드에 적용 해준다.
// hello 메소드의 결과는 HelloWorld 라는 문자열을 JSON 형태로 반환한다.
@RestController
public class WebRestController {

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
}
