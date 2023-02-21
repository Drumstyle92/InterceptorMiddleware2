package co.develhope.InterceptorMiddleware2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Drumstyle92
 * Controller class without interceptor control
 */
@RestController
@RequestMapping("/")
public class BasicController {

    /**
     * @return
     * Method to welcome a call with the reference mapping
     */
    @GetMapping
    public String getWelcome(){

        return "Welcome visitor!";

    }

}
