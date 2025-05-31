lexer grammar AngularLexer;

IMPORT   : 'import';
COMPONENT  : '@' 'Component';
FROM : 'from';
EXPORT : 'export';
CLASS : 'class';
FOR  : 'for';
FUNICTION:'function';
CONSOLE:'console';
LOG:'log';
WHILE  : 'while';
SWITCH:'switch';
CASE : 'case';
DEFAULT:'default';
INTERFACE: 'interface';
LET : 'let';
CONST : 'const';
VAR:'var';
IN : 'in';
IF : 'if';
ELSE :'else';
AT : '@';
PROVIDEDIN: 'providedIn';
SELECTOR : 'selector';
TEMPLATE:'template';
TEMPLATEURL: 'templateUrl';
STYLEURLS : 'styleUrls';
ANY : 'any';
CONSTRUCTOR :'constructor';
SELECTPRODUCT:'selectProduct';
NGONINIT:'ngOnInit';
THIS: 'this';
ARRAY: 'array';
PRIVATE : 'private';
PUBLIC: 'public';
PROTECTED: 'protected';
EXPORTAS : 'exportas';
INJECTABLE: '@Injectable';
GET_PRODUCTS: 'getProducts';
 ONBUTTONCLICK:'onButtonClick';
 VOID: 'void';
 RETURN:'return';
INPUT : '@Input';
OUTPUT : '@Output';
Input: 'input';
NEW : 'new';

IMPLEMENTS:'implements';
EXTENDS :'extends';
ONINIT :'OnInit';
OPEN_CURLY:  '{';
CLOSE_CURLY: '}';
OPEN_DOUBLE_CURLY: '{{';
CLOSE_DOUBLE_CURLY: '}}';
OPEN_SQUARE: '[';
CLOSE_SQUARE: ']';
OPEN_PAREN : '(';
CLOSE_PAREN: ')';
COLON : ':';
COMMA: ',';
SEMICOLON : ';';
EQUALS : '=';
OR_OPERATOR: '|';
NOT_EQUAL: '!=';
STRICT_NOT_EQUAL: '!==';
BACKTICK:'`';
HHH:'/>';
ARROW  : '=>';
STRING
    : '\'' .*? '\''       // النصوص المحاطة بعلامة اقتباس مفردة
    | '"' .*? '"'         // النصوص المحاطة بعلامة اقتباس مزدوجة
    ;
    PLUS_PLUS: '++';
    MINUS_MINUS: '--';
NUMBER: [0-9]+;  // دعم الأرقام
INTEGER : [0-9]+;
PRICE: [0-9]+;
IDENTIFIER
    : [a-zA-Z_] [a-zA-Z0-9_]* // تعريف معرفات مثل ngFor
    ;


LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;

BUTTON:'button';

// الرموز HTML:
LESS_THAN: '<';
GREATER_THAN: '>';
STAR: '*';
DIVIDE: '/';
MOD: '%';
PLUS: '+';
MINUS: '-';
DOT: '.';
LS: 'ل' '.' 'س';

 Product:'product';
NG :'*ngFor';
FIXEDTAGNAME
              : 'h1' | 'h2' | 'p' | 'div' | 'ul' | 'li' | 'span'|'img'   ;
NI:'*ngIf';
NULL:'null';
ATTVALUE_VALUE:'attvalue_value';

GG:'</';
ARABIC_TEXT
    : [\u0621-\u064A0-9]+;
