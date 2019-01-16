package cz.adastra.app.test.https.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {

    class Welcome{
        public String welcome = "ahoooooooooj";
    }

    @GetMapping("/welcome")
    @ResponseBody
    public Welcome welcomeUser() {
        return new Welcome();
    }
}
