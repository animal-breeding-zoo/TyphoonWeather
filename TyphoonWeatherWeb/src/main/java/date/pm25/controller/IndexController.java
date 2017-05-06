package date.pm25.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by toy on 19/04/2017.
 */
@Controller
public class IndexController {
    @RequestMapping("/aloha")
    public String index() {
        return "index";
    }
}
