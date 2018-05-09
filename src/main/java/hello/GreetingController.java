package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/adding")
    public int adding(@RequestParam(value="first") String first, @RequestParam (value = "second") String second) {

        return Integer.parseInt(first)+Integer.parseInt(second);
    }
    @RequestMapping("/subtract")
    public int subtract(@RequestParam(value = "first") String first, @RequestParam (value = "second") String second) {

        return Integer.parseInt(first)-Integer.parseInt(second);
    }
    @RequestMapping("/operation")
    public int operation(@RequestParam(value = "operation") String operation, @RequestParam(value = "first") String first, @RequestParam (value = "second") String second) {

        return operationService.execute(operation, first, second);
    }
    @Autowired
    private OperationService operationService;
}
