package com.ffekinci.springbootkeycloak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @GetMapping(path = "/")
    public String index() {
        return "home";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) throws Exception {
        request.logout();
        return "redirect:/";
    }

    @GetMapping(path = "/admin")
    public String adminPage() {
        return "admin";
    }

    @GetMapping(path = "/user")
    public String userPage() {
        return "user";
    }
}
