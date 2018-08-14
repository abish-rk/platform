package kz.lot.rest;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Secured("ROLE_USER")
@RequestMapping("/rest")
public class UserController {

    @RequestMapping(path = "/health", method = RequestMethod.GET)
    public String health(){
        return "ok";
    }
}
