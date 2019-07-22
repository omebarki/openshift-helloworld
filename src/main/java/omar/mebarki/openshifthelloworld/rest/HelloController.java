package omar.mebarki.openshifthelloworld.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${app.message:toto}")
    private String appMessage;

    @RequestMapping("/hello")
    public String hello() {
        return appMessage;
    }
}
