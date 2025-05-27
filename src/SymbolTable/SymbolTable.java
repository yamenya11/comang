package SymbolTable;

import java.util.*;

public class SymbolTable {
    private Map<String, SymbolEntry> symbols = new HashMap<>();
    private Set<String> importedSources = new HashSet<>();
    private Map<String, Map<String, SymbolEntry>> scopedSymbols = new HashMap<>();
    private String currentScope = "global";

    public void addSymbol(SymbolEntry entry) {
        String scope = entry.getScope();
        scopedSymbols.putIfAbsent(scope, new HashMap<>());
        scopedSymbols.get(scope).put(entry.getName(), entry);
    }

    public boolean isImported(String source) {
        return importedSources.contains(source);
    }

    public void addImported(String source) {
        importedSources.add(source);
    }

    public SymbolEntry getSymbol(String name) {
        return symbols.get(name);}
    public SymbolEntry getSymbol(String name, String scope) {
        if (scopedSymbols.containsKey(scope)) {
            return scopedSymbols.get(scope).get(name);
        }
        return null;
    }
    public String getCurrentScope() {
        return currentScope;
    }

    public void setCurrentScope(String scope) {
        this.currentScope = scope;
    }
    public boolean symbolExists(String name, String scope) {
        return scopedSymbols.containsKey(scope) && scopedSymbols.get(scope).containsKey(name);
    }
    public Collection<SymbolEntry> getAllSymbols() {
        List<SymbolEntry> allSymbols = new ArrayList<>();
        for (Map<String, SymbolEntry> scopeMap : scopedSymbols.values()) {
            allSymbols.addAll(scopeMap.values());
        }
        return allSymbols;
    }

    public void printSymbols() {
        System.out.println("Symbol Table:");
        for (String scope : scopedSymbols.keySet()) {
            System.out.println("Scope: " + scope);
            for (SymbolEntry entry : scopedSymbols.get(scope).values()) {
                System.out.println("  " + entry);
            }
        }
    }}