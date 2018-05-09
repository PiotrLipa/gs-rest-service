package hello;

import org.springframework.stereotype.Component;

@Component
public class Add implements Operation {

    @Override
    public String name() {
        return "adding";
    }

    @Override
    public int execute(int first, int second) {
        return first+second;
    }
}
