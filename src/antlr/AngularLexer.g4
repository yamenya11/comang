lexer grammar AngularLexer;

IMPORT   : 'import';
COMPONENT  : '@' 'Component';

ROUTES : 'Routes';
FROM : 'from';
EXPORT : 'export';
CLASS : 'class';
FOR  : 'for';
NG_MODULE   : '@' 'NgModule';
IMPORTS     : 'imports';
EXPORTS     : 'exports';
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
VIEWDETAILS: 'viewDetails';
AT : '@';
ARROW  : '=>';
Input: 'input';
BEHAVIOR_SUBJECT: 'BehaviorSubject';
FORMCONTROLNAME: 'formControlName';
FORMGROUPATTR: 'formGroup';
PLACEHOLDER: 'placeholder';
PROVIDEDIN: 'providedIn';
SELECTOR : 'selector';
TEMPLATE:'template';
TEMPLATEURL: 'templateUrl';
STYLEURLS : 'styleUrls';
ANY : 'any';
QUESTION_DOT: '?.';
CONSTRUCTOR :'constructor';
SELECTPRODUCT:'selectProduct';
NGONINIT:'ngOnInit';
THIS: 'this';
ARRAY: 'array';
PRIVATE : 'private';
PUBLIC: 'public';
FORMGROUP: 'FormGroup';
FORMCONTROL: 'FormControl';
ONSUBMIT : 'onSubmit';
NEXT: 'next';
FILTER: 'filter';
ADDPRODUCT:'addProduct';
DELETPRODUCT:'deleteProduct';
PATH_MATCH: 'pathMatch';
REDIRECT_TO: 'redirectTo';
FULL: 'full';
ROUTER_MODULE : 'RouterModule';
GETPRODUCTBYID:'getProductById';
ROUTER_LINK : 'routerLink';
NAVIGATE : 'navigate';
PATH : 'path';
OBSERVABLE: 'Observable';
AS_OBSERVABLE: 'asObservable';
VALIDATORS:'Validators';
PROTECTED: 'protected';
TEXTAREA: 'textarea';
EXPORTAS : 'exportas';
INJECTABLE: '@Injectable';
GET_PRODUCTS: 'getProducts';
 ONBUTTONCLICK:'onButtonClick';
 //DECLARATIONS: 'declarations';
 //PROVIDERS: 'providers';
 BUTTON:'button';
 //ROUTE: 'route';
 SNAPSHOT: 'snapshot';
 PARAMS: 'params';
 VOID: 'void';
 RETURN:'return';
INPUT : '@Input';
OUTPUT : '@Output';
//DOLLAR: '$';
NEW : 'new';
UNIT : ('px'|'em'|'%'|'rem'|'vh'|'vw');
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
SEMIRATE:'!';
EQUALS : '=';
OR_OPERATOR: '|';
COLOR : '#' [0-9a-fA-F]+;
HASH : '#';
NOT_EQUAL: '!=';
STRICT_NOT_EQUAL: '!==';
BACKTICK:'`';
HHH:'/>';

STRING
    : '\'' .*? '\''       // النصوص المحاطة بعلامة اقتباس مفردة
    | '"' .*? '"'         // النصوص المحاطة بعلامة اقتباس مزدوجة
    ;
    PLUS_PLUS: '++';
    MINUS_MINUS: '--';
NUMBER: [0-9]+ ('.' [0-9]+)?;  // دعم الأرقام
INTEGER : [0-9]+;
PRICE: [0-9]+;

IDENTIFIER: [a-zA-Z_] [a-zA-Z0-9_$-]*;


LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;



// الرموز HTML:
LESS_THAN: '<';
GREATER_THAN: '>';
STAR: '*';
DIVIDE: '/';
MOD: '%';
PLUS: '+';
MINUS: '-';
DOT: '.';
SPREAD: '...';
LS: 'ل' '.' 'س';

Product:'product';
NG :'*ngFor';
H1    : 'h1';
H2    : 'h2';
P     : 'p';
DIV   : 'div';
UL    : 'ul';
LI    : 'li';
SPAN  : 'span';
IMG   : 'img';
FORM   : 'form';
A:'a';
NG_SUBMIT        : '(ngSubmit)';

NI:'*ngIf';
NULL:'null';
//STRUCTURAL_DIRECTIVE : '*' ('ngIf' | 'ngFor' | 'ngSwitch' | 'ngForOf');

ATTVALUE_VALUE:'attvalue_value';

GG:'</';
ARABIC_TEXT
    : [\u0621-\u064A0-9]+;
