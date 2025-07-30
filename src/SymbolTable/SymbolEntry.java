    package SymbolTable;

    public class SymbolEntry {
        private String name;
        private SymbolType type;
        private String value;
        private String scope;
        private String sourceFile;


        public SymbolEntry(String name, SymbolType type, String value, String scope, String sourceFile) {
            this.name = name;
            this.type = type;
            this.value = value;
            this.scope = scope;
            this.sourceFile = sourceFile;
        }
        public String getName() { return name; }
        public SymbolType getType() { return type; }
        public String getValue() { return value; }
        public String getScope() { return scope; }
        public String getSourceFile() { return sourceFile; }

        public void setScope(String scope) { this.scope = scope; }
        public void setSourceFile(String sourceFile) { this.sourceFile = sourceFile; }
        @Override
        public String toString() {
            return String.format("%-15s | %-12s | %-20s | %-30s | %-20s",
                    name, type, value, scope, sourceFile);
        }

    }
