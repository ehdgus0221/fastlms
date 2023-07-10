/***
 *  주소(논리적인 인터넷 주소)와 물리적인 파일(프로그래밍)을 매핑하기 위해 사용
 *
 *  매핑 대상 후보
 *  1. 클래스 : 클래스를 매핑한다면 주소가 추가될 때마다 클래스를 추가해야돼서 효율적이지 않음
 *  2. 속성 : 속성은 값들을 나타내는데 주로 사용
 *  3. 따라서 매핑 대상으로 메소드가 제일 적절함!!
 *
 * request -> WEB에서 SERVER로 요청하기 위한 객체
 * response -> SERVER에서 WEB으로 요청하기위한 객체
 *
 *     // RequestMapping : 요청에 대한 매핑
 *     // thymeleaf를 사용했기에, return에는 파일 명을 지정해야함
 *     // index라는 파일 지정
 */


package com.zerobase.fastlms.main.controller;

import com.zerobase.fastlms.components.MailComponents;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final MailComponents mailComponents;
    @RequestMapping("/")
    public String index() {

        return "index";
    }

    @RequestMapping("/error/denied")
    public String errorDenied() {

        return "error/denied";
    }
}
