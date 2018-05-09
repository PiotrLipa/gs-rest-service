package hello;

import org.springframework.stereotype.Component;

@Component
public class Multiplication implements Operation {
    @Override
    public String name() {
        return "multiplication";
    }
    @Override
    public int execute(int first, int second) {
        return first*second;
    }

}
