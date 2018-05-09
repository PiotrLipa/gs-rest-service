package hello;

import org.springframework.stereotype.Component;

@Component
public class Division implements Operation {
    @Override
    public String name() {
        return "division";
    }
    @Override
    public int execute(int first, int second){
        return first/second;
    }

}
