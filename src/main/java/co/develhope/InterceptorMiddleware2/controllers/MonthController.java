package co.develhope.InterceptorMiddleware2.controllers;

import co.develhope.InterceptorMiddleware2.entities.MonthEntity;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Drumstyle92
 * Controller class mapped to the appropriate CRUD
 */
@RestController
@RequestMapping("/months")
public class MonthController {

    /**
     * @param httpServletRequest Parameter where we pass an HTTPServlet object to be able to modify it
     * @return Returns from an HTTP object cast to an object reference
     * Get method which through HTTpServlet takes an attribute concerning the involved object
     */
    @GetMapping
    public MonthEntity getMonth(HttpServletRequest httpServletRequest){

        MonthEntity monthEntity = (MonthEntity) httpServletRequest.getAttribute("month");

    return monthEntity;

     }

}
