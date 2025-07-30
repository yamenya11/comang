                parser grammar AngularParser;

                options { tokenVocab=AngularLexer; }


              program:application* ;

              application
                  : importStatement   #IMPORTLABEL
                  | component         #COMPONENTLABEL
                  | classDeclaration  #CLASSLABEL
                  | injectable        #INJECTABLELABEL
                  | routeDefinition #ROUTELABEL
                  |ngModuleDecorator #NGMODULLABEL
                  ;

          importStatement
                :IMPORT OPEN_CURLY keyimport  (COMMA keyimport)*  CLOSE_CURLY FROM STRING SEMICOLON;

     keyimport
         : ONINIT              #KEYIMPORTLABEL
         | IDENTIFIER          #KEYIMPORTLABEL
         | STRING              #KEYIMPORTLABEL
         | FORMGROUP           #KEYIMPORTLABEL
         | FORMCONTROL         #KEYIMPORTLABEL
         | VALIDATORS          #KEYIMPORTLABEL
         | BEHAVIOR_SUBJECT    #KEYIMPORTLABEL
         | ROUTER_MODULE       #KEYIMPORTLABEL
         | ROUTES              #KEYIMPORTLABEL
         ;

           component
               : COMPONENT OPEN_PAREN OPEN_CURLY metadata CLOSE_CURLY CLOSE_PAREN
               ;

           injectable :INJECTABLE OPEN_PAREN OPEN_CURLY
                      metadata
                      CLOSE_CURLY CLOSE_PAREN ;

            ngModuleDecorator
            : NG_MODULE OPEN_PAREN OPEN_CURLY ngModuleProperty (COMMA ngModuleProperty)* CLOSE_CURLY CLOSE_PAREN
            ;

            ngModuleProperty
                : IMPORTS COLON ngModuleValue         #IMPORTS_PROPERTY
                | EXPORTS COLON ngModuleValue         #EXPORTS_PROPERTY
                ;

            ngModuleValue
                : OPEN_SQUARE ngModuleElement (COMMA ngModuleElement)* CLOSE_SQUARE
                ;
            ngModuleElement
               : propertyAccessFunctionCall                         #MODULE_FUNCTION_CALL
                | IDENTIFIER                          #MODULE_IDENTIFIER
                |ROUTER_MODULE                        #ROUTEMOUDLELBEL
                |ROUTER_LINK                          #ROUTELINKLABEL
                ;

            propertyAccessFunctionCall
                : ROUTER_MODULE DOT IDENTIFIER OPEN_PAREN argumentList? CLOSE_PAREN
                ;

          routeDefinition
              : CONST IDENTIFIER COLON ROUTES EQUALS OPEN_SQUARE routeItem (COMMA routeItem)* CLOSE_SQUARE SEMICOLON
              ;

          routeItem
              : OPEN_CURLY
                (
                  (PATH COLON STRING COMMA)
                  (
                    (IDENTIFIER COLON IDENTIFIER) |
                    (REDIRECT_TO COLON STRING COMMA PATH_MATCH COLON  STRING)
                  )
                )
                CLOSE_CURLY
              ;

           metadata
               : metadataEntry? (COMMA metadataEntry)*
               ;

           metadataEntry
                   :basicMetadata    #BasicMetadataLabel
                   |htmlMetadata     #HtmlMetadataLabel
                   |selector         #SELECTORLABEL
                   |templateurl      #TAMPLATEURLLABEL
                   |providin   #PROVIDINLABEL
                   |styleUrl    #STYLEURLLABEL
               ;
           providin:PROVIDEDIN COLON STRING;

           templateurl
               :TEMPLATEURL COLON STRING;

            selector
               : SELECTOR COLON STRING
               ;
           basicMetadata
               : TEMPLATE COLON STRING
               ;

           htmlMetadata
               : TEMPLATE COLON BACKTICK htmlElement* BACKTICK
               ;
          styleUrl:STYLEURLS COLON OPEN_SQUARE BACKTICK stylesheet* BACKTICK  CLOSE_SQUARE;

           classDeclaration
               : EXPORT CLASS IDENTIFIER classInheritance? OPEN_CURLY classBody CLOSE_CURLY   ;

           classInheritance
           :extendClause      #EXTENDSLABEL
           |implementClause   #IMPLEMITIONLABEL
           ;

         extendClause  : EXTENDS IDENTIFIER;
         implementClause  :IMPLEMENTS value (COMMA IDENTIFIER)*
         ;


            getproduct
                : GET_PRODUCTS OPEN_PAREN CLOSE_PAREN OPEN_CURLY
                  (RETURN OPEN_SQUARE elementList CLOSE_SQUARE SEMICOLON | RETURN propertyAccessChain SEMICOLON)
                  CLOSE_CURLY
                ;
            privateMethodDeclaration
                : modifiers IDENTIFIER OPEN_PAREN CLOSE_PAREN (COLON basevalue)?
                  OPEN_CURLY
                    returnStatement
                  CLOSE_CURLY
                ;
          products: IDENTIFIER EQUALS  OPEN_SQUARE elementList CLOSE_SQUARE SEMICOLON    ;

           elementList  : element (COMMA element)*  ;

           element : OPEN_CURLY pair (COMMA pair)* CLOSE_CURLY     ;

           pair: basevalue COLON value    ;

           value
                : basevalue    #BASEvalueLABEL
                | arrayvalue   #ARRAYTAYPELABEL
                ;

           basevalue
                 :IDENTIFIER   #IDENTIFIRELABEL
                 |STRING       #STRINGLABEL
                 |NUMBER       # NUMBERLABEL
                 |ANY          #ANYLABEL
                 |VOID         #VOIDLABEL
                 |ONINIT       #ONINITLABEL
                 |NULL         #NULLLABEL
                 |FORMGROUP  # FORMGROUPLABEL
                | FORMCONTROL  # FORMCONTROLLABEL
                ;
          classBody : (propertyDeclaration | methodDeclaration | constructor | statement |
                      decorator | ngOnInit | selectProduct | onbutton | getproduct | products |
                      lambdaExpression | propertyAccess | functionDeclaration | whileStatement |
                      addProductFunction | formGroupDeclaration | addProductMethod |
                      deleteProductMethod|privateMethodDeclaration|getProductByIdMethod|viewdetails|formGroupAssignment )* #ClassBodyLabel;
  addProductMethod
      : ADDPRODUCT OPEN_PAREN productParameter CLOSE_PAREN (COLON VOID)?
        OPEN_CURLY
          (variableDeclaration | expressionStatement | returnStatement)*
        CLOSE_CURLY
      ;
      variableDeclaration:CONST IDENTIFIER EQUALS propertyAccess SEMICOLON;

      expressionStatement
          : methodCall SEMICOLON
          | assignment SEMICOLON
          ;

      assignment
          : propertyAccessChain EQUALS expression
          ;

   deleteProductMethod
       : DELETPRODUCT OPEN_PAREN idParameter CLOSE_PAREN
         OPEN_CURLY
           filterAssignment
           simpleNextCall
         CLOSE_CURLY
       ;
        productParameter
            : IDENTIFIER COLON ANY
            ;

        constStatement
            : CONST IDENTIFIER EQUALS propertyAccess (DOT FILTER OPEN_PAREN filterExpression CLOSE_PAREN)? SEMICOLON
            ;

            subjectNextStatement
                : propertyAccess DOT NEXT OPEN_PAREN spreadExpression CLOSE_PAREN SEMICOLON
                ;
         spreadExpression
             : SPREAD (IDENTIFIER | propertyAccess | arrayLiteral | objectLiteral)
             ;
            arrayElements
                : expression (COMMA SPREAD expression)*
                ;

            subjectFilterStatement
                : propertyAccess DOT NEXT OPEN_PAREN
                  propertyAccess DOT FILTER OPEN_PAREN
                  filterExpression
                  CLOSE_PAREN

                  CLOSE_PAREN SEMICOLON
                ;
           filterAssignment
               : CONST IDENTIFIER EQUALS propertyAccessChain DOT FILTER
                 OPEN_PAREN filterExpression CLOSE_PAREN SEMICOLON
               ;

      simpleNextCall
          : propertyAccess DOT NEXT OPEN_PAREN expression CLOSE_PAREN SEMICOLON
          ;

        filterExpression
            : IDENTIFIER ARROW propertyAccess (euals) IDENTIFIER
            ;
            euals:STRICT_NOT_EQUAL|EQUALS EQUALS|NOT_EQUAL;
            methodBody
                : OPEN_CURLY statement* CLOSE_CURLY
                ;

            propertyAccessChain
                : propertyAccess (DOT (IDENTIFIER|FILTER|NEXT))+
                ;
             idParameter
                 : IDENTIFIER COLON IDENTIFIER  // كانت: IDENTIFIER COLON NUMBER
                 ;

             propertyDeclaration
                 : regularProperty    #PROPIRTYLABEL
                 | letDeclaration     #VARIBALLABEL
                 | emptyArrayDeclaration   #DDD
                 | observablePropertyDeclaration #OBSERVABLE_PROPERTY
                  | behaviorSubjectDeclaration #BEHAVIOR_SUBJECT_PROPERTY
                 ;

               observablePropertyDeclaration
                   : IDENTIFIER EQUALS observableExpression SEMICOLON
                   ;

                observableExpression
                    : THIS DOT IDENTIFIER (DOT observableMethod)*
                    ;
                observableMethod
                    : AS_OBSERVABLE OPEN_PAREN CLOSE_PAREN
                    | IDENTIFIER OPEN_PAREN (argumentList)? CLOSE_PAREN
                    ;

                behaviorSubjectDeclaration
                    : PRIVATE? IDENTIFIER EQUALS NEW BEHAVIOR_SUBJECT LESS_THAN typeSpec GREATER_THAN OPEN_PAREN initialValue CLOSE_PAREN SEMICOLON
                    ;


                typeSpec:
                typeany     #TYPEANYLABELSE
                |typeidintfir   #TYPEIDENTFIRE
                ;


                 typeany: ANY (OPEN_SQUARE CLOSE_SQUARE)?;
              typeidintfir: IDENTIFIER (OPEN_SQUARE CLOSE_SQUARE)?
                ;

                initialValue
                    : THIS DOT functionCall
                    | expression
                    ;

              regularProperty
                  : IDENTIFIER COLON value (EQUALS expression)? SEMICOLON
                  ;
              letDeclaration
                  : typeVarible IDENTIFIER (COLON value)? EQUALS expression  SEMICOLON
                  ;
                  typeVarible:
                  LET       #LETTERMINALLABEL
                  |VAR      #VARTERMINALLABEL
                  |CONST    #CONSTTERMINALLABEL
                  ;
              emptyArrayDeclaration
                  : IDENTIFIER COLON value OPEN_SQUARE CLOSE_SQUARE EQUALS OPEN_SQUARE CLOSE_SQUARE SEMICOLON
                  ;
