package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;


    //DI(의존성 주입) 3가지 방법

    //setter 주입 - 단점 : 누군가 멤버 컨트롤러를 호출 했을 때 public으로 열려있어야 함. 그러므로, 세팅한 멤버서비스는 변경할 일이 없는데, public으로 노출해야 해서 실수로 변경 될 가능성이 있어 좋지 않다.
    //@Autowired
    //public void setMemberService(MemberService memberService) {
    //    this.memberService = memberService;
    //}

    //필드 주입(별로 좋지 않음) - 중간에 변경이 필요할 때 할 수 있는 방법이 없어서
    //@Autowired private MemberService memberService;

    //생성자 주입
    @Autowired //컨트롤러가 생성될 때 스프링빈에 등록되어 있는 memberService와 컨트롤러를 연결시켜줌
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
