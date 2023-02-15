package co.develhope.deploy1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BasicController {

    @Autowired
    private Environment environment;

    @GetMapping
    public String getDevName(){
        return environment.getProperty("myCustomEnvs.devName");
    }

}