//////////////////////////////////////////////////////////////////////////////////
           constructor
               : CONSTRUCTOR OPEN_PAREN (parameter (COMMA parameter)*)? CLOSE_PAREN

                 OPEN_CURLY ( statement|serviceAssignment)* CLOSE_CURLY
               ;
          serviceAssignment
              : THIS DOT IDENTIFIER EQUALS (serviceCall | expression) SEMICOLON
              ;
            serviceCall
                : propertyAccessChain OPEN_PAREN argumentList? CLOSE_PAREN
                ;
           methodInvocation
               : propertyAccessChain OPEN_PAREN argumentList? CLOSE_PAREN
               ;

              getProductByIdMethod
                  : GETPRODUCTBYID OPEN_PAREN idParameter CLOSE_PAREN
                    (COLON returnType)?
                    OPEN_CURLY
                      RETURN expression SEMICOLON
                    CLOSE_CURLY
                  ;


                  returnType
                      : typeSpec     #TYPESPRCLABEL
                      | VOID         #VOIDLABELSINGLE
                      ;
             viewdetails
                 : VIEWDETAILS OPEN_PAREN idParameter CLOSE_PAREN
                   OPEN_CURLY
                     functionCall SEMICOLON
                   CLOSE_CURLY
                 ;



          loopStatement
              : FOR OPEN_PAREN LET IDENTIFIER EQUALS expression SEMICOLON expression SEMICOLON IDENTIFIER (PLUS_PLUS | MINUS_MINUS) CLOSE_PAREN OPEN_CURLY statement* CLOSE_CURLY (ELSE OPEN_CURLY statement* CLOSE_CURLY)?  #FORCLASSIC
              | FOR OPEN_PAREN LET IDENTIFIER IN IDENTIFIER (DOT IDENTIFIER)* CLOSE_PAREN OPEN_CURLY statement* CLOSE_CURLY                                          #FORIN
              ;

             whileStatement
                        : WHILE OPEN_PAREN expression CLOSE_PAREN OPEN_CURLY statement* CLOSE_CURLY;

              switchStatement
                        : SWITCH OPEN_PAREN expression CLOSE_PAREN OPEN_CURLY caseClause* CLOSE_CURLY;
            ifStatement
                : IF OPEN_PAREN ifCondition CLOSE_PAREN OPEN_CURLY statement* CLOSE_CURLY
                  (ELSE OPEN_CURLY statement* CLOSE_CURLY)?;

                  ifCondition
                      : propertyAccess  # PropertyAccessCondition
                      | equalityExpression # EqualityCondition;

                equalityExpression
                    : expression EQUALS EQUALS EQUALS expression # StrictEquality
                    | expression EQUALS EQUALS expression        # LooseEquality
                    | expression NOT_EQUAL expression            # NotEquality
                    | expression STRICT_NOT_EQUAL expression     # StrictNotEquality;

                   caseClause
                        : CASE expression COLON statement*
                        | DEFAULT COLON statement*;

                   functionDeclaration
                        : FUNICTION IDENTIFIER OPEN_PAREN parameterList? CLOSE_PAREN COLON value functionB;
                   functionB
                        : OPEN_CURLY  statement* CLOSE_CURLY;
                propertystatment: CONSOLE DOT LOG OPEN_PAREN expressionList CLOSE_PAREN SEMICOLON;

                  methodDeclaration
                 : IDENTIFIER OPEN_PAREN parameter (COMMA parameter)* CLOSE_PAREN COLON value OPEN_CURLY statement* CLOSE_CURLY;

                  parameter : modifiers? IDENTIFIER COLON value  ;

               modifiers
                   : PRIVATE       #TYPEFUN
                   | PUBLIC         #TYPEFUN
                   | PROTECTED       #TYPEFUN
                   ;

