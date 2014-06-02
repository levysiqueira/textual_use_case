package br.com.levysiqueira.dsl.textualusecase.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.com.levysiqueira.dsl.textualusecase.services.TextualUseCaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextualUseCaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_SINGLE_CHAR", "RULE_WS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "';'", "'actors'", "'{'", "','", "'}'", "'subject'", "'usecase'", "'description'", "'preCondition'", "'postCondition'", "'basic'", "'endbasic'", "')'", "'action'", "'['", "']'", "'if'", "'then'", "'endif'", "'while'", "'do'", "'endwhile'", "'alternative'", "'to step'", "'when'", "'endflow'", "'include'", "'.'", "'?'", "'\\''", "'\"'", "'-'", "'+'", "'='", "'*'", "'<'", "'>'", "'('", "'@'", "'%'", "'_'"
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
    public String getGrammarFileName() { return "../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g"; }



     	private TextualUseCaseGrammarAccess grammarAccess;
     	
        public InternalTextualUseCaseParser(TokenStream input, TextualUseCaseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "UseCaseModel";	
       	}
       	
       	@Override
       	protected TextualUseCaseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleUseCaseModel"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:67:1: entryRuleUseCaseModel returns [EObject current=null] : iv_ruleUseCaseModel= ruleUseCaseModel EOF ;
    public final EObject entryRuleUseCaseModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseModel = null;


        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:68:2: (iv_ruleUseCaseModel= ruleUseCaseModel EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:69:2: iv_ruleUseCaseModel= ruleUseCaseModel EOF
            {
             newCompositeNode(grammarAccess.getUseCaseModelRule()); 
            pushFollow(FOLLOW_ruleUseCaseModel_in_entryRuleUseCaseModel75);
            iv_ruleUseCaseModel=ruleUseCaseModel();

            state._fsp--;

             current =iv_ruleUseCaseModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseCaseModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseCaseModel"


    // $ANTLR start "ruleUseCaseModel"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:76:1: ruleUseCaseModel returns [EObject current=null] : ( ( (lv_subject_0_0= ruleSubject ) ) otherlv_1= ';' otherlv_2= 'actors' otherlv_3= '{' ( (lv_actor_4_0= ruleActor ) ) (otherlv_5= ',' ( (lv_actor_6_0= ruleActor ) ) )* otherlv_7= '}' ( (lv_useCase_8_0= ruleUseCase ) )* ) ;
    public final EObject ruleUseCaseModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_subject_0_0 = null;

        EObject lv_actor_4_0 = null;

        EObject lv_actor_6_0 = null;

        EObject lv_useCase_8_0 = null;


         enterRule(); 
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:79:28: ( ( ( (lv_subject_0_0= ruleSubject ) ) otherlv_1= ';' otherlv_2= 'actors' otherlv_3= '{' ( (lv_actor_4_0= ruleActor ) ) (otherlv_5= ',' ( (lv_actor_6_0= ruleActor ) ) )* otherlv_7= '}' ( (lv_useCase_8_0= ruleUseCase ) )* ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:80:1: ( ( (lv_subject_0_0= ruleSubject ) ) otherlv_1= ';' otherlv_2= 'actors' otherlv_3= '{' ( (lv_actor_4_0= ruleActor ) ) (otherlv_5= ',' ( (lv_actor_6_0= ruleActor ) ) )* otherlv_7= '}' ( (lv_useCase_8_0= ruleUseCase ) )* )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:80:1: ( ( (lv_subject_0_0= ruleSubject ) ) otherlv_1= ';' otherlv_2= 'actors' otherlv_3= '{' ( (lv_actor_4_0= ruleActor ) ) (otherlv_5= ',' ( (lv_actor_6_0= ruleActor ) ) )* otherlv_7= '}' ( (lv_useCase_8_0= ruleUseCase ) )* )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:80:2: ( (lv_subject_0_0= ruleSubject ) ) otherlv_1= ';' otherlv_2= 'actors' otherlv_3= '{' ( (lv_actor_4_0= ruleActor ) ) (otherlv_5= ',' ( (lv_actor_6_0= ruleActor ) ) )* otherlv_7= '}' ( (lv_useCase_8_0= ruleUseCase ) )*
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:80:2: ( (lv_subject_0_0= ruleSubject ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:81:1: (lv_subject_0_0= ruleSubject )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:81:1: (lv_subject_0_0= ruleSubject )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:82:3: lv_subject_0_0= ruleSubject
            {
             
            	        newCompositeNode(grammarAccess.getUseCaseModelAccess().getSubjectSubjectParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSubject_in_ruleUseCaseModel131);
            lv_subject_0_0=ruleSubject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
            	        }
                   		set(
                   			current, 
                   			"subject",
                    		lv_subject_0_0, 
                    		"Subject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleUseCaseModel143); 

                	newLeafNode(otherlv_1, grammarAccess.getUseCaseModelAccess().getSemicolonKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleUseCaseModel155); 

                	newLeafNode(otherlv_2, grammarAccess.getUseCaseModelAccess().getActorsKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleUseCaseModel167); 

                	newLeafNode(otherlv_3, grammarAccess.getUseCaseModelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:110:1: ( (lv_actor_4_0= ruleActor ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:111:1: (lv_actor_4_0= ruleActor )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:111:1: (lv_actor_4_0= ruleActor )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:112:3: lv_actor_4_0= ruleActor
            {
             
            	        newCompositeNode(grammarAccess.getUseCaseModelAccess().getActorActorParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleActor_in_ruleUseCaseModel188);
            lv_actor_4_0=ruleActor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
            	        }
                   		add(
                   			current, 
                   			"actor",
                    		lv_actor_4_0, 
                    		"Actor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:128:2: (otherlv_5= ',' ( (lv_actor_6_0= ruleActor ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:128:4: otherlv_5= ',' ( (lv_actor_6_0= ruleActor ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleUseCaseModel201); 

            	        	newLeafNode(otherlv_5, grammarAccess.getUseCaseModelAccess().getCommaKeyword_5_0());
            	        
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:132:1: ( (lv_actor_6_0= ruleActor ) )
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:133:1: (lv_actor_6_0= ruleActor )
            	    {
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:133:1: (lv_actor_6_0= ruleActor )
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:134:3: lv_actor_6_0= ruleActor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseModelAccess().getActorActorParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActor_in_ruleUseCaseModel222);
            	    lv_actor_6_0=ruleActor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actor",
            	            		lv_actor_6_0, 
            	            		"Actor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleUseCaseModel236); 

                	newLeafNode(otherlv_7, grammarAccess.getUseCaseModelAccess().getRightCurlyBracketKeyword_6());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:154:1: ( (lv_useCase_8_0= ruleUseCase ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:155:1: (lv_useCase_8_0= ruleUseCase )
            	    {
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:155:1: (lv_useCase_8_0= ruleUseCase )
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:156:3: lv_useCase_8_0= ruleUseCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseModelAccess().getUseCaseUseCaseParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUseCase_in_ruleUseCaseModel257);
            	    lv_useCase_8_0=ruleUseCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"useCase",
            	            		lv_useCase_8_0, 
            	            		"UseCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUseCaseModel"


    // $ANTLR start "entryRuleActor"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:182:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:183:2: (iv_ruleActor= ruleActor EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:184:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor296);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor306); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:191:1: ruleActor returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:194:28: ( ( (lv_name_0_0= ruleName ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:195:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:195:1: ( (lv_name_0_0= ruleName ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:196:1: (lv_name_0_0= ruleName )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:196:1: (lv_name_0_0= ruleName )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:197:3: lv_name_0_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getActorAccess().getNameNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleActor351);
            lv_name_0_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActorRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleSubject"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:221:1: entryRuleSubject returns [EObject current=null] : iv_ruleSubject= ruleSubject EOF ;
    public final EObject entryRuleSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubject = null;


        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:222:2: (iv_ruleSubject= ruleSubject EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:223:2: iv_ruleSubject= ruleSubject EOF
            {
             newCompositeNode(grammarAccess.getSubjectRule()); 
            pushFollow(FOLLOW_ruleSubject_in_entryRuleSubject386);
            iv_ruleSubject=ruleSubject();

            state._fsp--;

             current =iv_ruleSubject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubject396); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubject"


    // $ANTLR start "ruleSubject"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:230:1: ruleSubject returns [EObject current=null] : (otherlv_0= 'subject' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleSubject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:233:28: ( (otherlv_0= 'subject' ( (lv_name_1_0= ruleName ) ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:234:1: (otherlv_0= 'subject' ( (lv_name_1_0= ruleName ) ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:234:1: (otherlv_0= 'subject' ( (lv_name_1_0= ruleName ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:234:3: otherlv_0= 'subject' ( (lv_name_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSubject433); 

                	newLeafNode(otherlv_0, grammarAccess.getSubjectAccess().getSubjectKeyword_0());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:238:1: ( (lv_name_1_0= ruleName ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:239:1: (lv_name_1_0= ruleName )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:239:1: (lv_name_1_0= ruleName )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:240:3: lv_name_1_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getSubjectAccess().getNameNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleSubject454);
            lv_name_1_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubjectRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubject"


    // $ANTLR start "entryRuleUseCase"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:264:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:265:2: (iv_ruleUseCase= ruleUseCase EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:266:2: iv_ruleUseCase= ruleUseCase EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_ruleUseCase_in_entryRuleUseCase490);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseCase500); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:273:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'usecase' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= ruleDescription ) ) otherlv_5= ';' otherlv_6= 'actors' ( ( ruleName ) ) (otherlv_8= ',' ( ( ruleName ) ) )* otherlv_10= ';' (otherlv_11= 'preCondition' ( (lv_preCondition_12_0= ruleCondition ) ) otherlv_13= ';' )? ( (lv_basicFlow_14_0= ruleBasicFlow ) ) ( (lv_alternativeFlow_15_0= ruleAlternativeFlow ) )* (otherlv_16= 'postCondition' ( (lv_postCondition_17_0= ruleCondition ) ) otherlv_18= ';' )? otherlv_19= '}' ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        EObject lv_preCondition_12_0 = null;

        EObject lv_basicFlow_14_0 = null;

        EObject lv_alternativeFlow_15_0 = null;

        EObject lv_postCondition_17_0 = null;


         enterRule(); 
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:276:28: ( (otherlv_0= 'usecase' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= ruleDescription ) ) otherlv_5= ';' otherlv_6= 'actors' ( ( ruleName ) ) (otherlv_8= ',' ( ( ruleName ) ) )* otherlv_10= ';' (otherlv_11= 'preCondition' ( (lv_preCondition_12_0= ruleCondition ) ) otherlv_13= ';' )? ( (lv_basicFlow_14_0= ruleBasicFlow ) ) ( (lv_alternativeFlow_15_0= ruleAlternativeFlow ) )* (otherlv_16= 'postCondition' ( (lv_postCondition_17_0= ruleCondition ) ) otherlv_18= ';' )? otherlv_19= '}' ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:277:1: (otherlv_0= 'usecase' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= ruleDescription ) ) otherlv_5= ';' otherlv_6= 'actors' ( ( ruleName ) ) (otherlv_8= ',' ( ( ruleName ) ) )* otherlv_10= ';' (otherlv_11= 'preCondition' ( (lv_preCondition_12_0= ruleCondition ) ) otherlv_13= ';' )? ( (lv_basicFlow_14_0= ruleBasicFlow ) ) ( (lv_alternativeFlow_15_0= ruleAlternativeFlow ) )* (otherlv_16= 'postCondition' ( (lv_postCondition_17_0= ruleCondition ) ) otherlv_18= ';' )? otherlv_19= '}' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:277:1: (otherlv_0= 'usecase' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= ruleDescription ) ) otherlv_5= ';' otherlv_6= 'actors' ( ( ruleName ) ) (otherlv_8= ',' ( ( ruleName ) ) )* otherlv_10= ';' (otherlv_11= 'preCondition' ( (lv_preCondition_12_0= ruleCondition ) ) otherlv_13= ';' )? ( (lv_basicFlow_14_0= ruleBasicFlow ) ) ( (lv_alternativeFlow_15_0= ruleAlternativeFlow ) )* (otherlv_16= 'postCondition' ( (lv_postCondition_17_0= ruleCondition ) ) otherlv_18= ';' )? otherlv_19= '}' )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:277:3: otherlv_0= 'usecase' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= ruleDescription ) ) otherlv_5= ';' otherlv_6= 'actors' ( ( ruleName ) ) (otherlv_8= ',' ( ( ruleName ) ) )* otherlv_10= ';' (otherlv_11= 'preCondition' ( (lv_preCondition_12_0= ruleCondition ) ) otherlv_13= ';' )? ( (lv_basicFlow_14_0= ruleBasicFlow ) ) ( (lv_alternativeFlow_15_0= ruleAlternativeFlow ) )* (otherlv_16= 'postCondition' ( (lv_postCondition_17_0= ruleCondition ) ) otherlv_18= ';' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleUseCase537); 

                	newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUsecaseKeyword_0());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:281:1: ( (lv_name_1_0= ruleName ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:282:1: (lv_name_1_0= ruleName )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:282:1: (lv_name_1_0= ruleName )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:283:3: lv_name_1_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getUseCaseAccess().getNameNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleUseCase558);
            lv_name_1_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleUseCase570); 

                	newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleUseCase582); 

                	newLeafNode(otherlv_3, grammarAccess.getUseCaseAccess().getDescriptionKeyword_3());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:307:1: ( (lv_description_4_0= ruleDescription ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:308:1: (lv_description_4_0= ruleDescription )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:308:1: (lv_description_4_0= ruleDescription )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:309:3: lv_description_4_0= ruleDescription
            {
             
            	        newCompositeNode(grammarAccess.getUseCaseAccess().getDescriptionDescriptionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDescription_in_ruleUseCase603);
            lv_description_4_0=ruleDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"Description");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleUseCase615); 

                	newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getSemicolonKeyword_5());
                
            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleUseCase627); 

                	newLeafNode(otherlv_6, grammarAccess.getUseCaseAccess().getActorsKeyword_6());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:333:1: ( ( ruleName ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:334:1: ( ruleName )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:334:1: ( ruleName )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:335:3: ruleName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getUseCaseAccess().getActorActorCrossReference_7_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleUseCase650);
            ruleName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:348:2: (otherlv_8= ',' ( ( ruleName ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:348:4: otherlv_8= ',' ( ( ruleName ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleUseCase663); 

            	        	newLeafNode(otherlv_8, grammarAccess.getUseCaseAccess().getCommaKeyword_8_0());
            	        
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:352:1: ( ( ruleName ) )
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:353:1: ( ruleName )
            	    {
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:353:1: ( ruleName )
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:354:3: ruleName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUseCaseRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getActorActorCrossReference_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleName_in_ruleUseCase686);
            	    ruleName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleUseCase700); 

                	newLeafNode(otherlv_10, grammarAccess.getUseCaseAccess().getSemicolonKeyword_9());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:371:1: (otherlv_11= 'preCondition' ( (lv_preCondition_12_0= ruleCondition ) ) otherlv_13= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:371:3: otherlv_11= 'preCondition' ( (lv_preCondition_12_0= ruleCondition ) ) otherlv_13= ';'
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleUseCase713); 

                        	newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getPreConditionKeyword_10_0());
                        
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:375:1: ( (lv_preCondition_12_0= ruleCondition ) )
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:376:1: (lv_preCondition_12_0= ruleCondition )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:376:1: (lv_preCondition_12_0= ruleCondition )
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:377:3: lv_preCondition_12_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getUseCaseAccess().getPreConditionConditionParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCondition_in_ruleUseCase734);
                    lv_preCondition_12_0=ruleCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"preCondition",
                            		lv_preCondition_12_0, 
                            		"Condition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,12,FOLLOW_12_in_ruleUseCase746); 

                        	newLeafNode(otherlv_13, grammarAccess.getUseCaseAccess().getSemicolonKeyword_10_2());
                        

                    }
                    break;

            }

            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:397:3: ( (lv_basicFlow_14_0= ruleBasicFlow ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:398:1: (lv_basicFlow_14_0= ruleBasicFlow )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:398:1: (lv_basicFlow_14_0= ruleBasicFlow )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:399:3: lv_basicFlow_14_0= ruleBasicFlow
            {
             
            	        newCompositeNode(grammarAccess.getUseCaseAccess().getBasicFlowBasicFlowParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleBasicFlow_in_ruleUseCase769);
            lv_basicFlow_14_0=ruleBasicFlow();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	        }
                   		set(
                   			current, 
                   			"basicFlow",
                    		lv_basicFlow_14_0, 
                    		"BasicFlow");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:415:2: ( (lv_alternativeFlow_15_0= ruleAlternativeFlow ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==34) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:416:1: (lv_alternativeFlow_15_0= ruleAlternativeFlow )
            	    {
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:416:1: (lv_alternativeFlow_15_0= ruleAlternativeFlow )
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:417:3: lv_alternativeFlow_15_0= ruleAlternativeFlow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getAlternativeFlowAlternativeFlowParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAlternativeFlow_in_ruleUseCase790);
            	    lv_alternativeFlow_15_0=ruleAlternativeFlow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"alternativeFlow",
            	            		lv_alternativeFlow_15_0, 
            	            		"AlternativeFlow");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:433:3: (otherlv_16= 'postCondition' ( (lv_postCondition_17_0= ruleCondition ) ) otherlv_18= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:433:5: otherlv_16= 'postCondition' ( (lv_postCondition_17_0= ruleCondition ) ) otherlv_18= ';'
                    {
                    otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleUseCase804); 

                        	newLeafNode(otherlv_16, grammarAccess.getUseCaseAccess().getPostConditionKeyword_13_0());
                        
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:437:1: ( (lv_postCondition_17_0= ruleCondition ) )
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:438:1: (lv_postCondition_17_0= ruleCondition )
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:438:1: (lv_postCondition_17_0= ruleCondition )
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:439:3: lv_postCondition_17_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getUseCaseAccess().getPostConditionConditionParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCondition_in_ruleUseCase825);
                    lv_postCondition_17_0=ruleCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"postCondition",
                            		lv_postCondition_17_0, 
                            		"Condition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,12,FOLLOW_12_in_ruleUseCase837); 

                        	newLeafNode(otherlv_18, grammarAccess.getUseCaseAccess().getSemicolonKeyword_13_2());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleUseCase851); 

                	newLeafNode(otherlv_19, grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleCondition"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:471:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:472:2: (iv_ruleCondition= ruleCondition EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:473:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition887);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition897); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:480:1: ruleCondition returns [EObject current=null] : ( (lv_expression_0_0= ruleDescription ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:483:28: ( ( (lv_expression_0_0= ruleDescription ) ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:484:1: ( (lv_expression_0_0= ruleDescription ) )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:484:1: ( (lv_expression_0_0= ruleDescription ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:485:1: (lv_expression_0_0= ruleDescription )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:485:1: (lv_expression_0_0= ruleDescription )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:486:3: lv_expression_0_0= ruleDescription
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getExpressionDescriptionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleDescription_in_ruleCondition942);
            lv_expression_0_0=ruleDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"Description");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleBasicFlow"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:510:1: entryRuleBasicFlow returns [EObject current=null] : iv_ruleBasicFlow= ruleBasicFlow EOF ;
    public final EObject entryRuleBasicFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicFlow = null;


        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:511:2: (iv_ruleBasicFlow= ruleBasicFlow EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:512:2: iv_ruleBasicFlow= ruleBasicFlow EOF
            {
             newCompositeNode(grammarAccess.getBasicFlowRule()); 
            pushFollow(FOLLOW_ruleBasicFlow_in_entryRuleBasicFlow977);
            iv_ruleBasicFlow=ruleBasicFlow();

            state._fsp--;

             current =iv_ruleBasicFlow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicFlow987); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicFlow"


    // $ANTLR start "ruleBasicFlow"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:519:1: ruleBasicFlow returns [EObject current=null] : ( ( (lv_name_0_0= 'basic' ) ) ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= 'endbasic' ) ;
    public final EObject ruleBasicFlow() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_steps_1_0 = null;


         enterRule(); 
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:522:28: ( ( ( (lv_name_0_0= 'basic' ) ) ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= 'endbasic' ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:523:1: ( ( (lv_name_0_0= 'basic' ) ) ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= 'endbasic' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:523:1: ( ( (lv_name_0_0= 'basic' ) ) ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= 'endbasic' )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:523:2: ( (lv_name_0_0= 'basic' ) ) ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= 'endbasic'
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:523:2: ( (lv_name_0_0= 'basic' ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:524:1: (lv_name_0_0= 'basic' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:524:1: (lv_name_0_0= 'basic' )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:525:3: lv_name_0_0= 'basic'
            {
            lv_name_0_0=(Token)match(input,22,FOLLOW_22_in_ruleBasicFlow1030); 

                    newLeafNode(lv_name_0_0, grammarAccess.getBasicFlowAccess().getNameBasicKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBasicFlowRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "basic");
            	    

            }


            }

            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:538:2: ( (lv_steps_1_0= ruleStep ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_SINGLE_CHAR)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:539:1: (lv_steps_1_0= ruleStep )
            	    {
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:539:1: (lv_steps_1_0= ruleStep )
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:540:3: lv_steps_1_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBasicFlowAccess().getStepsStepParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleBasicFlow1064);
            	    lv_steps_1_0=ruleStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBasicFlowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"steps",
            	            		lv_steps_1_0, 
            	            		"Step");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleBasicFlow1077); 

                	newLeafNode(otherlv_2, grammarAccess.getBasicFlowAccess().getEndbasicKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicFlow"


    // $ANTLR start "entryRuleStep"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:568:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:569:2: (iv_ruleStep= ruleStep EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:570:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep1113);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep1123); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:577:1: ruleStep returns [EObject current=null] : (this_Action_0= ruleAction | this_ConditionalStatement_1= ruleConditionalStatement | this_LoopStatement_2= ruleLoopStatement | this_Include_3= ruleInclude ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_Action_0 = null;

        EObject this_ConditionalStatement_1 = null;

        EObject this_LoopStatement_2 = null;

        EObject this_Include_3 = null;


         enterRule(); 
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:580:28: ( (this_Action_0= ruleAction | this_ConditionalStatement_1= ruleConditionalStatement | this_LoopStatement_2= ruleLoopStatement | this_Include_3= ruleInclude ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:581:1: (this_Action_0= ruleAction | this_ConditionalStatement_1= ruleConditionalStatement | this_LoopStatement_2= ruleLoopStatement | this_Include_3= ruleInclude )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:581:1: (this_Action_0= ruleAction | this_ConditionalStatement_1= ruleConditionalStatement | this_LoopStatement_2= ruleLoopStatement | this_Include_3= ruleInclude )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:582:5: this_Action_0= ruleAction
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getActionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAction_in_ruleStep1170);
                    this_Action_0=ruleAction();

                    state._fsp--;

                     
                            current = this_Action_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:592:5: this_ConditionalStatement_1= ruleConditionalStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getConditionalStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConditionalStatement_in_ruleStep1197);
                    this_ConditionalStatement_1=ruleConditionalStatement();

                    state._fsp--;

                     
                            current = this_ConditionalStatement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:602:5: this_LoopStatement_2= ruleLoopStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getLoopStatementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLoopStatement_in_ruleStep1224);
                    this_LoopStatement_2=ruleLoopStatement();

                    state._fsp--;

                     
                            current = this_LoopStatement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:612:5: this_Include_3= ruleInclude
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getIncludeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInclude_in_ruleStep1251);
                    this_Include_3=ruleInclude();

                    state._fsp--;

                     
                            current = this_Include_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleAction"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:628:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:629:2: (iv_ruleAction= ruleAction EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:630:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1286);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1296); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:637:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'action' otherlv_3= '[' ( ( ruleName ) ) otherlv_5= ']' ( (lv_description_6_0= ruleDescription ) ) otherlv_7= ';' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;


         enterRule(); 
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:640:28: ( ( ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'action' otherlv_3= '[' ( ( ruleName ) ) otherlv_5= ']' ( (lv_description_6_0= ruleDescription ) ) otherlv_7= ';' ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:641:1: ( ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'action' otherlv_3= '[' ( ( ruleName ) ) otherlv_5= ']' ( (lv_description_6_0= ruleDescription ) ) otherlv_7= ';' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:641:1: ( ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'action' otherlv_3= '[' ( ( ruleName ) ) otherlv_5= ']' ( (lv_description_6_0= ruleDescription ) ) otherlv_7= ';' )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:641:2: ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'action' otherlv_3= '[' ( ( ruleName ) ) otherlv_5= ']' ( (lv_description_6_0= ruleDescription ) ) otherlv_7= ';'
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:641:2: ( (lv_name_0_0= ruleStepOrder ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:642:1: (lv_name_0_0= ruleStepOrder )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:642:1: (lv_name_0_0= ruleStepOrder )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:643:3: lv_name_0_0= ruleStepOrder
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getNameStepOrderParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStepOrder_in_ruleAction1342);
            lv_name_0_0=ruleStepOrder();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"StepOrder");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleAction1354); 

                	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getRightParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleAction1366); 

                	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getActionKeyword_2());
                
            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleAction1378); 

                	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getLeftSquareBracketKeyword_3());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:671:1: ( ( ruleName ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:672:1: ( ruleName )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:672:1: ( ruleName )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:673:3: ruleName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getActionAccess().getAgentAgentCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleAction1401);
            ruleName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleAction1413); 

                	newLeafNode(otherlv_5, grammarAccess.getActionAccess().getRightSquareBracketKeyword_5());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:690:1: ( (lv_description_6_0= ruleDescription ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:691:1: (lv_description_6_0= ruleDescription )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:691:1: (lv_description_6_0= ruleDescription )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:692:3: lv_description_6_0= ruleDescription
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getDescriptionDescriptionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleDescription_in_ruleAction1434);
            lv_description_6_0=ruleDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_6_0, 
                    		"Description");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleAction1446); 

                	newLeafNode(otherlv_7, grammarAccess.getActionAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleConditionalStatement"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:720:1: entryRuleConditionalStatement returns [EObject current=null] : iv_ruleConditionalStatement= ruleConditionalStatement EOF ;
    public final EObject entryRuleConditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalStatement = null;


        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:721:2: (iv_ruleConditionalStatement= ruleConditionalStatement EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:722:2: iv_ruleConditionalStatement= ruleConditionalStatement EOF
            {
             newCompositeNode(grammarAccess.getConditionalStatementRule()); 
            pushFollow(FOLLOW_ruleConditionalStatement_in_entryRuleConditionalStatement1482);
            iv_ruleConditionalStatement=ruleConditionalStatement();

            state._fsp--;

             current =iv_ruleConditionalStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalStatement1492); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalStatement"


    // $ANTLR start "ruleConditionalStatement"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:729:1: ruleConditionalStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'then' ( (lv_steps_5_0= ruleStep ) )+ otherlv_6= 'endif' ) ;
    public final EObject ruleConditionalStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_condition_3_0 = null;

        EObject lv_steps_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:732:28: ( ( ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'then' ( (lv_steps_5_0= ruleStep ) )+ otherlv_6= 'endif' ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:733:1: ( ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'then' ( (lv_steps_5_0= ruleStep ) )+ otherlv_6= 'endif' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:733:1: ( ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'then' ( (lv_steps_5_0= ruleStep ) )+ otherlv_6= 'endif' )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:733:2: ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'then' ( (lv_steps_5_0= ruleStep ) )+ otherlv_6= 'endif'
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:733:2: ( (lv_name_0_0= ruleStepOrder ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:734:1: (lv_name_0_0= ruleStepOrder )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:734:1: (lv_name_0_0= ruleStepOrder )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:735:3: lv_name_0_0= ruleStepOrder
            {
             
            	        newCompositeNode(grammarAccess.getConditionalStatementAccess().getNameStepOrderParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStepOrder_in_ruleConditionalStatement1538);
            lv_name_0_0=ruleStepOrder();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"StepOrder");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleConditionalStatement1550); 

                	newLeafNode(otherlv_1, grammarAccess.getConditionalStatementAccess().getRightParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleConditionalStatement1562); 

                	newLeafNode(otherlv_2, grammarAccess.getConditionalStatementAccess().getIfKeyword_2());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:759:1: ( (lv_condition_3_0= ruleCondition ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:760:1: (lv_condition_3_0= ruleCondition )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:760:1: (lv_condition_3_0= ruleCondition )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:761:3: lv_condition_3_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleConditionalStatement1583);
            lv_condition_3_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_3_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleConditionalStatement1595); 

                	newLeafNode(otherlv_4, grammarAccess.getConditionalStatementAccess().getThenKeyword_4());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:781:1: ( (lv_steps_5_0= ruleStep ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_SINGLE_CHAR)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:782:1: (lv_steps_5_0= ruleStep )
            	    {
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:782:1: (lv_steps_5_0= ruleStep )
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:783:3: lv_steps_5_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConditionalStatementAccess().getStepsStepParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleConditionalStatement1616);
            	    lv_steps_5_0=ruleStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"steps",
            	            		lv_steps_5_0, 
            	            		"Step");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleConditionalStatement1629); 

                	newLeafNode(otherlv_6, grammarAccess.getConditionalStatementAccess().getEndifKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalStatement"


    // $ANTLR start "entryRuleLoopStatement"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:811:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:812:2: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:813:2: iv_ruleLoopStatement= ruleLoopStatement EOF
            {
             newCompositeNode(grammarAccess.getLoopStatementRule()); 
            pushFollow(FOLLOW_ruleLoopStatement_in_entryRuleLoopStatement1665);
            iv_ruleLoopStatement=ruleLoopStatement();

            state._fsp--;

             current =iv_ruleLoopStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopStatement1675); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoopStatement"


    // $ANTLR start "ruleLoopStatement"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:820:1: ruleLoopStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'while' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'do' ( (lv_steps_5_0= ruleStep ) )+ otherlv_6= 'endwhile' ) ;
    public final EObject ruleLoopStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_condition_3_0 = null;

        EObject lv_steps_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:823:28: ( ( ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'while' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'do' ( (lv_steps_5_0= ruleStep ) )+ otherlv_6= 'endwhile' ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:824:1: ( ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'while' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'do' ( (lv_steps_5_0= ruleStep ) )+ otherlv_6= 'endwhile' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:824:1: ( ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'while' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'do' ( (lv_steps_5_0= ruleStep ) )+ otherlv_6= 'endwhile' )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:824:2: ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'while' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'do' ( (lv_steps_5_0= ruleStep ) )+ otherlv_6= 'endwhile'
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:824:2: ( (lv_name_0_0= ruleStepOrder ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:825:1: (lv_name_0_0= ruleStepOrder )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:825:1: (lv_name_0_0= ruleStepOrder )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:826:3: lv_name_0_0= ruleStepOrder
            {
             
            	        newCompositeNode(grammarAccess.getLoopStatementAccess().getNameStepOrderParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStepOrder_in_ruleLoopStatement1721);
            lv_name_0_0=ruleStepOrder();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoopStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"StepOrder");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleLoopStatement1733); 

                	newLeafNode(otherlv_1, grammarAccess.getLoopStatementAccess().getRightParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleLoopStatement1745); 

                	newLeafNode(otherlv_2, grammarAccess.getLoopStatementAccess().getWhileKeyword_2());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:850:1: ( (lv_condition_3_0= ruleCondition ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:851:1: (lv_condition_3_0= ruleCondition )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:851:1: (lv_condition_3_0= ruleCondition )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:852:3: lv_condition_3_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getLoopStatementAccess().getConditionConditionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleLoopStatement1766);
            lv_condition_3_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoopStatementRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_3_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleLoopStatement1778); 

                	newLeafNode(otherlv_4, grammarAccess.getLoopStatementAccess().getDoKeyword_4());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:872:1: ( (lv_steps_5_0= ruleStep ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_SINGLE_CHAR)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:873:1: (lv_steps_5_0= ruleStep )
            	    {
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:873:1: (lv_steps_5_0= ruleStep )
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:874:3: lv_steps_5_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLoopStatementAccess().getStepsStepParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleLoopStatement1799);
            	    lv_steps_5_0=ruleStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLoopStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"steps",
            	            		lv_steps_5_0, 
            	            		"Step");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleLoopStatement1812); 

                	newLeafNode(otherlv_6, grammarAccess.getLoopStatementAccess().getEndwhileKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoopStatement"


    // $ANTLR start "entryRuleAlternativeFlow"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:902:1: entryRuleAlternativeFlow returns [EObject current=null] : iv_ruleAlternativeFlow= ruleAlternativeFlow EOF ;
    public final EObject entryRuleAlternativeFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternativeFlow = null;


        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:903:2: (iv_ruleAlternativeFlow= ruleAlternativeFlow EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:904:2: iv_ruleAlternativeFlow= ruleAlternativeFlow EOF
            {
             newCompositeNode(grammarAccess.getAlternativeFlowRule()); 
            pushFollow(FOLLOW_ruleAlternativeFlow_in_entryRuleAlternativeFlow1848);
            iv_ruleAlternativeFlow=ruleAlternativeFlow();

            state._fsp--;

             current =iv_ruleAlternativeFlow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeFlow1858); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternativeFlow"


    // $ANTLR start "ruleAlternativeFlow"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:911:1: ruleAlternativeFlow returns [EObject current=null] : (otherlv_0= 'alternative' ( (lv_name_1_0= ruleAlternativeFlowName ) ) otherlv_2= 'to step' ( ( ruleQualifiedName ) ) otherlv_4= 'when' ( (lv_condition_5_0= ruleCondition ) ) otherlv_6= 'then' ( (lv_steps_7_0= ruleStep ) )+ otherlv_8= 'endflow' ) ;
    public final EObject ruleAlternativeFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_condition_5_0 = null;

        EObject lv_steps_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:914:28: ( (otherlv_0= 'alternative' ( (lv_name_1_0= ruleAlternativeFlowName ) ) otherlv_2= 'to step' ( ( ruleQualifiedName ) ) otherlv_4= 'when' ( (lv_condition_5_0= ruleCondition ) ) otherlv_6= 'then' ( (lv_steps_7_0= ruleStep ) )+ otherlv_8= 'endflow' ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:915:1: (otherlv_0= 'alternative' ( (lv_name_1_0= ruleAlternativeFlowName ) ) otherlv_2= 'to step' ( ( ruleQualifiedName ) ) otherlv_4= 'when' ( (lv_condition_5_0= ruleCondition ) ) otherlv_6= 'then' ( (lv_steps_7_0= ruleStep ) )+ otherlv_8= 'endflow' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:915:1: (otherlv_0= 'alternative' ( (lv_name_1_0= ruleAlternativeFlowName ) ) otherlv_2= 'to step' ( ( ruleQualifiedName ) ) otherlv_4= 'when' ( (lv_condition_5_0= ruleCondition ) ) otherlv_6= 'then' ( (lv_steps_7_0= ruleStep ) )+ otherlv_8= 'endflow' )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:915:3: otherlv_0= 'alternative' ( (lv_name_1_0= ruleAlternativeFlowName ) ) otherlv_2= 'to step' ( ( ruleQualifiedName ) ) otherlv_4= 'when' ( (lv_condition_5_0= ruleCondition ) ) otherlv_6= 'then' ( (lv_steps_7_0= ruleStep ) )+ otherlv_8= 'endflow'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleAlternativeFlow1895); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativeFlowAccess().getAlternativeKeyword_0());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:919:1: ( (lv_name_1_0= ruleAlternativeFlowName ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:920:1: (lv_name_1_0= ruleAlternativeFlowName )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:920:1: (lv_name_1_0= ruleAlternativeFlowName )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:921:3: lv_name_1_0= ruleAlternativeFlowName
            {
             
            	        newCompositeNode(grammarAccess.getAlternativeFlowAccess().getNameAlternativeFlowNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAlternativeFlowName_in_ruleAlternativeFlow1916);
            lv_name_1_0=ruleAlternativeFlowName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAlternativeFlowRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"AlternativeFlowName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleAlternativeFlow1928); 

                	newLeafNode(otherlv_2, grammarAccess.getAlternativeFlowAccess().getToStepKeyword_2());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:941:1: ( ( ruleQualifiedName ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:942:1: ( ruleQualifiedName )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:942:1: ( ruleQualifiedName )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:943:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAlternativeFlowRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAlternativeFlowAccess().getBranchingStepStepCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAlternativeFlow1951);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleAlternativeFlow1963); 

                	newLeafNode(otherlv_4, grammarAccess.getAlternativeFlowAccess().getWhenKeyword_4());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:960:1: ( (lv_condition_5_0= ruleCondition ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:961:1: (lv_condition_5_0= ruleCondition )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:961:1: (lv_condition_5_0= ruleCondition )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:962:3: lv_condition_5_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getAlternativeFlowAccess().getConditionConditionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleAlternativeFlow1984);
            lv_condition_5_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAlternativeFlowRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_5_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleAlternativeFlow1996); 

                	newLeafNode(otherlv_6, grammarAccess.getAlternativeFlowAccess().getThenKeyword_6());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:982:1: ( (lv_steps_7_0= ruleStep ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_SINGLE_CHAR)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:983:1: (lv_steps_7_0= ruleStep )
            	    {
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:983:1: (lv_steps_7_0= ruleStep )
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:984:3: lv_steps_7_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlternativeFlowAccess().getStepsStepParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleAlternativeFlow2017);
            	    lv_steps_7_0=ruleStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlternativeFlowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"steps",
            	            		lv_steps_7_0, 
            	            		"Step");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleAlternativeFlow2030); 

                	newLeafNode(otherlv_8, grammarAccess.getAlternativeFlowAccess().getEndflowKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternativeFlow"


    // $ANTLR start "entryRuleInclude"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1012:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1013:2: (iv_ruleInclude= ruleInclude EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1014:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude2066);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude2076); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1021:1: ruleInclude returns [EObject current=null] : ( ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'include' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1024:28: ( ( ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'include' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1025:1: ( ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'include' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1025:1: ( ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'include' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1025:2: ( (lv_name_0_0= ruleStepOrder ) ) otherlv_1= ')' otherlv_2= 'include' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1025:2: ( (lv_name_0_0= ruleStepOrder ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1026:1: (lv_name_0_0= ruleStepOrder )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1026:1: (lv_name_0_0= ruleStepOrder )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1027:3: lv_name_0_0= ruleStepOrder
            {
             
            	        newCompositeNode(grammarAccess.getIncludeAccess().getNameStepOrderParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStepOrder_in_ruleInclude2122);
            lv_name_0_0=ruleStepOrder();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIncludeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"StepOrder");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleInclude2134); 

                	newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getRightParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleInclude2146); 

                	newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getIncludeKeyword_2());
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1051:1: ( (otherlv_3= RULE_ID ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1052:1: (otherlv_3= RULE_ID )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1052:1: (otherlv_3= RULE_ID )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1053:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludeRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInclude2166); 

            		newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getUseCaseUseCaseCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleInclude2178); 

                	newLeafNode(otherlv_4, grammarAccess.getIncludeAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleStepOrder"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1076:1: entryRuleStepOrder returns [String current=null] : iv_ruleStepOrder= ruleStepOrder EOF ;
    public final String entryRuleStepOrder() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStepOrder = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1080:2: (iv_ruleStepOrder= ruleStepOrder EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1081:2: iv_ruleStepOrder= ruleStepOrder EOF
            {
             newCompositeNode(grammarAccess.getStepOrderRule()); 
            pushFollow(FOLLOW_ruleStepOrder_in_entryRuleStepOrder2221);
            iv_ruleStepOrder=ruleStepOrder();

            state._fsp--;

             current =iv_ruleStepOrder.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepOrder2232); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleStepOrder"


    // $ANTLR start "ruleStepOrder"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1091:1: ruleStepOrder returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )+ | (this_SINGLE_CHAR_1= RULE_SINGLE_CHAR )+ ) ;
    public final AntlrDatatypeRuleToken ruleStepOrder() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_SINGLE_CHAR_1=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1095:28: ( ( (this_INT_0= RULE_INT )+ | (this_SINGLE_CHAR_1= RULE_SINGLE_CHAR )+ ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1096:1: ( (this_INT_0= RULE_INT )+ | (this_SINGLE_CHAR_1= RULE_SINGLE_CHAR )+ )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1096:1: ( (this_INT_0= RULE_INT )+ | (this_SINGLE_CHAR_1= RULE_SINGLE_CHAR )+ )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_SINGLE_CHAR) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1096:2: (this_INT_0= RULE_INT )+
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1096:2: (this_INT_0= RULE_INT )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_INT) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1096:7: this_INT_0= RULE_INT
                    	    {
                    	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStepOrder2277); 

                    	    		current.merge(this_INT_0);
                    	        
                    	     
                    	        newLeafNode(this_INT_0, grammarAccess.getStepOrderAccess().getINTTerminalRuleCall_0()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1104:6: (this_SINGLE_CHAR_1= RULE_SINGLE_CHAR )+
                    {
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1104:6: (this_SINGLE_CHAR_1= RULE_SINGLE_CHAR )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_SINGLE_CHAR) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1104:11: this_SINGLE_CHAR_1= RULE_SINGLE_CHAR
                    	    {
                    	    this_SINGLE_CHAR_1=(Token)match(input,RULE_SINGLE_CHAR,FOLLOW_RULE_SINGLE_CHAR_in_ruleStepOrder2306); 

                    	    		current.merge(this_SINGLE_CHAR_1);
                    	        
                    	     
                    	        newLeafNode(this_SINGLE_CHAR_1, grammarAccess.getStepOrderAccess().getSINGLE_CHARTerminalRuleCall_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleStepOrder"


    // $ANTLR start "entryRuleName"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1122:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1123:2: (iv_ruleName= ruleName EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1124:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName2358);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName2369); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1131:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )+ ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1134:28: ( (this_ID_0= RULE_ID )+ )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1135:1: (this_ID_0= RULE_ID )+
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1135:1: (this_ID_0= RULE_ID )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1135:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName2409); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleAlternativeFlowName"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1150:1: entryRuleAlternativeFlowName returns [String current=null] : iv_ruleAlternativeFlowName= ruleAlternativeFlowName EOF ;
    public final String entryRuleAlternativeFlowName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlternativeFlowName = null;


        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1151:2: (iv_ruleAlternativeFlowName= ruleAlternativeFlowName EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1152:2: iv_ruleAlternativeFlowName= ruleAlternativeFlowName EOF
            {
             newCompositeNode(grammarAccess.getAlternativeFlowNameRule()); 
            pushFollow(FOLLOW_ruleAlternativeFlowName_in_entryRuleAlternativeFlowName2456);
            iv_ruleAlternativeFlowName=ruleAlternativeFlowName();

            state._fsp--;

             current =iv_ruleAlternativeFlowName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeFlowName2467); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternativeFlowName"


    // $ANTLR start "ruleAlternativeFlowName"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1159:1: ruleAlternativeFlowName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )+ ;
    public final AntlrDatatypeRuleToken ruleAlternativeFlowName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1162:28: ( (this_ID_0= RULE_ID )+ )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1163:1: (this_ID_0= RULE_ID )+
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1163:1: (this_ID_0= RULE_ID )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1163:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternativeFlowName2507); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getAlternativeFlowNameAccess().getIDTerminalRuleCall()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternativeFlowName"


    // $ANTLR start "entryRuleQualifiedName"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1178:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1179:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1180:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2554);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2565); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1187:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_AlternativeFlowName_0= ruleAlternativeFlowName kw= '.' )? this_StepOrder_2= ruleStepOrder (kw= '.' this_StepOrder_4= ruleStepOrder )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AlternativeFlowName_0 = null;

        AntlrDatatypeRuleToken this_StepOrder_2 = null;

        AntlrDatatypeRuleToken this_StepOrder_4 = null;


         enterRule(); 
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1190:28: ( ( (this_AlternativeFlowName_0= ruleAlternativeFlowName kw= '.' )? this_StepOrder_2= ruleStepOrder (kw= '.' this_StepOrder_4= ruleStepOrder )* ) )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1191:1: ( (this_AlternativeFlowName_0= ruleAlternativeFlowName kw= '.' )? this_StepOrder_2= ruleStepOrder (kw= '.' this_StepOrder_4= ruleStepOrder )* )
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1191:1: ( (this_AlternativeFlowName_0= ruleAlternativeFlowName kw= '.' )? this_StepOrder_2= ruleStepOrder (kw= '.' this_StepOrder_4= ruleStepOrder )* )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1191:2: (this_AlternativeFlowName_0= ruleAlternativeFlowName kw= '.' )? this_StepOrder_2= ruleStepOrder (kw= '.' this_StepOrder_4= ruleStepOrder )*
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1191:2: (this_AlternativeFlowName_0= ruleAlternativeFlowName kw= '.' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1192:5: this_AlternativeFlowName_0= ruleAlternativeFlowName kw= '.'
                    {
                     
                            newCompositeNode(grammarAccess.getQualifiedNameAccess().getAlternativeFlowNameParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleAlternativeFlowName_in_ruleQualifiedName2613);
                    this_AlternativeFlowName_0=ruleAlternativeFlowName();

                    state._fsp--;


                    		current.merge(this_AlternativeFlowName_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleQualifiedName2631); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getQualifiedNameAccess().getStepOrderParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleStepOrder_in_ruleQualifiedName2655);
            this_StepOrder_2=ruleStepOrder();

            state._fsp--;


            		current.merge(this_StepOrder_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1219:1: (kw= '.' this_StepOrder_4= ruleStepOrder )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1220:2: kw= '.' this_StepOrder_4= ruleStepOrder
            	    {
            	    kw=(Token)match(input,39,FOLLOW_39_in_ruleQualifiedName2674); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getQualifiedNameAccess().getStepOrderParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleStepOrder_in_ruleQualifiedName2696);
            	    this_StepOrder_4=ruleStepOrder();

            	    state._fsp--;


            	    		current.merge(this_StepOrder_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleDescription"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1244:1: entryRuleDescription returns [String current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final String entryRuleDescription() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDescription = null;


        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1245:2: (iv_ruleDescription= ruleDescription EOF )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1246:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription2744);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription2755); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1253:1: ruleDescription returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_WS_2= RULE_WS | kw= '.' | kw= ',' | kw= '?' | kw= '\\'' | kw= '\"' | kw= '-' | kw= '+' | kw= '=' | kw= '*' | kw= '<' | kw= '>' | kw= '(' | kw= ')' | kw= '{' | kw= '}' | kw= '@' | kw= '%' | kw= '_' )+ ;
    public final AntlrDatatypeRuleToken ruleDescription() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token this_WS_2=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1256:28: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_WS_2= RULE_WS | kw= '.' | kw= ',' | kw= '?' | kw= '\\'' | kw= '\"' | kw= '-' | kw= '+' | kw= '=' | kw= '*' | kw= '<' | kw= '>' | kw= '(' | kw= ')' | kw= '{' | kw= '}' | kw= '@' | kw= '%' | kw= '_' )+ )
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1257:1: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_WS_2= RULE_WS | kw= '.' | kw= ',' | kw= '?' | kw= '\\'' | kw= '\"' | kw= '-' | kw= '+' | kw= '=' | kw= '*' | kw= '<' | kw= '>' | kw= '(' | kw= ')' | kw= '{' | kw= '}' | kw= '@' | kw= '%' | kw= '_' )+
            {
            // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1257:1: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_WS_2= RULE_WS | kw= '.' | kw= ',' | kw= '?' | kw= '\\'' | kw= '\"' | kw= '-' | kw= '+' | kw= '=' | kw= '*' | kw= '<' | kw= '>' | kw= '(' | kw= ')' | kw= '{' | kw= '}' | kw= '@' | kw= '%' | kw= '_' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=22;
                switch ( input.LA(1) ) {
                case RULE_INT:
                    {
                    alt19=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt19=2;
                    }
                    break;
                case RULE_WS:
                    {
                    alt19=3;
                    }
                    break;
                case 39:
                    {
                    alt19=4;
                    }
                    break;
                case 15:
                    {
                    alt19=5;
                    }
                    break;
                case 40:
                    {
                    alt19=6;
                    }
                    break;
                case 41:
                    {
                    alt19=7;
                    }
                    break;
                case 42:
                    {
                    alt19=8;
                    }
                    break;
                case 43:
                    {
                    alt19=9;
                    }
                    break;
                case 44:
                    {
                    alt19=10;
                    }
                    break;
                case 45:
                    {
                    alt19=11;
                    }
                    break;
                case 46:
                    {
                    alt19=12;
                    }
                    break;
                case 47:
                    {
                    alt19=13;
                    }
                    break;
                case 48:
                    {
                    alt19=14;
                    }
                    break;
                case 49:
                    {
                    alt19=15;
                    }
                    break;
                case 24:
                    {
                    alt19=16;
                    }
                    break;
                case 14:
                    {
                    alt19=17;
                    }
                    break;
                case 16:
                    {
                    alt19=18;
                    }
                    break;
                case 50:
                    {
                    alt19=19;
                    }
                    break;
                case 51:
                    {
                    alt19=20;
                    }
                    break;
                case 52:
                    {
                    alt19=21;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1257:6: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDescription2795); 

            	    		current.merge(this_INT_0);
            	        
            	     
            	        newLeafNode(this_INT_0, grammarAccess.getDescriptionAccess().getINTTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1265:10: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDescription2821); 

            	    		current.merge(this_ID_1);
            	        
            	     
            	        newLeafNode(this_ID_1, grammarAccess.getDescriptionAccess().getIDTerminalRuleCall_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1273:10: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleDescription2847); 

            	    		current.merge(this_WS_2);
            	        
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getDescriptionAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1282:2: kw= '.'
            	    {
            	    kw=(Token)match(input,39,FOLLOW_39_in_ruleDescription2871); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getFullStopKeyword_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1289:2: kw= ','
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleDescription2890); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getCommaKeyword_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1296:2: kw= '?'
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40_in_ruleDescription2909); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getQuestionMarkKeyword_5()); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1303:2: kw= '\\''
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleDescription2928); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getApostropheKeyword_6()); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1310:2: kw= '\"'
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleDescription2947); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getQuotationMarkKeyword_7()); 
            	        

            	    }
            	    break;
            	case 9 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1317:2: kw= '-'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_43_in_ruleDescription2966); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getHyphenMinusKeyword_8()); 
            	        

            	    }
            	    break;
            	case 10 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1324:2: kw= '+'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_44_in_ruleDescription2985); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getPlusSignKeyword_9()); 
            	        

            	    }
            	    break;
            	case 11 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1331:2: kw= '='
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleDescription3004); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getEqualsSignKeyword_10()); 
            	        

            	    }
            	    break;
            	case 12 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1338:2: kw= '*'
            	    {
            	    kw=(Token)match(input,46,FOLLOW_46_in_ruleDescription3023); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getAsteriskKeyword_11()); 
            	        

            	    }
            	    break;
            	case 13 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1345:2: kw= '<'
            	    {
            	    kw=(Token)match(input,47,FOLLOW_47_in_ruleDescription3042); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getLessThanSignKeyword_12()); 
            	        

            	    }
            	    break;
            	case 14 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1352:2: kw= '>'
            	    {
            	    kw=(Token)match(input,48,FOLLOW_48_in_ruleDescription3061); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getGreaterThanSignKeyword_13()); 
            	        

            	    }
            	    break;
            	case 15 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1359:2: kw= '('
            	    {
            	    kw=(Token)match(input,49,FOLLOW_49_in_ruleDescription3080); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getLeftParenthesisKeyword_14()); 
            	        

            	    }
            	    break;
            	case 16 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1366:2: kw= ')'
            	    {
            	    kw=(Token)match(input,24,FOLLOW_24_in_ruleDescription3099); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getRightParenthesisKeyword_15()); 
            	        

            	    }
            	    break;
            	case 17 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1373:2: kw= '{'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleDescription3118); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getLeftCurlyBracketKeyword_16()); 
            	        

            	    }
            	    break;
            	case 18 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1380:2: kw= '}'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleDescription3137); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_17()); 
            	        

            	    }
            	    break;
            	case 19 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1387:2: kw= '@'
            	    {
            	    kw=(Token)match(input,50,FOLLOW_50_in_ruleDescription3156); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getCommercialAtKeyword_18()); 
            	        

            	    }
            	    break;
            	case 20 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1394:2: kw= '%'
            	    {
            	    kw=(Token)match(input,51,FOLLOW_51_in_ruleDescription3175); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().getPercentSignKeyword_19()); 
            	        

            	    }
            	    break;
            	case 21 :
            	    // ../br.com.levysiqueira.dsl.textualusecase/src-gen/br/com/levysiqueira/dsl/textualusecase/parser/antlr/internal/InternalTextualUseCase.g:1401:2: kw= '_'
            	    {
            	    kw=(Token)match(input,52,FOLLOW_52_in_ruleDescription3194); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDescriptionAccess().get_Keyword_20()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\10\uffff";
    static final String DFA8_eofS =
        "\10\uffff";
    static final String DFA8_minS =
        "\2\5\1\6\1\31\4\uffff";
    static final String DFA8_maxS =
        "\1\6\2\30\1\46\4\uffff";
    static final String DFA8_acceptS =
        "\4\uffff\1\4\1\1\1\2\1\3";
    static final String DFA8_specialS =
        "\10\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\1\2",
            "\1\1\22\uffff\1\3",
            "\1\2\21\uffff\1\3",
            "\1\5\2\uffff\1\6\2\uffff\1\7\6\uffff\1\4",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "581:1: (this_Action_0= ruleAction | this_ConditionalStatement_1= ruleConditionalStatement | this_LoopStatement_2= ruleLoopStatement | this_Include_3= ruleInclude )";
        }
    }
 

    public static final BitSet FOLLOW_ruleUseCaseModel_in_entryRuleUseCaseModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseCaseModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubject_in_ruleUseCaseModel131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUseCaseModel143 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUseCaseModel155 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUseCaseModel167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActor_in_ruleUseCaseModel188 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleUseCaseModel201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActor_in_ruleUseCaseModel222 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleUseCaseModel236 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleUseCase_in_ruleUseCaseModel257 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleActor351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubject_in_entryRuleSubject386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubject396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSubject433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleName_in_ruleSubject454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseCase_in_entryRuleUseCase490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseCase500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleUseCase537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleName_in_ruleUseCase558 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUseCase570 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUseCase582 = new BitSet(new long[]{0x001FFF800101C0B0L});
    public static final BitSet FOLLOW_ruleDescription_in_ruleUseCase603 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUseCase615 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUseCase627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleName_in_ruleUseCase650 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleUseCase663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleName_in_ruleUseCase686 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleUseCase700 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_20_in_ruleUseCase713 = new BitSet(new long[]{0x001FFF800101C0B0L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleUseCase734 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUseCase746 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_ruleBasicFlow_in_ruleUseCase769 = new BitSet(new long[]{0x0000000400210000L});
    public static final BitSet FOLLOW_ruleAlternativeFlow_in_ruleUseCase790 = new BitSet(new long[]{0x0000000400210000L});
    public static final BitSet FOLLOW_21_in_ruleUseCase804 = new BitSet(new long[]{0x001FFF800101C0B0L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleUseCase825 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUseCase837 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUseCase851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_ruleCondition942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicFlow_in_entryRuleBasicFlow977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicFlow987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBasicFlow1030 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleStep_in_ruleBasicFlow1064 = new BitSet(new long[]{0x0000000000800060L});
    public static final BitSet FOLLOW_23_in_ruleBasicFlow1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep1113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleStep1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalStatement_in_ruleStep1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopStatement_in_ruleStep1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleStep1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepOrder_in_ruleAction1342 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAction1354 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAction1366 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAction1378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleName_in_ruleAction1401 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAction1413 = new BitSet(new long[]{0x001FFF800101C0B0L});
    public static final BitSet FOLLOW_ruleDescription_in_ruleAction1434 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAction1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalStatement_in_entryRuleConditionalStatement1482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalStatement1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepOrder_in_ruleConditionalStatement1538 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleConditionalStatement1550 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleConditionalStatement1562 = new BitSet(new long[]{0x001FFF800101C0B0L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleConditionalStatement1583 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleConditionalStatement1595 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleStep_in_ruleConditionalStatement1616 = new BitSet(new long[]{0x0000000040000060L});
    public static final BitSet FOLLOW_30_in_ruleConditionalStatement1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopStatement_in_entryRuleLoopStatement1665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopStatement1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepOrder_in_ruleLoopStatement1721 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLoopStatement1733 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleLoopStatement1745 = new BitSet(new long[]{0x001FFF800101C0B0L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleLoopStatement1766 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleLoopStatement1778 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleStep_in_ruleLoopStatement1799 = new BitSet(new long[]{0x0000000200000060L});
    public static final BitSet FOLLOW_33_in_ruleLoopStatement1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeFlow_in_entryRuleAlternativeFlow1848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeFlow1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAlternativeFlow1895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAlternativeFlowName_in_ruleAlternativeFlow1916 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleAlternativeFlow1928 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAlternativeFlow1951 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleAlternativeFlow1963 = new BitSet(new long[]{0x001FFF800101C0B0L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleAlternativeFlow1984 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAlternativeFlow1996 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleStep_in_ruleAlternativeFlow2017 = new BitSet(new long[]{0x0000002000000060L});
    public static final BitSet FOLLOW_37_in_ruleAlternativeFlow2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude2066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepOrder_in_ruleInclude2122 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInclude2134 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleInclude2146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInclude2166 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInclude2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepOrder_in_entryRuleStepOrder2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepOrder2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStepOrder2277 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_SINGLE_CHAR_in_ruleStepOrder2306 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName2358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName2409 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAlternativeFlowName_in_entryRuleAlternativeFlowName2456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeFlowName2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeFlowName2507 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeFlowName_in_ruleQualifiedName2613 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleQualifiedName2631 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleStepOrder_in_ruleQualifiedName2655 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleQualifiedName2674 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleStepOrder_in_ruleQualifiedName2696 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription2744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDescription2795 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDescription2821 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleDescription2847 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_39_in_ruleDescription2871 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_15_in_ruleDescription2890 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_40_in_ruleDescription2909 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_41_in_ruleDescription2928 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_42_in_ruleDescription2947 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_43_in_ruleDescription2966 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_44_in_ruleDescription2985 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_45_in_ruleDescription3004 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_46_in_ruleDescription3023 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_47_in_ruleDescription3042 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_48_in_ruleDescription3061 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_49_in_ruleDescription3080 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_24_in_ruleDescription3099 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_14_in_ruleDescription3118 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_16_in_ruleDescription3137 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_50_in_ruleDescription3156 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_51_in_ruleDescription3175 = new BitSet(new long[]{0x001FFF800101C0B2L});
    public static final BitSet FOLLOW_52_in_ruleDescription3194 = new BitSet(new long[]{0x001FFF800101C0B2L});

}