package controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Date:  2019/2/25.
 * Time:  19:47.
 * User:  zlcbs.
 */
@Controller
@RequestMapping("home")
public class HomeController {

    @RequestMapping("one")
    public String one(){
        return "one";
    }
}