//
            addProductFunction
              : ONSUBMIT  OPEN_PAREN CLOSE_PAREN   functionB   #ADDSUBMITLABEL
              ;

            formGroupDeclaration
              : IDENTIFIER COLON FORMGROUP EQUALS NEW FORMGROUP OPEN_PAREN elementList CLOSE_PAREN SEMICOLON
              ;
          formGroupAssignment
              : IDENTIFIER EQUALS NEW FORMGROUP OPEN_PAREN OPEN_CURLY formGroupFields CLOSE_CURLY CLOSE_PAREN SEMICOLON
              ;
          formGroupFields
              : formGroupField (COMMA formGroupField)*    #FROMFAILDLABEL
              ;
          formGroupField
              : IDENTIFIER COLON formControlInit
              ;
          formControlInit
              : NEW FORMCONTROL OPEN_PAREN formControlArgs CLOSE_PAREN
              ;


          statement
              : IDENTIFIER COLON statement                            # LABELED_STATEMENT
              | expression SEMICOLON                                  # EXPRESSION_STATEMENT
              | ifStatement                                            # IF_STATEMENT
              | loopStatement                                          # LOOP_STATEMENT
              | switchStatement                                        # SWITCH_STATEMENT
              | methodDeclaration                                      # METHOD_DECLARATION_STATEMENT
              | propertyDeclaration                                    # PROPERTY_DECLARATION_STATEMENT
              | functionCall SEMICOLON                                 # FUNCTION_CALL_STATEMENT
              | IDENTIFIER EQUALS expression SEMICOLON                 # ASSIGNMENT_STATEMENT
              | returnStatement                                        # RETURN_STATEMENT
              | propertyAccess                                         # PROPERTY_ACCESS_STATEMENT
              | propertystatment                                       # CONSOLE_STATEMENT
              | letDeclaration                                         # VAR_DECLARATION_STATEMENT
              | formGroupInitialization                                #FROMGROUPLABEL
              | constStatement                                            #DDDDEE
              | subjectNextStatement                                          #DDDDDDDDDDD
              | subjectFilterStatement                                        #EEEEEEEEEEEE


                  ;

            expression
            : lambdaExpression                                    # LambdaExpr
            // عمليات حسابية ثنائية
            | expression PLUS expression                          # EXPPLUS
            | expression MINUS expression                         # EXPMINUS
            | expression STAR expression                          # EXPSTAR
            | expression DIVIDE expression                        # EXPDIVIDE
            | expression MOD expression                           # EXPMOD
            | expression LESS_THAN expression                     # EXPLESS
            | expression GREATER_THAN expression                  # EXPGREATER

            // مقارنات تساوي
            | expression EQUALS expression                        # EXPEQUALS
            | expression EQUALS EQUALS expression                 # EXP_LOOSE_EQUAL
            | expression EQUALS EQUALS EQUALS expression          # EXP_STRICT_EQUAL
            | expression NOT_EQUAL expression                     # EXP_NOT_EQUAL
            | expression STRICT_NOT_EQUAL expression              # EXP_STRICT_NOT_EQUAL

            // زيادات أو تناقصات
            | expression PLUS_PLUS                                # EXPPLUSPLUS
            | expression MINUS_MINUS                              # EXPMINMIN

            // عمليات ثنائية عامة (لو عندك binaryOp)
            | expression binaryOp expression                      # BinaryOperation

            // عمليات أحادية عامة (لو عندك unaryOp)
            | unaryOp expression                                  # UnaryOperation

            // تعبير خاص (وجوده غير واضح ولكن لو مستعمل)
            | expression '!' COLON 'FormGroup'                    # EXPSEMIRAT

            // استدعاءات الدوال
            | functionCall                                        # FUNCTIONCALLLABEL

            // وصول إلى خاصية
            | propertyAccess                                      # EXPPRO
            | propertyAccessChain                                 # PROP_CHAIN

            // كائن أو مصفوفة
            | objectLiteral                                       # ObjectLiteralExpr
            | arrayLiteral                                        # ArrayLiteralExpr

            // تعبير أولي
            | primaryExpression                                   # PrimaryExpr

            // أقواس
            | OPEN_PAREN expression CLOSE_PAREN                   # EXPPAREN

            // قيم بسيطة
            | IDENTIFIER                                          # EXPID
            | STRING                                              # EXPSTRING
            | NUMBER                                              # EXPNUMBER
            | INTEGER                                             # EXPINTEGER

            | spreadExpression                                         #KLGILGVIL
            | methodCall                                                #GHJJK
            | optionalChain                                              #JJJJKKKK

            ;

            methodCall
                : (propertyAccessChain | optionalChain) OPEN_PAREN argumentList? CLOSE_PAREN
                ;

            optionalChain
                    : propertyAccessChain (QUESTION_DOT IDENTIFIER)+
                ;

            objectLiteral
                : OPEN_CURLY (spreadExpression | objectProperty) (COMMA (spreadExpression | objectProperty))* CLOSE_CURLY
                ;
            objectProperty
              :  IDENTIFIER COLON expression
              ;
            primaryExpression
                : propertyAccess                     #PropAccessExpr
                | IDENTIFIER                         #IdExpr
                | THIS                               #ThisExprL
                | STRING                             #StrExpr
                | NUMBER                             #NumExpr
                | OPEN_PAREN expression CLOSE_PAREN #ParenExprL
                ;
            binaryOp
                : PLUS          #BinaryOpe
                | MINUS         #BinaryOpe
                | STAR          #BinaryOpe
                | DIVIDE        #BinaryOpe
                | MOD           #BinaryOpe
                | EQUALS        #BinaryOpe
                | LESS_THAN     #BinaryOpe
                | GREATER_THAN  #BinaryOpe
                ;


            unaryOp
                : PLUS_PLUS | MINUS_MINUS;

           propertyAccess
               : calfun    # CALFUNLABEL
               | iddot     # IDDOTLABEL
               | functhis  # FUNCTHISLABEL
               | asObservableCall # AS_OBSERVABLE_CALL
               | fundetails # FUNDETAILSLAB
               |fundetd #FUNCTIOND
               ;
            fundetails:(THIS DOT)? IDENTIFIER  DOT NAVIGATE;

            fundetd:(THIS DOT)? IDENTIFIER  DOT ADDPRODUCT;

           asObservableCall
               : IDENTIFIER DOT AS_OBSERVABLE OPEN_PAREN CLOSE_PAREN
               ;


            calfun
                : THIS DOT IDENTIFIER (DOT IDENTIFIER)*
                ;
           iddot:IDENTIFIER (DOT IDENTIFIER)+;
          functhis: THIS DOT IDENTIFIER DOT GET_PRODUCTS  OPEN_PAREN CLOSE_PAREN
            ;
           //seqcalfun: OPEN_PAREN THIS (DOT IDENTIFIER)+ CLOSE_PAREN;

     /* functionCall
          : propertyAccess OPEN_PAREN (expression (COMMA expression)*)? CLOSE_PAREN
          | IDENTIFIER OPEN_PAREN (expression (COMMA expression)*)? CLOSE_PAREN
          | propertyAccess OPEN_PAREN argumentList? CLOSE_PAREN
          | propertyAccess OPEN_PAREN CLOSE_PAREN SEMICOLON
          | AS_OBSERVABLE OPEN_PAREN CLOSE_PAREN
          ;*/
        functionCall
            : propertyAccess OPEN_PAREN argumentList? CLOSE_PAREN
            ;

      selectProduct
      : SELECTPRODUCT OPEN_PAREN parameter (COMMA parameter)* CLOSE_PAREN (':' VOID)? OPEN_CURLY statement* CLOSE_CURLY      #SELECTPRODUCTLABEL;

    argumentList
        : (spreadExpression | expression) (COMMA (spreadExpression | expression))*
        ;




           arrayLiteral
               : OPEN_SQUARE (spreadExpression | expression) (COMMA (spreadExpression | expression))* CLOSE_SQUARE
               ;
                interfaceDeclaration
                    : EXPORT? INTERFACE IDENTIFIER OPEN_CURLY interfaceBody CLOSE_CURLY;

                interfaceBody
                    : interfaceMember*;

                interfaceMember
                    : propertySignature
                    | methodSignature;

                propertySignature
                    : IDENTIFIER COLON value SEMICOLON;

                methodSignature
                    : IDENTIFIER OPEN_PAREN parameterList? CLOSE_PAREN COLON value SEMICOLON;

                parameterList
                    : parameter2 (COMMA parameter2)*;

                parameter2
                    : IDENTIFIER COLON value;

                 onbutton
                 : ONBUTTONCLICK OPEN_PAREN CLOSE_PAREN OPEN_CURLY basevalue OPEN_PAREN expression CLOSE_PAREN SEMICOLON CLOSE_CURLY ;

                 arrayvalue
                : basevalue OPEN_SQUARE CLOSE_SQUARE
                | ARRAY LESS_THAN basevalue GREATER_THAN;


                decorator
                :  OUTPUT OPEN_PAREN CLOSE_PAREN propertyAssignment SEMICOLON;

              propertyAssignment
                  : IDENTIFIER EQUALS expression
                  | IDENTIFIER COLON value EQUALS expression
                  |THIS DOT IDENTIFIER EQUALS expression SEMICOLON
                  ;



                 expressionList: expression (COMMA expression)*;


         ngOnInit: NGONINIT OPEN_PAREN CLOSE_PAREN COLON VOID
             OPEN_CURLY
               (statement | routeParamAssignment | serviceCall)*
             CLOSE_CURLY
           ;
           routeParamAssignment
               : CONST IDENTIFIER EQUALS unaryPlus? THIS DOT IDENTIFIER DOT SNAPSHOT DOT PARAMS (DOT IDENTIFIER | indexAccess) SEMICOLON
               ;
            indexAccess
                : OPEN_SQUARE (STRING | IDENTIFIER) CLOSE_SQUARE
                ;


            unaryPlus: PLUS;


       formGroupInitialization
        : THIS DOT IDENTIFIER EQUALS NEW FORMGROUP
          OPEN_PAREN formGroupBody CLOSE_PAREN ;


        formGroupBody
        : OPEN_CURLY formControlFields  CLOSE_CURLY;



                formControlFields
                    : formControlField (COMMA formControlField)*;
                formControlField
                    : IDENTIFIER COLON NEW 'FormControl' OPEN_PAREN formControlArgs CLOSE_PAREN;
                formControlArgs
                    : STRING (COMMA validatorExpression)?;
                validatorExpression
                    : 'Validators' DOT IDENTIFIER
                    | OPEN_SQUARE validator  (COMMA validator)* CLOSE_SQUARE;

                validator
                    : 'Validators' DOT IDENTIFIER
                    |'Validators' DOT IDENTIFIER '(' NUMBER ')';

        lambdaExpression
            : parameters ARROW expression                # LambdaExpressionExpr
            | parameters ARROW OPEN_CURLY statement* CLOSE_CURLY  # LambdaExpressionBlock
            ;

        parameters
            : IDENTIFIER
            | OPEN_PAREN parameterList? CLOSE_PAREN
            ;


            functionBody
                : expression
                | OPEN_CURLY statement* CLOSE_CURLY
                ;
         returnStatement:RETURN (expressionList | expression) SEMICOLON
                    ;



