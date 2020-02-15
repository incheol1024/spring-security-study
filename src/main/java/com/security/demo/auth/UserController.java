package com.security.demo.auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
@Slf4j
public class UserController {


    @GetMapping("/")
    public String index() {
        log.info("user Controller...");
        return "index";
    }

    @GetMapping("/info")
    public String info(Model model, Principal principal) {
        if (principal != null) {
            model.addAttribute("userName", principal.getName());
        }
        return "info";
    }

    @GetMapping("/admin")
    public String admin(Model model, Principal principal) {
        if(principal != null) {
            model.addAttribute("userName", principal.getName());
        }
        return "admin";

    }
}
