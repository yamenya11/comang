package seminticerror;

import SymbolTable.SymbolEntry;

import java.util.HashMap;
import java.util.Map;

public class SelectorSymbolTable {
    private Map<String, SymbolEntry> selectorsByValue = new HashMap<>();

    // تحقق إذا كانت القيمة موجودة مسبقًا (أي مكررة)
    public boolean symbolExists(String selectorValue) {
        return selectorsByValue.containsKey(selectorValue);
    }

    // أضف قيمة selector مع بياناتها (SymbolEntry)
    public void addSymbol(SymbolEntry entry) {
        // هنا نفترض أن القيمة مخزنة في entry.getValue()
        selectorsByValue.put(entry.getValue(), entry);
    }

    public SymbolEntry getSymbol(String selectorValue) {
        return selectorsByValue.get(selectorValue);
    }
}
