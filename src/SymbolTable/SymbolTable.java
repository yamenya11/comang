package SymbolTable;

import java.util.*;

public class SymbolTable {
    private Map<String, SymbolEntry> symbols = new HashMap<>();
    private Set<String> importedSources = new HashSet<>();

    // نستخدم stack لإدارة scopes المتداخلة
    private Deque<String> scopeStack = new ArrayDeque<>();

    public SymbolTable() {
        scopeStack.push("global"); // البداية في ال global scope
    }

    public void addSymbol(SymbolEntry entry) {
        // ضع scope الاسم الحالي من stack اذا لم يكن محدد
        if (entry.getScope() == null || entry.getScope().isEmpty()) {
            entry.setScope(getCurrentScope());
        }
        symbols.put(entry.getName() + "@" + entry.getScope(), entry);
        // استخدم المفتاح name@scope لتفادي تكرار الاسم في scopes مختلفة
    }

    public boolean isImported(String source) {
        return importedSources.contains(source);
    }

    public void addImported(String source) {
        importedSources.add(source);
    }

    public SymbolEntry getSymbol(String name) {
        // ابحث أولاً في الـ current scope
        String currentScope = getCurrentScope();
        SymbolEntry sym = symbols.get(name + "@" + currentScope);
        if (sym != null) {
            return sym;
        }
        // لو لم تجد، ابحث في scopes أعلى (يمكن تحسين هذا لاحقاً)
        Iterator<String> it = scopeStack.descendingIterator();
        while (it.hasNext()) {
            String scope = it.next();
            sym = symbols.get(name + "@" + scope);
            if (sym != null) return sym;
        }
        return null;
    }

    public String getCurrentScope() {
        return scopeStack.peek();
    }

    public void enterScope(String scopeName) {
        String newScope = getCurrentScope() + "." + scopeName;
        scopeStack.push(newScope);
    }

    public void exitScope() {
        if (scopeStack.size() > 1) {
            scopeStack.pop();
        }
    }

    public Collection<SymbolEntry> getAllSymbols() {
        return symbols.values();
    }

    public void printSymbols() {
        System.out.println("Symbol Table:");
        System.out.println(String.format("%-15s | %-12s | %-20s | %-20s",
                "Name", "Type", "Value", "Scope"));
        System.out.println("--------------------------------------------------------------------------");
        for (SymbolEntry entry : symbols.values()) {
            System.out.println(entry);
        }
    }
}