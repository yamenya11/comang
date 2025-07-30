package seminticerror;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionSymbolTable {
    private final Map<String, List<FunctionSignature>> functions = new HashMap<>();

    public void addFunction(String name, int paramCount) {
        FunctionSignature newFunc = new FunctionSignature(name, paramCount);

        if (functions.containsKey(name)) {
            for (FunctionSignature sig : functions.get(name)) {
                if (sig.paramCount == paramCount) {
                    throw new SemanticException("Duplicate function declaration: function '" + name +
                            "' with " + paramCount + " parameters already declared.");
                }
            }
            functions.get(name).add(newFunc);
        } else {
            List<FunctionSignature> sigList = new ArrayList<>();
            sigList.add(newFunc);
            functions.put(name, sigList);
        }
    }

    public boolean hasFunction(String name, int paramCount) {
        if (!functions.containsKey(name)) return false;
        for (FunctionSignature sig : functions.get(name)) {
            if (sig.paramCount == paramCount) return true;
        }
        return false;
    }
}

class FunctionSignature {
    String name;
    int paramCount;

    public FunctionSignature(String name, int paramCount) {
        this.name = name;
        this.paramCount = paramCount;
    }
}

