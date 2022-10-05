package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired //컨트롤러가 생성될 때 스프링빈에 등록되어 있는 memberService와 컨트롤러를 연결시켜줌
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
