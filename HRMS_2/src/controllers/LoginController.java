package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(String username, String password, Model model) {
        // Here, you would typically validate the credentials against a database or any other authentication mechanism

        // For simplicity, let's assume the login is successful
        model.addAttribute("username", username);

        // Redirect the user to the protected page
        return "redirect:/protected";
    }

    @GetMapping("/protected")
    public String showProtectedPage() {
        return "protected";
    }
}
