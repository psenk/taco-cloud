package sia.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * Controller - fetches/processes data in the application
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}