////////////////////////////////////////////html/////////////////////////////////////
         htmlElement:htmlElementassist+;

          htmlElementassist
               : standardHtmlElement      # STANDERHTMLELEMNT
                | selfClosingHtmlElement   # SELFCLOSEHTMLELEMNT
                | fixedHtmlElement         # FIXEDHTMLELEMNT
                | angularButton            # ANGULARBUTTONLABEL
                | formElement              # FORMELEMENTLABEL
                ;
              formElement:
                  LESS_THAN FORM htmlAttribute* GREATER_THAN
                  (htmlContent | formControlElement)*
                  closetag
                  ;
                  formControlElement
                      : LESS_THAN (Input | TEXTAREA) htmlAttribute* (DIVIDE GREATER_THAN | GREATER_THAN)
                      ;
      fixedtqg:LESS_THAN fixedTagName ;

        closefixedtag:GG fixedTagName GREATER_THAN ;
      standardHtmlElement:
          LESS_THAN (fixedTagName | IDENTIFIER) htmlAttribute* GREATER_THAN htmlContent* closetag;
       selfClosingHtmlElement:
           LESS_THAN (fixedTagName | IDENTIFIER) htmlAttribute* (DIVIDE GREATER_THAN | GREATER_THAN);
         fixedHtmlElement: fixedtqg  '>' htmlContent* closefixedtag ;

         angularButton: LESS_THAN BUTTON (htmlAttribute)* GREATER_THAN htmlContent* GG BUTTON GREATER_THAN ;


         opentag: LESS_THAN  IDENTIFIER ;

         closetag:GG IDENTIFIER GREATER_THAN ;




    fixedTagName
        : H1     #TagH1
        | H2     #TagH2
        | P      #TagP
        | DIV    #TagDiv
        | UL     #TagUl
        | LI     #TagLi
        | SPAN   #TagSpan
        | IMG    #TagImg
        | FORM   #FORMLABEL
        | Input  #INPUTLABEL
        | TEXTAREA #TEXTAREALABEL
        | BUTTON #BUTTONLABEL
        |A  #ALABEL

        ;

