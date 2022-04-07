
package net.codejava;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SigninController {

    @Autowired
    private SignupService service;


    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Signup> listSignups = service.listAll();
        model.addAttribute("listSignups", listSignups);

        return "index";
    }

    @RequestMapping("/new")
    public String showNewSignPage(Model model) {
        Signup details = new Signup();
        model.addAttribute("detals", details);

        return "new_details";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveSignup(@ModelAttribute("details") Signup details) {
        service.save(details);

        return "redirect:/";
    }

    @RequestMapping("/edit/{email}")
    public ModelAndView showEditSignupPage(@PathVariable(name = "email") char email) {
        ModelAndView mav = new ModelAndView("Login");
        Signup Signup = service.get(email);
        mav.addObject("details");

        return mav;
    }

    @RequestMapping("/delete/{email}")
    public String deleteSignup(@PathVariable(name = "email") char email) {
        service.delete(email);
        return "redirect:/";
    }
}