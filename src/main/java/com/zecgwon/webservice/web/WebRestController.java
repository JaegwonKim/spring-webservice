package com.zecgwon.webservice.web;

import com.zecgwon.webservice.domain.posts.PostsRepository;
import com.zecgwon.webservice.dto.posts.PostsSaveRequestDto;
import com.zecgwon.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// @RestController 는 @ResponseBody 를 모든 메소드에 적용 해준다.
// hello 메소드의 결과는 HelloWorld 라는 문자열을 JSON 형태로 반환한다.
@RestController
@AllArgsConstructor
public class WebRestController {

    //private PostsRepository postsRepository;
    private PostsService postsService;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        //postsRepository.save(dto.toEntity());
        postsService.save(dto);
    }
}