htmlAttribute
    : FORMCONTROLNAME EQUALS STRING             # FORMCONTROL_ATTRIBUTE
    | FORMGROUPATTR (EQUALS expression | bindingSyntax)  # FORMGROUP_ATTRIBUTE
    | NG_SUBMIT EQUALS expression               # NGSUBMIT_ATTRIBUTE
    | propertyBinding                           # PROPERTYBINDING_ATTRIBUTE
    | eventBinding                              # EVENTBINDING_ATTRIBUTE
    | ngIf                                      # NGIF_ATTRIBUTE
    | ngfor                                     # NGFOR_ATTRIBUTE
    | bindingSyntax                             # BINDING_SYNTAX
    | ff                                        # RAW_INPUT_ELEMENT
    | 'class' EQUALS STRING                     # CLASS_ATTRIBUTE

    ;
bindingSyntax
    : '[' IDENTIFIER ']' EQUALS expression
    | '(' IDENTIFIER ')' EQUALS expression
    ;
 ff:LESS_THAN INPUT EQUALS STRING GREATER_THAN;
         propertyBinding
             : '[' bindingIdentifier ']' (EQUALS expression)?;

     bindingIdentifier
         : IDENTIFIER (DOT IDENTIFIER)*    # IdentifierChainBinding
         | FORMGROUPATTR                   # FormGroupAttributeBinding
         | FORMCONTROLNAME                 # FormControlNameBinding
         ;
          ngIf
                :'*ngIf' EQUALS expression;
           ngfor
                :'*ngFor' EQUALS expression;
        htmlContent
            : (htmlElement | textNode | interp | errorNode)+  ;


            errorNode: . ;

           interp
               :identifierChain
                ;
           identifierChain
            : OPEN_DOUBLE_CURLY IDENTIFIER (DOT IDENTIFIER)* CLOSE_DOUBLE_CURLY ;
           eventBinding
             : '(' IDENTIFIER ')' '=' expression ;
           textNode
               :STRING
               |ARABIC_TEXT
               |WS
               |COLON
               |LS
               ;



///////////////////////////////////////////css////////////////////////
stylesheet : ruleSet+ ;

ruleSet
    : selector1 OPEN_CURLY declaration+ CLOSE_CURLY
    ;
   selector1
       : classSelector   #classSelectorLabel
       | idSelector      #idSelectorLabel
       | pseudoClassSelector  #pseudoClassSelectorLabel
       ;
       classSelector
           : DOT basevalue
           ;
          idSelector
              : HASH IDENTIFIER
              ;

          pseudoClassSelector
              : classSelector ':' IDENTIFIER
              ;

            declaration
                : property COLON value1 SEMICOLON
                ;

            property
                : IDENTIFIER (MINUS IDENTIFIER)*
                ;

           value1
               : NUMBER UNIT?        #numberValueLabel
               | COLOR               #colorValueLabel
               | IDENTIFIER          #identifierValueLabel
               | STRING              #stringValueLabel
               | cssFunction         #cssFunctionValueLabel
               ;
                cssFunction
                    : IDENTIFIER OPEN_PAREN value1 CLOSE_PAREN
                    ;