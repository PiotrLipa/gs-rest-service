package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class OperationService {
    @Autowired
    private List<Operation> operations;

    int execute(String pierwszy, String drugi, String trzeci) {
        return operations.stream().filter(name->name.name().equals(pierwszy)).map(operation -> operation.execute(Integer.parseInt(drugi), Integer.parseInt(trzeci))).findFirst().get();
    }

}
