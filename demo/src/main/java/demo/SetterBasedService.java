package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by bmcveigh on 3/22/2017.
 */
@Component
public class SetterBasedService {

    private HelloWorldService helloWorldService;

    @Autowired
    public void sayHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void getMessage() {
        helloWorldService.sayHello();
    }

}
