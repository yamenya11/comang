package SymbolTable;

import java.util.*;

public class SymbolTable {
    private Map<String, SymbolEntry> symbols = new HashMap<>();
    private Set<String> importedSources = new HashSet<>();
    private String currentScope = "global";

    public void addSymbol(SymbolEntry entry) {
        symbols.put(entry.getName(), entry);
    }

    public boolean isImported(String source) {
        return importedSources.contains(source);
    }

    public void addImported(String source) {
        importedSources.add(source);
    }


    public SymbolEntry getSymbol(String name) {
        return symbols.get(name);
    }

    public String getCurrentScope() {
        return currentScope;
    }

    public void setCurrentScope(String scope) {
        this.currentScope = scope;
    }

    public Collection<SymbolEntry> getAllSymbols() {
        return symbols.values();
    }



    public void printSymbols() {
        System.out.println("Symbol Table:");
        for (SymbolEntry entry : symbols.values()) {
            System.out.println(entry);
        }
    }
}