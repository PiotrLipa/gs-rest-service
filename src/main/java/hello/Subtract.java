package hello;

import org.springframework.stereotype.Component;

@Component
public class Subtract implements Operation {

    @Override
    public String name() {
        return "subtract";
    }

    @Override
    public int execute(int first, int second) {
        return first-second;
    }
}
