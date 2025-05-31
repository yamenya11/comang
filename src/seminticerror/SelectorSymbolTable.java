package seminticerror;

import SymbolTable.SymbolEntry;

import java.util.HashMap;
import java.util.Map;

public class SelectorSymbolTable {
    private Map<String, SymbolEntry> selectorsByValue = new HashMap<>();

    public boolean symbolExists(String selectorValue) {
        return selectorsByValue.containsKey(selectorValue);
    }

    public void addSymbol(SymbolEntry entry) {
        selectorsByValue.put(entry.getValue(), entry);
    }

    public SymbolEntry getSymbol(String selectorValue) {
        return selectorsByValue.get(selectorValue);
    }
}
