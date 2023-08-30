package gamari.app.features.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import gamari.app.features.users.models.User;
import gamari.app.features.users.services.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String home(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "home";
    }
}
