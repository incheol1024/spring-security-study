package com.security.demo.auth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.Objects;

@Controller
public class UserPageController {

    @GetMapping("/")
    public String index(Model model, Principal principal) {
        if(Objects.nonNull(principal))
            model.addAttribute("userName", principal.getName());

        return "index";
    }


    @GetMapping("/admin")
    public String admin(Model model, Principal principal) {
        if (Objects.nonNull(principal))
            model.addAttribute("userName", principal.getName());

        return "admin";
    }

    @GetMapping("/info")
    public String info(Model model, Principal principal) {
        if (Objects.nonNull(principal))
            model.addAttribute("userName", principal.getName());

        return "info";
    }

    @GetMapping("/dashBoard")
    public String dashBoard(Model model, Principal principal) {
        if (Objects.nonNull(principal))
            model.addAttribute("userName", principal.getName());

        return "dashBoard";
    }
}
