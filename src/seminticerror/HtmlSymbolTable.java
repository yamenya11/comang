package seminticerror;

import SymbolTable.SymbolEntry;
import SymbolTable.SymbolType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HtmlSymbolTable {
    private final Map<String, SymbolEntry> tagSymbols = new HashMap<>();
    private final List<SymbolEntry> symbols = new ArrayList<>();

    public boolean symbolExists(String tagValue) {
        return tagSymbols.containsKey(tagValue);
    }

    public void addSymbol(SymbolEntry entry) {
        if (entry.getType() == SymbolType.TAG) {
            tagSymbols.put(entry.getValue(), entry);
            symbols.add(entry); // حفظ في القائمة العامة
        }
    }

    public boolean isTagAllowed(String tagHtml) {
        return symbols.stream()
                .anyMatch(entry -> entry.getType() == SymbolType.TAG && entry.getValue().equals(tagHtml));
    }

    public SymbolEntry getSymbol(String tagValue) {
        return tagSymbols.get(tagValue);
    }

    public List<SymbolEntry> getSymbols() {
        return symbols;
    }
    }


