package seminticerror;

import SymbolTable.SymbolEntry;
import SymbolTable.SymbolType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Import {

    private final List<SymbolEntry> symbols = new ArrayList<>();
    private String currentScope = "global";

    public Collection<SymbolEntry> getAllSymbols() {
        return symbols;
    }



    public void addSymbol(SymbolEntry entry) {
        symbols.add(entry);
    }


    public boolean isImported(String importSource) {
        return symbols.stream()
                .anyMatch(entry -> entry.getType() == SymbolType.IMPORT && entry.getValue().equals(importSource));
    }

    public List<SymbolEntry> getSymbols() {
        return symbols;
    }

    public String getCurrentScope() {
        return currentScope;
    }

    public void setCurrentScope(String scope) {
        this.currentScope = scope;
    }

}
