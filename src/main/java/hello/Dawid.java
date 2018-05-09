package hello;

import org.springframework.stereotype.Component;

@Component
public class Dawid implements Operation {
    @Override
    public String name() {
        return "Dawid";
    }
    @Override
    public int execute (int first, int second){
        return ((first*2)-(second*10));
    }
}
