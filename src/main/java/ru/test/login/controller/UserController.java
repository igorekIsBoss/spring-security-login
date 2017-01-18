package ru.test.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.test.login.model.User;

/**
 * Created by igor on 15.01.17.
 */
@Controller
public class UserController {


    @RequestMapping(value = "/login")
    public String login(Model model){
        return "login";
    }

    @RequestMapping(value = {"/", "/welcome"})
    public String welcome(Model model, @RequestParam(value="name", required = false, defaultValue = "world") String name) {
        User user = new User();
        user.setUsername("Igor");
        model.addAttribute("user", user);
        return "welcome";
    }
}
