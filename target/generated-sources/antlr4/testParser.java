// Generated from test.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, PALLET=69, ENDORSE=70, BAR=71, BARRULET=72, HAMADE=73, 
		RIBBON=74, BATON=75, BendletSinister=76, LOZENGE=77, BILLET=78, ROUNDEL=79, 
		LABEL=80, FRET=81, TORTEAUX=82, ROSE=83, SPEAR=84, SHELL=85, QUARTER=86, 
		CANTON=87, FLAUNCH=88, GORE=89, GYRON=90, ORLE=91, ESCUTCHEON=92, FUSIL=93, 
		MASCLE=94, RUSTRE=95, ANNULET=96, FESS=97, PALE=98, BEND=99, BendSinister=100, 
		SALTIRE=101, CROSS=102, CHEVRON=103, PALL=104, CRESCENT=105, BORDURE=106, 
		PILE=107, LION=108, TYGER=109, BengalTiger=110, LEOPARD=111, FOX=112, 
		WOLF=113, BEAR=114, BADGER=115, OTTER=116, THYLACINE=117, PANTHER=118, 
		CAT=119, HOUND=120, WEASEL=121, ANTELOPE=122, COW=123, CAMEL=124, DEER=125, 
		ELEPHANT=126, HIPPOPOTAMUS=127, RHINOCEROS=128, SWINE=129, SHEEP=130, 
		MULLET=131, MARTLET=132, FleurDeLys=133, CrossMoline=134, DoubleQuatrefoil=135, 
		WS=136;
	public static final int
		RULE_blazon = 0, RULE_tincture = 1, RULE_tinctureNames = 2, RULE_complexField = 3, 
		RULE_escutcheonLocations = 4, RULE_direction = 5, RULE_coatDivision = 6, 
		RULE_seme = 7, RULE_ordinary = 8, RULE_ordinaryPosition = 9, RULE_diminutiveNames = 10, 
		RULE_charges = 11, RULE_subordinary = 12, RULE_ordinaryNames = 13, RULE_number = 14, 
		RULE_quartering = 15, RULE_quarterName = 16, RULE_animal = 17, RULE_animalNames = 18, 
		RULE_animalPosition = 19, RULE_cadency = 20, RULE_cadencyNames = 21, RULE_bordure = 22;
	public static final String[] ruleNames = {
		"blazon", "tincture", "tinctureNames", "complexField", "escutcheonLocations", 
		"direction", "coatDivision", "seme", "ordinary", "ordinaryPosition", "diminutiveNames", 
		"charges", "subordinary", "ordinaryNames", "number", "quartering", "quarterName", 
		"animal", "animalNames", "animalPosition", "cadency", "cadencyNames", 
		"bordure"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "','", "'of the field'", "'Argent'", "'Or'", "'Gules'", 
		"'Sable'", "'Azure'", "'Vert'", "'Purpure'", "'Murrey'", "'Sanguine'", 
		"'Tenne'", "'dexter'", "'sinister'", "'palewise'", "'fesswise'", "'party'", 
		"'parted'", "'per'", "'quarterly'", "'seme of'", "'s'", "'es'", "'semy-de-lis'", 
		"'crusily'", "'bezante'", "'plate'", "'billete'", "'annulletty'", "'etincelle'", 
		"'gouttee'", "'tortelly'", "'nebuly'", "'on a'", "'in'", "'chief'", "'base'", 
		"'charged with'", "'debruised by'", "'between'", "'over all'", "'a'", 
		"'an'", "'as many'", "'one'", "'two'", "'three'", "'four'", "'five'", 
		"'the'", "'first'", "'second'", "'third'", "'fourth'", "'rampant'", "'passant'", 
		"'statant'", "'guardant'", "'to the sinister'", "'with'", "'for'", "'difference'", 
		"'distinction'", "'label of'", "'points'", "'all'", "'within a bordure'", 
		"'pallet'", "'endorse'", "'bar'", "'barrulet'", "'hamade'", "'ribbon'", 
		"'baton'", "'bendlet sinister'", "'lozenge'", "'billet'", "'roundel'", 
		"'label'", "'fret'", "'torteaux'", "'rose'", "'spear'", "'shell'", "'quarter'", 
		"'canton'", "'flaunch'", "'gore'", "'gyron'", "'orle'", "'escutcheon'", 
		"'fusil'", "'mascle'", "'rustre'", "'annulet'", "'fess'", "'pale'", "'bend'", 
		null, "'saltire'", "'cross'", "'chevron'", "'pall'", "'crescent'", "'bordure'", 
		"'pile'", "'lion'", "'tyger'", "'bengal tiger'", "'leopard'", "'fox'", 
		null, "'bear'", "'badger'", "'otter'", "'thylacine'", "'panther'", "'cat'", 
		"'hound'", "'weasel'", "'antelope'", "'cow'", "'camel'", "'deer'", "'elephant'", 
		"'hippopotamus'", "'rhinoceros'", "'swine'", "'sheep'", "'mullet'", "'martlet'", 
		null, null, "'double quatrefoil'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "PALLET", "ENDORSE", 
		"BAR", "BARRULET", "HAMADE", "RIBBON", "BATON", "BendletSinister", "LOZENGE", 
		"BILLET", "ROUNDEL", "LABEL", "FRET", "TORTEAUX", "ROSE", "SPEAR", "SHELL", 
		"QUARTER", "CANTON", "FLAUNCH", "GORE", "GYRON", "ORLE", "ESCUTCHEON", 
		"FUSIL", "MASCLE", "RUSTRE", "ANNULET", "FESS", "PALE", "BEND", "BendSinister", 
		"SALTIRE", "CROSS", "CHEVRON", "PALL", "CRESCENT", "BORDURE", "PILE", 
		"LION", "TYGER", "BengalTiger", "LEOPARD", "FOX", "WOLF", "BEAR", "BADGER", 
		"OTTER", "THYLACINE", "PANTHER", "CAT", "HOUND", "WEASEL", "ANTELOPE", 
		"COW", "CAMEL", "DEER", "ELEPHANT", "HIPPOPOTAMUS", "RHINOCEROS", "SWINE", 
		"SHEEP", "MULLET", "MARTLET", "FleurDeLys", "CrossMoline", "DoubleQuatrefoil", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public testParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BlazonContext extends ParserRuleContext {
		public TinctureContext tincture() {
			return getRuleContext(TinctureContext.class,0);
		}
		public SemeContext seme() {
			return getRuleContext(SemeContext.class,0);
		}
		public ComplexFieldContext complexField() {
			return getRuleContext(ComplexFieldContext.class,0);
		}
		public BlazonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blazon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterBlazon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitBlazon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitBlazon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlazonContext blazon() throws RecognitionException {
		BlazonContext _localctx = new BlazonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_blazon);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				tincture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				seme();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				complexField();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TinctureContext extends ParserRuleContext {
		public List<TinctureNamesContext> tinctureNames() {
			return getRuleContexts(TinctureNamesContext.class);
		}
		public TinctureNamesContext tinctureNames(int i) {
			return getRuleContext(TinctureNamesContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public TinctureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tincture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterTincture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitTincture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitTincture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TinctureContext tincture() throws RecognitionException {
		TinctureContext _localctx = new TinctureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tincture);
		int _la;
		try {
			int _alt;
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(51);
						match(WS);
						}
						} 
					}
					setState(56);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				{
				setState(57);
				tinctureNames();
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(58);
						match(WS);
						}
						} 
					}
					setState(63);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(64);
					match(T__0);
					setState(68);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(65);
							match(WS);
							}
							} 
						}
						setState(70);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					}
					setState(71);
					tinctureNames();
					}
					break;
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(74);
					match(T__1);
					}
				}

				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(77);
						match(WS);
						}
						} 
					}
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(83);
					match(WS);
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(T__2);
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(90);
						match(WS);
						}
						} 
					}
					setState(95);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TinctureNamesContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public TinctureNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tinctureNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterTinctureNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitTinctureNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitTinctureNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TinctureNamesContext tinctureNames() throws RecognitionException {
		TinctureNamesContext _localctx = new TinctureNamesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tinctureNames);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(98);
				match(WS);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
					match(WS);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexFieldContext extends ParserRuleContext {
		public TinctureContext tincture() {
			return getRuleContext(TinctureContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public CoatDivisionContext coatDivision() {
			return getRuleContext(CoatDivisionContext.class,0);
		}
		public SemeContext seme() {
			return getRuleContext(SemeContext.class,0);
		}
		public List<OrdinaryContext> ordinary() {
			return getRuleContexts(OrdinaryContext.class);
		}
		public OrdinaryContext ordinary(int i) {
			return getRuleContext(OrdinaryContext.class,i);
		}
		public List<ChargesContext> charges() {
			return getRuleContexts(ChargesContext.class);
		}
		public ChargesContext charges(int i) {
			return getRuleContext(ChargesContext.class,i);
		}
		public List<AnimalContext> animal() {
			return getRuleContexts(AnimalContext.class);
		}
		public AnimalContext animal(int i) {
			return getRuleContext(AnimalContext.class,i);
		}
		public EscutcheonLocationsContext escutcheonLocations() {
			return getRuleContext(EscutcheonLocationsContext.class,0);
		}
		public QuarteringContext quartering() {
			return getRuleContext(QuarteringContext.class,0);
		}
		public CadencyContext cadency() {
			return getRuleContext(CadencyContext.class,0);
		}
		public BordureContext bordure() {
			return getRuleContext(BordureContext.class,0);
		}
		public ComplexFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterComplexField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitComplexField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitComplexField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexFieldContext complexField() throws RecognitionException {
		ComplexFieldContext _localctx = new ComplexFieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_complexField);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					match(WS);
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(117);
				coatDivision();
				}
				break;
			}
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					match(WS);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(126);
			tincture();
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					match(WS);
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(133);
				seme();
				}
				break;
			}
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					match(WS);
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(142);
				match(T__0);
				}
				break;
			}
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					match(WS);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					ordinary();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(159);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(157);
						charges();
						}
						break;
					case 2:
						{
						setState(158);
						animal();
						}
						break;
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					match(WS);
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(170);
				escutcheonLocations();
				}
				break;
			}
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					match(WS);
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(179);
				quartering();
				}
				break;
			}
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(182);
					match(WS);
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__60) {
				{
				setState(188);
				cadency();
				}
			}

			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					match(WS);
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__66 || _la==T__67 || _la==WS) {
				{
				setState(197);
				bordure();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscutcheonLocationsContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public EscutcheonLocationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escutcheonLocations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterEscutcheonLocations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitEscutcheonLocations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitEscutcheonLocations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscutcheonLocationsContext escutcheonLocations() throws RecognitionException {
		EscutcheonLocationsContext _localctx = new EscutcheonLocationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_escutcheonLocations);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(200);
				match(WS);
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					match(WS);
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectionContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_direction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(213);
				match(WS);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					match(WS);
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoatDivisionContext extends ParserRuleContext {
		public OrdinaryNamesContext ordinaryNames() {
			return getRuleContext(OrdinaryNamesContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public CoatDivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coatDivision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterCoatDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCoatDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitCoatDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoatDivisionContext coatDivision() throws RecognitionException {
		CoatDivisionContext _localctx = new CoatDivisionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_coatDivision);
		int _la;
		try {
			int _alt;
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(226);
						match(WS);
						}
						} 
					}
					setState(231);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(232);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__18) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(235);
					match(WS);
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				match(T__19);
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(242);
						match(WS);
						}
						} 
					}
					setState(247);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(248);
				ordinaryNames();
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(249);
						match(WS);
						}
						} 
					}
					setState(254);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(255);
					match(WS);
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				match(T__20);
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(262);
						match(WS);
						}
						} 
					}
					setState(267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SemeContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public TinctureContext tincture() {
			return getRuleContext(TinctureContext.class,0);
		}
		public SubordinaryContext subordinary() {
			return getRuleContext(SubordinaryContext.class,0);
		}
		public SemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterSeme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitSeme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitSeme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemeContext seme() throws RecognitionException {
		SemeContext _localctx = new SemeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_seme);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					match(WS);
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case WS:
				{
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(276);
					match(WS);
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(282);
				match(T__21);
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(283);
						match(WS);
						}
						} 
					}
					setState(288);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(289);
				subordinary();
				setState(290);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(291);
						match(WS);
						}
						} 
					}
					setState(296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(297);
					match(T__1);
					}
				}

				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(300);
						match(WS);
						}
						} 
					}
					setState(305);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				}
				}
				break;
			case T__24:
				{
				setState(306);
				match(T__24);
				}
				break;
			case T__25:
				{
				setState(307);
				match(T__25);
				}
				break;
			case T__26:
				{
				setState(308);
				match(T__26);
				}
				break;
			case T__27:
				{
				setState(309);
				match(T__27);
				}
				break;
			case T__28:
				{
				setState(310);
				match(T__28);
				}
				break;
			case T__29:
				{
				setState(311);
				match(T__29);
				}
				break;
			case T__30:
				{
				setState(312);
				match(T__30);
				}
				break;
			case T__31:
				{
				setState(313);
				match(T__31);
				}
				break;
			case T__32:
				{
				setState(314);
				match(T__32);
				}
				break;
			case T__33:
				{
				setState(315);
				match(T__33);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(318);
					match(WS);
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(324);
				tincture();
				}
				break;
			}
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(327);
					match(WS);
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrdinaryContext extends ParserRuleContext {
		public AnimalContext animal() {
			return getRuleContext(AnimalContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OrdinaryNamesContext ordinaryNames() {
			return getRuleContext(OrdinaryNamesContext.class,0);
		}
		public SubordinaryContext subordinary() {
			return getRuleContext(SubordinaryContext.class,0);
		}
		public DiminutiveNamesContext diminutiveNames() {
			return getRuleContext(DiminutiveNamesContext.class,0);
		}
		public SemeContext seme() {
			return getRuleContext(SemeContext.class,0);
		}
		public TinctureContext tincture() {
			return getRuleContext(TinctureContext.class,0);
		}
		public OrdinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterOrdinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitOrdinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitOrdinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdinaryContext ordinary() throws RecognitionException {
		OrdinaryContext _localctx = new OrdinaryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ordinary);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(333);
					match(WS);
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(339);
				match(T__0);
				}
				break;
			}
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(342);
					match(WS);
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(348);
				animal();
				}
				break;
			case 2:
				{
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(349);
						match(WS);
						}
						} 
					}
					setState(354);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				{
				setState(357);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case WS:
					{
					setState(355);
					number();
					}
					break;
				case T__34:
					{
					setState(356);
					match(T__34);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(359);
						match(WS);
						}
						} 
					}
					setState(364);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(365);
					ordinaryNames();
					}
					break;
				case 2:
					{
					setState(366);
					subordinary();
					}
					break;
				case 3:
					{
					setState(367);
					diminutiveNames();
					}
					break;
				case 4:
					{
					setState(368);
					seme();
					}
					break;
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22 || _la==T__23) {
					{
					setState(371);
					_la = _input.LA(1);
					if ( !(_la==T__22 || _la==T__23) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(374);
						match(WS);
						}
						} 
					}
					setState(379);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(381);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(380);
					tincture();
					}
					break;
				}
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(383);
						match(WS);
						}
						} 
					}
					setState(388);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				}
				break;
			}
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(391);
					match(WS);
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(397);
				direction();
				}
				break;
			}
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(400);
					match(WS);
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrdinaryPositionContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OrdinaryPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinaryPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterOrdinaryPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitOrdinaryPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitOrdinaryPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdinaryPositionContext ordinaryPosition() throws RecognitionException {
		OrdinaryPositionContext _localctx = new OrdinaryPositionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ordinaryPosition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(406);
					match(WS);
					}
					} 
				}
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(412);
				match(T__0);
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(413);
						match(WS);
						}
						} 
					}
					setState(418);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(419);
				number();
				}
			}

			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(422);
				match(WS);
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			match(T__35);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(429);
				match(WS);
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
			_la = _input.LA(1);
			if ( !(_la==T__36 || _la==T__37 || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (FESS - 97)) | (1L << (PALE - 97)) | (1L << (BEND - 97)) | (1L << (CHEVRON - 97)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(436);
					match(WS);
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiminutiveNamesContext extends ParserRuleContext {
		public TerminalNode PALLET() { return getToken(testParser.PALLET, 0); }
		public TerminalNode ENDORSE() { return getToken(testParser.ENDORSE, 0); }
		public TerminalNode BAR() { return getToken(testParser.BAR, 0); }
		public TerminalNode BARRULET() { return getToken(testParser.BARRULET, 0); }
		public TerminalNode HAMADE() { return getToken(testParser.HAMADE, 0); }
		public TerminalNode RIBBON() { return getToken(testParser.RIBBON, 0); }
		public TerminalNode BATON() { return getToken(testParser.BATON, 0); }
		public TerminalNode BendletSinister() { return getToken(testParser.BendletSinister, 0); }
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public DiminutiveNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diminutiveNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDiminutiveNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDiminutiveNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDiminutiveNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiminutiveNamesContext diminutiveNames() throws RecognitionException {
		DiminutiveNamesContext _localctx = new DiminutiveNamesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_diminutiveNames);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(442);
				match(WS);
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (PALLET - 69)) | (1L << (ENDORSE - 69)) | (1L << (BAR - 69)) | (1L << (BARRULET - 69)) | (1L << (HAMADE - 69)) | (1L << (RIBBON - 69)) | (1L << (BATON - 69)) | (1L << (BendletSinister - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(449);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(452);
					match(WS);
					}
					} 
				}
				setState(457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChargesContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SubordinaryContext subordinary() {
			return getRuleContext(SubordinaryContext.class,0);
		}
		public OrdinaryNamesContext ordinaryNames() {
			return getRuleContext(OrdinaryNamesContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public List<OrdinaryPositionContext> ordinaryPosition() {
			return getRuleContexts(OrdinaryPositionContext.class);
		}
		public OrdinaryPositionContext ordinaryPosition(int i) {
			return getRuleContext(OrdinaryPositionContext.class,i);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public TinctureContext tincture() {
			return getRuleContext(TinctureContext.class,0);
		}
		public ChargesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterCharges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCharges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitCharges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChargesContext charges() throws RecognitionException {
		ChargesContext _localctx = new ChargesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_charges);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(458);
				match(T__0);
				}
				break;
			}
			setState(464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(461);
					match(WS);
					}
					} 
				}
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(472);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__38:
						{
						setState(467);
						match(T__38);
						}
						break;
					case T__39:
						{
						setState(468);
						match(T__39);
						}
						break;
					case T__40:
						{
						setState(469);
						match(T__40);
						}
						break;
					case T__41:
						{
						setState(470);
						match(T__41);
						}
						break;
					case T__0:
					case T__35:
					case WS:
						{
						setState(471);
						ordinaryPosition();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(477);
					match(WS);
					}
					} 
				}
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(483);
			number();
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(484);
					match(WS);
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(490);
				subordinary();
				}
				break;
			case 2:
				{
				setState(491);
				ordinaryNames();
				}
				break;
			}
			setState(497);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(494);
					match(WS);
					}
					} 
				}
				setState(499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22 || _la==T__23) {
				{
				setState(500);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(503);
					match(WS);
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(509);
				direction();
				}
				break;
			}
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(512);
					match(WS);
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(518);
				ordinaryPosition();
				}
				break;
			}
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(521);
					match(WS);
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(527);
				tincture();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubordinaryContext extends ParserRuleContext {
		public TerminalNode LOZENGE() { return getToken(testParser.LOZENGE, 0); }
		public TerminalNode BILLET() { return getToken(testParser.BILLET, 0); }
		public TerminalNode ANNULET() { return getToken(testParser.ANNULET, 0); }
		public TerminalNode ROUNDEL() { return getToken(testParser.ROUNDEL, 0); }
		public TerminalNode LABEL() { return getToken(testParser.LABEL, 0); }
		public TerminalNode FRET() { return getToken(testParser.FRET, 0); }
		public TerminalNode BATON() { return getToken(testParser.BATON, 0); }
		public TerminalNode TORTEAUX() { return getToken(testParser.TORTEAUX, 0); }
		public TerminalNode ROSE() { return getToken(testParser.ROSE, 0); }
		public TerminalNode SPEAR() { return getToken(testParser.SPEAR, 0); }
		public TerminalNode SHELL() { return getToken(testParser.SHELL, 0); }
		public TerminalNode QUARTER() { return getToken(testParser.QUARTER, 0); }
		public TerminalNode CANTON() { return getToken(testParser.CANTON, 0); }
		public TerminalNode FLAUNCH() { return getToken(testParser.FLAUNCH, 0); }
		public TerminalNode GORE() { return getToken(testParser.GORE, 0); }
		public TerminalNode GYRON() { return getToken(testParser.GYRON, 0); }
		public TerminalNode ORLE() { return getToken(testParser.ORLE, 0); }
		public TerminalNode ESCUTCHEON() { return getToken(testParser.ESCUTCHEON, 0); }
		public TerminalNode FUSIL() { return getToken(testParser.FUSIL, 0); }
		public TerminalNode MASCLE() { return getToken(testParser.MASCLE, 0); }
		public TerminalNode RUSTRE() { return getToken(testParser.RUSTRE, 0); }
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public SubordinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subordinary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterSubordinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitSubordinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitSubordinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubordinaryContext subordinary() throws RecognitionException {
		SubordinaryContext _localctx = new SubordinaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_subordinary);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(530);
				match(WS);
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (BATON - 75)) | (1L << (LOZENGE - 75)) | (1L << (BILLET - 75)) | (1L << (ROUNDEL - 75)) | (1L << (LABEL - 75)) | (1L << (FRET - 75)) | (1L << (TORTEAUX - 75)) | (1L << (ROSE - 75)) | (1L << (SPEAR - 75)) | (1L << (SHELL - 75)) | (1L << (QUARTER - 75)) | (1L << (CANTON - 75)) | (1L << (FLAUNCH - 75)) | (1L << (GORE - 75)) | (1L << (GYRON - 75)) | (1L << (ORLE - 75)) | (1L << (ESCUTCHEON - 75)) | (1L << (FUSIL - 75)) | (1L << (MASCLE - 75)) | (1L << (RUSTRE - 75)) | (1L << (ANNULET - 75)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(537);
					match(WS);
					}
					} 
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrdinaryNamesContext extends ParserRuleContext {
		public TerminalNode FESS() { return getToken(testParser.FESS, 0); }
		public TerminalNode PALE() { return getToken(testParser.PALE, 0); }
		public TerminalNode BEND() { return getToken(testParser.BEND, 0); }
		public TerminalNode BendSinister() { return getToken(testParser.BendSinister, 0); }
		public TerminalNode SALTIRE() { return getToken(testParser.SALTIRE, 0); }
		public TerminalNode CROSS() { return getToken(testParser.CROSS, 0); }
		public TerminalNode CHEVRON() { return getToken(testParser.CHEVRON, 0); }
		public TerminalNode PALL() { return getToken(testParser.PALL, 0); }
		public TerminalNode CRESCENT() { return getToken(testParser.CRESCENT, 0); }
		public TerminalNode BORDURE() { return getToken(testParser.BORDURE, 0); }
		public TerminalNode PILE() { return getToken(testParser.PILE, 0); }
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public OrdinaryNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinaryNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterOrdinaryNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitOrdinaryNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitOrdinaryNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdinaryNamesContext ordinaryNames() throws RecognitionException {
		OrdinaryNamesContext _localctx = new OrdinaryNamesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ordinaryNames);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(543);
				match(WS);
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (FESS - 97)) | (1L << (PALE - 97)) | (1L << (BEND - 97)) | (1L << (BendSinister - 97)) | (1L << (SALTIRE - 97)) | (1L << (CROSS - 97)) | (1L << (CHEVRON - 97)) | (1L << (PALL - 97)) | (1L << (CRESCENT - 97)) | (1L << (BORDURE - 97)) | (1L << (PILE - 97)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(550);
					match(WS);
					}
					} 
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_number);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(556);
				match(WS);
				}
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(562);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
					match(WS);
					}
					} 
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuarteringContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public List<QuarterNameContext> quarterName() {
			return getRuleContexts(QuarterNameContext.class);
		}
		public QuarterNameContext quarterName(int i) {
			return getRuleContext(QuarterNameContext.class,i);
		}
		public List<ChargesContext> charges() {
			return getRuleContexts(ChargesContext.class);
		}
		public ChargesContext charges(int i) {
			return getRuleContext(ChargesContext.class,i);
		}
		public QuarteringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quartering; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterQuartering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitQuartering(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitQuartering(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuarteringContext quartering() throws RecognitionException {
		QuarteringContext _localctx = new QuarteringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_quartering);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(569);
					match(WS);
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			setState(600); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(576);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(575);
						match(T__0);
						}
					}

					setState(581);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(578);
						match(WS);
						}
						}
						setState(583);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(584);
					match(T__35);
					setState(588);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(585);
							match(WS);
							}
							} 
						}
						setState(590);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
					}
					setState(591);
					quarterName();
					setState(595);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(592);
							match(WS);
							}
							} 
						}
						setState(597);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
					}
					setState(598);
					charges();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(602); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuarterNameContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public QuarterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quarterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterQuarterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitQuarterName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitQuarterName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuarterNameContext quarterName() throws RecognitionException {
		QuarterNameContext _localctx = new QuarterNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_quarterName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(604);
				match(WS);
				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(610);
			match(T__50);
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(611);
				match(WS);
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(618);
				match(WS);
				}
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(624);
			match(QUARTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimalContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AnimalNamesContext animalNames() {
			return getRuleContext(AnimalNamesContext.class,0);
		}
		public TinctureContext tincture() {
			return getRuleContext(TinctureContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public List<AnimalPositionContext> animalPosition() {
			return getRuleContexts(AnimalPositionContext.class);
		}
		public AnimalPositionContext animalPosition(int i) {
			return getRuleContext(AnimalPositionContext.class,i);
		}
		public OrdinaryPositionContext ordinaryPosition() {
			return getRuleContext(OrdinaryPositionContext.class,0);
		}
		public AnimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAnimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAnimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitAnimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimalContext animal() throws RecognitionException {
		AnimalContext _localctx = new AnimalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_animal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(626);
					match(WS);
					}
					} 
				}
				setState(631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(632);
				match(T__0);
				}
			}

			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(635);
					match(WS);
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			}
			setState(641);
			number();
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(642);
					match(WS);
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			}
			setState(648);
			animalNames();
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22 || _la==T__23) {
				{
				setState(649);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(652);
					match(WS);
					}
					} 
				}
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			setState(659); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(658);
					animalPosition();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(661); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(666);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(663);
					match(WS);
					}
					} 
				}
				setState(668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(669);
				ordinaryPosition();
				}
				break;
			}
			setState(675);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(672);
					match(WS);
					}
					} 
				}
				setState(677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			setState(678);
			tincture();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimalNamesContext extends ParserRuleContext {
		public TerminalNode LION() { return getToken(testParser.LION, 0); }
		public TerminalNode TYGER() { return getToken(testParser.TYGER, 0); }
		public TerminalNode BengalTiger() { return getToken(testParser.BengalTiger, 0); }
		public TerminalNode LEOPARD() { return getToken(testParser.LEOPARD, 0); }
		public TerminalNode FOX() { return getToken(testParser.FOX, 0); }
		public TerminalNode WOLF() { return getToken(testParser.WOLF, 0); }
		public TerminalNode BEAR() { return getToken(testParser.BEAR, 0); }
		public TerminalNode BADGER() { return getToken(testParser.BADGER, 0); }
		public TerminalNode OTTER() { return getToken(testParser.OTTER, 0); }
		public TerminalNode THYLACINE() { return getToken(testParser.THYLACINE, 0); }
		public TerminalNode PANTHER() { return getToken(testParser.PANTHER, 0); }
		public TerminalNode CAT() { return getToken(testParser.CAT, 0); }
		public TerminalNode HOUND() { return getToken(testParser.HOUND, 0); }
		public TerminalNode WEASEL() { return getToken(testParser.WEASEL, 0); }
		public TerminalNode ANTELOPE() { return getToken(testParser.ANTELOPE, 0); }
		public TerminalNode COW() { return getToken(testParser.COW, 0); }
		public TerminalNode CAMEL() { return getToken(testParser.CAMEL, 0); }
		public TerminalNode DEER() { return getToken(testParser.DEER, 0); }
		public TerminalNode ELEPHANT() { return getToken(testParser.ELEPHANT, 0); }
		public TerminalNode HIPPOPOTAMUS() { return getToken(testParser.HIPPOPOTAMUS, 0); }
		public TerminalNode RHINOCEROS() { return getToken(testParser.RHINOCEROS, 0); }
		public TerminalNode SWINE() { return getToken(testParser.SWINE, 0); }
		public TerminalNode SHEEP() { return getToken(testParser.SHEEP, 0); }
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public AnimalNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animalNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAnimalNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAnimalNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitAnimalNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimalNamesContext animalNames() throws RecognitionException {
		AnimalNamesContext _localctx = new AnimalNamesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_animalNames);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(680);
				match(WS);
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(686);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (LION - 108)) | (1L << (TYGER - 108)) | (1L << (BengalTiger - 108)) | (1L << (LEOPARD - 108)) | (1L << (FOX - 108)) | (1L << (WOLF - 108)) | (1L << (BEAR - 108)) | (1L << (BADGER - 108)) | (1L << (OTTER - 108)) | (1L << (THYLACINE - 108)) | (1L << (PANTHER - 108)) | (1L << (CAT - 108)) | (1L << (HOUND - 108)) | (1L << (WEASEL - 108)) | (1L << (ANTELOPE - 108)) | (1L << (COW - 108)) | (1L << (CAMEL - 108)) | (1L << (DEER - 108)) | (1L << (ELEPHANT - 108)) | (1L << (HIPPOPOTAMUS - 108)) | (1L << (RHINOCEROS - 108)) | (1L << (SWINE - 108)) | (1L << (SHEEP - 108)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(687);
					match(WS);
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimalPositionContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public AnimalPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animalPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAnimalPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAnimalPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitAnimalPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimalPositionContext animalPosition() throws RecognitionException {
		AnimalPositionContext _localctx = new AnimalPositionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_animalPosition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(693);
				match(WS);
				}
				}
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(699);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(703);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(700);
					match(WS);
					}
					} 
				}
				setState(705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__59) {
				{
				setState(706);
				match(T__59);
				}
			}

			setState(712);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(709);
					match(WS);
					}
					} 
				}
				setState(714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CadencyContext extends ParserRuleContext {
		public CadencyNamesContext cadencyNames() {
			return getRuleContext(CadencyNamesContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public TinctureContext tincture() {
			return getRuleContext(TinctureContext.class,0);
		}
		public CadencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadency; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterCadency(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCadency(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitCadency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CadencyContext cadency() throws RecognitionException {
		CadencyContext _localctx = new CadencyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cadency);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(T__60);
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(716);
				match(WS);
				}
				}
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(722);
			match(T__42);
			setState(726);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(723);
					match(WS);
					}
					} 
				}
				setState(728);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			setState(729);
			cadencyNames();
			setState(733);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(730);
					match(WS);
					}
					} 
				}
				setState(735);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(736);
				tincture();
				}
				break;
			}
			setState(742);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(739);
					match(WS);
					}
					} 
				}
				setState(744);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__61) {
				{
				setState(745);
				match(T__61);
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(746);
					match(WS);
					}
					}
					setState(751);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(752);
				_la = _input.LA(1);
				if ( !(_la==T__62 || _la==T__63) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CadencyNamesContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public TerminalNode LOZENGE() { return getToken(testParser.LOZENGE, 0); }
		public TerminalNode MULLET() { return getToken(testParser.MULLET, 0); }
		public TerminalNode MARTLET() { return getToken(testParser.MARTLET, 0); }
		public TerminalNode ANNULET() { return getToken(testParser.ANNULET, 0); }
		public TerminalNode FleurDeLys() { return getToken(testParser.FleurDeLys, 0); }
		public TerminalNode ROSE() { return getToken(testParser.ROSE, 0); }
		public TerminalNode CrossMoline() { return getToken(testParser.CrossMoline, 0); }
		public TerminalNode DoubleQuatrefoil() { return getToken(testParser.DoubleQuatrefoil, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CadencyNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadencyNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterCadencyNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCadencyNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitCadencyNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CadencyNamesContext cadencyNames() throws RecognitionException {
		CadencyNamesContext _localctx = new CadencyNamesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cadencyNames);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(755);
					match(WS);
					}
					} 
				}
				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			{
			setState(796);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOZENGE:
				{
				setState(761);
				match(LOZENGE);
				}
				break;
			case T__64:
			case WS:
				{
				{
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(762);
					match(WS);
					}
					}
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(768);
				match(T__64);
				setState(772);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(769);
						match(WS);
						}
						} 
					}
					setState(774);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
				}
				setState(775);
				number();
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(776);
					match(WS);
					}
					}
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(782);
				match(T__65);
				setState(786);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(783);
						match(WS);
						}
						} 
					}
					setState(788);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				}
				}
				}
				break;
			case MULLET:
				{
				setState(789);
				match(MULLET);
				}
				break;
			case MARTLET:
				{
				setState(790);
				match(MARTLET);
				}
				break;
			case ANNULET:
				{
				setState(791);
				match(ANNULET);
				}
				break;
			case FleurDeLys:
				{
				setState(792);
				match(FleurDeLys);
				}
				break;
			case ROSE:
				{
				setState(793);
				match(ROSE);
				}
				break;
			case CrossMoline:
				{
				setState(794);
				match(CrossMoline);
				}
				break;
			case DoubleQuatrefoil:
				{
				setState(795);
				match(DoubleQuatrefoil);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22 || _la==T__23) {
				{
				setState(798);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
			setState(804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(801);
					match(WS);
					}
					} 
				}
				setState(806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BordureContext extends ParserRuleContext {
		public TinctureNamesContext tinctureNames() {
			return getRuleContext(TinctureNamesContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(testParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(testParser.WS, i);
		}
		public BordureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bordure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterBordure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitBordure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitBordure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BordureContext bordure() throws RecognitionException {
		BordureContext _localctx = new BordureContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bordure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(807);
					match(WS);
					}
					} 
				}
				setState(812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__66) {
				{
				setState(813);
				match(T__66);
				}
			}

			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(816);
				match(WS);
				}
				}
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(822);
			match(T__67);
			setState(826);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(823);
					match(WS);
					}
					} 
				}
				setState(828);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			setState(829);
			tinctureNames();
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(830);
				match(WS);
				}
				}
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008a\u0347\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\5\2\64\n\2\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\7\3>\n\3\f\3\16\3"+
		"A\13\3\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\5\3K\n\3\3\3\5\3N\n\3\3\3\7"+
		"\3Q\n\3\f\3\16\3T\13\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\7\3^\n\3\f"+
		"\3\16\3a\13\3\5\3c\n\3\3\4\7\4f\n\4\f\4\16\4i\13\4\3\4\3\4\7\4m\n\4\f"+
		"\4\16\4p\13\4\3\5\7\5s\n\5\f\5\16\5v\13\5\3\5\5\5y\n\5\3\5\7\5|\n\5\f"+
		"\5\16\5\177\13\5\3\5\3\5\7\5\u0083\n\5\f\5\16\5\u0086\13\5\3\5\5\5\u0089"+
		"\n\5\3\5\7\5\u008c\n\5\f\5\16\5\u008f\13\5\3\5\5\5\u0092\n\5\3\5\7\5\u0095"+
		"\n\5\f\5\16\5\u0098\13\5\3\5\7\5\u009b\n\5\f\5\16\5\u009e\13\5\3\5\3\5"+
		"\7\5\u00a2\n\5\f\5\16\5\u00a5\13\5\3\5\7\5\u00a8\n\5\f\5\16\5\u00ab\13"+
		"\5\3\5\5\5\u00ae\n\5\3\5\7\5\u00b1\n\5\f\5\16\5\u00b4\13\5\3\5\5\5\u00b7"+
		"\n\5\3\5\7\5\u00ba\n\5\f\5\16\5\u00bd\13\5\3\5\5\5\u00c0\n\5\3\5\7\5\u00c3"+
		"\n\5\f\5\16\5\u00c6\13\5\3\5\5\5\u00c9\n\5\3\6\7\6\u00cc\n\6\f\6\16\6"+
		"\u00cf\13\6\3\6\3\6\7\6\u00d3\n\6\f\6\16\6\u00d6\13\6\3\7\7\7\u00d9\n"+
		"\7\f\7\16\7\u00dc\13\7\3\7\3\7\7\7\u00e0\n\7\f\7\16\7\u00e3\13\7\3\b\7"+
		"\b\u00e6\n\b\f\b\16\b\u00e9\13\b\3\b\5\b\u00ec\n\b\3\b\7\b\u00ef\n\b\f"+
		"\b\16\b\u00f2\13\b\3\b\3\b\7\b\u00f6\n\b\f\b\16\b\u00f9\13\b\3\b\3\b\7"+
		"\b\u00fd\n\b\f\b\16\b\u0100\13\b\3\b\7\b\u0103\n\b\f\b\16\b\u0106\13\b"+
		"\3\b\3\b\7\b\u010a\n\b\f\b\16\b\u010d\13\b\5\b\u010f\n\b\3\t\7\t\u0112"+
		"\n\t\f\t\16\t\u0115\13\t\3\t\7\t\u0118\n\t\f\t\16\t\u011b\13\t\3\t\3\t"+
		"\7\t\u011f\n\t\f\t\16\t\u0122\13\t\3\t\3\t\3\t\7\t\u0127\n\t\f\t\16\t"+
		"\u012a\13\t\3\t\5\t\u012d\n\t\3\t\7\t\u0130\n\t\f\t\16\t\u0133\13\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u013f\n\t\3\t\7\t\u0142\n\t"+
		"\f\t\16\t\u0145\13\t\3\t\5\t\u0148\n\t\3\t\7\t\u014b\n\t\f\t\16\t\u014e"+
		"\13\t\3\n\7\n\u0151\n\n\f\n\16\n\u0154\13\n\3\n\5\n\u0157\n\n\3\n\7\n"+
		"\u015a\n\n\f\n\16\n\u015d\13\n\3\n\3\n\7\n\u0161\n\n\f\n\16\n\u0164\13"+
		"\n\3\n\3\n\5\n\u0168\n\n\3\n\7\n\u016b\n\n\f\n\16\n\u016e\13\n\3\n\3\n"+
		"\3\n\3\n\5\n\u0174\n\n\3\n\5\n\u0177\n\n\3\n\7\n\u017a\n\n\f\n\16\n\u017d"+
		"\13\n\3\n\5\n\u0180\n\n\3\n\7\n\u0183\n\n\f\n\16\n\u0186\13\n\5\n\u0188"+
		"\n\n\3\n\7\n\u018b\n\n\f\n\16\n\u018e\13\n\3\n\5\n\u0191\n\n\3\n\7\n\u0194"+
		"\n\n\f\n\16\n\u0197\13\n\3\13\7\13\u019a\n\13\f\13\16\13\u019d\13\13\3"+
		"\13\3\13\7\13\u01a1\n\13\f\13\16\13\u01a4\13\13\3\13\5\13\u01a7\n\13\3"+
		"\13\7\13\u01aa\n\13\f\13\16\13\u01ad\13\13\3\13\3\13\7\13\u01b1\n\13\f"+
		"\13\16\13\u01b4\13\13\3\13\3\13\7\13\u01b8\n\13\f\13\16\13\u01bb\13\13"+
		"\3\f\7\f\u01be\n\f\f\f\16\f\u01c1\13\f\3\f\3\f\5\f\u01c5\n\f\3\f\7\f\u01c8"+
		"\n\f\f\f\16\f\u01cb\13\f\3\r\5\r\u01ce\n\r\3\r\7\r\u01d1\n\r\f\r\16\r"+
		"\u01d4\13\r\3\r\3\r\3\r\3\r\3\r\7\r\u01db\n\r\f\r\16\r\u01de\13\r\3\r"+
		"\7\r\u01e1\n\r\f\r\16\r\u01e4\13\r\3\r\3\r\7\r\u01e8\n\r\f\r\16\r\u01eb"+
		"\13\r\3\r\3\r\5\r\u01ef\n\r\3\r\7\r\u01f2\n\r\f\r\16\r\u01f5\13\r\3\r"+
		"\5\r\u01f8\n\r\3\r\7\r\u01fb\n\r\f\r\16\r\u01fe\13\r\3\r\5\r\u0201\n\r"+
		"\3\r\7\r\u0204\n\r\f\r\16\r\u0207\13\r\3\r\5\r\u020a\n\r\3\r\7\r\u020d"+
		"\n\r\f\r\16\r\u0210\13\r\3\r\5\r\u0213\n\r\3\16\7\16\u0216\n\16\f\16\16"+
		"\16\u0219\13\16\3\16\3\16\7\16\u021d\n\16\f\16\16\16\u0220\13\16\3\17"+
		"\7\17\u0223\n\17\f\17\16\17\u0226\13\17\3\17\3\17\7\17\u022a\n\17\f\17"+
		"\16\17\u022d\13\17\3\20\7\20\u0230\n\20\f\20\16\20\u0233\13\20\3\20\3"+
		"\20\7\20\u0237\n\20\f\20\16\20\u023a\13\20\3\21\7\21\u023d\n\21\f\21\16"+
		"\21\u0240\13\21\3\21\5\21\u0243\n\21\3\21\7\21\u0246\n\21\f\21\16\21\u0249"+
		"\13\21\3\21\3\21\7\21\u024d\n\21\f\21\16\21\u0250\13\21\3\21\3\21\7\21"+
		"\u0254\n\21\f\21\16\21\u0257\13\21\3\21\3\21\6\21\u025b\n\21\r\21\16\21"+
		"\u025c\3\22\7\22\u0260\n\22\f\22\16\22\u0263\13\22\3\22\3\22\7\22\u0267"+
		"\n\22\f\22\16\22\u026a\13\22\3\22\3\22\7\22\u026e\n\22\f\22\16\22\u0271"+
		"\13\22\3\22\3\22\3\23\7\23\u0276\n\23\f\23\16\23\u0279\13\23\3\23\5\23"+
		"\u027c\n\23\3\23\7\23\u027f\n\23\f\23\16\23\u0282\13\23\3\23\3\23\7\23"+
		"\u0286\n\23\f\23\16\23\u0289\13\23\3\23\3\23\5\23\u028d\n\23\3\23\7\23"+
		"\u0290\n\23\f\23\16\23\u0293\13\23\3\23\6\23\u0296\n\23\r\23\16\23\u0297"+
		"\3\23\7\23\u029b\n\23\f\23\16\23\u029e\13\23\3\23\5\23\u02a1\n\23\3\23"+
		"\7\23\u02a4\n\23\f\23\16\23\u02a7\13\23\3\23\3\23\3\24\7\24\u02ac\n\24"+
		"\f\24\16\24\u02af\13\24\3\24\3\24\7\24\u02b3\n\24\f\24\16\24\u02b6\13"+
		"\24\3\25\7\25\u02b9\n\25\f\25\16\25\u02bc\13\25\3\25\3\25\7\25\u02c0\n"+
		"\25\f\25\16\25\u02c3\13\25\3\25\5\25\u02c6\n\25\3\25\7\25\u02c9\n\25\f"+
		"\25\16\25\u02cc\13\25\3\26\3\26\7\26\u02d0\n\26\f\26\16\26\u02d3\13\26"+
		"\3\26\3\26\7\26\u02d7\n\26\f\26\16\26\u02da\13\26\3\26\3\26\7\26\u02de"+
		"\n\26\f\26\16\26\u02e1\13\26\3\26\5\26\u02e4\n\26\3\26\7\26\u02e7\n\26"+
		"\f\26\16\26\u02ea\13\26\3\26\3\26\7\26\u02ee\n\26\f\26\16\26\u02f1\13"+
		"\26\3\26\5\26\u02f4\n\26\3\27\7\27\u02f7\n\27\f\27\16\27\u02fa\13\27\3"+
		"\27\3\27\7\27\u02fe\n\27\f\27\16\27\u0301\13\27\3\27\3\27\7\27\u0305\n"+
		"\27\f\27\16\27\u0308\13\27\3\27\3\27\7\27\u030c\n\27\f\27\16\27\u030f"+
		"\13\27\3\27\3\27\7\27\u0313\n\27\f\27\16\27\u0316\13\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u031f\n\27\3\27\5\27\u0322\n\27\3\27\7\27\u0325"+
		"\n\27\f\27\16\27\u0328\13\27\3\30\7\30\u032b\n\30\f\30\16\30\u032e\13"+
		"\30\3\30\5\30\u0331\n\30\3\30\7\30\u0334\n\30\f\30\16\30\u0337\13\30\3"+
		"\30\3\30\7\30\u033b\n\30\f\30\16\30\u033e\13\30\3\30\3\30\7\30\u0342\n"+
		"\30\f\30\16\30\u0345\13\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\2\20\3\2\6\17\3\2\20\21\3\2\22\23\3\2\24\25\3\2\31\32"+
		"\5\2\'(ceii\3\2GN\4\2MMOb\3\2cm\3\2-\64\3\2\669\3\2n\u0084\3\2:=\3\2A"+
		"B\2\u03d4\2\63\3\2\2\2\4b\3\2\2\2\6g\3\2\2\2\bt\3\2\2\2\n\u00cd\3\2\2"+
		"\2\f\u00da\3\2\2\2\16\u010e\3\2\2\2\20\u0113\3\2\2\2\22\u0152\3\2\2\2"+
		"\24\u019b\3\2\2\2\26\u01bf\3\2\2\2\30\u01cd\3\2\2\2\32\u0217\3\2\2\2\34"+
		"\u0224\3\2\2\2\36\u0231\3\2\2\2 \u023e\3\2\2\2\"\u0261\3\2\2\2$\u0277"+
		"\3\2\2\2&\u02ad\3\2\2\2(\u02ba\3\2\2\2*\u02cd\3\2\2\2,\u02f8\3\2\2\2."+
		"\u032c\3\2\2\2\60\64\5\4\3\2\61\64\5\20\t\2\62\64\5\b\5\2\63\60\3\2\2"+
		"\2\63\61\3\2\2\2\63\62\3\2\2\2\64\3\3\2\2\2\65\67\7\u008a\2\2\66\65\3"+
		"\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;?\5\6\4\2"+
		"<>\7\u008a\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@J\3\2\2\2A?\3\2"+
		"\2\2BF\7\3\2\2CE\7\u008a\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G"+
		"I\3\2\2\2HF\3\2\2\2IK\5\6\4\2JB\3\2\2\2JK\3\2\2\2KM\3\2\2\2LN\7\4\2\2"+
		"ML\3\2\2\2MN\3\2\2\2NR\3\2\2\2OQ\7\u008a\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2"+
		"\2\2RS\3\2\2\2Sc\3\2\2\2TR\3\2\2\2UW\7\u008a\2\2VU\3\2\2\2WZ\3\2\2\2X"+
		"V\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[_\7\5\2\2\\^\7\u008a\2\2]\\\3"+
		"\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2b8\3\2\2\2bX\3"+
		"\2\2\2c\5\3\2\2\2df\7\u008a\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2"+
		"\2hj\3\2\2\2ig\3\2\2\2jn\t\2\2\2km\7\u008a\2\2lk\3\2\2\2mp\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2o\7\3\2\2\2pn\3\2\2\2qs\7\u008a\2\2rq\3\2\2\2sv\3\2\2"+
		"\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wy\5\16\b\2xw\3\2\2\2xy\3\2"+
		"\2\2y}\3\2\2\2z|\7\u008a\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2"+
		"\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0084\5\4\3\2\u0081\u0083\7\u008a"+
		"\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\5\20"+
		"\t\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008d\3\2\2\2\u008a"+
		"\u008c\7\u008a\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0092\7\3\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0096\3\2"+
		"\2\2\u0093\u0095\7\u008a\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009c\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009b\5\22\n\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a3\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a2\5\30\r\2\u00a0\u00a2\5$\23\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a9\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\7\u008a\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\5\n\6\2\u00ad"+
		"\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b2\3\2\2\2\u00af\u00b1\7\u008a"+
		"\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\5 "+
		"\21\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bb\3\2\2\2\u00b8"+
		"\u00ba\7\u008a\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00c0\5*\26\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c4\3\2"+
		"\2\2\u00c1\u00c3\7\u008a\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00c9\5.\30\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\t\3\2\2\2\u00ca\u00cc\7\u008a\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d4\t\3\2\2\u00d1\u00d3\7\u008a\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\13\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\7\u008a\2\2\u00d8\u00d7\3"+
		"\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e1\t\4\2\2\u00de\u00e0\7\u008a"+
		"\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\r\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\7\u008a"+
		"\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ec\t\5"+
		"\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f0\3\2\2\2\u00ed"+
		"\u00ef\7\u008a\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f7\7\26\2\2\u00f4\u00f6\7\u008a\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fe\5\34\17\2\u00fb\u00fd\7\u008a\2\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u010f\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\7\u008a\2\2\u0102\u0101"+
		"\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u010b\7\27\2\2\u0108\u010a\7"+
		"\u008a\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2"+
		"\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u00e7"+
		"\3\2\2\2\u010e\u0104\3\2\2\2\u010f\17\3\2\2\2\u0110\u0112\7\u008a\2\2"+
		"\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u013e\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118\7\u008a\2"+
		"\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0120\7\30\2\2"+
		"\u011d\u011f\7\u008a\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0123\u0124\5\32\16\2\u0124\u0128\t\6\2\2\u0125\u0127\7\u008a\2\2"+
		"\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012d\7\4\2\2\u012c"+
		"\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0131\3\2\2\2\u012e\u0130\7\u008a"+
		"\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u013f\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u013f\7\33"+
		"\2\2\u0135\u013f\7\34\2\2\u0136\u013f\7\35\2\2\u0137\u013f\7\36\2\2\u0138"+
		"\u013f\7\37\2\2\u0139\u013f\7 \2\2\u013a\u013f\7!\2\2\u013b\u013f\7\""+
		"\2\2\u013c\u013f\7#\2\2\u013d\u013f\7$\2\2\u013e\u0119\3\2\2\2\u013e\u0134"+
		"\3\2\2\2\u013e\u0135\3\2\2\2\u013e\u0136\3\2\2\2\u013e\u0137\3\2\2\2\u013e"+
		"\u0138\3\2\2\2\u013e\u0139\3\2\2\2\u013e\u013a\3\2\2\2\u013e\u013b\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u0143\3\2\2\2\u0140"+
		"\u0142\7\u008a\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0148\5\4\3\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014c\3\2"+
		"\2\2\u0149\u014b\7\u008a\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\21\3\2\2\2\u014e\u014c\3\2\2"+
		"\2\u014f\u0151\7\u008a\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0155\u0157\7\3\2\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u015b\3\2\2\2\u0158\u015a\7\u008a\2\2\u0159\u0158\3\2\2\2\u015a\u015d"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0187\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u0188\5$\23\2\u015f\u0161\7\u008a\2\2\u0160\u015f"+
		"\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0167\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0168\5\36\20\2\u0166\u0168\7"+
		"%\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u016c\3\2\2\2\u0169"+
		"\u016b\7\u008a\2\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0173\3\2\2\2\u016e\u016c\3\2\2\2\u016f"+
		"\u0174\5\34\17\2\u0170\u0174\5\32\16\2\u0171\u0174\5\26\f\2\u0172\u0174"+
		"\5\20\t\2\u0173\u016f\3\2\2\2\u0173\u0170\3\2\2\2\u0173\u0171\3\2\2\2"+
		"\u0173\u0172\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0177\t\6\2\2\u0176\u0175"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017b\3\2\2\2\u0178\u017a\7\u008a\2"+
		"\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0180\5\4\3\2\u017f"+
		"\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0184\3\2\2\2\u0181\u0183\7\u008a"+
		"\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u015e\3\2"+
		"\2\2\u0187\u0162\3\2\2\2\u0188\u018c\3\2\2\2\u0189\u018b\7\u008a\2\2\u018a"+
		"\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\5\f\7\2\u0190"+
		"\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0195\3\2\2\2\u0192\u0194\7\u008a"+
		"\2\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\23\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a\7\u008a"+
		"\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u01a6\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a2\7\3"+
		"\2\2\u019f\u01a1\7\u008a\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a5\u01a7\5\36\20\2\u01a6\u019e\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01ab\3\2\2\2\u01a8\u01aa\7\u008a\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad"+
		"\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ae\u01b2\7&\2\2\u01af\u01b1\7\u008a\2\2\u01b0\u01af"+
		"\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b9\t\7\2\2\u01b6\u01b8\7\u008a"+
		"\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\25\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01be\7\u008a"+
		"\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c4\t\b"+
		"\2\2\u01c3\u01c5\t\6\2\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c9\3\2\2\2\u01c6\u01c8\7\u008a\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb"+
		"\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\27\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cc\u01ce\7\3\2\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2"+
		"\2\2\u01ce\u01d2\3\2\2\2\u01cf\u01d1\7\u008a\2\2\u01d0\u01cf\3\2\2\2\u01d1"+
		"\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01dc\3\2"+
		"\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01db\7)\2\2\u01d6\u01db\7*\2\2\u01d7\u01db"+
		"\7+\2\2\u01d8\u01db\7,\2\2\u01d9\u01db\5\24\13\2\u01da\u01d5\3\2\2\2\u01da"+
		"\u01d6\3\2\2\2\u01da\u01d7\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2"+
		"\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01e2\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e1\7\u008a\2\2\u01e0\u01df"+
		"\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e9\5\36\20\2\u01e6\u01e8\7"+
		"\u008a\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2"+
		"\u01e9\u01ea\3\2\2\2\u01ea\u01ee\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ef"+
		"\5\32\16\2\u01ed\u01ef\5\34\17\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2"+
		"\2\u01ef\u01f3\3\2\2\2\u01f0\u01f2\7\u008a\2\2\u01f1\u01f0\3\2\2\2\u01f2"+
		"\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f7\3\2"+
		"\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f8\t\6\2\2\u01f7\u01f6\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01fc\3\2\2\2\u01f9\u01fb\7\u008a\2\2\u01fa\u01f9"+
		"\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0201\5\f\7\2\u0200\u01ff\3\2"+
		"\2\2\u0200\u0201\3\2\2\2\u0201\u0205\3\2\2\2\u0202\u0204\7\u008a\2\2\u0203"+
		"\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020a\5\24\13\2\u0209"+
		"\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020e\3\2\2\2\u020b\u020d\7\u008a"+
		"\2\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0213\5\4"+
		"\3\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\31\3\2\2\2\u0214\u0216"+
		"\7\u008a\2\2\u0215\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2"+
		"\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021e"+
		"\t\t\2\2\u021b\u021d\7\u008a\2\2\u021c\u021b\3\2\2\2\u021d\u0220\3\2\2"+
		"\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\33\3\2\2\2\u0220\u021e"+
		"\3\2\2\2\u0221\u0223\7\u008a\2\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2\2"+
		"\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0224"+
		"\3\2\2\2\u0227\u022b\t\n\2\2\u0228\u022a\7\u008a\2\2\u0229\u0228\3\2\2"+
		"\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\35"+
		"\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0230\7\u008a\2\2\u022f\u022e\3\2\2"+
		"\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234"+
		"\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0238\t\13\2\2\u0235\u0237\7\u008a"+
		"\2\2\u0236\u0235\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u0239\37\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023d\7\u008a"+
		"\2\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u025a\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0243\7\3"+
		"\2\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0247\3\2\2\2\u0244"+
		"\u0246\7\u008a\2\2\u0245\u0244\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245"+
		"\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u024a"+
		"\u024e\7&\2\2\u024b\u024d\7\u008a\2\2\u024c\u024b\3\2\2\2\u024d\u0250"+
		"\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250"+
		"\u024e\3\2\2\2\u0251\u0255\5\"\22\2\u0252\u0254\7\u008a\2\2\u0253\u0252"+
		"\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0258\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u0259\5\30\r\2\u0259\u025b\3"+
		"\2\2\2\u025a\u0242\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025a\3\2\2\2\u025c"+
		"\u025d\3\2\2\2\u025d!\3\2\2\2\u025e\u0260\7\u008a\2\2\u025f\u025e\3\2"+
		"\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"\u0264\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0268\7\65\2\2\u0265\u0267\7"+
		"\u008a\2\2\u0266\u0265\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2"+
		"\u0268\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026f"+
		"\t\f\2\2\u026c\u026e\7\u008a\2\2\u026d\u026c\3\2\2\2\u026e\u0271\3\2\2"+
		"\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u026f"+
		"\3\2\2\2\u0272\u0273\7X\2\2\u0273#\3\2\2\2\u0274\u0276\7\u008a\2\2\u0275"+
		"\u0274\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2"+
		"\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027c\7\3\2\2\u027b"+
		"\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u0280\3\2\2\2\u027d\u027f\7\u008a"+
		"\2\2\u027e\u027d\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280"+
		"\u0281\3\2\2\2\u0281\u0283\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0287\5\36"+
		"\20\2\u0284\u0286\7\u008a\2\2\u0285\u0284\3\2\2\2\u0286\u0289\3\2\2\2"+
		"\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028a\3\2\2\2\u0289\u0287"+
		"\3\2\2\2\u028a\u028c\5&\24\2\u028b\u028d\t\6\2\2\u028c\u028b\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u0291\3\2\2\2\u028e\u0290\7\u008a\2\2\u028f\u028e"+
		"\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u0296\5(\25\2\u0295\u0294\3\2"+
		"\2\2\u0296\u0297\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u029c\3\2\2\2\u0299\u029b\7\u008a\2\2\u029a\u0299\3\2\2\2\u029b\u029e"+
		"\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a0\3\2\2\2\u029e"+
		"\u029c\3\2\2\2\u029f\u02a1\5\24\13\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3"+
		"\2\2\2\u02a1\u02a5\3\2\2\2\u02a2\u02a4\7\u008a\2\2\u02a3\u02a2\3\2\2\2"+
		"\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8"+
		"\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\5\4\3\2\u02a9%\3\2\2\2\u02aa"+
		"\u02ac\7\u008a\2\2\u02ab\u02aa\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab"+
		"\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0"+
		"\u02b4\t\r\2\2\u02b1\u02b3\7\u008a\2\2\u02b2\u02b1\3\2\2\2\u02b3\u02b6"+
		"\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\'\3\2\2\2\u02b6"+
		"\u02b4\3\2\2\2\u02b7\u02b9\7\u008a\2\2\u02b8\u02b7\3\2\2\2\u02b9\u02bc"+
		"\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\3\2\2\2\u02bc"+
		"\u02ba\3\2\2\2\u02bd\u02c1\t\16\2\2\u02be\u02c0\7\u008a\2\2\u02bf\u02be"+
		"\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02c6\7>\2\2\u02c5\u02c4\3\2"+
		"\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02ca\3\2\2\2\u02c7\u02c9\7\u008a\2\2\u02c8"+
		"\u02c7\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2"+
		"\2\2\u02cb)\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02d1\7?\2\2\u02ce\u02d0"+
		"\7\u008a\2\2\u02cf\u02ce\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2"+
		"\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d8"+
		"\7-\2\2\u02d5\u02d7\7\u008a\2\2\u02d6\u02d5\3\2\2\2\u02d7\u02da\3\2\2"+
		"\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db\3\2\2\2\u02da\u02d8"+
		"\3\2\2\2\u02db\u02df\5,\27\2\u02dc\u02de\7\u008a\2\2\u02dd\u02dc\3\2\2"+
		"\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e3"+
		"\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e4\5\4\3\2\u02e3\u02e2\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\u02e8\3\2\2\2\u02e5\u02e7\7\u008a\2\2\u02e6\u02e5"+
		"\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9"+
		"\u02f3\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02ef\7@\2\2\u02ec\u02ee\7\u008a"+
		"\2\2\u02ed\u02ec\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f4\t\17"+
		"\2\2\u02f3\u02eb\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4+\3\2\2\2\u02f5\u02f7"+
		"\7\u008a\2\2\u02f6\u02f5\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2\2"+
		"\2\u02f8\u02f9\3\2\2\2\u02f9\u031e\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb\u031f"+
		"\7O\2\2\u02fc\u02fe\7\u008a\2\2\u02fd\u02fc\3\2\2\2\u02fe\u0301\3\2\2"+
		"\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3\2\2\2\u0301\u02ff"+
		"\3\2\2\2\u0302\u0306\7C\2\2\u0303\u0305\7\u008a\2\2\u0304\u0303\3\2\2"+
		"\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0309"+
		"\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030d\5\36\20\2\u030a\u030c\7\u008a"+
		"\2\2\u030b\u030a\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u0310\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0314\7D"+
		"\2\2\u0311\u0313\7\u008a\2\2\u0312\u0311\3\2\2\2\u0313\u0316\3\2\2\2\u0314"+
		"\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u031f\3\2\2\2\u0316\u0314\3\2"+
		"\2\2\u0317\u031f\7\u0085\2\2\u0318\u031f\7\u0086\2\2\u0319\u031f\7b\2"+
		"\2\u031a\u031f\7\u0087\2\2\u031b\u031f\7U\2\2\u031c\u031f\7\u0088\2\2"+
		"\u031d\u031f\7\u0089\2\2\u031e\u02fb\3\2\2\2\u031e\u02ff\3\2\2\2\u031e"+
		"\u0317\3\2\2\2\u031e\u0318\3\2\2\2\u031e\u0319\3\2\2\2\u031e\u031a\3\2"+
		"\2\2\u031e\u031b\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031d\3\2\2\2\u031f"+
		"\u0321\3\2\2\2\u0320\u0322\t\6\2\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2"+
		"\2\2\u0322\u0326\3\2\2\2\u0323\u0325\7\u008a\2\2\u0324\u0323\3\2\2\2\u0325"+
		"\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327-\3\2\2\2"+
		"\u0328\u0326\3\2\2\2\u0329\u032b\7\u008a\2\2\u032a\u0329\3\2\2\2\u032b"+
		"\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u0330\3\2"+
		"\2\2\u032e\u032c\3\2\2\2\u032f\u0331\7E\2\2\u0330\u032f\3\2\2\2\u0330"+
		"\u0331\3\2\2\2\u0331\u0335\3\2\2\2\u0332\u0334\7\u008a\2\2\u0333\u0332"+
		"\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336"+
		"\u0338\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u033c\7F\2\2\u0339\u033b\7\u008a"+
		"\2\2\u033a\u0339\3\2\2\2\u033b\u033e\3\2\2\2\u033c\u033a\3\2\2\2\u033c"+
		"\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u033c\3\2\2\2\u033f\u0343\5\6"+
		"\4\2\u0340\u0342\7\u008a\2\2\u0341\u0340\3\2\2\2\u0342\u0345\3\2\2\2\u0343"+
		"\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344/\3\2\2\2\u0345\u0343\3\2\2\2"+
		"\u0091\638?FJMRX_bgntx}\u0084\u0088\u008d\u0091\u0096\u009c\u00a1\u00a3"+
		"\u00a9\u00ad\u00b2\u00b6\u00bb\u00bf\u00c4\u00c8\u00cd\u00d4\u00da\u00e1"+
		"\u00e7\u00eb\u00f0\u00f7\u00fe\u0104\u010b\u010e\u0113\u0119\u0120\u0128"+
		"\u012c\u0131\u013e\u0143\u0147\u014c\u0152\u0156\u015b\u0162\u0167\u016c"+
		"\u0173\u0176\u017b\u017f\u0184\u0187\u018c\u0190\u0195\u019b\u01a2\u01a6"+
		"\u01ab\u01b2\u01b9\u01bf\u01c4\u01c9\u01cd\u01d2\u01da\u01dc\u01e2\u01e9"+
		"\u01ee\u01f3\u01f7\u01fc\u0200\u0205\u0209\u020e\u0212\u0217\u021e\u0224"+
		"\u022b\u0231\u0238\u023e\u0242\u0247\u024e\u0255\u025c\u0261\u0268\u026f"+
		"\u0277\u027b\u0280\u0287\u028c\u0291\u0297\u029c\u02a0\u02a5\u02ad\u02b4"+
		"\u02ba\u02c1\u02c5\u02ca\u02d1\u02d8\u02df\u02e3\u02e8\u02ef\u02f3\u02f8"+
		"\u02ff\u0306\u030d\u0314\u031e\u0321\u0326\u032c\u0330\u0335\u033c\u0343";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}