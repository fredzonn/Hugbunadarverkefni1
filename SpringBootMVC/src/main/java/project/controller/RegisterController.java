package project.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.User;
import project.service.UserService;

@Controller
public class RegisterController {

    private UserService userService;


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String createUser(Model model) {
        model.addAttribute("msg", "Please Enter Your Information");

        model.addAttribute("createUser", new User());

        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String createUserPost(@ModelAttribute("createUser") User user,
                                 Model model) {

        userService.save(user);

        model.addAttribute("createUser", new User());

        return "login";
    }



}
