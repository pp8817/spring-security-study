package io.security.springsecuritymaster;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/denied")
    public String denied() {
        return "denied";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/csrf")
    public String csrf() {
        return "csrf 적용";
    }

//    @GetMapping("/loginPage")
//    public String login() {
//        return "loginPage";
//    }
//
//    @GetMapping("/anonymous")
//    public String anonymous() {
//        return "anonymous";
//    }
//
//    @GetMapping("/authentication")
//    public String authentication(Authentication authentication) {
//        if (authentication instanceof AnonymousAuthenticationToken) {
//            return "anonymous";
//        } else {
//            return "not anonymous";
//        }
//    }
//
//    @GetMapping("/anonymousContext")
//    public String anonymousContext(@CurrentSecurityContext SecurityContext context) {
//        return context.getAuthentication().getName();
//    }
//
//    @GetMapping("/logoutSuccess")
//    public String logoutSuccess() {
//        return "logoutSuccess";
//    }
//
//    @GetMapping("/invalidSessionUrl")
//    public String invalidSessionUrl() {
//        return "invalidSessionUrl";
//    }
}
