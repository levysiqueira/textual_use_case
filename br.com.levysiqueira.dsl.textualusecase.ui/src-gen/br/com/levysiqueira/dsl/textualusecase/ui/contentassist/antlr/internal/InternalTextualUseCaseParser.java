package br.com.levysiqueira.dsl.textualusecase.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import br.com.levysiqueira.dsl.textualusecase.services.TextualUseCaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextualUseCaseParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_SINGLE_CHAR", "RULE_WS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'.'", "','", "'?'", "'\\''", "'\"'", "'-'", "'+'", "'='", "'*'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", "'@'", "'%'", "'_'", "';'", "'actors'", "'subject'", "'usecase'", "'description'", "'preCondition'", "'postCondition'", "'endbasic'", "'action'", "'['", "']'", "'if'", "'then'", "'endif'", "'while'", "'do'", "'endwhile'", "'alternative'", "'to step'", "'when'", "'endflow'", "'include'", "'basic'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SINGLE_CHAR=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=7;

    // delegates
    // delegators


        public InternalTextualUseCaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTextualUseCaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTextualUseCaseParser.tokenNames; }
    public String getGrammarFileName() { return "../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g"; }


     
     	private TextualUseCaseGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TextualUseCaseGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleUseCaseModel"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:60:1: entryRuleUseCaseModel : ruleUseCaseModel EOF ;
    public final void entryRuleUseCaseModel() throws RecognitionException {
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:61:1: ( ruleUseCaseModel EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:62:1: ruleUseCaseModel EOF
            {
             before(grammarAccess.getUseCaseModelRule()); 
            pushFollow(FOLLOW_ruleUseCaseModel_in_entryRuleUseCaseModel61);
            ruleUseCaseModel();

            state._fsp--;

             after(grammarAccess.getUseCaseModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseCaseModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUseCaseModel"


    // $ANTLR start "ruleUseCaseModel"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:69:1: ruleUseCaseModel : ( ( rule__UseCaseModel__Group__0 ) ) ;
    public final void ruleUseCaseModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:73:2: ( ( ( rule__UseCaseModel__Group__0 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:74:1: ( ( rule__UseCaseModel__Group__0 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:74:1: ( ( rule__UseCaseModel__Group__0 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:75:1: ( rule__UseCaseModel__Group__0 )
            {
             before(grammarAccess.getUseCaseModelAccess().getGroup()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:76:1: ( rule__UseCaseModel__Group__0 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:76:2: rule__UseCaseModel__Group__0
            {
            pushFollow(FOLLOW_rule__UseCaseModel__Group__0_in_ruleUseCaseModel94);
            rule__UseCaseModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseCaseModel"


    // $ANTLR start "entryRuleActor"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:90:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:91:1: ( ruleActor EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:92:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor123);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor130); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:99:1: ruleActor : ( ( rule__Actor__NameAssignment ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:103:2: ( ( ( rule__Actor__NameAssignment ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:104:1: ( ( rule__Actor__NameAssignment ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:104:1: ( ( rule__Actor__NameAssignment ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:105:1: ( rule__Actor__NameAssignment )
            {
             before(grammarAccess.getActorAccess().getNameAssignment()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:106:1: ( rule__Actor__NameAssignment )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:106:2: rule__Actor__NameAssignment
            {
            pushFollow(FOLLOW_rule__Actor__NameAssignment_in_ruleActor156);
            rule__Actor__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleSubject"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:118:1: entryRuleSubject : ruleSubject EOF ;
    public final void entryRuleSubject() throws RecognitionException {
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:119:1: ( ruleSubject EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:120:1: ruleSubject EOF
            {
             before(grammarAccess.getSubjectRule()); 
            pushFollow(FOLLOW_ruleSubject_in_entryRuleSubject183);
            ruleSubject();

            state._fsp--;

             after(grammarAccess.getSubjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubject190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubject"


    // $ANTLR start "ruleSubject"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:127:1: ruleSubject : ( ( rule__Subject__Group__0 ) ) ;
    public final void ruleSubject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:131:2: ( ( ( rule__Subject__Group__0 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:132:1: ( ( rule__Subject__Group__0 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:132:1: ( ( rule__Subject__Group__0 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:133:1: ( rule__Subject__Group__0 )
            {
             before(grammarAccess.getSubjectAccess().getGroup()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:134:1: ( rule__Subject__Group__0 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:134:2: rule__Subject__Group__0
            {
            pushFollow(FOLLOW_rule__Subject__Group__0_in_ruleSubject216);
            rule__Subject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubject"


    // $ANTLR start "entryRuleUseCase"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:146:1: entryRuleUseCase : ruleUseCase EOF ;
    public final void entryRuleUseCase() throws RecognitionException {
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:147:1: ( ruleUseCase EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:148:1: ruleUseCase EOF
            {
             before(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_ruleUseCase_in_entryRuleUseCase243);
            ruleUseCase();

            state._fsp--;

             after(grammarAccess.getUseCaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseCase250); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:155:1: ruleUseCase : ( ( rule__UseCase__Group__0 ) ) ;
    public final void ruleUseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:159:2: ( ( ( rule__UseCase__Group__0 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:160:1: ( ( rule__UseCase__Group__0 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:160:1: ( ( rule__UseCase__Group__0 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:161:1: ( rule__UseCase__Group__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:162:1: ( rule__UseCase__Group__0 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:162:2: rule__UseCase__Group__0
            {
            pushFollow(FOLLOW_rule__UseCase__Group__0_in_ruleUseCase276);
            rule__UseCase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleCondition"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:174:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:175:1: ( ruleCondition EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:176:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition303);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:183:1: ruleCondition : ( ( rule__Condition__ExpressionAssignment ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:187:2: ( ( ( rule__Condition__ExpressionAssignment ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:188:1: ( ( rule__Condition__ExpressionAssignment ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:188:1: ( ( rule__Condition__ExpressionAssignment ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:189:1: ( rule__Condition__ExpressionAssignment )
            {
             before(grammarAccess.getConditionAccess().getExpressionAssignment()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:190:1: ( rule__Condition__ExpressionAssignment )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:190:2: rule__Condition__ExpressionAssignment
            {
            pushFollow(FOLLOW_rule__Condition__ExpressionAssignment_in_ruleCondition336);
            rule__Condition__ExpressionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getExpressionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleBasicFlow"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:202:1: entryRuleBasicFlow : ruleBasicFlow EOF ;
    public final void entryRuleBasicFlow() throws RecognitionException {
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:203:1: ( ruleBasicFlow EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:204:1: ruleBasicFlow EOF
            {
             before(grammarAccess.getBasicFlowRule()); 
            pushFollow(FOLLOW_ruleBasicFlow_in_entryRuleBasicFlow363);
            ruleBasicFlow();

            state._fsp--;

             after(grammarAccess.getBasicFlowRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicFlow370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicFlow"


    // $ANTLR start "ruleBasicFlow"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:211:1: ruleBasicFlow : ( ( rule__BasicFlow__Group__0 ) ) ;
    public final void ruleBasicFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:215:2: ( ( ( rule__BasicFlow__Group__0 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:216:1: ( ( rule__BasicFlow__Group__0 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:216:1: ( ( rule__BasicFlow__Group__0 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:217:1: ( rule__BasicFlow__Group__0 )
            {
             before(grammarAccess.getBasicFlowAccess().getGroup()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:218:1: ( rule__BasicFlow__Group__0 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:218:2: rule__BasicFlow__Group__0
            {
            pushFollow(FOLLOW_rule__BasicFlow__Group__0_in_ruleBasicFlow396);
            rule__BasicFlow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicFlowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicFlow"


    // $ANTLR start "entryRuleStep"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:230:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:231:1: ( ruleStep EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:232:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep423);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:239:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:243:2: ( ( ( rule__Step__Alternatives ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:244:1: ( ( rule__Step__Alternatives ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:244:1: ( ( rule__Step__Alternatives ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:245:1: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:246:1: ( rule__Step__Alternatives )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:246:2: rule__Step__Alternatives
            {
            pushFollow(FOLLOW_rule__Step__Alternatives_in_ruleStep456);
            rule__Step__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleAction"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:258:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:259:1: ( ruleAction EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:260:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction483);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:267:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:271:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:272:1: ( ( rule__Action__Group__0 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:272:1: ( ( rule__Action__Group__0 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:273:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:274:1: ( rule__Action__Group__0 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:274:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction516);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleConditionalStatement"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:286:1: entryRuleConditionalStatement : ruleConditionalStatement EOF ;
    public final void entryRuleConditionalStatement() throws RecognitionException {
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:287:1: ( ruleConditionalStatement EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:288:1: ruleConditionalStatement EOF
            {
             before(grammarAccess.getConditionalStatementRule()); 
            pushFollow(FOLLOW_ruleConditionalStatement_in_entryRuleConditionalStatement543);
            ruleConditionalStatement();

            state._fsp--;

             after(grammarAccess.getConditionalStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalStatement550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionalStatement"


    // $ANTLR start "ruleConditionalStatement"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:295:1: ruleConditionalStatement : ( ( rule__ConditionalStatement__Group__0 ) ) ;
    public final void ruleConditionalStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:299:2: ( ( ( rule__ConditionalStatement__Group__0 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:300:1: ( ( rule__ConditionalStatement__Group__0 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:300:1: ( ( rule__ConditionalStatement__Group__0 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:301:1: ( rule__ConditionalStatement__Group__0 )
            {
             before(grammarAccess.getConditionalStatementAccess().getGroup()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:302:1: ( rule__ConditionalStatement__Group__0 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:302:2: rule__ConditionalStatement__Group__0
            {
            pushFollow(FOLLOW_rule__ConditionalStatement__Group__0_in_ruleConditionalStatement576);
            rule__ConditionalStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalStatement"


    // $ANTLR start "entryRuleLoopStatement"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:314:1: entryRuleLoopStatement : ruleLoopStatement EOF ;
    public final void entryRuleLoopStatement() throws RecognitionException {
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:315:1: ( ruleLoopStatement EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:316:1: ruleLoopStatement EOF
            {
             before(grammarAccess.getLoopStatementRule()); 
            pushFollow(FOLLOW_ruleLoopStatement_in_entryRuleLoopStatement603);
            ruleLoopStatement();

            state._fsp--;

             after(grammarAccess.getLoopStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopStatement610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoopStatement"


    // $ANTLR start "ruleLoopStatement"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:323:1: ruleLoopStatement : ( ( rule__LoopStatement__Group__0 ) ) ;
    public final void ruleLoopStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:327:2: ( ( ( rule__LoopStatement__Group__0 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:328:1: ( ( rule__LoopStatement__Group__0 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:328:1: ( ( rule__LoopStatement__Group__0 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:329:1: ( rule__LoopStatement__Group__0 )
            {
             before(grammarAccess.getLoopStatementAccess().getGroup()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:330:1: ( rule__LoopStatement__Group__0 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:330:2: rule__LoopStatement__Group__0
            {
            pushFollow(FOLLOW_rule__LoopStatement__Group__0_in_ruleLoopStatement636);
            rule__LoopStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoopStatement"


    // $ANTLR start "entryRuleAlternativeFlow"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:342:1: entryRuleAlternativeFlow : ruleAlternativeFlow EOF ;
    public final void entryRuleAlternativeFlow() throws RecognitionException {
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:343:1: ( ruleAlternativeFlow EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:344:1: ruleAlternativeFlow EOF
            {
             before(grammarAccess.getAlternativeFlowRule()); 
            pushFollow(FOLLOW_ruleAlternativeFlow_in_entryRuleAlternativeFlow663);
            ruleAlternativeFlow();

            state._fsp--;

             after(grammarAccess.getAlternativeFlowRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeFlow670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternativeFlow"


    // $ANTLR start "ruleAlternativeFlow"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:351:1: ruleAlternativeFlow : ( ( rule__AlternativeFlow__Group__0 ) ) ;
    public final void ruleAlternativeFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:355:2: ( ( ( rule__AlternativeFlow__Group__0 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:356:1: ( ( rule__AlternativeFlow__Group__0 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:356:1: ( ( rule__AlternativeFlow__Group__0 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:357:1: ( rule__AlternativeFlow__Group__0 )
            {
             before(grammarAccess.getAlternativeFlowAccess().getGroup()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:358:1: ( rule__AlternativeFlow__Group__0 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:358:2: rule__AlternativeFlow__Group__0
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group__0_in_ruleAlternativeFlow696);
            rule__AlternativeFlow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeFlowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternativeFlow"


    // $ANTLR start "entryRuleInclude"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:370:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:371:1: ( ruleInclude EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:372:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude723);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:379:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:383:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:384:1: ( ( rule__Include__Group__0 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:384:1: ( ( rule__Include__Group__0 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:385:1: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:386:1: ( rule__Include__Group__0 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:386:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude756);
            rule__Include__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleStepOrder"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:398:1: entryRuleStepOrder : ruleStepOrder EOF ;
    public final void entryRuleStepOrder() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:402:1: ( ruleStepOrder EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:403:1: ruleStepOrder EOF
            {
             before(grammarAccess.getStepOrderRule()); 
            pushFollow(FOLLOW_ruleStepOrder_in_entryRuleStepOrder788);
            ruleStepOrder();

            state._fsp--;

             after(grammarAccess.getStepOrderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepOrder795); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleStepOrder"


    // $ANTLR start "ruleStepOrder"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:413:1: ruleStepOrder : ( ( rule__StepOrder__Alternatives ) ) ;
    public final void ruleStepOrder() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:418:2: ( ( ( rule__StepOrder__Alternatives ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:419:1: ( ( rule__StepOrder__Alternatives ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:419:1: ( ( rule__StepOrder__Alternatives ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:420:1: ( rule__StepOrder__Alternatives )
            {
             before(grammarAccess.getStepOrderAccess().getAlternatives()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:421:1: ( rule__StepOrder__Alternatives )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:421:2: rule__StepOrder__Alternatives
            {
            pushFollow(FOLLOW_rule__StepOrder__Alternatives_in_ruleStepOrder825);
            rule__StepOrder__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStepOrderAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleStepOrder"


    // $ANTLR start "entryRuleName"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:434:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:435:1: ( ruleName EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:436:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName852);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName859); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:443:1: ruleName : ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:447:2: ( ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:448:1: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:448:1: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:449:1: ( ( RULE_ID ) ) ( ( RULE_ID )* )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:449:1: ( ( RULE_ID ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:450:1: ( RULE_ID )
            {
             before(grammarAccess.getNameAccess().getIDTerminalRuleCall()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:451:1: ( RULE_ID )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:451:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName888); 

            }

             after(grammarAccess.getNameAccess().getIDTerminalRuleCall()); 

            }

            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:454:1: ( ( RULE_ID )* )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:455:1: ( RULE_ID )*
            {
             before(grammarAccess.getNameAccess().getIDTerminalRuleCall()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:456:1: ( RULE_ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:456:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName901); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getNameAccess().getIDTerminalRuleCall()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleAlternativeFlowName"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:469:1: entryRuleAlternativeFlowName : ruleAlternativeFlowName EOF ;
    public final void entryRuleAlternativeFlowName() throws RecognitionException {
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:470:1: ( ruleAlternativeFlowName EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:471:1: ruleAlternativeFlowName EOF
            {
             before(grammarAccess.getAlternativeFlowNameRule()); 
            pushFollow(FOLLOW_ruleAlternativeFlowName_in_entryRuleAlternativeFlowName931);
            ruleAlternativeFlowName();

            state._fsp--;

             after(grammarAccess.getAlternativeFlowNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeFlowName938); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternativeFlowName"


    // $ANTLR start "ruleAlternativeFlowName"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:478:1: ruleAlternativeFlowName : ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) ;
    public final void ruleAlternativeFlowName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:482:2: ( ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:483:1: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:483:1: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:484:1: ( ( RULE_ID ) ) ( ( RULE_ID )* )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:484:1: ( ( RULE_ID ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:485:1: ( RULE_ID )
            {
             before(grammarAccess.getAlternativeFlowNameAccess().getIDTerminalRuleCall()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:486:1: ( RULE_ID )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:486:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternativeFlowName967); 

            }

             after(grammarAccess.getAlternativeFlowNameAccess().getIDTerminalRuleCall()); 

            }

            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:489:1: ( ( RULE_ID )* )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:490:1: ( RULE_ID )*
            {
             before(grammarAccess.getAlternativeFlowNameAccess().getIDTerminalRuleCall()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:491:1: ( RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:491:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternativeFlowName980); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getAlternativeFlowNameAccess().getIDTerminalRuleCall()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternativeFlowName"


    // $ANTLR start "entryRuleQualifiedName"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:504:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:505:1: ( ruleQualifiedName EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:506:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1010);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1017); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:513:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:517:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:518:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:518:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:519:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:520:1: ( rule__QualifiedName__Group__0 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:520:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1043);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleDescription"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:532:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:533:1: ( ruleDescription EOF )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:534:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription1070);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription1077); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:541:1: ruleDescription : ( ( ( rule__Description__Alternatives ) ) ( ( rule__Description__Alternatives )* ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:545:2: ( ( ( ( rule__Description__Alternatives ) ) ( ( rule__Description__Alternatives )* ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:546:1: ( ( ( rule__Description__Alternatives ) ) ( ( rule__Description__Alternatives )* ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:546:1: ( ( ( rule__Description__Alternatives ) ) ( ( rule__Description__Alternatives )* ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:547:1: ( ( rule__Description__Alternatives ) ) ( ( rule__Description__Alternatives )* )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:547:1: ( ( rule__Description__Alternatives ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:548:1: ( rule__Description__Alternatives )
            {
             before(grammarAccess.getDescriptionAccess().getAlternatives()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:549:1: ( rule__Description__Alternatives )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:549:2: rule__Description__Alternatives
            {
            pushFollow(FOLLOW_rule__Description__Alternatives_in_ruleDescription1105);
            rule__Description__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getAlternatives()); 

            }

            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:552:1: ( ( rule__Description__Alternatives )* )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:553:1: ( rule__Description__Alternatives )*
            {
             before(grammarAccess.getDescriptionAccess().getAlternatives()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:554:1: ( rule__Description__Alternatives )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||LA3_0==RULE_WS||(LA3_0>=12 && LA3_0<=29)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:554:2: rule__Description__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Description__Alternatives_in_ruleDescription1117);
            	    rule__Description__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDescriptionAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "rule__Step__Alternatives"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:570:1: rule__Step__Alternatives : ( ( ruleAction ) | ( ruleConditionalStatement ) | ( ruleLoopStatement ) | ( ruleInclude ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:574:1: ( ( ruleAction ) | ( ruleConditionalStatement ) | ( ruleLoopStatement ) | ( ruleInclude ) )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:575:1: ( ruleAction )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:575:1: ( ruleAction )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:576:1: ruleAction
                    {
                     before(grammarAccess.getStepAccess().getActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAction_in_rule__Step__Alternatives1159);
                    ruleAction();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:581:6: ( ruleConditionalStatement )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:581:6: ( ruleConditionalStatement )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:582:1: ruleConditionalStatement
                    {
                     before(grammarAccess.getStepAccess().getConditionalStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleConditionalStatement_in_rule__Step__Alternatives1176);
                    ruleConditionalStatement();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getConditionalStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:587:6: ( ruleLoopStatement )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:587:6: ( ruleLoopStatement )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:588:1: ruleLoopStatement
                    {
                     before(grammarAccess.getStepAccess().getLoopStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleLoopStatement_in_rule__Step__Alternatives1193);
                    ruleLoopStatement();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getLoopStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:593:6: ( ruleInclude )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:593:6: ( ruleInclude )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:594:1: ruleInclude
                    {
                     before(grammarAccess.getStepAccess().getIncludeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleInclude_in_rule__Step__Alternatives1210);
                    ruleInclude();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getIncludeParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Alternatives"


    // $ANTLR start "rule__StepOrder__Alternatives"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:604:1: rule__StepOrder__Alternatives : ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) | ( ( ( RULE_SINGLE_CHAR ) ) ( ( RULE_SINGLE_CHAR )* ) ) );
    public final void rule__StepOrder__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:608:1: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) | ( ( ( RULE_SINGLE_CHAR ) ) ( ( RULE_SINGLE_CHAR )* ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_SINGLE_CHAR) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:609:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:609:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:610:1: ( ( RULE_INT ) ) ( ( RULE_INT )* )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:610:1: ( ( RULE_INT ) )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:611:1: ( RULE_INT )
                    {
                     before(grammarAccess.getStepOrderAccess().getINTTerminalRuleCall_0()); 
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:612:1: ( RULE_INT )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:612:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StepOrder__Alternatives1245); 

                    }

                     after(grammarAccess.getStepOrderAccess().getINTTerminalRuleCall_0()); 

                    }

                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:615:1: ( ( RULE_INT )* )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:616:1: ( RULE_INT )*
                    {
                     before(grammarAccess.getStepOrderAccess().getINTTerminalRuleCall_0()); 
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:617:1: ( RULE_INT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_INT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:617:3: RULE_INT
                    	    {
                    	    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StepOrder__Alternatives1258); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                     after(grammarAccess.getStepOrderAccess().getINTTerminalRuleCall_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:622:6: ( ( ( RULE_SINGLE_CHAR ) ) ( ( RULE_SINGLE_CHAR )* ) )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:622:6: ( ( ( RULE_SINGLE_CHAR ) ) ( ( RULE_SINGLE_CHAR )* ) )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:623:1: ( ( RULE_SINGLE_CHAR ) ) ( ( RULE_SINGLE_CHAR )* )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:623:1: ( ( RULE_SINGLE_CHAR ) )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:624:1: ( RULE_SINGLE_CHAR )
                    {
                     before(grammarAccess.getStepOrderAccess().getSINGLE_CHARTerminalRuleCall_1()); 
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:625:1: ( RULE_SINGLE_CHAR )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:625:3: RULE_SINGLE_CHAR
                    {
                    match(input,RULE_SINGLE_CHAR,FOLLOW_RULE_SINGLE_CHAR_in_rule__StepOrder__Alternatives1282); 

                    }

                     after(grammarAccess.getStepOrderAccess().getSINGLE_CHARTerminalRuleCall_1()); 

                    }

                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:628:1: ( ( RULE_SINGLE_CHAR )* )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:629:1: ( RULE_SINGLE_CHAR )*
                    {
                     before(grammarAccess.getStepOrderAccess().getSINGLE_CHARTerminalRuleCall_1()); 
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:630:1: ( RULE_SINGLE_CHAR )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_SINGLE_CHAR) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:630:3: RULE_SINGLE_CHAR
                    	    {
                    	    match(input,RULE_SINGLE_CHAR,FOLLOW_RULE_SINGLE_CHAR_in_rule__StepOrder__Alternatives1295); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                     after(grammarAccess.getStepOrderAccess().getSINGLE_CHARTerminalRuleCall_1()); 

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepOrder__Alternatives"


    // $ANTLR start "rule__Description__Alternatives"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:640:1: rule__Description__Alternatives : ( ( RULE_INT ) | ( RULE_ID ) | ( RULE_WS ) | ( '.' ) | ( ',' ) | ( '?' ) | ( '\\'' ) | ( '\"' ) | ( '-' ) | ( '+' ) | ( '=' ) | ( '*' ) | ( '<' ) | ( '>' ) | ( '(' ) | ( ')' ) | ( '{' ) | ( '}' ) | ( '@' ) | ( '%' ) | ( '_' ) );
    public final void rule__Description__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:644:1: ( ( RULE_INT ) | ( RULE_ID ) | ( RULE_WS ) | ( '.' ) | ( ',' ) | ( '?' ) | ( '\\'' ) | ( '\"' ) | ( '-' ) | ( '+' ) | ( '=' ) | ( '*' ) | ( '<' ) | ( '>' ) | ( '(' ) | ( ')' ) | ( '{' ) | ( '}' ) | ( '@' ) | ( '%' ) | ( '_' ) )
            int alt8=21;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case RULE_WS:
                {
                alt8=3;
                }
                break;
            case 12:
                {
                alt8=4;
                }
                break;
            case 13:
                {
                alt8=5;
                }
                break;
            case 14:
                {
                alt8=6;
                }
                break;
            case 15:
                {
                alt8=7;
                }
                break;
            case 16:
                {
                alt8=8;
                }
                break;
            case 17:
                {
                alt8=9;
                }
                break;
            case 18:
                {
                alt8=10;
                }
                break;
            case 19:
                {
                alt8=11;
                }
                break;
            case 20:
                {
                alt8=12;
                }
                break;
            case 21:
                {
                alt8=13;
                }
                break;
            case 22:
                {
                alt8=14;
                }
                break;
            case 23:
                {
                alt8=15;
                }
                break;
            case 24:
                {
                alt8=16;
                }
                break;
            case 25:
                {
                alt8=17;
                }
                break;
            case 26:
                {
                alt8=18;
                }
                break;
            case 27:
                {
                alt8=19;
                }
                break;
            case 28:
                {
                alt8=20;
                }
                break;
            case 29:
                {
                alt8=21;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:645:1: ( RULE_INT )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:645:1: ( RULE_INT )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:646:1: RULE_INT
                    {
                     before(grammarAccess.getDescriptionAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Description__Alternatives1331); 
                     after(grammarAccess.getDescriptionAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:651:6: ( RULE_ID )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:651:6: ( RULE_ID )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:652:1: RULE_ID
                    {
                     before(grammarAccess.getDescriptionAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Description__Alternatives1348); 
                     after(grammarAccess.getDescriptionAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:657:6: ( RULE_WS )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:657:6: ( RULE_WS )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:658:1: RULE_WS
                    {
                     before(grammarAccess.getDescriptionAccess().getWSTerminalRuleCall_2()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Description__Alternatives1365); 
                     after(grammarAccess.getDescriptionAccess().getWSTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:663:6: ( '.' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:663:6: ( '.' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:664:1: '.'
                    {
                     before(grammarAccess.getDescriptionAccess().getFullStopKeyword_3()); 
                    match(input,12,FOLLOW_12_in_rule__Description__Alternatives1383); 
                     after(grammarAccess.getDescriptionAccess().getFullStopKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:671:6: ( ',' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:671:6: ( ',' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:672:1: ','
                    {
                     before(grammarAccess.getDescriptionAccess().getCommaKeyword_4()); 
                    match(input,13,FOLLOW_13_in_rule__Description__Alternatives1403); 
                     after(grammarAccess.getDescriptionAccess().getCommaKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:679:6: ( '?' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:679:6: ( '?' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:680:1: '?'
                    {
                     before(grammarAccess.getDescriptionAccess().getQuestionMarkKeyword_5()); 
                    match(input,14,FOLLOW_14_in_rule__Description__Alternatives1423); 
                     after(grammarAccess.getDescriptionAccess().getQuestionMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:687:6: ( '\\'' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:687:6: ( '\\'' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:688:1: '\\''
                    {
                     before(grammarAccess.getDescriptionAccess().getApostropheKeyword_6()); 
                    match(input,15,FOLLOW_15_in_rule__Description__Alternatives1443); 
                     after(grammarAccess.getDescriptionAccess().getApostropheKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:695:6: ( '\"' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:695:6: ( '\"' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:696:1: '\"'
                    {
                     before(grammarAccess.getDescriptionAccess().getQuotationMarkKeyword_7()); 
                    match(input,16,FOLLOW_16_in_rule__Description__Alternatives1463); 
                     after(grammarAccess.getDescriptionAccess().getQuotationMarkKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:703:6: ( '-' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:703:6: ( '-' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:704:1: '-'
                    {
                     before(grammarAccess.getDescriptionAccess().getHyphenMinusKeyword_8()); 
                    match(input,17,FOLLOW_17_in_rule__Description__Alternatives1483); 
                     after(grammarAccess.getDescriptionAccess().getHyphenMinusKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:711:6: ( '+' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:711:6: ( '+' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:712:1: '+'
                    {
                     before(grammarAccess.getDescriptionAccess().getPlusSignKeyword_9()); 
                    match(input,18,FOLLOW_18_in_rule__Description__Alternatives1503); 
                     after(grammarAccess.getDescriptionAccess().getPlusSignKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:719:6: ( '=' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:719:6: ( '=' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:720:1: '='
                    {
                     before(grammarAccess.getDescriptionAccess().getEqualsSignKeyword_10()); 
                    match(input,19,FOLLOW_19_in_rule__Description__Alternatives1523); 
                     after(grammarAccess.getDescriptionAccess().getEqualsSignKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:727:6: ( '*' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:727:6: ( '*' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:728:1: '*'
                    {
                     before(grammarAccess.getDescriptionAccess().getAsteriskKeyword_11()); 
                    match(input,20,FOLLOW_20_in_rule__Description__Alternatives1543); 
                     after(grammarAccess.getDescriptionAccess().getAsteriskKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:735:6: ( '<' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:735:6: ( '<' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:736:1: '<'
                    {
                     before(grammarAccess.getDescriptionAccess().getLessThanSignKeyword_12()); 
                    match(input,21,FOLLOW_21_in_rule__Description__Alternatives1563); 
                     after(grammarAccess.getDescriptionAccess().getLessThanSignKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:743:6: ( '>' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:743:6: ( '>' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:744:1: '>'
                    {
                     before(grammarAccess.getDescriptionAccess().getGreaterThanSignKeyword_13()); 
                    match(input,22,FOLLOW_22_in_rule__Description__Alternatives1583); 
                     after(grammarAccess.getDescriptionAccess().getGreaterThanSignKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:751:6: ( '(' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:751:6: ( '(' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:752:1: '('
                    {
                     before(grammarAccess.getDescriptionAccess().getLeftParenthesisKeyword_14()); 
                    match(input,23,FOLLOW_23_in_rule__Description__Alternatives1603); 
                     after(grammarAccess.getDescriptionAccess().getLeftParenthesisKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:759:6: ( ')' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:759:6: ( ')' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:760:1: ')'
                    {
                     before(grammarAccess.getDescriptionAccess().getRightParenthesisKeyword_15()); 
                    match(input,24,FOLLOW_24_in_rule__Description__Alternatives1623); 
                     after(grammarAccess.getDescriptionAccess().getRightParenthesisKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:767:6: ( '{' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:767:6: ( '{' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:768:1: '{'
                    {
                     before(grammarAccess.getDescriptionAccess().getLeftCurlyBracketKeyword_16()); 
                    match(input,25,FOLLOW_25_in_rule__Description__Alternatives1643); 
                     after(grammarAccess.getDescriptionAccess().getLeftCurlyBracketKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:775:6: ( '}' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:775:6: ( '}' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:776:1: '}'
                    {
                     before(grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_17()); 
                    match(input,26,FOLLOW_26_in_rule__Description__Alternatives1663); 
                     after(grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:783:6: ( '@' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:783:6: ( '@' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:784:1: '@'
                    {
                     before(grammarAccess.getDescriptionAccess().getCommercialAtKeyword_18()); 
                    match(input,27,FOLLOW_27_in_rule__Description__Alternatives1683); 
                     after(grammarAccess.getDescriptionAccess().getCommercialAtKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:791:6: ( '%' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:791:6: ( '%' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:792:1: '%'
                    {
                     before(grammarAccess.getDescriptionAccess().getPercentSignKeyword_19()); 
                    match(input,28,FOLLOW_28_in_rule__Description__Alternatives1703); 
                     after(grammarAccess.getDescriptionAccess().getPercentSignKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:799:6: ( '_' )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:799:6: ( '_' )
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:800:1: '_'
                    {
                     before(grammarAccess.getDescriptionAccess().get_Keyword_20()); 
                    match(input,29,FOLLOW_29_in_rule__Description__Alternatives1723); 
                     after(grammarAccess.getDescriptionAccess().get_Keyword_20()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Alternatives"


    // $ANTLR start "rule__UseCaseModel__Group__0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:814:1: rule__UseCaseModel__Group__0 : rule__UseCaseModel__Group__0__Impl rule__UseCaseModel__Group__1 ;
    public final void rule__UseCaseModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:818:1: ( rule__UseCaseModel__Group__0__Impl rule__UseCaseModel__Group__1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:819:2: rule__UseCaseModel__Group__0__Impl rule__UseCaseModel__Group__1
            {
            pushFollow(FOLLOW_rule__UseCaseModel__Group__0__Impl_in_rule__UseCaseModel__Group__01755);
            rule__UseCaseModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCaseModel__Group__1_in_rule__UseCaseModel__Group__01758);
            rule__UseCaseModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group__0"


    // $ANTLR start "rule__UseCaseModel__Group__0__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:826:1: rule__UseCaseModel__Group__0__Impl : ( ( rule__UseCaseModel__SubjectAssignment_0 ) ) ;
    public final void rule__UseCaseModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:830:1: ( ( ( rule__UseCaseModel__SubjectAssignment_0 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:831:1: ( ( rule__UseCaseModel__SubjectAssignment_0 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:831:1: ( ( rule__UseCaseModel__SubjectAssignment_0 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:832:1: ( rule__UseCaseModel__SubjectAssignment_0 )
            {
             before(grammarAccess.getUseCaseModelAccess().getSubjectAssignment_0()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:833:1: ( rule__UseCaseModel__SubjectAssignment_0 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:833:2: rule__UseCaseModel__SubjectAssignment_0
            {
            pushFollow(FOLLOW_rule__UseCaseModel__SubjectAssignment_0_in_rule__UseCaseModel__Group__0__Impl1785);
            rule__UseCaseModel__SubjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseModelAccess().getSubjectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group__0__Impl"


    // $ANTLR start "rule__UseCaseModel__Group__1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:843:1: rule__UseCaseModel__Group__1 : rule__UseCaseModel__Group__1__Impl rule__UseCaseModel__Group__2 ;
    public final void rule__UseCaseModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:847:1: ( rule__UseCaseModel__Group__1__Impl rule__UseCaseModel__Group__2 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:848:2: rule__UseCaseModel__Group__1__Impl rule__UseCaseModel__Group__2
            {
            pushFollow(FOLLOW_rule__UseCaseModel__Group__1__Impl_in_rule__UseCaseModel__Group__11815);
            rule__UseCaseModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCaseModel__Group__2_in_rule__UseCaseModel__Group__11818);
            rule__UseCaseModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group__1"


    // $ANTLR start "rule__UseCaseModel__Group__1__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:855:1: rule__UseCaseModel__Group__1__Impl : ( ';' ) ;
    public final void rule__UseCaseModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:859:1: ( ( ';' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:860:1: ( ';' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:860:1: ( ';' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:861:1: ';'
            {
             before(grammarAccess.getUseCaseModelAccess().getSemicolonKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__UseCaseModel__Group__1__Impl1846); 
             after(grammarAccess.getUseCaseModelAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group__1__Impl"


    // $ANTLR start "rule__UseCaseModel__Group__2"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:874:1: rule__UseCaseModel__Group__2 : rule__UseCaseModel__Group__2__Impl rule__UseCaseModel__Group__3 ;
    public final void rule__UseCaseModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:878:1: ( rule__UseCaseModel__Group__2__Impl rule__UseCaseModel__Group__3 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:879:2: rule__UseCaseModel__Group__2__Impl rule__UseCaseModel__Group__3
            {
            pushFollow(FOLLOW_rule__UseCaseModel__Group__2__Impl_in_rule__UseCaseModel__Group__21877);
            rule__UseCaseModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCaseModel__Group__3_in_rule__UseCaseModel__Group__21880);
            rule__UseCaseModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group__2"


    // $ANTLR start "rule__UseCaseModel__Group__2__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:886:1: rule__UseCaseModel__Group__2__Impl : ( 'actors' ) ;
    public final void rule__UseCaseModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:890:1: ( ( 'actors' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:891:1: ( 'actors' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:891:1: ( 'actors' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:892:1: 'actors'
            {
             before(grammarAccess.getUseCaseModelAccess().getActorsKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__UseCaseModel__Group__2__Impl1908); 
             after(grammarAccess.getUseCaseModelAccess().getActorsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group__2__Impl"


    // $ANTLR start "rule__UseCaseModel__Group__3"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:905:1: rule__UseCaseModel__Group__3 : rule__UseCaseModel__Group__3__Impl rule__UseCaseModel__Group__4 ;
    public final void rule__UseCaseModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:909:1: ( rule__UseCaseModel__Group__3__Impl rule__UseCaseModel__Group__4 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:910:2: rule__UseCaseModel__Group__3__Impl rule__UseCaseModel__Group__4
            {
            pushFollow(FOLLOW_rule__UseCaseModel__Group__3__Impl_in_rule__UseCaseModel__Group__31939);
            rule__UseCaseModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCaseModel__Group__4_in_rule__UseCaseModel__Group__31942);
            rule__UseCaseModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group__3"


    // $ANTLR start "rule__UseCaseModel__Group__3__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:917:1: rule__UseCaseModel__Group__3__Impl : ( '{' ) ;
    public final void rule__UseCaseModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:921:1: ( ( '{' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:922:1: ( '{' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:922:1: ( '{' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:923:1: '{'
            {
             before(grammarAccess.getUseCaseModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__UseCaseModel__Group__3__Impl1970); 
             after(grammarAccess.getUseCaseModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group__3__Impl"


    // $ANTLR start "rule__UseCaseModel__Group__4"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:936:1: rule__UseCaseModel__Group__4 : rule__UseCaseModel__Group__4__Impl rule__UseCaseModel__Group__5 ;
    public final void rule__UseCaseModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:940:1: ( rule__UseCaseModel__Group__4__Impl rule__UseCaseModel__Group__5 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:941:2: rule__UseCaseModel__Group__4__Impl rule__UseCaseModel__Group__5
            {
            pushFollow(FOLLOW_rule__UseCaseModel__Group__4__Impl_in_rule__UseCaseModel__Group__42001);
            rule__UseCaseModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCaseModel__Group__5_in_rule__UseCaseModel__Group__42004);
            rule__UseCaseModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group__4"


    // $ANTLR start "rule__UseCaseModel__Group__4__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:948:1: rule__UseCaseModel__Group__4__Impl : ( ( rule__UseCaseModel__ActorAssignment_4 ) ) ;
    public final void rule__UseCaseModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:952:1: ( ( ( rule__UseCaseModel__ActorAssignment_4 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:953:1: ( ( rule__UseCaseModel__ActorAssignment_4 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:953:1: ( ( rule__UseCaseModel__ActorAssignment_4 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:954:1: ( rule__UseCaseModel__ActorAssignment_4 )
            {
             before(grammarAccess.getUseCaseModelAccess().getActorAssignment_4()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:955:1: ( rule__UseCaseModel__ActorAssignment_4 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:955:2: rule__UseCaseModel__ActorAssignment_4
            {
            pushFollow(FOLLOW_rule__UseCaseModel__ActorAssignment_4_in_rule__UseCaseModel__Group__4__Impl2031);
            rule__UseCaseModel__ActorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseModelAccess().getActorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group__4__Impl"


    // $ANTLR start "rule__UseCaseModel__Group__5"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:965:1: rule__UseCaseModel__Group__5 : rule__UseCaseModel__Group__5__Impl rule__UseCaseModel__Group__6 ;
    public final void rule__UseCaseModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:969:1: ( rule__UseCaseModel__Group__5__Impl rule__UseCaseModel__Group__6 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:970:2: rule__UseCaseModel__Group__5__Impl rule__UseCaseModel__Group__6
            {
            pushFollow(FOLLOW_rule__UseCaseModel__Group__5__Impl_in_rule__UseCaseModel__Group__52061);
            rule__UseCaseModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCaseModel__Group__6_in_rule__UseCaseModel__Group__52064);
            rule__UseCaseModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group__5"


    // $ANTLR start "rule__UseCaseModel__Group__5__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:977:1: rule__UseCaseModel__Group__5__Impl : ( ( rule__UseCaseModel__Group_5__0 )* ) ;
    public final void rule__UseCaseModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:981:1: ( ( ( rule__UseCaseModel__Group_5__0 )* ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:982:1: ( ( rule__UseCaseModel__Group_5__0 )* )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:982:1: ( ( rule__UseCaseModel__Group_5__0 )* )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:983:1: ( rule__UseCaseModel__Group_5__0 )*
            {
             before(grammarAccess.getUseCaseModelAccess().getGroup_5()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:984:1: ( rule__UseCaseModel__Group_5__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:984:2: rule__UseCaseModel__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__UseCaseModel__Group_5__0_in_rule__UseCaseModel__Group__5__Impl2091);
            	    rule__UseCaseModel__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getUseCaseModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group__5__Impl"


    // $ANTLR start "rule__UseCaseModel__Group__6"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:994:1: rule__UseCaseModel__Group__6 : rule__UseCaseModel__Group__6__Impl rule__UseCaseModel__Group__7 ;
    public final void rule__UseCaseModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:998:1: ( rule__UseCaseModel__Group__6__Impl rule__UseCaseModel__Group__7 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:999:2: rule__UseCaseModel__Group__6__Impl rule__UseCaseModel__Group__7
            {
            pushFollow(FOLLOW_rule__UseCaseModel__Group__6__Impl_in_rule__UseCaseModel__Group__62122);
            rule__UseCaseModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCaseModel__Group__7_in_rule__UseCaseModel__Group__62125);
            rule__UseCaseModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group__6"


    // $ANTLR start "rule__UseCaseModel__Group__6__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1006:1: rule__UseCaseModel__Group__6__Impl : ( '}' ) ;
    public final void rule__UseCaseModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1010:1: ( ( '}' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1011:1: ( '}' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1011:1: ( '}' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1012:1: '}'
            {
             before(grammarAccess.getUseCaseModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_26_in_rule__UseCaseModel__Group__6__Impl2153); 
             after(grammarAccess.getUseCaseModelAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group__6__Impl"


    // $ANTLR start "rule__UseCaseModel__Group__7"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1025:1: rule__UseCaseModel__Group__7 : rule__UseCaseModel__Group__7__Impl ;
    public final void rule__UseCaseModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1029:1: ( rule__UseCaseModel__Group__7__Impl )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1030:2: rule__UseCaseModel__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__UseCaseModel__Group__7__Impl_in_rule__UseCaseModel__Group__72184);
            rule__UseCaseModel__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group__7"


    // $ANTLR start "rule__UseCaseModel__Group__7__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1036:1: rule__UseCaseModel__Group__7__Impl : ( ( rule__UseCaseModel__UseCaseAssignment_7 )* ) ;
    public final void rule__UseCaseModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1040:1: ( ( ( rule__UseCaseModel__UseCaseAssignment_7 )* ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1041:1: ( ( rule__UseCaseModel__UseCaseAssignment_7 )* )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1041:1: ( ( rule__UseCaseModel__UseCaseAssignment_7 )* )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1042:1: ( rule__UseCaseModel__UseCaseAssignment_7 )*
            {
             before(grammarAccess.getUseCaseModelAccess().getUseCaseAssignment_7()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1043:1: ( rule__UseCaseModel__UseCaseAssignment_7 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1043:2: rule__UseCaseModel__UseCaseAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__UseCaseModel__UseCaseAssignment_7_in_rule__UseCaseModel__Group__7__Impl2211);
            	    rule__UseCaseModel__UseCaseAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getUseCaseModelAccess().getUseCaseAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group__7__Impl"


    // $ANTLR start "rule__UseCaseModel__Group_5__0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1069:1: rule__UseCaseModel__Group_5__0 : rule__UseCaseModel__Group_5__0__Impl rule__UseCaseModel__Group_5__1 ;
    public final void rule__UseCaseModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1073:1: ( rule__UseCaseModel__Group_5__0__Impl rule__UseCaseModel__Group_5__1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1074:2: rule__UseCaseModel__Group_5__0__Impl rule__UseCaseModel__Group_5__1
            {
            pushFollow(FOLLOW_rule__UseCaseModel__Group_5__0__Impl_in_rule__UseCaseModel__Group_5__02258);
            rule__UseCaseModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCaseModel__Group_5__1_in_rule__UseCaseModel__Group_5__02261);
            rule__UseCaseModel__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group_5__0"


    // $ANTLR start "rule__UseCaseModel__Group_5__0__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1081:1: rule__UseCaseModel__Group_5__0__Impl : ( ',' ) ;
    public final void rule__UseCaseModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1085:1: ( ( ',' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1086:1: ( ',' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1086:1: ( ',' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1087:1: ','
            {
             before(grammarAccess.getUseCaseModelAccess().getCommaKeyword_5_0()); 
            match(input,13,FOLLOW_13_in_rule__UseCaseModel__Group_5__0__Impl2289); 
             after(grammarAccess.getUseCaseModelAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group_5__0__Impl"


    // $ANTLR start "rule__UseCaseModel__Group_5__1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1100:1: rule__UseCaseModel__Group_5__1 : rule__UseCaseModel__Group_5__1__Impl ;
    public final void rule__UseCaseModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1104:1: ( rule__UseCaseModel__Group_5__1__Impl )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1105:2: rule__UseCaseModel__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__UseCaseModel__Group_5__1__Impl_in_rule__UseCaseModel__Group_5__12320);
            rule__UseCaseModel__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group_5__1"


    // $ANTLR start "rule__UseCaseModel__Group_5__1__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1111:1: rule__UseCaseModel__Group_5__1__Impl : ( ( rule__UseCaseModel__ActorAssignment_5_1 ) ) ;
    public final void rule__UseCaseModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1115:1: ( ( ( rule__UseCaseModel__ActorAssignment_5_1 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1116:1: ( ( rule__UseCaseModel__ActorAssignment_5_1 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1116:1: ( ( rule__UseCaseModel__ActorAssignment_5_1 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1117:1: ( rule__UseCaseModel__ActorAssignment_5_1 )
            {
             before(grammarAccess.getUseCaseModelAccess().getActorAssignment_5_1()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1118:1: ( rule__UseCaseModel__ActorAssignment_5_1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1118:2: rule__UseCaseModel__ActorAssignment_5_1
            {
            pushFollow(FOLLOW_rule__UseCaseModel__ActorAssignment_5_1_in_rule__UseCaseModel__Group_5__1__Impl2347);
            rule__UseCaseModel__ActorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseModelAccess().getActorAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__Group_5__1__Impl"


    // $ANTLR start "rule__Subject__Group__0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1132:1: rule__Subject__Group__0 : rule__Subject__Group__0__Impl rule__Subject__Group__1 ;
    public final void rule__Subject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1136:1: ( rule__Subject__Group__0__Impl rule__Subject__Group__1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1137:2: rule__Subject__Group__0__Impl rule__Subject__Group__1
            {
            pushFollow(FOLLOW_rule__Subject__Group__0__Impl_in_rule__Subject__Group__02381);
            rule__Subject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subject__Group__1_in_rule__Subject__Group__02384);
            rule__Subject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__0"


    // $ANTLR start "rule__Subject__Group__0__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1144:1: rule__Subject__Group__0__Impl : ( 'subject' ) ;
    public final void rule__Subject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1148:1: ( ( 'subject' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1149:1: ( 'subject' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1149:1: ( 'subject' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1150:1: 'subject'
            {
             before(grammarAccess.getSubjectAccess().getSubjectKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Subject__Group__0__Impl2412); 
             after(grammarAccess.getSubjectAccess().getSubjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__0__Impl"


    // $ANTLR start "rule__Subject__Group__1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1163:1: rule__Subject__Group__1 : rule__Subject__Group__1__Impl ;
    public final void rule__Subject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1167:1: ( rule__Subject__Group__1__Impl )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1168:2: rule__Subject__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Subject__Group__1__Impl_in_rule__Subject__Group__12443);
            rule__Subject__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__1"


    // $ANTLR start "rule__Subject__Group__1__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1174:1: rule__Subject__Group__1__Impl : ( ( rule__Subject__NameAssignment_1 ) ) ;
    public final void rule__Subject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1178:1: ( ( ( rule__Subject__NameAssignment_1 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1179:1: ( ( rule__Subject__NameAssignment_1 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1179:1: ( ( rule__Subject__NameAssignment_1 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1180:1: ( rule__Subject__NameAssignment_1 )
            {
             before(grammarAccess.getSubjectAccess().getNameAssignment_1()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1181:1: ( rule__Subject__NameAssignment_1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1181:2: rule__Subject__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Subject__NameAssignment_1_in_rule__Subject__Group__1__Impl2470);
            rule__Subject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__1__Impl"


    // $ANTLR start "rule__UseCase__Group__0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1195:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1199:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1200:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
            {
            pushFollow(FOLLOW_rule__UseCase__Group__0__Impl_in_rule__UseCase__Group__02504);
            rule__UseCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__1_in_rule__UseCase__Group__02507);
            rule__UseCase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__0"


    // $ANTLR start "rule__UseCase__Group__0__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1207:1: rule__UseCase__Group__0__Impl : ( 'usecase' ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1211:1: ( ( 'usecase' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1212:1: ( 'usecase' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1212:1: ( 'usecase' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1213:1: 'usecase'
            {
             before(grammarAccess.getUseCaseAccess().getUsecaseKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__UseCase__Group__0__Impl2535); 
             after(grammarAccess.getUseCaseAccess().getUsecaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__0__Impl"


    // $ANTLR start "rule__UseCase__Group__1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1226:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1230:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1231:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
            {
            pushFollow(FOLLOW_rule__UseCase__Group__1__Impl_in_rule__UseCase__Group__12566);
            rule__UseCase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__2_in_rule__UseCase__Group__12569);
            rule__UseCase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__1"


    // $ANTLR start "rule__UseCase__Group__1__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1238:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1242:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1243:1: ( ( rule__UseCase__NameAssignment_1 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1243:1: ( ( rule__UseCase__NameAssignment_1 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1244:1: ( rule__UseCase__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1245:1: ( rule__UseCase__NameAssignment_1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1245:2: rule__UseCase__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UseCase__NameAssignment_1_in_rule__UseCase__Group__1__Impl2596);
            rule__UseCase__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__1__Impl"


    // $ANTLR start "rule__UseCase__Group__2"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1255:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1259:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1260:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
            {
            pushFollow(FOLLOW_rule__UseCase__Group__2__Impl_in_rule__UseCase__Group__22626);
            rule__UseCase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__3_in_rule__UseCase__Group__22629);
            rule__UseCase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__2"


    // $ANTLR start "rule__UseCase__Group__2__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1267:1: rule__UseCase__Group__2__Impl : ( '{' ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1271:1: ( ( '{' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1272:1: ( '{' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1272:1: ( '{' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1273:1: '{'
            {
             before(grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__UseCase__Group__2__Impl2657); 
             after(grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__2__Impl"


    // $ANTLR start "rule__UseCase__Group__3"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1286:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1290:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1291:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
            {
            pushFollow(FOLLOW_rule__UseCase__Group__3__Impl_in_rule__UseCase__Group__32688);
            rule__UseCase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__4_in_rule__UseCase__Group__32691);
            rule__UseCase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__3"


    // $ANTLR start "rule__UseCase__Group__3__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1298:1: rule__UseCase__Group__3__Impl : ( 'description' ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1302:1: ( ( 'description' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1303:1: ( 'description' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1303:1: ( 'description' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1304:1: 'description'
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__UseCase__Group__3__Impl2719); 
             after(grammarAccess.getUseCaseAccess().getDescriptionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__3__Impl"


    // $ANTLR start "rule__UseCase__Group__4"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1317:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1321:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1322:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
            {
            pushFollow(FOLLOW_rule__UseCase__Group__4__Impl_in_rule__UseCase__Group__42750);
            rule__UseCase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__5_in_rule__UseCase__Group__42753);
            rule__UseCase__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__4"


    // $ANTLR start "rule__UseCase__Group__4__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1329:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__DescriptionAssignment_4 ) ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1333:1: ( ( ( rule__UseCase__DescriptionAssignment_4 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1334:1: ( ( rule__UseCase__DescriptionAssignment_4 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1334:1: ( ( rule__UseCase__DescriptionAssignment_4 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1335:1: ( rule__UseCase__DescriptionAssignment_4 )
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionAssignment_4()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1336:1: ( rule__UseCase__DescriptionAssignment_4 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1336:2: rule__UseCase__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_rule__UseCase__DescriptionAssignment_4_in_rule__UseCase__Group__4__Impl2780);
            rule__UseCase__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__4__Impl"


    // $ANTLR start "rule__UseCase__Group__5"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1346:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1350:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1351:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
            {
            pushFollow(FOLLOW_rule__UseCase__Group__5__Impl_in_rule__UseCase__Group__52810);
            rule__UseCase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__6_in_rule__UseCase__Group__52813);
            rule__UseCase__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__5"


    // $ANTLR start "rule__UseCase__Group__5__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1358:1: rule__UseCase__Group__5__Impl : ( ';' ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1362:1: ( ( ';' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1363:1: ( ';' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1363:1: ( ';' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1364:1: ';'
            {
             before(grammarAccess.getUseCaseAccess().getSemicolonKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__UseCase__Group__5__Impl2841); 
             after(grammarAccess.getUseCaseAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__5__Impl"


    // $ANTLR start "rule__UseCase__Group__6"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1377:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1381:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1382:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
            {
            pushFollow(FOLLOW_rule__UseCase__Group__6__Impl_in_rule__UseCase__Group__62872);
            rule__UseCase__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__7_in_rule__UseCase__Group__62875);
            rule__UseCase__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__6"


    // $ANTLR start "rule__UseCase__Group__6__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1389:1: rule__UseCase__Group__6__Impl : ( 'actors' ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1393:1: ( ( 'actors' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1394:1: ( 'actors' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1394:1: ( 'actors' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1395:1: 'actors'
            {
             before(grammarAccess.getUseCaseAccess().getActorsKeyword_6()); 
            match(input,31,FOLLOW_31_in_rule__UseCase__Group__6__Impl2903); 
             after(grammarAccess.getUseCaseAccess().getActorsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__6__Impl"


    // $ANTLR start "rule__UseCase__Group__7"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1408:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1412:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1413:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
            {
            pushFollow(FOLLOW_rule__UseCase__Group__7__Impl_in_rule__UseCase__Group__72934);
            rule__UseCase__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__8_in_rule__UseCase__Group__72937);
            rule__UseCase__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__7"


    // $ANTLR start "rule__UseCase__Group__7__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1420:1: rule__UseCase__Group__7__Impl : ( ( rule__UseCase__ActorAssignment_7 ) ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1424:1: ( ( ( rule__UseCase__ActorAssignment_7 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1425:1: ( ( rule__UseCase__ActorAssignment_7 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1425:1: ( ( rule__UseCase__ActorAssignment_7 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1426:1: ( rule__UseCase__ActorAssignment_7 )
            {
             before(grammarAccess.getUseCaseAccess().getActorAssignment_7()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1427:1: ( rule__UseCase__ActorAssignment_7 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1427:2: rule__UseCase__ActorAssignment_7
            {
            pushFollow(FOLLOW_rule__UseCase__ActorAssignment_7_in_rule__UseCase__Group__7__Impl2964);
            rule__UseCase__ActorAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getActorAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__7__Impl"


    // $ANTLR start "rule__UseCase__Group__8"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1437:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl rule__UseCase__Group__9 ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1441:1: ( rule__UseCase__Group__8__Impl rule__UseCase__Group__9 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1442:2: rule__UseCase__Group__8__Impl rule__UseCase__Group__9
            {
            pushFollow(FOLLOW_rule__UseCase__Group__8__Impl_in_rule__UseCase__Group__82994);
            rule__UseCase__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__9_in_rule__UseCase__Group__82997);
            rule__UseCase__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__8"


    // $ANTLR start "rule__UseCase__Group__8__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1449:1: rule__UseCase__Group__8__Impl : ( ( rule__UseCase__Group_8__0 )* ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1453:1: ( ( ( rule__UseCase__Group_8__0 )* ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1454:1: ( ( rule__UseCase__Group_8__0 )* )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1454:1: ( ( rule__UseCase__Group_8__0 )* )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1455:1: ( rule__UseCase__Group_8__0 )*
            {
             before(grammarAccess.getUseCaseAccess().getGroup_8()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1456:1: ( rule__UseCase__Group_8__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1456:2: rule__UseCase__Group_8__0
            	    {
            	    pushFollow(FOLLOW_rule__UseCase__Group_8__0_in_rule__UseCase__Group__8__Impl3024);
            	    rule__UseCase__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__8__Impl"


    // $ANTLR start "rule__UseCase__Group__9"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1466:1: rule__UseCase__Group__9 : rule__UseCase__Group__9__Impl rule__UseCase__Group__10 ;
    public final void rule__UseCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1470:1: ( rule__UseCase__Group__9__Impl rule__UseCase__Group__10 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1471:2: rule__UseCase__Group__9__Impl rule__UseCase__Group__10
            {
            pushFollow(FOLLOW_rule__UseCase__Group__9__Impl_in_rule__UseCase__Group__93055);
            rule__UseCase__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__10_in_rule__UseCase__Group__93058);
            rule__UseCase__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__9"


    // $ANTLR start "rule__UseCase__Group__9__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1478:1: rule__UseCase__Group__9__Impl : ( ';' ) ;
    public final void rule__UseCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1482:1: ( ( ';' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1483:1: ( ';' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1483:1: ( ';' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1484:1: ';'
            {
             before(grammarAccess.getUseCaseAccess().getSemicolonKeyword_9()); 
            match(input,30,FOLLOW_30_in_rule__UseCase__Group__9__Impl3086); 
             after(grammarAccess.getUseCaseAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__9__Impl"


    // $ANTLR start "rule__UseCase__Group__10"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1497:1: rule__UseCase__Group__10 : rule__UseCase__Group__10__Impl rule__UseCase__Group__11 ;
    public final void rule__UseCase__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1501:1: ( rule__UseCase__Group__10__Impl rule__UseCase__Group__11 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1502:2: rule__UseCase__Group__10__Impl rule__UseCase__Group__11
            {
            pushFollow(FOLLOW_rule__UseCase__Group__10__Impl_in_rule__UseCase__Group__103117);
            rule__UseCase__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__11_in_rule__UseCase__Group__103120);
            rule__UseCase__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__10"


    // $ANTLR start "rule__UseCase__Group__10__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1509:1: rule__UseCase__Group__10__Impl : ( ( rule__UseCase__Group_10__0 )? ) ;
    public final void rule__UseCase__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1513:1: ( ( ( rule__UseCase__Group_10__0 )? ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1514:1: ( ( rule__UseCase__Group_10__0 )? )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1514:1: ( ( rule__UseCase__Group_10__0 )? )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1515:1: ( rule__UseCase__Group_10__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_10()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1516:1: ( rule__UseCase__Group_10__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1516:2: rule__UseCase__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__UseCase__Group_10__0_in_rule__UseCase__Group__10__Impl3147);
                    rule__UseCase__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__10__Impl"


    // $ANTLR start "rule__UseCase__Group__11"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1526:1: rule__UseCase__Group__11 : rule__UseCase__Group__11__Impl rule__UseCase__Group__12 ;
    public final void rule__UseCase__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1530:1: ( rule__UseCase__Group__11__Impl rule__UseCase__Group__12 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1531:2: rule__UseCase__Group__11__Impl rule__UseCase__Group__12
            {
            pushFollow(FOLLOW_rule__UseCase__Group__11__Impl_in_rule__UseCase__Group__113178);
            rule__UseCase__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__12_in_rule__UseCase__Group__113181);
            rule__UseCase__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__11"


    // $ANTLR start "rule__UseCase__Group__11__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1538:1: rule__UseCase__Group__11__Impl : ( ( rule__UseCase__BasicFlowAssignment_11 ) ) ;
    public final void rule__UseCase__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1542:1: ( ( ( rule__UseCase__BasicFlowAssignment_11 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1543:1: ( ( rule__UseCase__BasicFlowAssignment_11 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1543:1: ( ( rule__UseCase__BasicFlowAssignment_11 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1544:1: ( rule__UseCase__BasicFlowAssignment_11 )
            {
             before(grammarAccess.getUseCaseAccess().getBasicFlowAssignment_11()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1545:1: ( rule__UseCase__BasicFlowAssignment_11 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1545:2: rule__UseCase__BasicFlowAssignment_11
            {
            pushFollow(FOLLOW_rule__UseCase__BasicFlowAssignment_11_in_rule__UseCase__Group__11__Impl3208);
            rule__UseCase__BasicFlowAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getBasicFlowAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__11__Impl"


    // $ANTLR start "rule__UseCase__Group__12"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1555:1: rule__UseCase__Group__12 : rule__UseCase__Group__12__Impl rule__UseCase__Group__13 ;
    public final void rule__UseCase__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1559:1: ( rule__UseCase__Group__12__Impl rule__UseCase__Group__13 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1560:2: rule__UseCase__Group__12__Impl rule__UseCase__Group__13
            {
            pushFollow(FOLLOW_rule__UseCase__Group__12__Impl_in_rule__UseCase__Group__123238);
            rule__UseCase__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__13_in_rule__UseCase__Group__123241);
            rule__UseCase__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__12"


    // $ANTLR start "rule__UseCase__Group__12__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1567:1: rule__UseCase__Group__12__Impl : ( ( rule__UseCase__AlternativeFlowAssignment_12 )* ) ;
    public final void rule__UseCase__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1571:1: ( ( ( rule__UseCase__AlternativeFlowAssignment_12 )* ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1572:1: ( ( rule__UseCase__AlternativeFlowAssignment_12 )* )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1572:1: ( ( rule__UseCase__AlternativeFlowAssignment_12 )* )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1573:1: ( rule__UseCase__AlternativeFlowAssignment_12 )*
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeFlowAssignment_12()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1574:1: ( rule__UseCase__AlternativeFlowAssignment_12 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==47) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1574:2: rule__UseCase__AlternativeFlowAssignment_12
            	    {
            	    pushFollow(FOLLOW_rule__UseCase__AlternativeFlowAssignment_12_in_rule__UseCase__Group__12__Impl3268);
            	    rule__UseCase__AlternativeFlowAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getAlternativeFlowAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__12__Impl"


    // $ANTLR start "rule__UseCase__Group__13"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1584:1: rule__UseCase__Group__13 : rule__UseCase__Group__13__Impl rule__UseCase__Group__14 ;
    public final void rule__UseCase__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1588:1: ( rule__UseCase__Group__13__Impl rule__UseCase__Group__14 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1589:2: rule__UseCase__Group__13__Impl rule__UseCase__Group__14
            {
            pushFollow(FOLLOW_rule__UseCase__Group__13__Impl_in_rule__UseCase__Group__133299);
            rule__UseCase__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__14_in_rule__UseCase__Group__133302);
            rule__UseCase__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__13"


    // $ANTLR start "rule__UseCase__Group__13__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1596:1: rule__UseCase__Group__13__Impl : ( ( rule__UseCase__Group_13__0 )? ) ;
    public final void rule__UseCase__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1600:1: ( ( ( rule__UseCase__Group_13__0 )? ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1601:1: ( ( rule__UseCase__Group_13__0 )? )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1601:1: ( ( rule__UseCase__Group_13__0 )? )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1602:1: ( rule__UseCase__Group_13__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_13()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1603:1: ( rule__UseCase__Group_13__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1603:2: rule__UseCase__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__UseCase__Group_13__0_in_rule__UseCase__Group__13__Impl3329);
                    rule__UseCase__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__13__Impl"


    // $ANTLR start "rule__UseCase__Group__14"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1613:1: rule__UseCase__Group__14 : rule__UseCase__Group__14__Impl ;
    public final void rule__UseCase__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1617:1: ( rule__UseCase__Group__14__Impl )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1618:2: rule__UseCase__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__UseCase__Group__14__Impl_in_rule__UseCase__Group__143360);
            rule__UseCase__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__14"


    // $ANTLR start "rule__UseCase__Group__14__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1624:1: rule__UseCase__Group__14__Impl : ( '}' ) ;
    public final void rule__UseCase__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1628:1: ( ( '}' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1629:1: ( '}' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1629:1: ( '}' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1630:1: '}'
            {
             before(grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_26_in_rule__UseCase__Group__14__Impl3388); 
             after(grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__14__Impl"


    // $ANTLR start "rule__UseCase__Group_8__0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1673:1: rule__UseCase__Group_8__0 : rule__UseCase__Group_8__0__Impl rule__UseCase__Group_8__1 ;
    public final void rule__UseCase__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1677:1: ( rule__UseCase__Group_8__0__Impl rule__UseCase__Group_8__1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1678:2: rule__UseCase__Group_8__0__Impl rule__UseCase__Group_8__1
            {
            pushFollow(FOLLOW_rule__UseCase__Group_8__0__Impl_in_rule__UseCase__Group_8__03449);
            rule__UseCase__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group_8__1_in_rule__UseCase__Group_8__03452);
            rule__UseCase__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_8__0"


    // $ANTLR start "rule__UseCase__Group_8__0__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1685:1: rule__UseCase__Group_8__0__Impl : ( ',' ) ;
    public final void rule__UseCase__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1689:1: ( ( ',' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1690:1: ( ',' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1690:1: ( ',' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1691:1: ','
            {
             before(grammarAccess.getUseCaseAccess().getCommaKeyword_8_0()); 
            match(input,13,FOLLOW_13_in_rule__UseCase__Group_8__0__Impl3480); 
             after(grammarAccess.getUseCaseAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_8__0__Impl"


    // $ANTLR start "rule__UseCase__Group_8__1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1704:1: rule__UseCase__Group_8__1 : rule__UseCase__Group_8__1__Impl ;
    public final void rule__UseCase__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1708:1: ( rule__UseCase__Group_8__1__Impl )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1709:2: rule__UseCase__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__UseCase__Group_8__1__Impl_in_rule__UseCase__Group_8__13511);
            rule__UseCase__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_8__1"


    // $ANTLR start "rule__UseCase__Group_8__1__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1715:1: rule__UseCase__Group_8__1__Impl : ( ( rule__UseCase__ActorAssignment_8_1 ) ) ;
    public final void rule__UseCase__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1719:1: ( ( ( rule__UseCase__ActorAssignment_8_1 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1720:1: ( ( rule__UseCase__ActorAssignment_8_1 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1720:1: ( ( rule__UseCase__ActorAssignment_8_1 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1721:1: ( rule__UseCase__ActorAssignment_8_1 )
            {
             before(grammarAccess.getUseCaseAccess().getActorAssignment_8_1()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1722:1: ( rule__UseCase__ActorAssignment_8_1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1722:2: rule__UseCase__ActorAssignment_8_1
            {
            pushFollow(FOLLOW_rule__UseCase__ActorAssignment_8_1_in_rule__UseCase__Group_8__1__Impl3538);
            rule__UseCase__ActorAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getActorAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_8__1__Impl"


    // $ANTLR start "rule__UseCase__Group_10__0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1736:1: rule__UseCase__Group_10__0 : rule__UseCase__Group_10__0__Impl rule__UseCase__Group_10__1 ;
    public final void rule__UseCase__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1740:1: ( rule__UseCase__Group_10__0__Impl rule__UseCase__Group_10__1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1741:2: rule__UseCase__Group_10__0__Impl rule__UseCase__Group_10__1
            {
            pushFollow(FOLLOW_rule__UseCase__Group_10__0__Impl_in_rule__UseCase__Group_10__03572);
            rule__UseCase__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group_10__1_in_rule__UseCase__Group_10__03575);
            rule__UseCase__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10__0"


    // $ANTLR start "rule__UseCase__Group_10__0__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1748:1: rule__UseCase__Group_10__0__Impl : ( 'preCondition' ) ;
    public final void rule__UseCase__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1752:1: ( ( 'preCondition' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1753:1: ( 'preCondition' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1753:1: ( 'preCondition' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1754:1: 'preCondition'
            {
             before(grammarAccess.getUseCaseAccess().getPreConditionKeyword_10_0()); 
            match(input,35,FOLLOW_35_in_rule__UseCase__Group_10__0__Impl3603); 
             after(grammarAccess.getUseCaseAccess().getPreConditionKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10__0__Impl"


    // $ANTLR start "rule__UseCase__Group_10__1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1767:1: rule__UseCase__Group_10__1 : rule__UseCase__Group_10__1__Impl rule__UseCase__Group_10__2 ;
    public final void rule__UseCase__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1771:1: ( rule__UseCase__Group_10__1__Impl rule__UseCase__Group_10__2 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1772:2: rule__UseCase__Group_10__1__Impl rule__UseCase__Group_10__2
            {
            pushFollow(FOLLOW_rule__UseCase__Group_10__1__Impl_in_rule__UseCase__Group_10__13634);
            rule__UseCase__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group_10__2_in_rule__UseCase__Group_10__13637);
            rule__UseCase__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10__1"


    // $ANTLR start "rule__UseCase__Group_10__1__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1779:1: rule__UseCase__Group_10__1__Impl : ( ( rule__UseCase__PreConditionAssignment_10_1 ) ) ;
    public final void rule__UseCase__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1783:1: ( ( ( rule__UseCase__PreConditionAssignment_10_1 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1784:1: ( ( rule__UseCase__PreConditionAssignment_10_1 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1784:1: ( ( rule__UseCase__PreConditionAssignment_10_1 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1785:1: ( rule__UseCase__PreConditionAssignment_10_1 )
            {
             before(grammarAccess.getUseCaseAccess().getPreConditionAssignment_10_1()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1786:1: ( rule__UseCase__PreConditionAssignment_10_1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1786:2: rule__UseCase__PreConditionAssignment_10_1
            {
            pushFollow(FOLLOW_rule__UseCase__PreConditionAssignment_10_1_in_rule__UseCase__Group_10__1__Impl3664);
            rule__UseCase__PreConditionAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getPreConditionAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10__1__Impl"


    // $ANTLR start "rule__UseCase__Group_10__2"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1796:1: rule__UseCase__Group_10__2 : rule__UseCase__Group_10__2__Impl ;
    public final void rule__UseCase__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1800:1: ( rule__UseCase__Group_10__2__Impl )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1801:2: rule__UseCase__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__UseCase__Group_10__2__Impl_in_rule__UseCase__Group_10__23694);
            rule__UseCase__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10__2"


    // $ANTLR start "rule__UseCase__Group_10__2__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1807:1: rule__UseCase__Group_10__2__Impl : ( ';' ) ;
    public final void rule__UseCase__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1811:1: ( ( ';' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1812:1: ( ';' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1812:1: ( ';' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1813:1: ';'
            {
             before(grammarAccess.getUseCaseAccess().getSemicolonKeyword_10_2()); 
            match(input,30,FOLLOW_30_in_rule__UseCase__Group_10__2__Impl3722); 
             after(grammarAccess.getUseCaseAccess().getSemicolonKeyword_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10__2__Impl"


    // $ANTLR start "rule__UseCase__Group_13__0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1832:1: rule__UseCase__Group_13__0 : rule__UseCase__Group_13__0__Impl rule__UseCase__Group_13__1 ;
    public final void rule__UseCase__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1836:1: ( rule__UseCase__Group_13__0__Impl rule__UseCase__Group_13__1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1837:2: rule__UseCase__Group_13__0__Impl rule__UseCase__Group_13__1
            {
            pushFollow(FOLLOW_rule__UseCase__Group_13__0__Impl_in_rule__UseCase__Group_13__03759);
            rule__UseCase__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group_13__1_in_rule__UseCase__Group_13__03762);
            rule__UseCase__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_13__0"


    // $ANTLR start "rule__UseCase__Group_13__0__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1844:1: rule__UseCase__Group_13__0__Impl : ( 'postCondition' ) ;
    public final void rule__UseCase__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1848:1: ( ( 'postCondition' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1849:1: ( 'postCondition' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1849:1: ( 'postCondition' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1850:1: 'postCondition'
            {
             before(grammarAccess.getUseCaseAccess().getPostConditionKeyword_13_0()); 
            match(input,36,FOLLOW_36_in_rule__UseCase__Group_13__0__Impl3790); 
             after(grammarAccess.getUseCaseAccess().getPostConditionKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_13__0__Impl"


    // $ANTLR start "rule__UseCase__Group_13__1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1863:1: rule__UseCase__Group_13__1 : rule__UseCase__Group_13__1__Impl rule__UseCase__Group_13__2 ;
    public final void rule__UseCase__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1867:1: ( rule__UseCase__Group_13__1__Impl rule__UseCase__Group_13__2 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1868:2: rule__UseCase__Group_13__1__Impl rule__UseCase__Group_13__2
            {
            pushFollow(FOLLOW_rule__UseCase__Group_13__1__Impl_in_rule__UseCase__Group_13__13821);
            rule__UseCase__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group_13__2_in_rule__UseCase__Group_13__13824);
            rule__UseCase__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_13__1"


    // $ANTLR start "rule__UseCase__Group_13__1__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1875:1: rule__UseCase__Group_13__1__Impl : ( ( rule__UseCase__PostConditionAssignment_13_1 ) ) ;
    public final void rule__UseCase__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1879:1: ( ( ( rule__UseCase__PostConditionAssignment_13_1 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1880:1: ( ( rule__UseCase__PostConditionAssignment_13_1 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1880:1: ( ( rule__UseCase__PostConditionAssignment_13_1 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1881:1: ( rule__UseCase__PostConditionAssignment_13_1 )
            {
             before(grammarAccess.getUseCaseAccess().getPostConditionAssignment_13_1()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1882:1: ( rule__UseCase__PostConditionAssignment_13_1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1882:2: rule__UseCase__PostConditionAssignment_13_1
            {
            pushFollow(FOLLOW_rule__UseCase__PostConditionAssignment_13_1_in_rule__UseCase__Group_13__1__Impl3851);
            rule__UseCase__PostConditionAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getPostConditionAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_13__1__Impl"


    // $ANTLR start "rule__UseCase__Group_13__2"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1892:1: rule__UseCase__Group_13__2 : rule__UseCase__Group_13__2__Impl ;
    public final void rule__UseCase__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1896:1: ( rule__UseCase__Group_13__2__Impl )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1897:2: rule__UseCase__Group_13__2__Impl
            {
            pushFollow(FOLLOW_rule__UseCase__Group_13__2__Impl_in_rule__UseCase__Group_13__23881);
            rule__UseCase__Group_13__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_13__2"


    // $ANTLR start "rule__UseCase__Group_13__2__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1903:1: rule__UseCase__Group_13__2__Impl : ( ';' ) ;
    public final void rule__UseCase__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1907:1: ( ( ';' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1908:1: ( ';' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1908:1: ( ';' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1909:1: ';'
            {
             before(grammarAccess.getUseCaseAccess().getSemicolonKeyword_13_2()); 
            match(input,30,FOLLOW_30_in_rule__UseCase__Group_13__2__Impl3909); 
             after(grammarAccess.getUseCaseAccess().getSemicolonKeyword_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_13__2__Impl"


    // $ANTLR start "rule__BasicFlow__Group__0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1928:1: rule__BasicFlow__Group__0 : rule__BasicFlow__Group__0__Impl rule__BasicFlow__Group__1 ;
    public final void rule__BasicFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1932:1: ( rule__BasicFlow__Group__0__Impl rule__BasicFlow__Group__1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1933:2: rule__BasicFlow__Group__0__Impl rule__BasicFlow__Group__1
            {
            pushFollow(FOLLOW_rule__BasicFlow__Group__0__Impl_in_rule__BasicFlow__Group__03946);
            rule__BasicFlow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicFlow__Group__1_in_rule__BasicFlow__Group__03949);
            rule__BasicFlow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group__0"


    // $ANTLR start "rule__BasicFlow__Group__0__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1940:1: rule__BasicFlow__Group__0__Impl : ( ( rule__BasicFlow__NameAssignment_0 ) ) ;
    public final void rule__BasicFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1944:1: ( ( ( rule__BasicFlow__NameAssignment_0 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1945:1: ( ( rule__BasicFlow__NameAssignment_0 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1945:1: ( ( rule__BasicFlow__NameAssignment_0 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1946:1: ( rule__BasicFlow__NameAssignment_0 )
            {
             before(grammarAccess.getBasicFlowAccess().getNameAssignment_0()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1947:1: ( rule__BasicFlow__NameAssignment_0 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1947:2: rule__BasicFlow__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BasicFlow__NameAssignment_0_in_rule__BasicFlow__Group__0__Impl3976);
            rule__BasicFlow__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicFlowAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group__0__Impl"


    // $ANTLR start "rule__BasicFlow__Group__1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1957:1: rule__BasicFlow__Group__1 : rule__BasicFlow__Group__1__Impl rule__BasicFlow__Group__2 ;
    public final void rule__BasicFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1961:1: ( rule__BasicFlow__Group__1__Impl rule__BasicFlow__Group__2 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1962:2: rule__BasicFlow__Group__1__Impl rule__BasicFlow__Group__2
            {
            pushFollow(FOLLOW_rule__BasicFlow__Group__1__Impl_in_rule__BasicFlow__Group__14006);
            rule__BasicFlow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicFlow__Group__2_in_rule__BasicFlow__Group__14009);
            rule__BasicFlow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group__1"


    // $ANTLR start "rule__BasicFlow__Group__1__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1969:1: rule__BasicFlow__Group__1__Impl : ( ( ( rule__BasicFlow__StepsAssignment_1 ) ) ( ( rule__BasicFlow__StepsAssignment_1 )* ) ) ;
    public final void rule__BasicFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1973:1: ( ( ( ( rule__BasicFlow__StepsAssignment_1 ) ) ( ( rule__BasicFlow__StepsAssignment_1 )* ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1974:1: ( ( ( rule__BasicFlow__StepsAssignment_1 ) ) ( ( rule__BasicFlow__StepsAssignment_1 )* ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1974:1: ( ( ( rule__BasicFlow__StepsAssignment_1 ) ) ( ( rule__BasicFlow__StepsAssignment_1 )* ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1975:1: ( ( rule__BasicFlow__StepsAssignment_1 ) ) ( ( rule__BasicFlow__StepsAssignment_1 )* )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1975:1: ( ( rule__BasicFlow__StepsAssignment_1 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1976:1: ( rule__BasicFlow__StepsAssignment_1 )
            {
             before(grammarAccess.getBasicFlowAccess().getStepsAssignment_1()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1977:1: ( rule__BasicFlow__StepsAssignment_1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1977:2: rule__BasicFlow__StepsAssignment_1
            {
            pushFollow(FOLLOW_rule__BasicFlow__StepsAssignment_1_in_rule__BasicFlow__Group__1__Impl4038);
            rule__BasicFlow__StepsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicFlowAccess().getStepsAssignment_1()); 

            }

            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1980:1: ( ( rule__BasicFlow__StepsAssignment_1 )* )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1981:1: ( rule__BasicFlow__StepsAssignment_1 )*
            {
             before(grammarAccess.getBasicFlowAccess().getStepsAssignment_1()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1982:1: ( rule__BasicFlow__StepsAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_INT && LA15_0<=RULE_SINGLE_CHAR)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1982:2: rule__BasicFlow__StepsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__BasicFlow__StepsAssignment_1_in_rule__BasicFlow__Group__1__Impl4050);
            	    rule__BasicFlow__StepsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getBasicFlowAccess().getStepsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group__1__Impl"


    // $ANTLR start "rule__BasicFlow__Group__2"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1993:1: rule__BasicFlow__Group__2 : rule__BasicFlow__Group__2__Impl ;
    public final void rule__BasicFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1997:1: ( rule__BasicFlow__Group__2__Impl )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:1998:2: rule__BasicFlow__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BasicFlow__Group__2__Impl_in_rule__BasicFlow__Group__24083);
            rule__BasicFlow__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group__2"


    // $ANTLR start "rule__BasicFlow__Group__2__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2004:1: rule__BasicFlow__Group__2__Impl : ( 'endbasic' ) ;
    public final void rule__BasicFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2008:1: ( ( 'endbasic' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2009:1: ( 'endbasic' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2009:1: ( 'endbasic' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2010:1: 'endbasic'
            {
             before(grammarAccess.getBasicFlowAccess().getEndbasicKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__BasicFlow__Group__2__Impl4111); 
             after(grammarAccess.getBasicFlowAccess().getEndbasicKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2029:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2033:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2034:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__04148);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04151);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2041:1: rule__Action__Group__0__Impl : ( ( rule__Action__NameAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2045:1: ( ( ( rule__Action__NameAssignment_0 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2046:1: ( ( rule__Action__NameAssignment_0 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2046:1: ( ( rule__Action__NameAssignment_0 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2047:1: ( rule__Action__NameAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_0()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2048:1: ( rule__Action__NameAssignment_0 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2048:2: rule__Action__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_0_in_rule__Action__Group__0__Impl4178);
            rule__Action__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2058:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2062:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2063:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__14208);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14211);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2070:1: rule__Action__Group__1__Impl : ( ')' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2074:1: ( ( ')' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2075:1: ( ')' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2075:1: ( ')' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2076:1: ')'
            {
             before(grammarAccess.getActionAccess().getRightParenthesisKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Action__Group__1__Impl4239); 
             after(grammarAccess.getActionAccess().getRightParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2089:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2093:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2094:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__24270);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24273);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2101:1: rule__Action__Group__2__Impl : ( 'action' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2105:1: ( ( 'action' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2106:1: ( 'action' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2106:1: ( 'action' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2107:1: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Action__Group__2__Impl4301); 
             after(grammarAccess.getActionAccess().getActionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2120:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2124:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2125:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__34332);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__4_in_rule__Action__Group__34335);
            rule__Action__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2132:1: rule__Action__Group__3__Impl : ( '[' ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2136:1: ( ( '[' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2137:1: ( '[' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2137:1: ( '[' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2138:1: '['
            {
             before(grammarAccess.getActionAccess().getLeftSquareBracketKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__Action__Group__3__Impl4363); 
             after(grammarAccess.getActionAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2151:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2155:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2156:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__44394);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__5_in_rule__Action__Group__44397);
            rule__Action__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2163:1: rule__Action__Group__4__Impl : ( ( rule__Action__AgentAssignment_4 ) ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2167:1: ( ( ( rule__Action__AgentAssignment_4 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2168:1: ( ( rule__Action__AgentAssignment_4 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2168:1: ( ( rule__Action__AgentAssignment_4 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2169:1: ( rule__Action__AgentAssignment_4 )
            {
             before(grammarAccess.getActionAccess().getAgentAssignment_4()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2170:1: ( rule__Action__AgentAssignment_4 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2170:2: rule__Action__AgentAssignment_4
            {
            pushFollow(FOLLOW_rule__Action__AgentAssignment_4_in_rule__Action__Group__4__Impl4424);
            rule__Action__AgentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAgentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2180:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2184:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2185:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__54454);
            rule__Action__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__6_in_rule__Action__Group__54457);
            rule__Action__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2192:1: rule__Action__Group__5__Impl : ( ']' ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2196:1: ( ( ']' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2197:1: ( ']' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2197:1: ( ']' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2198:1: ']'
            {
             before(grammarAccess.getActionAccess().getRightSquareBracketKeyword_5()); 
            match(input,40,FOLLOW_40_in_rule__Action__Group__5__Impl4485); 
             after(grammarAccess.getActionAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__6"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2211:1: rule__Action__Group__6 : rule__Action__Group__6__Impl rule__Action__Group__7 ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2215:1: ( rule__Action__Group__6__Impl rule__Action__Group__7 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2216:2: rule__Action__Group__6__Impl rule__Action__Group__7
            {
            pushFollow(FOLLOW_rule__Action__Group__6__Impl_in_rule__Action__Group__64516);
            rule__Action__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__7_in_rule__Action__Group__64519);
            rule__Action__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6"


    // $ANTLR start "rule__Action__Group__6__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2223:1: rule__Action__Group__6__Impl : ( ( rule__Action__DescriptionAssignment_6 ) ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2227:1: ( ( ( rule__Action__DescriptionAssignment_6 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2228:1: ( ( rule__Action__DescriptionAssignment_6 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2228:1: ( ( rule__Action__DescriptionAssignment_6 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2229:1: ( rule__Action__DescriptionAssignment_6 )
            {
             before(grammarAccess.getActionAccess().getDescriptionAssignment_6()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2230:1: ( rule__Action__DescriptionAssignment_6 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2230:2: rule__Action__DescriptionAssignment_6
            {
            pushFollow(FOLLOW_rule__Action__DescriptionAssignment_6_in_rule__Action__Group__6__Impl4546);
            rule__Action__DescriptionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getDescriptionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6__Impl"


    // $ANTLR start "rule__Action__Group__7"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2240:1: rule__Action__Group__7 : rule__Action__Group__7__Impl ;
    public final void rule__Action__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2244:1: ( rule__Action__Group__7__Impl )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2245:2: rule__Action__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__7__Impl_in_rule__Action__Group__74576);
            rule__Action__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__7"


    // $ANTLR start "rule__Action__Group__7__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2251:1: rule__Action__Group__7__Impl : ( ';' ) ;
    public final void rule__Action__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2255:1: ( ( ';' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2256:1: ( ';' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2256:1: ( ';' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2257:1: ';'
            {
             before(grammarAccess.getActionAccess().getSemicolonKeyword_7()); 
            match(input,30,FOLLOW_30_in_rule__Action__Group__7__Impl4604); 
             after(grammarAccess.getActionAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__7__Impl"


    // $ANTLR start "rule__ConditionalStatement__Group__0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2286:1: rule__ConditionalStatement__Group__0 : rule__ConditionalStatement__Group__0__Impl rule__ConditionalStatement__Group__1 ;
    public final void rule__ConditionalStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2290:1: ( rule__ConditionalStatement__Group__0__Impl rule__ConditionalStatement__Group__1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2291:2: rule__ConditionalStatement__Group__0__Impl rule__ConditionalStatement__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionalStatement__Group__0__Impl_in_rule__ConditionalStatement__Group__04651);
            rule__ConditionalStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalStatement__Group__1_in_rule__ConditionalStatement__Group__04654);
            rule__ConditionalStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__0"


    // $ANTLR start "rule__ConditionalStatement__Group__0__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2298:1: rule__ConditionalStatement__Group__0__Impl : ( ( rule__ConditionalStatement__NameAssignment_0 ) ) ;
    public final void rule__ConditionalStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2302:1: ( ( ( rule__ConditionalStatement__NameAssignment_0 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2303:1: ( ( rule__ConditionalStatement__NameAssignment_0 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2303:1: ( ( rule__ConditionalStatement__NameAssignment_0 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2304:1: ( rule__ConditionalStatement__NameAssignment_0 )
            {
             before(grammarAccess.getConditionalStatementAccess().getNameAssignment_0()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2305:1: ( rule__ConditionalStatement__NameAssignment_0 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2305:2: rule__ConditionalStatement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ConditionalStatement__NameAssignment_0_in_rule__ConditionalStatement__Group__0__Impl4681);
            rule__ConditionalStatement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalStatementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__0__Impl"


    // $ANTLR start "rule__ConditionalStatement__Group__1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2315:1: rule__ConditionalStatement__Group__1 : rule__ConditionalStatement__Group__1__Impl rule__ConditionalStatement__Group__2 ;
    public final void rule__ConditionalStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2319:1: ( rule__ConditionalStatement__Group__1__Impl rule__ConditionalStatement__Group__2 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2320:2: rule__ConditionalStatement__Group__1__Impl rule__ConditionalStatement__Group__2
            {
            pushFollow(FOLLOW_rule__ConditionalStatement__Group__1__Impl_in_rule__ConditionalStatement__Group__14711);
            rule__ConditionalStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalStatement__Group__2_in_rule__ConditionalStatement__Group__14714);
            rule__ConditionalStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__1"


    // $ANTLR start "rule__ConditionalStatement__Group__1__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2327:1: rule__ConditionalStatement__Group__1__Impl : ( ')' ) ;
    public final void rule__ConditionalStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2331:1: ( ( ')' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2332:1: ( ')' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2332:1: ( ')' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2333:1: ')'
            {
             before(grammarAccess.getConditionalStatementAccess().getRightParenthesisKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__ConditionalStatement__Group__1__Impl4742); 
             after(grammarAccess.getConditionalStatementAccess().getRightParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__1__Impl"


    // $ANTLR start "rule__ConditionalStatement__Group__2"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2346:1: rule__ConditionalStatement__Group__2 : rule__ConditionalStatement__Group__2__Impl rule__ConditionalStatement__Group__3 ;
    public final void rule__ConditionalStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2350:1: ( rule__ConditionalStatement__Group__2__Impl rule__ConditionalStatement__Group__3 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2351:2: rule__ConditionalStatement__Group__2__Impl rule__ConditionalStatement__Group__3
            {
            pushFollow(FOLLOW_rule__ConditionalStatement__Group__2__Impl_in_rule__ConditionalStatement__Group__24773);
            rule__ConditionalStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalStatement__Group__3_in_rule__ConditionalStatement__Group__24776);
            rule__ConditionalStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__2"


    // $ANTLR start "rule__ConditionalStatement__Group__2__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2358:1: rule__ConditionalStatement__Group__2__Impl : ( 'if' ) ;
    public final void rule__ConditionalStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2362:1: ( ( 'if' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2363:1: ( 'if' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2363:1: ( 'if' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2364:1: 'if'
            {
             before(grammarAccess.getConditionalStatementAccess().getIfKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__ConditionalStatement__Group__2__Impl4804); 
             after(grammarAccess.getConditionalStatementAccess().getIfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__2__Impl"


    // $ANTLR start "rule__ConditionalStatement__Group__3"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2377:1: rule__ConditionalStatement__Group__3 : rule__ConditionalStatement__Group__3__Impl rule__ConditionalStatement__Group__4 ;
    public final void rule__ConditionalStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2381:1: ( rule__ConditionalStatement__Group__3__Impl rule__ConditionalStatement__Group__4 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2382:2: rule__ConditionalStatement__Group__3__Impl rule__ConditionalStatement__Group__4
            {
            pushFollow(FOLLOW_rule__ConditionalStatement__Group__3__Impl_in_rule__ConditionalStatement__Group__34835);
            rule__ConditionalStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalStatement__Group__4_in_rule__ConditionalStatement__Group__34838);
            rule__ConditionalStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__3"


    // $ANTLR start "rule__ConditionalStatement__Group__3__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2389:1: rule__ConditionalStatement__Group__3__Impl : ( ( rule__ConditionalStatement__ConditionAssignment_3 ) ) ;
    public final void rule__ConditionalStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2393:1: ( ( ( rule__ConditionalStatement__ConditionAssignment_3 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2394:1: ( ( rule__ConditionalStatement__ConditionAssignment_3 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2394:1: ( ( rule__ConditionalStatement__ConditionAssignment_3 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2395:1: ( rule__ConditionalStatement__ConditionAssignment_3 )
            {
             before(grammarAccess.getConditionalStatementAccess().getConditionAssignment_3()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2396:1: ( rule__ConditionalStatement__ConditionAssignment_3 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2396:2: rule__ConditionalStatement__ConditionAssignment_3
            {
            pushFollow(FOLLOW_rule__ConditionalStatement__ConditionAssignment_3_in_rule__ConditionalStatement__Group__3__Impl4865);
            rule__ConditionalStatement__ConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionalStatementAccess().getConditionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__3__Impl"


    // $ANTLR start "rule__ConditionalStatement__Group__4"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2406:1: rule__ConditionalStatement__Group__4 : rule__ConditionalStatement__Group__4__Impl rule__ConditionalStatement__Group__5 ;
    public final void rule__ConditionalStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2410:1: ( rule__ConditionalStatement__Group__4__Impl rule__ConditionalStatement__Group__5 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2411:2: rule__ConditionalStatement__Group__4__Impl rule__ConditionalStatement__Group__5
            {
            pushFollow(FOLLOW_rule__ConditionalStatement__Group__4__Impl_in_rule__ConditionalStatement__Group__44895);
            rule__ConditionalStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalStatement__Group__5_in_rule__ConditionalStatement__Group__44898);
            rule__ConditionalStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__4"


    // $ANTLR start "rule__ConditionalStatement__Group__4__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2418:1: rule__ConditionalStatement__Group__4__Impl : ( 'then' ) ;
    public final void rule__ConditionalStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2422:1: ( ( 'then' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2423:1: ( 'then' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2423:1: ( 'then' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2424:1: 'then'
            {
             before(grammarAccess.getConditionalStatementAccess().getThenKeyword_4()); 
            match(input,42,FOLLOW_42_in_rule__ConditionalStatement__Group__4__Impl4926); 
             after(grammarAccess.getConditionalStatementAccess().getThenKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__4__Impl"


    // $ANTLR start "rule__ConditionalStatement__Group__5"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2437:1: rule__ConditionalStatement__Group__5 : rule__ConditionalStatement__Group__5__Impl rule__ConditionalStatement__Group__6 ;
    public final void rule__ConditionalStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2441:1: ( rule__ConditionalStatement__Group__5__Impl rule__ConditionalStatement__Group__6 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2442:2: rule__ConditionalStatement__Group__5__Impl rule__ConditionalStatement__Group__6
            {
            pushFollow(FOLLOW_rule__ConditionalStatement__Group__5__Impl_in_rule__ConditionalStatement__Group__54957);
            rule__ConditionalStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalStatement__Group__6_in_rule__ConditionalStatement__Group__54960);
            rule__ConditionalStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__5"


    // $ANTLR start "rule__ConditionalStatement__Group__5__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2449:1: rule__ConditionalStatement__Group__5__Impl : ( ( ( rule__ConditionalStatement__StepsAssignment_5 ) ) ( ( rule__ConditionalStatement__StepsAssignment_5 )* ) ) ;
    public final void rule__ConditionalStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2453:1: ( ( ( ( rule__ConditionalStatement__StepsAssignment_5 ) ) ( ( rule__ConditionalStatement__StepsAssignment_5 )* ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2454:1: ( ( ( rule__ConditionalStatement__StepsAssignment_5 ) ) ( ( rule__ConditionalStatement__StepsAssignment_5 )* ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2454:1: ( ( ( rule__ConditionalStatement__StepsAssignment_5 ) ) ( ( rule__ConditionalStatement__StepsAssignment_5 )* ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2455:1: ( ( rule__ConditionalStatement__StepsAssignment_5 ) ) ( ( rule__ConditionalStatement__StepsAssignment_5 )* )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2455:1: ( ( rule__ConditionalStatement__StepsAssignment_5 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2456:1: ( rule__ConditionalStatement__StepsAssignment_5 )
            {
             before(grammarAccess.getConditionalStatementAccess().getStepsAssignment_5()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2457:1: ( rule__ConditionalStatement__StepsAssignment_5 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2457:2: rule__ConditionalStatement__StepsAssignment_5
            {
            pushFollow(FOLLOW_rule__ConditionalStatement__StepsAssignment_5_in_rule__ConditionalStatement__Group__5__Impl4989);
            rule__ConditionalStatement__StepsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConditionalStatementAccess().getStepsAssignment_5()); 

            }

            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2460:1: ( ( rule__ConditionalStatement__StepsAssignment_5 )* )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2461:1: ( rule__ConditionalStatement__StepsAssignment_5 )*
            {
             before(grammarAccess.getConditionalStatementAccess().getStepsAssignment_5()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2462:1: ( rule__ConditionalStatement__StepsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_INT && LA16_0<=RULE_SINGLE_CHAR)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2462:2: rule__ConditionalStatement__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ConditionalStatement__StepsAssignment_5_in_rule__ConditionalStatement__Group__5__Impl5001);
            	    rule__ConditionalStatement__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getConditionalStatementAccess().getStepsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__5__Impl"


    // $ANTLR start "rule__ConditionalStatement__Group__6"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2473:1: rule__ConditionalStatement__Group__6 : rule__ConditionalStatement__Group__6__Impl ;
    public final void rule__ConditionalStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2477:1: ( rule__ConditionalStatement__Group__6__Impl )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2478:2: rule__ConditionalStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalStatement__Group__6__Impl_in_rule__ConditionalStatement__Group__65034);
            rule__ConditionalStatement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__6"


    // $ANTLR start "rule__ConditionalStatement__Group__6__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2484:1: rule__ConditionalStatement__Group__6__Impl : ( 'endif' ) ;
    public final void rule__ConditionalStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2488:1: ( ( 'endif' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2489:1: ( 'endif' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2489:1: ( 'endif' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2490:1: 'endif'
            {
             before(grammarAccess.getConditionalStatementAccess().getEndifKeyword_6()); 
            match(input,43,FOLLOW_43_in_rule__ConditionalStatement__Group__6__Impl5062); 
             after(grammarAccess.getConditionalStatementAccess().getEndifKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__6__Impl"


    // $ANTLR start "rule__LoopStatement__Group__0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2517:1: rule__LoopStatement__Group__0 : rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 ;
    public final void rule__LoopStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2521:1: ( rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2522:2: rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1
            {
            pushFollow(FOLLOW_rule__LoopStatement__Group__0__Impl_in_rule__LoopStatement__Group__05107);
            rule__LoopStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoopStatement__Group__1_in_rule__LoopStatement__Group__05110);
            rule__LoopStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__0"


    // $ANTLR start "rule__LoopStatement__Group__0__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2529:1: rule__LoopStatement__Group__0__Impl : ( ( rule__LoopStatement__NameAssignment_0 ) ) ;
    public final void rule__LoopStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2533:1: ( ( ( rule__LoopStatement__NameAssignment_0 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2534:1: ( ( rule__LoopStatement__NameAssignment_0 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2534:1: ( ( rule__LoopStatement__NameAssignment_0 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2535:1: ( rule__LoopStatement__NameAssignment_0 )
            {
             before(grammarAccess.getLoopStatementAccess().getNameAssignment_0()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2536:1: ( rule__LoopStatement__NameAssignment_0 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2536:2: rule__LoopStatement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LoopStatement__NameAssignment_0_in_rule__LoopStatement__Group__0__Impl5137);
            rule__LoopStatement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLoopStatementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__0__Impl"


    // $ANTLR start "rule__LoopStatement__Group__1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2546:1: rule__LoopStatement__Group__1 : rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 ;
    public final void rule__LoopStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2550:1: ( rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2551:2: rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2
            {
            pushFollow(FOLLOW_rule__LoopStatement__Group__1__Impl_in_rule__LoopStatement__Group__15167);
            rule__LoopStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoopStatement__Group__2_in_rule__LoopStatement__Group__15170);
            rule__LoopStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__1"


    // $ANTLR start "rule__LoopStatement__Group__1__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2558:1: rule__LoopStatement__Group__1__Impl : ( ')' ) ;
    public final void rule__LoopStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2562:1: ( ( ')' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2563:1: ( ')' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2563:1: ( ')' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2564:1: ')'
            {
             before(grammarAccess.getLoopStatementAccess().getRightParenthesisKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__LoopStatement__Group__1__Impl5198); 
             after(grammarAccess.getLoopStatementAccess().getRightParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__1__Impl"


    // $ANTLR start "rule__LoopStatement__Group__2"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2577:1: rule__LoopStatement__Group__2 : rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 ;
    public final void rule__LoopStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2581:1: ( rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2582:2: rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3
            {
            pushFollow(FOLLOW_rule__LoopStatement__Group__2__Impl_in_rule__LoopStatement__Group__25229);
            rule__LoopStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoopStatement__Group__3_in_rule__LoopStatement__Group__25232);
            rule__LoopStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__2"


    // $ANTLR start "rule__LoopStatement__Group__2__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2589:1: rule__LoopStatement__Group__2__Impl : ( 'while' ) ;
    public final void rule__LoopStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2593:1: ( ( 'while' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2594:1: ( 'while' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2594:1: ( 'while' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2595:1: 'while'
            {
             before(grammarAccess.getLoopStatementAccess().getWhileKeyword_2()); 
            match(input,44,FOLLOW_44_in_rule__LoopStatement__Group__2__Impl5260); 
             after(grammarAccess.getLoopStatementAccess().getWhileKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__2__Impl"


    // $ANTLR start "rule__LoopStatement__Group__3"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2608:1: rule__LoopStatement__Group__3 : rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 ;
    public final void rule__LoopStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2612:1: ( rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2613:2: rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4
            {
            pushFollow(FOLLOW_rule__LoopStatement__Group__3__Impl_in_rule__LoopStatement__Group__35291);
            rule__LoopStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoopStatement__Group__4_in_rule__LoopStatement__Group__35294);
            rule__LoopStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__3"


    // $ANTLR start "rule__LoopStatement__Group__3__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2620:1: rule__LoopStatement__Group__3__Impl : ( ( rule__LoopStatement__ConditionAssignment_3 ) ) ;
    public final void rule__LoopStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2624:1: ( ( ( rule__LoopStatement__ConditionAssignment_3 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2625:1: ( ( rule__LoopStatement__ConditionAssignment_3 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2625:1: ( ( rule__LoopStatement__ConditionAssignment_3 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2626:1: ( rule__LoopStatement__ConditionAssignment_3 )
            {
             before(grammarAccess.getLoopStatementAccess().getConditionAssignment_3()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2627:1: ( rule__LoopStatement__ConditionAssignment_3 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2627:2: rule__LoopStatement__ConditionAssignment_3
            {
            pushFollow(FOLLOW_rule__LoopStatement__ConditionAssignment_3_in_rule__LoopStatement__Group__3__Impl5321);
            rule__LoopStatement__ConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLoopStatementAccess().getConditionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__3__Impl"


    // $ANTLR start "rule__LoopStatement__Group__4"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2637:1: rule__LoopStatement__Group__4 : rule__LoopStatement__Group__4__Impl rule__LoopStatement__Group__5 ;
    public final void rule__LoopStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2641:1: ( rule__LoopStatement__Group__4__Impl rule__LoopStatement__Group__5 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2642:2: rule__LoopStatement__Group__4__Impl rule__LoopStatement__Group__5
            {
            pushFollow(FOLLOW_rule__LoopStatement__Group__4__Impl_in_rule__LoopStatement__Group__45351);
            rule__LoopStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoopStatement__Group__5_in_rule__LoopStatement__Group__45354);
            rule__LoopStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__4"


    // $ANTLR start "rule__LoopStatement__Group__4__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2649:1: rule__LoopStatement__Group__4__Impl : ( 'do' ) ;
    public final void rule__LoopStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2653:1: ( ( 'do' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2654:1: ( 'do' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2654:1: ( 'do' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2655:1: 'do'
            {
             before(grammarAccess.getLoopStatementAccess().getDoKeyword_4()); 
            match(input,45,FOLLOW_45_in_rule__LoopStatement__Group__4__Impl5382); 
             after(grammarAccess.getLoopStatementAccess().getDoKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__4__Impl"


    // $ANTLR start "rule__LoopStatement__Group__5"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2668:1: rule__LoopStatement__Group__5 : rule__LoopStatement__Group__5__Impl rule__LoopStatement__Group__6 ;
    public final void rule__LoopStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2672:1: ( rule__LoopStatement__Group__5__Impl rule__LoopStatement__Group__6 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2673:2: rule__LoopStatement__Group__5__Impl rule__LoopStatement__Group__6
            {
            pushFollow(FOLLOW_rule__LoopStatement__Group__5__Impl_in_rule__LoopStatement__Group__55413);
            rule__LoopStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoopStatement__Group__6_in_rule__LoopStatement__Group__55416);
            rule__LoopStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__5"


    // $ANTLR start "rule__LoopStatement__Group__5__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2680:1: rule__LoopStatement__Group__5__Impl : ( ( ( rule__LoopStatement__StepsAssignment_5 ) ) ( ( rule__LoopStatement__StepsAssignment_5 )* ) ) ;
    public final void rule__LoopStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2684:1: ( ( ( ( rule__LoopStatement__StepsAssignment_5 ) ) ( ( rule__LoopStatement__StepsAssignment_5 )* ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2685:1: ( ( ( rule__LoopStatement__StepsAssignment_5 ) ) ( ( rule__LoopStatement__StepsAssignment_5 )* ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2685:1: ( ( ( rule__LoopStatement__StepsAssignment_5 ) ) ( ( rule__LoopStatement__StepsAssignment_5 )* ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2686:1: ( ( rule__LoopStatement__StepsAssignment_5 ) ) ( ( rule__LoopStatement__StepsAssignment_5 )* )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2686:1: ( ( rule__LoopStatement__StepsAssignment_5 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2687:1: ( rule__LoopStatement__StepsAssignment_5 )
            {
             before(grammarAccess.getLoopStatementAccess().getStepsAssignment_5()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2688:1: ( rule__LoopStatement__StepsAssignment_5 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2688:2: rule__LoopStatement__StepsAssignment_5
            {
            pushFollow(FOLLOW_rule__LoopStatement__StepsAssignment_5_in_rule__LoopStatement__Group__5__Impl5445);
            rule__LoopStatement__StepsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLoopStatementAccess().getStepsAssignment_5()); 

            }

            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2691:1: ( ( rule__LoopStatement__StepsAssignment_5 )* )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2692:1: ( rule__LoopStatement__StepsAssignment_5 )*
            {
             before(grammarAccess.getLoopStatementAccess().getStepsAssignment_5()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2693:1: ( rule__LoopStatement__StepsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_INT && LA17_0<=RULE_SINGLE_CHAR)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2693:2: rule__LoopStatement__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__LoopStatement__StepsAssignment_5_in_rule__LoopStatement__Group__5__Impl5457);
            	    rule__LoopStatement__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getLoopStatementAccess().getStepsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__5__Impl"


    // $ANTLR start "rule__LoopStatement__Group__6"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2704:1: rule__LoopStatement__Group__6 : rule__LoopStatement__Group__6__Impl ;
    public final void rule__LoopStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2708:1: ( rule__LoopStatement__Group__6__Impl )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2709:2: rule__LoopStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__LoopStatement__Group__6__Impl_in_rule__LoopStatement__Group__65490);
            rule__LoopStatement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__6"


    // $ANTLR start "rule__LoopStatement__Group__6__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2715:1: rule__LoopStatement__Group__6__Impl : ( 'endwhile' ) ;
    public final void rule__LoopStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2719:1: ( ( 'endwhile' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2720:1: ( 'endwhile' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2720:1: ( 'endwhile' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2721:1: 'endwhile'
            {
             before(grammarAccess.getLoopStatementAccess().getEndwhileKeyword_6()); 
            match(input,46,FOLLOW_46_in_rule__LoopStatement__Group__6__Impl5518); 
             after(grammarAccess.getLoopStatementAccess().getEndwhileKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__6__Impl"


    // $ANTLR start "rule__AlternativeFlow__Group__0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2748:1: rule__AlternativeFlow__Group__0 : rule__AlternativeFlow__Group__0__Impl rule__AlternativeFlow__Group__1 ;
    public final void rule__AlternativeFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2752:1: ( rule__AlternativeFlow__Group__0__Impl rule__AlternativeFlow__Group__1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2753:2: rule__AlternativeFlow__Group__0__Impl rule__AlternativeFlow__Group__1
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group__0__Impl_in_rule__AlternativeFlow__Group__05563);
            rule__AlternativeFlow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlow__Group__1_in_rule__AlternativeFlow__Group__05566);
            rule__AlternativeFlow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__0"


    // $ANTLR start "rule__AlternativeFlow__Group__0__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2760:1: rule__AlternativeFlow__Group__0__Impl : ( 'alternative' ) ;
    public final void rule__AlternativeFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2764:1: ( ( 'alternative' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2765:1: ( 'alternative' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2765:1: ( 'alternative' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2766:1: 'alternative'
            {
             before(grammarAccess.getAlternativeFlowAccess().getAlternativeKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__AlternativeFlow__Group__0__Impl5594); 
             after(grammarAccess.getAlternativeFlowAccess().getAlternativeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__0__Impl"


    // $ANTLR start "rule__AlternativeFlow__Group__1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2779:1: rule__AlternativeFlow__Group__1 : rule__AlternativeFlow__Group__1__Impl rule__AlternativeFlow__Group__2 ;
    public final void rule__AlternativeFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2783:1: ( rule__AlternativeFlow__Group__1__Impl rule__AlternativeFlow__Group__2 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2784:2: rule__AlternativeFlow__Group__1__Impl rule__AlternativeFlow__Group__2
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group__1__Impl_in_rule__AlternativeFlow__Group__15625);
            rule__AlternativeFlow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlow__Group__2_in_rule__AlternativeFlow__Group__15628);
            rule__AlternativeFlow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__1"


    // $ANTLR start "rule__AlternativeFlow__Group__1__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2791:1: rule__AlternativeFlow__Group__1__Impl : ( ( rule__AlternativeFlow__NameAssignment_1 ) ) ;
    public final void rule__AlternativeFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2795:1: ( ( ( rule__AlternativeFlow__NameAssignment_1 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2796:1: ( ( rule__AlternativeFlow__NameAssignment_1 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2796:1: ( ( rule__AlternativeFlow__NameAssignment_1 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2797:1: ( rule__AlternativeFlow__NameAssignment_1 )
            {
             before(grammarAccess.getAlternativeFlowAccess().getNameAssignment_1()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2798:1: ( rule__AlternativeFlow__NameAssignment_1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2798:2: rule__AlternativeFlow__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__NameAssignment_1_in_rule__AlternativeFlow__Group__1__Impl5655);
            rule__AlternativeFlow__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeFlowAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__1__Impl"


    // $ANTLR start "rule__AlternativeFlow__Group__2"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2808:1: rule__AlternativeFlow__Group__2 : rule__AlternativeFlow__Group__2__Impl rule__AlternativeFlow__Group__3 ;
    public final void rule__AlternativeFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2812:1: ( rule__AlternativeFlow__Group__2__Impl rule__AlternativeFlow__Group__3 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2813:2: rule__AlternativeFlow__Group__2__Impl rule__AlternativeFlow__Group__3
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group__2__Impl_in_rule__AlternativeFlow__Group__25685);
            rule__AlternativeFlow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlow__Group__3_in_rule__AlternativeFlow__Group__25688);
            rule__AlternativeFlow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__2"


    // $ANTLR start "rule__AlternativeFlow__Group__2__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2820:1: rule__AlternativeFlow__Group__2__Impl : ( 'to step' ) ;
    public final void rule__AlternativeFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2824:1: ( ( 'to step' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2825:1: ( 'to step' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2825:1: ( 'to step' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2826:1: 'to step'
            {
             before(grammarAccess.getAlternativeFlowAccess().getToStepKeyword_2()); 
            match(input,48,FOLLOW_48_in_rule__AlternativeFlow__Group__2__Impl5716); 
             after(grammarAccess.getAlternativeFlowAccess().getToStepKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__2__Impl"


    // $ANTLR start "rule__AlternativeFlow__Group__3"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2839:1: rule__AlternativeFlow__Group__3 : rule__AlternativeFlow__Group__3__Impl rule__AlternativeFlow__Group__4 ;
    public final void rule__AlternativeFlow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2843:1: ( rule__AlternativeFlow__Group__3__Impl rule__AlternativeFlow__Group__4 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2844:2: rule__AlternativeFlow__Group__3__Impl rule__AlternativeFlow__Group__4
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group__3__Impl_in_rule__AlternativeFlow__Group__35747);
            rule__AlternativeFlow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlow__Group__4_in_rule__AlternativeFlow__Group__35750);
            rule__AlternativeFlow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__3"


    // $ANTLR start "rule__AlternativeFlow__Group__3__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2851:1: rule__AlternativeFlow__Group__3__Impl : ( ( rule__AlternativeFlow__BranchingStepAssignment_3 ) ) ;
    public final void rule__AlternativeFlow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2855:1: ( ( ( rule__AlternativeFlow__BranchingStepAssignment_3 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2856:1: ( ( rule__AlternativeFlow__BranchingStepAssignment_3 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2856:1: ( ( rule__AlternativeFlow__BranchingStepAssignment_3 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2857:1: ( rule__AlternativeFlow__BranchingStepAssignment_3 )
            {
             before(grammarAccess.getAlternativeFlowAccess().getBranchingStepAssignment_3()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2858:1: ( rule__AlternativeFlow__BranchingStepAssignment_3 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2858:2: rule__AlternativeFlow__BranchingStepAssignment_3
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__BranchingStepAssignment_3_in_rule__AlternativeFlow__Group__3__Impl5777);
            rule__AlternativeFlow__BranchingStepAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeFlowAccess().getBranchingStepAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__3__Impl"


    // $ANTLR start "rule__AlternativeFlow__Group__4"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2868:1: rule__AlternativeFlow__Group__4 : rule__AlternativeFlow__Group__4__Impl rule__AlternativeFlow__Group__5 ;
    public final void rule__AlternativeFlow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2872:1: ( rule__AlternativeFlow__Group__4__Impl rule__AlternativeFlow__Group__5 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2873:2: rule__AlternativeFlow__Group__4__Impl rule__AlternativeFlow__Group__5
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group__4__Impl_in_rule__AlternativeFlow__Group__45807);
            rule__AlternativeFlow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlow__Group__5_in_rule__AlternativeFlow__Group__45810);
            rule__AlternativeFlow__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__4"


    // $ANTLR start "rule__AlternativeFlow__Group__4__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2880:1: rule__AlternativeFlow__Group__4__Impl : ( 'when' ) ;
    public final void rule__AlternativeFlow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2884:1: ( ( 'when' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2885:1: ( 'when' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2885:1: ( 'when' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2886:1: 'when'
            {
             before(grammarAccess.getAlternativeFlowAccess().getWhenKeyword_4()); 
            match(input,49,FOLLOW_49_in_rule__AlternativeFlow__Group__4__Impl5838); 
             after(grammarAccess.getAlternativeFlowAccess().getWhenKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__4__Impl"


    // $ANTLR start "rule__AlternativeFlow__Group__5"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2899:1: rule__AlternativeFlow__Group__5 : rule__AlternativeFlow__Group__5__Impl rule__AlternativeFlow__Group__6 ;
    public final void rule__AlternativeFlow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2903:1: ( rule__AlternativeFlow__Group__5__Impl rule__AlternativeFlow__Group__6 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2904:2: rule__AlternativeFlow__Group__5__Impl rule__AlternativeFlow__Group__6
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group__5__Impl_in_rule__AlternativeFlow__Group__55869);
            rule__AlternativeFlow__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlow__Group__6_in_rule__AlternativeFlow__Group__55872);
            rule__AlternativeFlow__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__5"


    // $ANTLR start "rule__AlternativeFlow__Group__5__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2911:1: rule__AlternativeFlow__Group__5__Impl : ( ( rule__AlternativeFlow__ConditionAssignment_5 ) ) ;
    public final void rule__AlternativeFlow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2915:1: ( ( ( rule__AlternativeFlow__ConditionAssignment_5 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2916:1: ( ( rule__AlternativeFlow__ConditionAssignment_5 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2916:1: ( ( rule__AlternativeFlow__ConditionAssignment_5 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2917:1: ( rule__AlternativeFlow__ConditionAssignment_5 )
            {
             before(grammarAccess.getAlternativeFlowAccess().getConditionAssignment_5()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2918:1: ( rule__AlternativeFlow__ConditionAssignment_5 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2918:2: rule__AlternativeFlow__ConditionAssignment_5
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__ConditionAssignment_5_in_rule__AlternativeFlow__Group__5__Impl5899);
            rule__AlternativeFlow__ConditionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeFlowAccess().getConditionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__5__Impl"


    // $ANTLR start "rule__AlternativeFlow__Group__6"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2928:1: rule__AlternativeFlow__Group__6 : rule__AlternativeFlow__Group__6__Impl rule__AlternativeFlow__Group__7 ;
    public final void rule__AlternativeFlow__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2932:1: ( rule__AlternativeFlow__Group__6__Impl rule__AlternativeFlow__Group__7 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2933:2: rule__AlternativeFlow__Group__6__Impl rule__AlternativeFlow__Group__7
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group__6__Impl_in_rule__AlternativeFlow__Group__65929);
            rule__AlternativeFlow__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlow__Group__7_in_rule__AlternativeFlow__Group__65932);
            rule__AlternativeFlow__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__6"


    // $ANTLR start "rule__AlternativeFlow__Group__6__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2940:1: rule__AlternativeFlow__Group__6__Impl : ( 'then' ) ;
    public final void rule__AlternativeFlow__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2944:1: ( ( 'then' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2945:1: ( 'then' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2945:1: ( 'then' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2946:1: 'then'
            {
             before(grammarAccess.getAlternativeFlowAccess().getThenKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__AlternativeFlow__Group__6__Impl5960); 
             after(grammarAccess.getAlternativeFlowAccess().getThenKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__6__Impl"


    // $ANTLR start "rule__AlternativeFlow__Group__7"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2959:1: rule__AlternativeFlow__Group__7 : rule__AlternativeFlow__Group__7__Impl rule__AlternativeFlow__Group__8 ;
    public final void rule__AlternativeFlow__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2963:1: ( rule__AlternativeFlow__Group__7__Impl rule__AlternativeFlow__Group__8 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2964:2: rule__AlternativeFlow__Group__7__Impl rule__AlternativeFlow__Group__8
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group__7__Impl_in_rule__AlternativeFlow__Group__75991);
            rule__AlternativeFlow__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlow__Group__8_in_rule__AlternativeFlow__Group__75994);
            rule__AlternativeFlow__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__7"


    // $ANTLR start "rule__AlternativeFlow__Group__7__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2971:1: rule__AlternativeFlow__Group__7__Impl : ( ( ( rule__AlternativeFlow__StepsAssignment_7 ) ) ( ( rule__AlternativeFlow__StepsAssignment_7 )* ) ) ;
    public final void rule__AlternativeFlow__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2975:1: ( ( ( ( rule__AlternativeFlow__StepsAssignment_7 ) ) ( ( rule__AlternativeFlow__StepsAssignment_7 )* ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2976:1: ( ( ( rule__AlternativeFlow__StepsAssignment_7 ) ) ( ( rule__AlternativeFlow__StepsAssignment_7 )* ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2976:1: ( ( ( rule__AlternativeFlow__StepsAssignment_7 ) ) ( ( rule__AlternativeFlow__StepsAssignment_7 )* ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2977:1: ( ( rule__AlternativeFlow__StepsAssignment_7 ) ) ( ( rule__AlternativeFlow__StepsAssignment_7 )* )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2977:1: ( ( rule__AlternativeFlow__StepsAssignment_7 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2978:1: ( rule__AlternativeFlow__StepsAssignment_7 )
            {
             before(grammarAccess.getAlternativeFlowAccess().getStepsAssignment_7()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2979:1: ( rule__AlternativeFlow__StepsAssignment_7 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2979:2: rule__AlternativeFlow__StepsAssignment_7
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__StepsAssignment_7_in_rule__AlternativeFlow__Group__7__Impl6023);
            rule__AlternativeFlow__StepsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeFlowAccess().getStepsAssignment_7()); 

            }

            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2982:1: ( ( rule__AlternativeFlow__StepsAssignment_7 )* )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2983:1: ( rule__AlternativeFlow__StepsAssignment_7 )*
            {
             before(grammarAccess.getAlternativeFlowAccess().getStepsAssignment_7()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2984:1: ( rule__AlternativeFlow__StepsAssignment_7 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_INT && LA18_0<=RULE_SINGLE_CHAR)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2984:2: rule__AlternativeFlow__StepsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__AlternativeFlow__StepsAssignment_7_in_rule__AlternativeFlow__Group__7__Impl6035);
            	    rule__AlternativeFlow__StepsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getAlternativeFlowAccess().getStepsAssignment_7()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__7__Impl"


    // $ANTLR start "rule__AlternativeFlow__Group__8"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2995:1: rule__AlternativeFlow__Group__8 : rule__AlternativeFlow__Group__8__Impl ;
    public final void rule__AlternativeFlow__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:2999:1: ( rule__AlternativeFlow__Group__8__Impl )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3000:2: rule__AlternativeFlow__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group__8__Impl_in_rule__AlternativeFlow__Group__86068);
            rule__AlternativeFlow__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__8"


    // $ANTLR start "rule__AlternativeFlow__Group__8__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3006:1: rule__AlternativeFlow__Group__8__Impl : ( 'endflow' ) ;
    public final void rule__AlternativeFlow__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3010:1: ( ( 'endflow' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3011:1: ( 'endflow' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3011:1: ( 'endflow' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3012:1: 'endflow'
            {
             before(grammarAccess.getAlternativeFlowAccess().getEndflowKeyword_8()); 
            match(input,50,FOLLOW_50_in_rule__AlternativeFlow__Group__8__Impl6096); 
             after(grammarAccess.getAlternativeFlowAccess().getEndflowKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__8__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3043:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3047:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3048:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__06145);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__06148);
            rule__Include__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0"


    // $ANTLR start "rule__Include__Group__0__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3055:1: rule__Include__Group__0__Impl : ( ( rule__Include__NameAssignment_0 ) ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3059:1: ( ( ( rule__Include__NameAssignment_0 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3060:1: ( ( rule__Include__NameAssignment_0 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3060:1: ( ( rule__Include__NameAssignment_0 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3061:1: ( rule__Include__NameAssignment_0 )
            {
             before(grammarAccess.getIncludeAccess().getNameAssignment_0()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3062:1: ( rule__Include__NameAssignment_0 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3062:2: rule__Include__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Include__NameAssignment_0_in_rule__Include__Group__0__Impl6175);
            rule__Include__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3072:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3076:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3077:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__16205);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__16208);
            rule__Include__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1"


    // $ANTLR start "rule__Include__Group__1__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3084:1: rule__Include__Group__1__Impl : ( ')' ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3088:1: ( ( ')' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3089:1: ( ')' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3089:1: ( ')' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3090:1: ')'
            {
             before(grammarAccess.getIncludeAccess().getRightParenthesisKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Include__Group__1__Impl6236); 
             after(grammarAccess.getIncludeAccess().getRightParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__Include__Group__2"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3103:1: rule__Include__Group__2 : rule__Include__Group__2__Impl rule__Include__Group__3 ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3107:1: ( rule__Include__Group__2__Impl rule__Include__Group__3 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3108:2: rule__Include__Group__2__Impl rule__Include__Group__3
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__26267);
            rule__Include__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__3_in_rule__Include__Group__26270);
            rule__Include__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__2"


    // $ANTLR start "rule__Include__Group__2__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3115:1: rule__Include__Group__2__Impl : ( 'include' ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3119:1: ( ( 'include' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3120:1: ( 'include' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3120:1: ( 'include' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3121:1: 'include'
            {
             before(grammarAccess.getIncludeAccess().getIncludeKeyword_2()); 
            match(input,51,FOLLOW_51_in_rule__Include__Group__2__Impl6298); 
             after(grammarAccess.getIncludeAccess().getIncludeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__2__Impl"


    // $ANTLR start "rule__Include__Group__3"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3134:1: rule__Include__Group__3 : rule__Include__Group__3__Impl rule__Include__Group__4 ;
    public final void rule__Include__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3138:1: ( rule__Include__Group__3__Impl rule__Include__Group__4 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3139:2: rule__Include__Group__3__Impl rule__Include__Group__4
            {
            pushFollow(FOLLOW_rule__Include__Group__3__Impl_in_rule__Include__Group__36329);
            rule__Include__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__4_in_rule__Include__Group__36332);
            rule__Include__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__3"


    // $ANTLR start "rule__Include__Group__3__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3146:1: rule__Include__Group__3__Impl : ( ( rule__Include__UseCaseAssignment_3 ) ) ;
    public final void rule__Include__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3150:1: ( ( ( rule__Include__UseCaseAssignment_3 ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3151:1: ( ( rule__Include__UseCaseAssignment_3 ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3151:1: ( ( rule__Include__UseCaseAssignment_3 ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3152:1: ( rule__Include__UseCaseAssignment_3 )
            {
             before(grammarAccess.getIncludeAccess().getUseCaseAssignment_3()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3153:1: ( rule__Include__UseCaseAssignment_3 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3153:2: rule__Include__UseCaseAssignment_3
            {
            pushFollow(FOLLOW_rule__Include__UseCaseAssignment_3_in_rule__Include__Group__3__Impl6359);
            rule__Include__UseCaseAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getUseCaseAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__3__Impl"


    // $ANTLR start "rule__Include__Group__4"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3163:1: rule__Include__Group__4 : rule__Include__Group__4__Impl ;
    public final void rule__Include__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3167:1: ( rule__Include__Group__4__Impl )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3168:2: rule__Include__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__4__Impl_in_rule__Include__Group__46389);
            rule__Include__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__4"


    // $ANTLR start "rule__Include__Group__4__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3174:1: rule__Include__Group__4__Impl : ( ';' ) ;
    public final void rule__Include__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3178:1: ( ( ';' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3179:1: ( ';' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3179:1: ( ';' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3180:1: ';'
            {
             before(grammarAccess.getIncludeAccess().getSemicolonKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__Include__Group__4__Impl6417); 
             after(grammarAccess.getIncludeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3203:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3207:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3208:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06458);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06461);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3215:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__Group_0__0 )? ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3219:1: ( ( ( rule__QualifiedName__Group_0__0 )? ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3220:1: ( ( rule__QualifiedName__Group_0__0 )? )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3220:1: ( ( rule__QualifiedName__Group_0__0 )? )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3221:1: ( rule__QualifiedName__Group_0__0 )?
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_0()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3222:1: ( rule__QualifiedName__Group_0__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3222:2: rule__QualifiedName__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedName__Group_0__0_in_rule__QualifiedName__Group__0__Impl6488);
                    rule__QualifiedName__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3232:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2 ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3236:1: ( rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3237:2: rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16519);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__16522);
            rule__QualifiedName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3244:1: rule__QualifiedName__Group__1__Impl : ( ruleStepOrder ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3248:1: ( ( ruleStepOrder ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3249:1: ( ruleStepOrder )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3249:1: ( ruleStepOrder )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3250:1: ruleStepOrder
            {
             before(grammarAccess.getQualifiedNameAccess().getStepOrderParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleStepOrder_in_rule__QualifiedName__Group__1__Impl6549);
            ruleStepOrder();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getStepOrderParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__2"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3261:1: rule__QualifiedName__Group__2 : rule__QualifiedName__Group__2__Impl ;
    public final void rule__QualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3265:1: ( rule__QualifiedName__Group__2__Impl )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3266:2: rule__QualifiedName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__26578);
            rule__QualifiedName__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__2"


    // $ANTLR start "rule__QualifiedName__Group__2__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3272:1: rule__QualifiedName__Group__2__Impl : ( ( rule__QualifiedName__Group_2__0 )* ) ;
    public final void rule__QualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3276:1: ( ( ( rule__QualifiedName__Group_2__0 )* ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3277:1: ( ( rule__QualifiedName__Group_2__0 )* )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3277:1: ( ( rule__QualifiedName__Group_2__0 )* )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3278:1: ( rule__QualifiedName__Group_2__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_2()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3279:1: ( rule__QualifiedName__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==12) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3279:2: rule__QualifiedName__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_2__0_in_rule__QualifiedName__Group__2__Impl6605);
            	    rule__QualifiedName__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group_0__0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3295:1: rule__QualifiedName__Group_0__0 : rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 ;
    public final void rule__QualifiedName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3299:1: ( rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3300:2: rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_0__0__Impl_in_rule__QualifiedName__Group_0__06642);
            rule__QualifiedName__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_0__1_in_rule__QualifiedName__Group_0__06645);
            rule__QualifiedName__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_0__0"


    // $ANTLR start "rule__QualifiedName__Group_0__0__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3307:1: rule__QualifiedName__Group_0__0__Impl : ( ruleAlternativeFlowName ) ;
    public final void rule__QualifiedName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3311:1: ( ( ruleAlternativeFlowName ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3312:1: ( ruleAlternativeFlowName )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3312:1: ( ruleAlternativeFlowName )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3313:1: ruleAlternativeFlowName
            {
             before(grammarAccess.getQualifiedNameAccess().getAlternativeFlowNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAlternativeFlowName_in_rule__QualifiedName__Group_0__0__Impl6672);
            ruleAlternativeFlowName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getAlternativeFlowNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_0__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_0__1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3324:1: rule__QualifiedName__Group_0__1 : rule__QualifiedName__Group_0__1__Impl ;
    public final void rule__QualifiedName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3328:1: ( rule__QualifiedName__Group_0__1__Impl )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3329:2: rule__QualifiedName__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_0__1__Impl_in_rule__QualifiedName__Group_0__16701);
            rule__QualifiedName__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_0__1"


    // $ANTLR start "rule__QualifiedName__Group_0__1__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3335:1: rule__QualifiedName__Group_0__1__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3339:1: ( ( '.' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3340:1: ( '.' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3340:1: ( '.' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3341:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1()); 
            match(input,12,FOLLOW_12_in_rule__QualifiedName__Group_0__1__Impl6729); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_0__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_2__0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3358:1: rule__QualifiedName__Group_2__0 : rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1 ;
    public final void rule__QualifiedName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3362:1: ( rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1 )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3363:2: rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_2__0__Impl_in_rule__QualifiedName__Group_2__06764);
            rule__QualifiedName__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_2__1_in_rule__QualifiedName__Group_2__06767);
            rule__QualifiedName__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_2__0"


    // $ANTLR start "rule__QualifiedName__Group_2__0__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3370:1: rule__QualifiedName__Group_2__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3374:1: ( ( '.' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3375:1: ( '.' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3375:1: ( '.' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3376:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_0()); 
            match(input,12,FOLLOW_12_in_rule__QualifiedName__Group_2__0__Impl6795); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_2__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_2__1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3389:1: rule__QualifiedName__Group_2__1 : rule__QualifiedName__Group_2__1__Impl ;
    public final void rule__QualifiedName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3393:1: ( rule__QualifiedName__Group_2__1__Impl )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3394:2: rule__QualifiedName__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_2__1__Impl_in_rule__QualifiedName__Group_2__16826);
            rule__QualifiedName__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_2__1"


    // $ANTLR start "rule__QualifiedName__Group_2__1__Impl"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3400:1: rule__QualifiedName__Group_2__1__Impl : ( ruleStepOrder ) ;
    public final void rule__QualifiedName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3404:1: ( ( ruleStepOrder ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3405:1: ( ruleStepOrder )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3405:1: ( ruleStepOrder )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3406:1: ruleStepOrder
            {
             before(grammarAccess.getQualifiedNameAccess().getStepOrderParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleStepOrder_in_rule__QualifiedName__Group_2__1__Impl6853);
            ruleStepOrder();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getStepOrderParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_2__1__Impl"


    // $ANTLR start "rule__UseCaseModel__SubjectAssignment_0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3423:1: rule__UseCaseModel__SubjectAssignment_0 : ( ruleSubject ) ;
    public final void rule__UseCaseModel__SubjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3427:1: ( ( ruleSubject ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3428:1: ( ruleSubject )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3428:1: ( ruleSubject )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3429:1: ruleSubject
            {
             before(grammarAccess.getUseCaseModelAccess().getSubjectSubjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSubject_in_rule__UseCaseModel__SubjectAssignment_06892);
            ruleSubject();

            state._fsp--;

             after(grammarAccess.getUseCaseModelAccess().getSubjectSubjectParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__SubjectAssignment_0"


    // $ANTLR start "rule__UseCaseModel__ActorAssignment_4"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3438:1: rule__UseCaseModel__ActorAssignment_4 : ( ruleActor ) ;
    public final void rule__UseCaseModel__ActorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3442:1: ( ( ruleActor ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3443:1: ( ruleActor )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3443:1: ( ruleActor )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3444:1: ruleActor
            {
             before(grammarAccess.getUseCaseModelAccess().getActorActorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleActor_in_rule__UseCaseModel__ActorAssignment_46923);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getUseCaseModelAccess().getActorActorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__ActorAssignment_4"


    // $ANTLR start "rule__UseCaseModel__ActorAssignment_5_1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3453:1: rule__UseCaseModel__ActorAssignment_5_1 : ( ruleActor ) ;
    public final void rule__UseCaseModel__ActorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3457:1: ( ( ruleActor ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3458:1: ( ruleActor )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3458:1: ( ruleActor )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3459:1: ruleActor
            {
             before(grammarAccess.getUseCaseModelAccess().getActorActorParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleActor_in_rule__UseCaseModel__ActorAssignment_5_16954);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getUseCaseModelAccess().getActorActorParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__ActorAssignment_5_1"


    // $ANTLR start "rule__UseCaseModel__UseCaseAssignment_7"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3468:1: rule__UseCaseModel__UseCaseAssignment_7 : ( ruleUseCase ) ;
    public final void rule__UseCaseModel__UseCaseAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3472:1: ( ( ruleUseCase ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3473:1: ( ruleUseCase )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3473:1: ( ruleUseCase )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3474:1: ruleUseCase
            {
             before(grammarAccess.getUseCaseModelAccess().getUseCaseUseCaseParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleUseCase_in_rule__UseCaseModel__UseCaseAssignment_76985);
            ruleUseCase();

            state._fsp--;

             after(grammarAccess.getUseCaseModelAccess().getUseCaseUseCaseParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseModel__UseCaseAssignment_7"


    // $ANTLR start "rule__Actor__NameAssignment"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3483:1: rule__Actor__NameAssignment : ( ruleName ) ;
    public final void rule__Actor__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3487:1: ( ( ruleName ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3488:1: ( ruleName )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3488:1: ( ruleName )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3489:1: ruleName
            {
             before(grammarAccess.getActorAccess().getNameNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__Actor__NameAssignment7016);
            ruleName();

            state._fsp--;

             after(grammarAccess.getActorAccess().getNameNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__NameAssignment"


    // $ANTLR start "rule__Subject__NameAssignment_1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3498:1: rule__Subject__NameAssignment_1 : ( ruleName ) ;
    public final void rule__Subject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3502:1: ( ( ruleName ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3503:1: ( ruleName )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3503:1: ( ruleName )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3504:1: ruleName
            {
             before(grammarAccess.getSubjectAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__Subject__NameAssignment_17047);
            ruleName();

            state._fsp--;

             after(grammarAccess.getSubjectAccess().getNameNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__NameAssignment_1"


    // $ANTLR start "rule__UseCase__NameAssignment_1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3513:1: rule__UseCase__NameAssignment_1 : ( ruleName ) ;
    public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3517:1: ( ( ruleName ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3518:1: ( ruleName )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3518:1: ( ruleName )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3519:1: ruleName
            {
             before(grammarAccess.getUseCaseAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__UseCase__NameAssignment_17078);
            ruleName();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getNameNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__NameAssignment_1"


    // $ANTLR start "rule__UseCase__DescriptionAssignment_4"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3528:1: rule__UseCase__DescriptionAssignment_4 : ( ruleDescription ) ;
    public final void rule__UseCase__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3532:1: ( ( ruleDescription ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3533:1: ( ruleDescription )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3533:1: ( ruleDescription )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3534:1: ruleDescription
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__UseCase__DescriptionAssignment_47109);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getDescriptionDescriptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__DescriptionAssignment_4"


    // $ANTLR start "rule__UseCase__ActorAssignment_7"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3543:1: rule__UseCase__ActorAssignment_7 : ( ( ruleName ) ) ;
    public final void rule__UseCase__ActorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3547:1: ( ( ( ruleName ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3548:1: ( ( ruleName ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3548:1: ( ( ruleName ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3549:1: ( ruleName )
            {
             before(grammarAccess.getUseCaseAccess().getActorActorCrossReference_7_0()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3550:1: ( ruleName )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3551:1: ruleName
            {
             before(grammarAccess.getUseCaseAccess().getActorActorNameParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_ruleName_in_rule__UseCase__ActorAssignment_77144);
            ruleName();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getActorActorNameParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getActorActorCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__ActorAssignment_7"


    // $ANTLR start "rule__UseCase__ActorAssignment_8_1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3562:1: rule__UseCase__ActorAssignment_8_1 : ( ( ruleName ) ) ;
    public final void rule__UseCase__ActorAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3566:1: ( ( ( ruleName ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3567:1: ( ( ruleName ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3567:1: ( ( ruleName ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3568:1: ( ruleName )
            {
             before(grammarAccess.getUseCaseAccess().getActorActorCrossReference_8_1_0()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3569:1: ( ruleName )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3570:1: ruleName
            {
             before(grammarAccess.getUseCaseAccess().getActorActorNameParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_ruleName_in_rule__UseCase__ActorAssignment_8_17183);
            ruleName();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getActorActorNameParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getActorActorCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__ActorAssignment_8_1"


    // $ANTLR start "rule__UseCase__PreConditionAssignment_10_1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3581:1: rule__UseCase__PreConditionAssignment_10_1 : ( ruleCondition ) ;
    public final void rule__UseCase__PreConditionAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3585:1: ( ( ruleCondition ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3586:1: ( ruleCondition )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3586:1: ( ruleCondition )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3587:1: ruleCondition
            {
             before(grammarAccess.getUseCaseAccess().getPreConditionConditionParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__UseCase__PreConditionAssignment_10_17218);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getPreConditionConditionParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__PreConditionAssignment_10_1"


    // $ANTLR start "rule__UseCase__BasicFlowAssignment_11"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3596:1: rule__UseCase__BasicFlowAssignment_11 : ( ruleBasicFlow ) ;
    public final void rule__UseCase__BasicFlowAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3600:1: ( ( ruleBasicFlow ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3601:1: ( ruleBasicFlow )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3601:1: ( ruleBasicFlow )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3602:1: ruleBasicFlow
            {
             before(grammarAccess.getUseCaseAccess().getBasicFlowBasicFlowParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleBasicFlow_in_rule__UseCase__BasicFlowAssignment_117249);
            ruleBasicFlow();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getBasicFlowBasicFlowParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__BasicFlowAssignment_11"


    // $ANTLR start "rule__UseCase__AlternativeFlowAssignment_12"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3611:1: rule__UseCase__AlternativeFlowAssignment_12 : ( ruleAlternativeFlow ) ;
    public final void rule__UseCase__AlternativeFlowAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3615:1: ( ( ruleAlternativeFlow ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3616:1: ( ruleAlternativeFlow )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3616:1: ( ruleAlternativeFlow )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3617:1: ruleAlternativeFlow
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeFlowAlternativeFlowParserRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleAlternativeFlow_in_rule__UseCase__AlternativeFlowAssignment_127280);
            ruleAlternativeFlow();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getAlternativeFlowAlternativeFlowParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__AlternativeFlowAssignment_12"


    // $ANTLR start "rule__UseCase__PostConditionAssignment_13_1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3626:1: rule__UseCase__PostConditionAssignment_13_1 : ( ruleCondition ) ;
    public final void rule__UseCase__PostConditionAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3630:1: ( ( ruleCondition ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3631:1: ( ruleCondition )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3631:1: ( ruleCondition )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3632:1: ruleCondition
            {
             before(grammarAccess.getUseCaseAccess().getPostConditionConditionParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__UseCase__PostConditionAssignment_13_17311);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getPostConditionConditionParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__PostConditionAssignment_13_1"


    // $ANTLR start "rule__Condition__ExpressionAssignment"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3641:1: rule__Condition__ExpressionAssignment : ( ruleDescription ) ;
    public final void rule__Condition__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3645:1: ( ( ruleDescription ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3646:1: ( ruleDescription )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3646:1: ( ruleDescription )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3647:1: ruleDescription
            {
             before(grammarAccess.getConditionAccess().getExpressionDescriptionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__Condition__ExpressionAssignment7342);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getExpressionDescriptionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ExpressionAssignment"


    // $ANTLR start "rule__BasicFlow__NameAssignment_0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3656:1: rule__BasicFlow__NameAssignment_0 : ( ( 'basic' ) ) ;
    public final void rule__BasicFlow__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3660:1: ( ( ( 'basic' ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3661:1: ( ( 'basic' ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3661:1: ( ( 'basic' ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3662:1: ( 'basic' )
            {
             before(grammarAccess.getBasicFlowAccess().getNameBasicKeyword_0_0()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3663:1: ( 'basic' )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3664:1: 'basic'
            {
             before(grammarAccess.getBasicFlowAccess().getNameBasicKeyword_0_0()); 
            match(input,52,FOLLOW_52_in_rule__BasicFlow__NameAssignment_07378); 
             after(grammarAccess.getBasicFlowAccess().getNameBasicKeyword_0_0()); 

            }

             after(grammarAccess.getBasicFlowAccess().getNameBasicKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__NameAssignment_0"


    // $ANTLR start "rule__BasicFlow__StepsAssignment_1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3679:1: rule__BasicFlow__StepsAssignment_1 : ( ruleStep ) ;
    public final void rule__BasicFlow__StepsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3683:1: ( ( ruleStep ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3684:1: ( ruleStep )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3684:1: ( ruleStep )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3685:1: ruleStep
            {
             before(grammarAccess.getBasicFlowAccess().getStepsStepParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__BasicFlow__StepsAssignment_17417);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getBasicFlowAccess().getStepsStepParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__StepsAssignment_1"


    // $ANTLR start "rule__Action__NameAssignment_0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3694:1: rule__Action__NameAssignment_0 : ( ruleStepOrder ) ;
    public final void rule__Action__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3698:1: ( ( ruleStepOrder ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3699:1: ( ruleStepOrder )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3699:1: ( ruleStepOrder )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3700:1: ruleStepOrder
            {
             before(grammarAccess.getActionAccess().getNameStepOrderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStepOrder_in_rule__Action__NameAssignment_07448);
            ruleStepOrder();

            state._fsp--;

             after(grammarAccess.getActionAccess().getNameStepOrderParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment_0"


    // $ANTLR start "rule__Action__AgentAssignment_4"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3709:1: rule__Action__AgentAssignment_4 : ( ( ruleName ) ) ;
    public final void rule__Action__AgentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3713:1: ( ( ( ruleName ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3714:1: ( ( ruleName ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3714:1: ( ( ruleName ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3715:1: ( ruleName )
            {
             before(grammarAccess.getActionAccess().getAgentAgentCrossReference_4_0()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3716:1: ( ruleName )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3717:1: ruleName
            {
             before(grammarAccess.getActionAccess().getAgentAgentNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleName_in_rule__Action__AgentAssignment_47483);
            ruleName();

            state._fsp--;

             after(grammarAccess.getActionAccess().getAgentAgentNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getActionAccess().getAgentAgentCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__AgentAssignment_4"


    // $ANTLR start "rule__Action__DescriptionAssignment_6"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3728:1: rule__Action__DescriptionAssignment_6 : ( ruleDescription ) ;
    public final void rule__Action__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3732:1: ( ( ruleDescription ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3733:1: ( ruleDescription )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3733:1: ( ruleDescription )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3734:1: ruleDescription
            {
             before(grammarAccess.getActionAccess().getDescriptionDescriptionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__Action__DescriptionAssignment_67518);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getActionAccess().getDescriptionDescriptionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__DescriptionAssignment_6"


    // $ANTLR start "rule__ConditionalStatement__NameAssignment_0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3743:1: rule__ConditionalStatement__NameAssignment_0 : ( ruleStepOrder ) ;
    public final void rule__ConditionalStatement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3747:1: ( ( ruleStepOrder ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3748:1: ( ruleStepOrder )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3748:1: ( ruleStepOrder )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3749:1: ruleStepOrder
            {
             before(grammarAccess.getConditionalStatementAccess().getNameStepOrderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStepOrder_in_rule__ConditionalStatement__NameAssignment_07549);
            ruleStepOrder();

            state._fsp--;

             after(grammarAccess.getConditionalStatementAccess().getNameStepOrderParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__NameAssignment_0"


    // $ANTLR start "rule__ConditionalStatement__ConditionAssignment_3"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3758:1: rule__ConditionalStatement__ConditionAssignment_3 : ( ruleCondition ) ;
    public final void rule__ConditionalStatement__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3762:1: ( ( ruleCondition ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3763:1: ( ruleCondition )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3763:1: ( ruleCondition )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3764:1: ruleCondition
            {
             before(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__ConditionalStatement__ConditionAssignment_37580);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__ConditionAssignment_3"


    // $ANTLR start "rule__ConditionalStatement__StepsAssignment_5"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3773:1: rule__ConditionalStatement__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__ConditionalStatement__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3777:1: ( ( ruleStep ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3778:1: ( ruleStep )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3778:1: ( ruleStep )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3779:1: ruleStep
            {
             before(grammarAccess.getConditionalStatementAccess().getStepsStepParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__ConditionalStatement__StepsAssignment_57611);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getConditionalStatementAccess().getStepsStepParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__StepsAssignment_5"


    // $ANTLR start "rule__LoopStatement__NameAssignment_0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3788:1: rule__LoopStatement__NameAssignment_0 : ( ruleStepOrder ) ;
    public final void rule__LoopStatement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3792:1: ( ( ruleStepOrder ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3793:1: ( ruleStepOrder )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3793:1: ( ruleStepOrder )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3794:1: ruleStepOrder
            {
             before(grammarAccess.getLoopStatementAccess().getNameStepOrderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStepOrder_in_rule__LoopStatement__NameAssignment_07642);
            ruleStepOrder();

            state._fsp--;

             after(grammarAccess.getLoopStatementAccess().getNameStepOrderParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__NameAssignment_0"


    // $ANTLR start "rule__LoopStatement__ConditionAssignment_3"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3803:1: rule__LoopStatement__ConditionAssignment_3 : ( ruleCondition ) ;
    public final void rule__LoopStatement__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3807:1: ( ( ruleCondition ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3808:1: ( ruleCondition )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3808:1: ( ruleCondition )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3809:1: ruleCondition
            {
             before(grammarAccess.getLoopStatementAccess().getConditionConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__LoopStatement__ConditionAssignment_37673);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getLoopStatementAccess().getConditionConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__ConditionAssignment_3"


    // $ANTLR start "rule__LoopStatement__StepsAssignment_5"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3818:1: rule__LoopStatement__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__LoopStatement__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3822:1: ( ( ruleStep ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3823:1: ( ruleStep )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3823:1: ( ruleStep )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3824:1: ruleStep
            {
             before(grammarAccess.getLoopStatementAccess().getStepsStepParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__LoopStatement__StepsAssignment_57704);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getLoopStatementAccess().getStepsStepParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__StepsAssignment_5"


    // $ANTLR start "rule__AlternativeFlow__NameAssignment_1"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3833:1: rule__AlternativeFlow__NameAssignment_1 : ( ruleAlternativeFlowName ) ;
    public final void rule__AlternativeFlow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3837:1: ( ( ruleAlternativeFlowName ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3838:1: ( ruleAlternativeFlowName )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3838:1: ( ruleAlternativeFlowName )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3839:1: ruleAlternativeFlowName
            {
             before(grammarAccess.getAlternativeFlowAccess().getNameAlternativeFlowNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAlternativeFlowName_in_rule__AlternativeFlow__NameAssignment_17735);
            ruleAlternativeFlowName();

            state._fsp--;

             after(grammarAccess.getAlternativeFlowAccess().getNameAlternativeFlowNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__NameAssignment_1"


    // $ANTLR start "rule__AlternativeFlow__BranchingStepAssignment_3"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3848:1: rule__AlternativeFlow__BranchingStepAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AlternativeFlow__BranchingStepAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3852:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3853:1: ( ( ruleQualifiedName ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3853:1: ( ( ruleQualifiedName ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3854:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getAlternativeFlowAccess().getBranchingStepStepCrossReference_3_0()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3855:1: ( ruleQualifiedName )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3856:1: ruleQualifiedName
            {
             before(grammarAccess.getAlternativeFlowAccess().getBranchingStepStepQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__AlternativeFlow__BranchingStepAssignment_37770);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAlternativeFlowAccess().getBranchingStepStepQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAlternativeFlowAccess().getBranchingStepStepCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__BranchingStepAssignment_3"


    // $ANTLR start "rule__AlternativeFlow__ConditionAssignment_5"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3867:1: rule__AlternativeFlow__ConditionAssignment_5 : ( ruleCondition ) ;
    public final void rule__AlternativeFlow__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3871:1: ( ( ruleCondition ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3872:1: ( ruleCondition )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3872:1: ( ruleCondition )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3873:1: ruleCondition
            {
             before(grammarAccess.getAlternativeFlowAccess().getConditionConditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__AlternativeFlow__ConditionAssignment_57805);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getAlternativeFlowAccess().getConditionConditionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__ConditionAssignment_5"


    // $ANTLR start "rule__AlternativeFlow__StepsAssignment_7"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3882:1: rule__AlternativeFlow__StepsAssignment_7 : ( ruleStep ) ;
    public final void rule__AlternativeFlow__StepsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3886:1: ( ( ruleStep ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3887:1: ( ruleStep )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3887:1: ( ruleStep )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3888:1: ruleStep
            {
             before(grammarAccess.getAlternativeFlowAccess().getStepsStepParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__AlternativeFlow__StepsAssignment_77836);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getAlternativeFlowAccess().getStepsStepParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__StepsAssignment_7"


    // $ANTLR start "rule__Include__NameAssignment_0"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3897:1: rule__Include__NameAssignment_0 : ( ruleStepOrder ) ;
    public final void rule__Include__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3901:1: ( ( ruleStepOrder ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3902:1: ( ruleStepOrder )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3902:1: ( ruleStepOrder )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3903:1: ruleStepOrder
            {
             before(grammarAccess.getIncludeAccess().getNameStepOrderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStepOrder_in_rule__Include__NameAssignment_07867);
            ruleStepOrder();

            state._fsp--;

             after(grammarAccess.getIncludeAccess().getNameStepOrderParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__NameAssignment_0"


    // $ANTLR start "rule__Include__UseCaseAssignment_3"
    // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3912:1: rule__Include__UseCaseAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Include__UseCaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3916:1: ( ( ( RULE_ID ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3917:1: ( ( RULE_ID ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3917:1: ( ( RULE_ID ) )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3918:1: ( RULE_ID )
            {
             before(grammarAccess.getIncludeAccess().getUseCaseUseCaseCrossReference_3_0()); 
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3919:1: ( RULE_ID )
            // ../br.com.levysiqueira.dsl.textualusecase.ui/src-gen/br/com/levysiqueira/dsl/textualusecase/ui/contentassist/antlr/internal/InternalTextualUseCase.g:3920:1: RULE_ID
            {
             before(grammarAccess.getIncludeAccess().getUseCaseUseCaseIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Include__UseCaseAssignment_37902); 
             after(grammarAccess.getIncludeAccess().getUseCaseUseCaseIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getIncludeAccess().getUseCaseUseCaseCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__UseCaseAssignment_3"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\2\5\1\6\1\5\1\46\1\6\4\uffff";
    static final String DFA4_maxS =
        "\1\6\3\30\1\63\1\30\4\uffff";
    static final String DFA4_acceptS =
        "\6\uffff\1\4\1\1\1\2\1\3";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2",
            "\1\3\22\uffff\1\4",
            "\1\5\21\uffff\1\4",
            "\1\3\22\uffff\1\4",
            "\1\7\2\uffff\1\10\2\uffff\1\11\6\uffff\1\6",
            "\1\5\21\uffff\1\4",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "570:1: rule__Step__Alternatives : ( ( ruleAction ) | ( ruleConditionalStatement ) | ( ruleLoopStatement ) | ( ruleInclude ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleUseCaseModel_in_entryRuleUseCaseModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseCaseModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group__0_in_ruleUseCaseModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__NameAssignment_in_ruleActor156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubject_in_entryRuleSubject183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubject190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subject__Group__0_in_ruleSubject216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseCase_in_entryRuleUseCase243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseCase250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__0_in_ruleUseCase276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ExpressionAssignment_in_ruleCondition336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicFlow_in_entryRuleBasicFlow363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicFlow370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group__0_in_ruleBasicFlow396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Alternatives_in_ruleStep456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalStatement_in_entryRuleConditionalStatement543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalStatement550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__Group__0_in_ruleConditionalStatement576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopStatement_in_entryRuleLoopStatement603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopStatement610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopStatement__Group__0_in_ruleLoopStatement636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeFlow_in_entryRuleAlternativeFlow663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeFlow670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__0_in_ruleAlternativeFlow696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepOrder_in_entryRuleStepOrder788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepOrder795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepOrder__Alternatives_in_ruleStepOrder825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName888 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName901 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAlternativeFlowName_in_entryRuleAlternativeFlowName931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeFlowName938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeFlowName967 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeFlowName980 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription1070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Alternatives_in_ruleDescription1105 = new BitSet(new long[]{0x000000003FFFF0B2L});
    public static final BitSet FOLLOW_rule__Description__Alternatives_in_ruleDescription1117 = new BitSet(new long[]{0x000000003FFFF0B2L});
    public static final BitSet FOLLOW_ruleAction_in_rule__Step__Alternatives1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalStatement_in_rule__Step__Alternatives1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopStatement_in_rule__Step__Alternatives1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__Step__Alternatives1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StepOrder__Alternatives1245 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StepOrder__Alternatives1258 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_SINGLE_CHAR_in_rule__StepOrder__Alternatives1282 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_SINGLE_CHAR_in_rule__StepOrder__Alternatives1295 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Description__Alternatives1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Description__Alternatives1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Description__Alternatives1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Description__Alternatives1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Description__Alternatives1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Description__Alternatives1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Description__Alternatives1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Description__Alternatives1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Description__Alternatives1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Description__Alternatives1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Description__Alternatives1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Description__Alternatives1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Description__Alternatives1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Description__Alternatives1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Description__Alternatives1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Description__Alternatives1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Description__Alternatives1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Description__Alternatives1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Description__Alternatives1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Description__Alternatives1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Description__Alternatives1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group__0__Impl_in_rule__UseCaseModel__Group__01755 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group__1_in_rule__UseCaseModel__Group__01758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCaseModel__SubjectAssignment_0_in_rule__UseCaseModel__Group__0__Impl1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group__1__Impl_in_rule__UseCaseModel__Group__11815 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group__2_in_rule__UseCaseModel__Group__11818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__UseCaseModel__Group__1__Impl1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group__2__Impl_in_rule__UseCaseModel__Group__21877 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group__3_in_rule__UseCaseModel__Group__21880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__UseCaseModel__Group__2__Impl1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group__3__Impl_in_rule__UseCaseModel__Group__31939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group__4_in_rule__UseCaseModel__Group__31942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UseCaseModel__Group__3__Impl1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group__4__Impl_in_rule__UseCaseModel__Group__42001 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group__5_in_rule__UseCaseModel__Group__42004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCaseModel__ActorAssignment_4_in_rule__UseCaseModel__Group__4__Impl2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group__5__Impl_in_rule__UseCaseModel__Group__52061 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group__6_in_rule__UseCaseModel__Group__52064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group_5__0_in_rule__UseCaseModel__Group__5__Impl2091 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group__6__Impl_in_rule__UseCaseModel__Group__62122 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group__7_in_rule__UseCaseModel__Group__62125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UseCaseModel__Group__6__Impl2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group__7__Impl_in_rule__UseCaseModel__Group__72184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCaseModel__UseCaseAssignment_7_in_rule__UseCaseModel__Group__7__Impl2211 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group_5__0__Impl_in_rule__UseCaseModel__Group_5__02258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group_5__1_in_rule__UseCaseModel__Group_5__02261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UseCaseModel__Group_5__0__Impl2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCaseModel__Group_5__1__Impl_in_rule__UseCaseModel__Group_5__12320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCaseModel__ActorAssignment_5_1_in_rule__UseCaseModel__Group_5__1__Impl2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subject__Group__0__Impl_in_rule__Subject__Group__02381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Subject__Group__1_in_rule__Subject__Group__02384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Subject__Group__0__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subject__Group__1__Impl_in_rule__Subject__Group__12443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subject__NameAssignment_1_in_rule__Subject__Group__1__Impl2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__0__Impl_in_rule__UseCase__Group__02504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UseCase__Group__1_in_rule__UseCase__Group__02507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__UseCase__Group__0__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__1__Impl_in_rule__UseCase__Group__12566 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__UseCase__Group__2_in_rule__UseCase__Group__12569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__NameAssignment_1_in_rule__UseCase__Group__1__Impl2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__2__Impl_in_rule__UseCase__Group__22626 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__UseCase__Group__3_in_rule__UseCase__Group__22629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UseCase__Group__2__Impl2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__3__Impl_in_rule__UseCase__Group__32688 = new BitSet(new long[]{0x000000003FFFF0B0L});
    public static final BitSet FOLLOW_rule__UseCase__Group__4_in_rule__UseCase__Group__32691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__UseCase__Group__3__Impl2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__4__Impl_in_rule__UseCase__Group__42750 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__UseCase__Group__5_in_rule__UseCase__Group__42753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__DescriptionAssignment_4_in_rule__UseCase__Group__4__Impl2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__5__Impl_in_rule__UseCase__Group__52810 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__UseCase__Group__6_in_rule__UseCase__Group__52813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__UseCase__Group__5__Impl2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__6__Impl_in_rule__UseCase__Group__62872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UseCase__Group__7_in_rule__UseCase__Group__62875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__UseCase__Group__6__Impl2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__7__Impl_in_rule__UseCase__Group__72934 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_rule__UseCase__Group__8_in_rule__UseCase__Group__72937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__ActorAssignment_7_in_rule__UseCase__Group__7__Impl2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__8__Impl_in_rule__UseCase__Group__82994 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_rule__UseCase__Group__9_in_rule__UseCase__Group__82997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_8__0_in_rule__UseCase__Group__8__Impl3024 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__9__Impl_in_rule__UseCase__Group__93055 = new BitSet(new long[]{0x0010000800000000L});
    public static final BitSet FOLLOW_rule__UseCase__Group__10_in_rule__UseCase__Group__93058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__UseCase__Group__9__Impl3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__10__Impl_in_rule__UseCase__Group__103117 = new BitSet(new long[]{0x0010000800000000L});
    public static final BitSet FOLLOW_rule__UseCase__Group__11_in_rule__UseCase__Group__103120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_10__0_in_rule__UseCase__Group__10__Impl3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__11__Impl_in_rule__UseCase__Group__113178 = new BitSet(new long[]{0x0000801004000000L});
    public static final BitSet FOLLOW_rule__UseCase__Group__12_in_rule__UseCase__Group__113181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__BasicFlowAssignment_11_in_rule__UseCase__Group__11__Impl3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__12__Impl_in_rule__UseCase__Group__123238 = new BitSet(new long[]{0x0000801004000000L});
    public static final BitSet FOLLOW_rule__UseCase__Group__13_in_rule__UseCase__Group__123241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__AlternativeFlowAssignment_12_in_rule__UseCase__Group__12__Impl3268 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__13__Impl_in_rule__UseCase__Group__133299 = new BitSet(new long[]{0x0000801004000000L});
    public static final BitSet FOLLOW_rule__UseCase__Group__14_in_rule__UseCase__Group__133302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_13__0_in_rule__UseCase__Group__13__Impl3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__14__Impl_in_rule__UseCase__Group__143360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UseCase__Group__14__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_8__0__Impl_in_rule__UseCase__Group_8__03449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UseCase__Group_8__1_in_rule__UseCase__Group_8__03452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UseCase__Group_8__0__Impl3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_8__1__Impl_in_rule__UseCase__Group_8__13511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__ActorAssignment_8_1_in_rule__UseCase__Group_8__1__Impl3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_10__0__Impl_in_rule__UseCase__Group_10__03572 = new BitSet(new long[]{0x000000003FFFF0B0L});
    public static final BitSet FOLLOW_rule__UseCase__Group_10__1_in_rule__UseCase__Group_10__03575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__UseCase__Group_10__0__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_10__1__Impl_in_rule__UseCase__Group_10__13634 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__UseCase__Group_10__2_in_rule__UseCase__Group_10__13637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__PreConditionAssignment_10_1_in_rule__UseCase__Group_10__1__Impl3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_10__2__Impl_in_rule__UseCase__Group_10__23694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__UseCase__Group_10__2__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_13__0__Impl_in_rule__UseCase__Group_13__03759 = new BitSet(new long[]{0x000000003FFFF0B0L});
    public static final BitSet FOLLOW_rule__UseCase__Group_13__1_in_rule__UseCase__Group_13__03762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__UseCase__Group_13__0__Impl3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_13__1__Impl_in_rule__UseCase__Group_13__13821 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__UseCase__Group_13__2_in_rule__UseCase__Group_13__13824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__PostConditionAssignment_13_1_in_rule__UseCase__Group_13__1__Impl3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_13__2__Impl_in_rule__UseCase__Group_13__23881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__UseCase__Group_13__2__Impl3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group__0__Impl_in_rule__BasicFlow__Group__03946 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group__1_in_rule__BasicFlow__Group__03949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicFlow__NameAssignment_0_in_rule__BasicFlow__Group__0__Impl3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group__1__Impl_in_rule__BasicFlow__Group__14006 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group__2_in_rule__BasicFlow__Group__14009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicFlow__StepsAssignment_1_in_rule__BasicFlow__Group__1__Impl4038 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_rule__BasicFlow__StepsAssignment_1_in_rule__BasicFlow__Group__1__Impl4050 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group__2__Impl_in_rule__BasicFlow__Group__24083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__BasicFlow__Group__2__Impl4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__04148 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_0_in_rule__Action__Group__0__Impl4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__14208 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Action__Group__1__Impl4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__24270 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Action__Group__2__Impl4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__34332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__34335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Action__Group__3__Impl4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__44394 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Action__Group__5_in_rule__Action__Group__44397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__AgentAssignment_4_in_rule__Action__Group__4__Impl4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__54454 = new BitSet(new long[]{0x000000003FFFF0B0L});
    public static final BitSet FOLLOW_rule__Action__Group__6_in_rule__Action__Group__54457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Action__Group__5__Impl4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__6__Impl_in_rule__Action__Group__64516 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Action__Group__7_in_rule__Action__Group__64519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DescriptionAssignment_6_in_rule__Action__Group__6__Impl4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__7__Impl_in_rule__Action__Group__74576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Action__Group__7__Impl4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__Group__0__Impl_in_rule__ConditionalStatement__Group__04651 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__Group__1_in_rule__ConditionalStatement__Group__04654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__NameAssignment_0_in_rule__ConditionalStatement__Group__0__Impl4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__Group__1__Impl_in_rule__ConditionalStatement__Group__14711 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__Group__2_in_rule__ConditionalStatement__Group__14714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ConditionalStatement__Group__1__Impl4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__Group__2__Impl_in_rule__ConditionalStatement__Group__24773 = new BitSet(new long[]{0x000000003FFFF0B0L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__Group__3_in_rule__ConditionalStatement__Group__24776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ConditionalStatement__Group__2__Impl4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__Group__3__Impl_in_rule__ConditionalStatement__Group__34835 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__Group__4_in_rule__ConditionalStatement__Group__34838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__ConditionAssignment_3_in_rule__ConditionalStatement__Group__3__Impl4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__Group__4__Impl_in_rule__ConditionalStatement__Group__44895 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__Group__5_in_rule__ConditionalStatement__Group__44898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ConditionalStatement__Group__4__Impl4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__Group__5__Impl_in_rule__ConditionalStatement__Group__54957 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__Group__6_in_rule__ConditionalStatement__Group__54960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__StepsAssignment_5_in_rule__ConditionalStatement__Group__5__Impl4989 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__StepsAssignment_5_in_rule__ConditionalStatement__Group__5__Impl5001 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_rule__ConditionalStatement__Group__6__Impl_in_rule__ConditionalStatement__Group__65034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ConditionalStatement__Group__6__Impl5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopStatement__Group__0__Impl_in_rule__LoopStatement__Group__05107 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__LoopStatement__Group__1_in_rule__LoopStatement__Group__05110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopStatement__NameAssignment_0_in_rule__LoopStatement__Group__0__Impl5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopStatement__Group__1__Impl_in_rule__LoopStatement__Group__15167 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__LoopStatement__Group__2_in_rule__LoopStatement__Group__15170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LoopStatement__Group__1__Impl5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopStatement__Group__2__Impl_in_rule__LoopStatement__Group__25229 = new BitSet(new long[]{0x000000003FFFF0B0L});
    public static final BitSet FOLLOW_rule__LoopStatement__Group__3_in_rule__LoopStatement__Group__25232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__LoopStatement__Group__2__Impl5260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopStatement__Group__3__Impl_in_rule__LoopStatement__Group__35291 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__LoopStatement__Group__4_in_rule__LoopStatement__Group__35294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopStatement__ConditionAssignment_3_in_rule__LoopStatement__Group__3__Impl5321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopStatement__Group__4__Impl_in_rule__LoopStatement__Group__45351 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__LoopStatement__Group__5_in_rule__LoopStatement__Group__45354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__LoopStatement__Group__4__Impl5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopStatement__Group__5__Impl_in_rule__LoopStatement__Group__55413 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__LoopStatement__Group__6_in_rule__LoopStatement__Group__55416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopStatement__StepsAssignment_5_in_rule__LoopStatement__Group__5__Impl5445 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_rule__LoopStatement__StepsAssignment_5_in_rule__LoopStatement__Group__5__Impl5457 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_rule__LoopStatement__Group__6__Impl_in_rule__LoopStatement__Group__65490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__LoopStatement__Group__6__Impl5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__0__Impl_in_rule__AlternativeFlow__Group__05563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__1_in_rule__AlternativeFlow__Group__05566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__AlternativeFlow__Group__0__Impl5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__1__Impl_in_rule__AlternativeFlow__Group__15625 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__2_in_rule__AlternativeFlow__Group__15628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__NameAssignment_1_in_rule__AlternativeFlow__Group__1__Impl5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__2__Impl_in_rule__AlternativeFlow__Group__25685 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__3_in_rule__AlternativeFlow__Group__25688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__AlternativeFlow__Group__2__Impl5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__3__Impl_in_rule__AlternativeFlow__Group__35747 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__4_in_rule__AlternativeFlow__Group__35750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__BranchingStepAssignment_3_in_rule__AlternativeFlow__Group__3__Impl5777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__4__Impl_in_rule__AlternativeFlow__Group__45807 = new BitSet(new long[]{0x000000003FFFF0B0L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__5_in_rule__AlternativeFlow__Group__45810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__AlternativeFlow__Group__4__Impl5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__5__Impl_in_rule__AlternativeFlow__Group__55869 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__6_in_rule__AlternativeFlow__Group__55872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__ConditionAssignment_5_in_rule__AlternativeFlow__Group__5__Impl5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__6__Impl_in_rule__AlternativeFlow__Group__65929 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__7_in_rule__AlternativeFlow__Group__65932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__AlternativeFlow__Group__6__Impl5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__7__Impl_in_rule__AlternativeFlow__Group__75991 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__8_in_rule__AlternativeFlow__Group__75994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__StepsAssignment_7_in_rule__AlternativeFlow__Group__7__Impl6023 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__StepsAssignment_7_in_rule__AlternativeFlow__Group__7__Impl6035 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__8__Impl_in_rule__AlternativeFlow__Group__86068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__AlternativeFlow__Group__8__Impl6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__06145 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__06148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__NameAssignment_0_in_rule__Include__Group__0__Impl6175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__16205 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__16208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Include__Group__1__Impl6236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__26267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group__3_in_rule__Include__Group__26270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Include__Group__2__Impl6298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__3__Impl_in_rule__Include__Group__36329 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Include__Group__4_in_rule__Include__Group__36332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__UseCaseAssignment_3_in_rule__Include__Group__3__Impl6359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__4__Impl_in_rule__Include__Group__46389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Include__Group__4__Impl6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06458 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_0__0_in_rule__QualifiedName__Group__0__Impl6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16519 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__16522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepOrder_in_rule__QualifiedName__Group__1__Impl6549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__26578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_2__0_in_rule__QualifiedName__Group__2__Impl6605 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_0__0__Impl_in_rule__QualifiedName__Group_0__06642 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_0__1_in_rule__QualifiedName__Group_0__06645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeFlowName_in_rule__QualifiedName__Group_0__0__Impl6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_0__1__Impl_in_rule__QualifiedName__Group_0__16701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__QualifiedName__Group_0__1__Impl6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_2__0__Impl_in_rule__QualifiedName__Group_2__06764 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_2__1_in_rule__QualifiedName__Group_2__06767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__QualifiedName__Group_2__0__Impl6795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_2__1__Impl_in_rule__QualifiedName__Group_2__16826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepOrder_in_rule__QualifiedName__Group_2__1__Impl6853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubject_in_rule__UseCaseModel__SubjectAssignment_06892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_rule__UseCaseModel__ActorAssignment_46923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_rule__UseCaseModel__ActorAssignment_5_16954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseCase_in_rule__UseCaseModel__UseCaseAssignment_76985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Actor__NameAssignment7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Subject__NameAssignment_17047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__UseCase__NameAssignment_17078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__UseCase__DescriptionAssignment_47109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__UseCase__ActorAssignment_77144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__UseCase__ActorAssignment_8_17183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__UseCase__PreConditionAssignment_10_17218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicFlow_in_rule__UseCase__BasicFlowAssignment_117249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeFlow_in_rule__UseCase__AlternativeFlowAssignment_127280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__UseCase__PostConditionAssignment_13_17311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__Condition__ExpressionAssignment7342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__BasicFlow__NameAssignment_07378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__BasicFlow__StepsAssignment_17417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepOrder_in_rule__Action__NameAssignment_07448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Action__AgentAssignment_47483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__Action__DescriptionAssignment_67518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepOrder_in_rule__ConditionalStatement__NameAssignment_07549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__ConditionalStatement__ConditionAssignment_37580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__ConditionalStatement__StepsAssignment_57611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepOrder_in_rule__LoopStatement__NameAssignment_07642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__LoopStatement__ConditionAssignment_37673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__LoopStatement__StepsAssignment_57704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeFlowName_in_rule__AlternativeFlow__NameAssignment_17735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AlternativeFlow__BranchingStepAssignment_37770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__AlternativeFlow__ConditionAssignment_57805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__AlternativeFlow__StepsAssignment_77836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepOrder_in_rule__Include__NameAssignment_07867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Include__UseCaseAssignment_37902 = new BitSet(new long[]{0x0000000000000002L});

}