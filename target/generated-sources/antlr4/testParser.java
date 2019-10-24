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
		PALLET=60, ENDORSE=61, BAR=62, BARRULET=63, HAMADE=64, RIBBON=65, BATON=66, 
		BendletSinister=67, LOZENGE=68, BILLET=69, ROUNDEL=70, LABEL=71, FRET=72, 
		HorsesHead=73, TORTEAUX=74, ROSE=75, SPEAR=76, SHELL=77, QUARTER=78, CANTON=79, 
		FLAUNCH=80, GORE=81, GYRON=82, ORLE=83, ESCUTCHEON=84, FUSIL=85, MASCLE=86, 
		RUSTRE=87, ANNULET=88, FESS=89, PALE=90, BEND=91, BendSinister=92, SALTIRE=93, 
		CROSS=94, QUARTERLY=95, CHEVRON=96, PALL=97, CRESCENT=98, BORDURE=99, 
		PILE=100, LION=101, TYGER=102, BengalTiger=103, LEOPARD=104, FOX=105, 
		WOLF=106, BEAR=107, BADGER=108, OTTER=109, THYLACINE=110, PANTHER=111, 
		CAT=112, HOUND=113, WEASEL=114, ANTELOPE=115, COW=116, CAMEL=117, DEER=118, 
		ELEPHANT=119, HIPPOPOTAMUS=120, RHINOCEROS=121, SWINE=122, SHEEP=123, 
		MULLET=124, MARTLET=125, FleurDeLys=126, CrossMoline=127, DoubleQuatrefoil=128, 
		WS=129;
	public static final int
		RULE_blazon = 0, RULE_tincture = 1, RULE_tinctureNames = 2, RULE_complexField = 3, 
		RULE_fieldPosition = 4, RULE_ordinaryPosition = 5, RULE_escutcheonLocations = 6, 
		RULE_direction = 7, RULE_coatDivision = 8, RULE_seme = 9, RULE_ordinary = 10, 
		RULE_diminutiveNames = 11, RULE_charges = 12, RULE_subordinary = 13, RULE_ordinaryNames = 14, 
		RULE_number = 15, RULE_animal = 16, RULE_animalNames = 17, RULE_animalPosition = 18, 
		RULE_cadency = 19, RULE_cadencyNames = 20;
	public static final String[] ruleNames = {
		"blazon", "tincture", "tinctureNames", "complexField", "fieldPosition", 
		"ordinaryPosition", "escutcheonLocations", "direction", "coatDivision", 
		"seme", "ordinary", "diminutiveNames", "charges", "subordinary", "ordinaryNames", 
		"number", "animal", "animalNames", "animalPosition", "cadency", "cadencyNames"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "','", "'of the field'", "'Argent'", "'Or'", "'Gules'", 
		"'Sable'", "'Azure'", "'Vert'", "'Purpure'", "'Murrey'", "'Sanguine'", 
		"'Tenne'", "'over all'", "'on a '", "'in'", "'chief'", "'base'", "'dexter'", 
		"'sinister'", "'palewise'", "'fesswise'", "'party'", "'parted'", "'per'", 
		"'seme of'", "'s'", "'es'", "'semy-de-lis'", "'crusily'", "'bezante'", 
		"'plate'", "'billete'", "'annulletty'", "'etincelle'", "'gouttee'", "'tortelly'", 
		"'debruised by'", "'between'", "'a'", "'an'", "'as many'", "'one'", "'two'", 
		"'three'", "'four'", "'five'", "'rampant'", "'segreant'", "'passant'", 
		"'statant'", "'tripant'", "'guardant'", "'with'", "'for'", "'difference'", 
		"'distinction'", "'label of'", "'points'", "'pallet'", "'endorse'", "'bar'", 
		"'barrulet'", "'hamade'", "'ribbon'", "'baton'", "'bendlet sinister'", 
		"'lozenge'", "'billet'", "'roundel'", "'label'", "'fret'", "'horses' head'", 
		"'torteaux'", "'rose'", "'spear'", "'shell'", "'quarter'", "'canton'", 
		"'flaunch'", "'gore'", "'gyron'", "'orle'", "'escutcheon'", "'fusil'", 
		"'mascle'", "'rustre'", "'annulet'", "'fess'", "'pale'", "'bend'", null, 
		"'saltire'", "'cross'", null, "'chevron'", "'pall'", "'crescent'", "'bordure'", 
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
		"PALLET", "ENDORSE", "BAR", "BARRULET", "HAMADE", "RIBBON", "BATON", "BendletSinister", 
		"LOZENGE", "BILLET", "ROUNDEL", "LABEL", "FRET", "HorsesHead", "TORTEAUX", 
		"ROSE", "SPEAR", "SHELL", "QUARTER", "CANTON", "FLAUNCH", "GORE", "GYRON", 
		"ORLE", "ESCUTCHEON", "FUSIL", "MASCLE", "RUSTRE", "ANNULET", "FESS", 
		"PALE", "BEND", "BendSinister", "SALTIRE", "CROSS", "QUARTERLY", "CHEVRON", 
		"PALL", "CRESCENT", "BORDURE", "PILE", "LION", "TYGER", "BengalTiger", 
		"LEOPARD", "FOX", "WOLF", "BEAR", "BADGER", "OTTER", "THYLACINE", "PANTHER", 
		"CAT", "HOUND", "WEASEL", "ANTELOPE", "COW", "CAMEL", "DEER", "ELEPHANT", 
		"HIPPOPOTAMUS", "RHINOCEROS", "SWINE", "SHEEP", "MULLET", "MARTLET", "FleurDeLys", 
		"CrossMoline", "DoubleQuatrefoil", "WS"
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
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				tincture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				seme();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
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
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(47);
				tinctureNames();
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(48);
					match(T__0);
					setState(49);
					tinctureNames();
					}
					break;
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(52);
					match(T__1);
					}
				}

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		public CoatDivisionContext coatDivision() {
			return getRuleContext(CoatDivisionContext.class,0);
		}
		public SemeContext seme() {
			return getRuleContext(SemeContext.class,0);
		}
		public List<FieldPositionContext> fieldPosition() {
			return getRuleContexts(FieldPositionContext.class);
		}
		public FieldPositionContext fieldPosition(int i) {
			return getRuleContext(FieldPositionContext.class,i);
		}
		public List<OrdinaryContext> ordinary() {
			return getRuleContexts(OrdinaryContext.class);
		}
		public OrdinaryContext ordinary(int i) {
			return getRuleContext(OrdinaryContext.class,i);
		}
		public CadencyContext cadency() {
			return getRuleContext(CadencyContext.class,0);
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) {
				{
				setState(60);
				coatDivision();
				}
			}

			setState(63);
			tincture();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) {
				{
				setState(64);
				seme();
				}
			}

			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(67);
				fieldPosition();
				}
				break;
			}
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(70);
				match(T__0);
				}
				break;
			}
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(73);
					ordinary();
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(79);
				fieldPosition();
				}
			}

			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39 || _la==T__53) {
				{
				setState(82);
				cadency();
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

	public static class FieldPositionContext extends ParserRuleContext {
		public OrdinaryContext ordinary() {
			return getRuleContext(OrdinaryContext.class,0);
		}
		public OrdinaryNamesContext ordinaryNames() {
			return getRuleContext(OrdinaryNamesContext.class,0);
		}
		public TinctureContext tincture() {
			return getRuleContext(TinctureContext.class,0);
		}
		public ChargesContext charges() {
			return getRuleContext(ChargesContext.class,0);
		}
		public FieldPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterFieldPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitFieldPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitFieldPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldPositionContext fieldPosition() throws RecognitionException {
		FieldPositionContext _localctx = new FieldPositionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldPosition);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__13);
				setState(86);
				ordinary();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(87);
				match(T__14);
				setState(88);
				ordinaryNames();
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					setState(89);
					tincture();
					}
				}

				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(92);
					charges();
					}
					break;
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 10, RULE_ordinaryPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(97);
				match(T__0);
				setState(98);
				number();
				}
			}

			setState(101);
			match(T__15);
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17 || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (FESS - 89)) | (1L << (PALE - 89)) | (1L << (BEND - 89)) | (1L << (CHEVRON - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 12, RULE_escutcheonLocations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 14, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 16, RULE_coatDivision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22 || _la==T__23) {
				{
				setState(108);
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

			setState(111);
			match(T__24);
			setState(112);
			ordinaryNames();
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
		enterRule(_localctx, 18, RULE_seme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				{
				{
				setState(114);
				match(T__25);
				setState(115);
				subordinary();
				setState(116);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case T__28:
				{
				setState(118);
				match(T__28);
				}
				break;
			case T__29:
				{
				setState(119);
				match(T__29);
				}
				break;
			case T__30:
				{
				setState(120);
				match(T__30);
				}
				break;
			case T__31:
				{
				setState(121);
				match(T__31);
				}
				break;
			case T__32:
				{
				setState(122);
				match(T__32);
				}
				break;
			case T__33:
				{
				setState(123);
				match(T__33);
				}
				break;
			case T__34:
				{
				setState(124);
				match(T__34);
				}
				break;
			case T__35:
				{
				setState(125);
				match(T__35);
				}
				break;
			case T__36:
				{
				setState(126);
				match(T__36);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				setState(129);
				tincture();
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

	public static class OrdinaryContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<AnimalContext> animal() {
			return getRuleContexts(AnimalContext.class);
		}
		public AnimalContext animal(int i) {
			return getRuleContext(AnimalContext.class,i);
		}
		public DiminutiveNamesContext diminutiveNames() {
			return getRuleContext(DiminutiveNamesContext.class,0);
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
		public ChargesContext charges() {
			return getRuleContext(ChargesContext.class,0);
		}
		public EscutcheonLocationsContext escutcheonLocations() {
			return getRuleContext(EscutcheonLocationsContext.class,0);
		}
		public OrdinaryNamesContext ordinaryNames() {
			return getRuleContext(OrdinaryNamesContext.class,0);
		}
		public SubordinaryContext subordinary() {
			return getRuleContext(SubordinaryContext.class,0);
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
		enterRule(_localctx, 20, RULE_ordinary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__15) {
				{
				setState(132);
				ordinaryPosition();
				}
			}

			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(135);
				number();
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(136);
					ordinaryNames();
					}
					break;
				case 2:
					{
					setState(137);
					subordinary();
					}
					break;
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26 || _la==T__27) {
					{
					setState(140);
					_la = _input.LA(1);
					if ( !(_la==T__26 || _la==T__27) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					setState(143);
					tincture();
					}
				}

				}
				break;
			case 2:
				{
				setState(146);
				animal();
				}
				break;
			case 3:
				{
				setState(147);
				diminutiveNames();
				}
				break;
			}
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20 || _la==T__21) {
				{
				setState(150);
				direction();
				}
			}

			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(153);
				ordinaryPosition();
				}
				break;
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(156);
				match(T__37);
				}
			}

			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(159);
				charges();
				}
				break;
			case 2:
				{
				setState(160);
				animal();
				}
				break;
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18 || _la==T__19) {
				{
				setState(163);
				escutcheonLocations();
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

	public static class DiminutiveNamesContext extends ParserRuleContext {
		public TerminalNode PALLET() { return getToken(testParser.PALLET, 0); }
		public TerminalNode ENDORSE() { return getToken(testParser.ENDORSE, 0); }
		public TerminalNode BAR() { return getToken(testParser.BAR, 0); }
		public TerminalNode BARRULET() { return getToken(testParser.BARRULET, 0); }
		public TerminalNode HAMADE() { return getToken(testParser.HAMADE, 0); }
		public TerminalNode RIBBON() { return getToken(testParser.RIBBON, 0); }
		public TerminalNode BATON() { return getToken(testParser.BATON, 0); }
		public TerminalNode BendletSinister() { return getToken(testParser.BendletSinister, 0); }
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
		enterRule(_localctx, 22, RULE_diminutiveNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (PALLET - 60)) | (1L << (ENDORSE - 60)) | (1L << (BAR - 60)) | (1L << (BARRULET - 60)) | (1L << (HAMADE - 60)) | (1L << (RIBBON - 60)) | (1L << (BATON - 60)) | (1L << (BendletSinister - 60)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26 || _la==T__27) {
				{
				setState(167);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
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

	public static class ChargesContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SubordinaryContext subordinary() {
			return getRuleContext(SubordinaryContext.class,0);
		}
		public TinctureContext tincture() {
			return getRuleContext(TinctureContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public List<OrdinaryPositionContext> ordinaryPosition() {
			return getRuleContexts(OrdinaryPositionContext.class);
		}
		public OrdinaryPositionContext ordinaryPosition(int i) {
			return getRuleContext(OrdinaryPositionContext.class,i);
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
		enterRule(_localctx, 24, RULE_charges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(170);
				match(T__38);
				}
			}

			setState(173);
			number();
			setState(174);
			subordinary();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26 || _la==T__27) {
				{
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20 || _la==T__21) {
				{
				setState(178);
				direction();
				}
			}

			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__15) {
				{
				{
				setState(181);
				ordinaryPosition();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
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

	public static class SubordinaryContext extends ParserRuleContext {
		public TerminalNode LOZENGE() { return getToken(testParser.LOZENGE, 0); }
		public TerminalNode BILLET() { return getToken(testParser.BILLET, 0); }
		public TerminalNode ANNULET() { return getToken(testParser.ANNULET, 0); }
		public TerminalNode ROUNDEL() { return getToken(testParser.ROUNDEL, 0); }
		public TerminalNode LABEL() { return getToken(testParser.LABEL, 0); }
		public TerminalNode FRET() { return getToken(testParser.FRET, 0); }
		public TerminalNode BATON() { return getToken(testParser.BATON, 0); }
		public TerminalNode HorsesHead() { return getToken(testParser.HorsesHead, 0); }
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
		enterRule(_localctx, 26, RULE_subordinary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BATON - 66)) | (1L << (LOZENGE - 66)) | (1L << (BILLET - 66)) | (1L << (ROUNDEL - 66)) | (1L << (LABEL - 66)) | (1L << (FRET - 66)) | (1L << (HorsesHead - 66)) | (1L << (TORTEAUX - 66)) | (1L << (ROSE - 66)) | (1L << (SPEAR - 66)) | (1L << (SHELL - 66)) | (1L << (QUARTER - 66)) | (1L << (CANTON - 66)) | (1L << (FLAUNCH - 66)) | (1L << (GORE - 66)) | (1L << (GYRON - 66)) | (1L << (ORLE - 66)) | (1L << (ESCUTCHEON - 66)) | (1L << (FUSIL - 66)) | (1L << (MASCLE - 66)) | (1L << (RUSTRE - 66)) | (1L << (ANNULET - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		public TerminalNode QUARTERLY() { return getToken(testParser.QUARTERLY, 0); }
		public TerminalNode CHEVRON() { return getToken(testParser.CHEVRON, 0); }
		public TerminalNode PALL() { return getToken(testParser.PALL, 0); }
		public TerminalNode CRESCENT() { return getToken(testParser.CRESCENT, 0); }
		public TerminalNode TORTEAUX() { return getToken(testParser.TORTEAUX, 0); }
		public TerminalNode BORDURE() { return getToken(testParser.BORDURE, 0); }
		public TerminalNode PILE() { return getToken(testParser.PILE, 0); }
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
		enterRule(_localctx, 28, RULE_ordinaryNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (TORTEAUX - 74)) | (1L << (FESS - 74)) | (1L << (PALE - 74)) | (1L << (BEND - 74)) | (1L << (BendSinister - 74)) | (1L << (SALTIRE - 74)) | (1L << (CROSS - 74)) | (1L << (QUARTERLY - 74)) | (1L << (CHEVRON - 74)) | (1L << (PALL - 74)) | (1L << (CRESCENT - 74)) | (1L << (BORDURE - 74)) | (1L << (PILE - 74)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 30, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 32, RULE_animal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			number();
			setState(196);
			animalNames();
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				animalPosition();
				}
				}
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52))) != 0) );
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__15) {
				{
				setState(202);
				ordinaryPosition();
				}
			}

			setState(205);
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
		enterRule(_localctx, 34, RULE_animalNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (LION - 101)) | (1L << (TYGER - 101)) | (1L << (BengalTiger - 101)) | (1L << (LEOPARD - 101)) | (1L << (FOX - 101)) | (1L << (WOLF - 101)) | (1L << (BEAR - 101)) | (1L << (BADGER - 101)) | (1L << (OTTER - 101)) | (1L << (THYLACINE - 101)) | (1L << (PANTHER - 101)) | (1L << (CAT - 101)) | (1L << (HOUND - 101)) | (1L << (WEASEL - 101)) | (1L << (ANTELOPE - 101)) | (1L << (COW - 101)) | (1L << (CAMEL - 101)) | (1L << (DEER - 101)) | (1L << (ELEPHANT - 101)) | (1L << (HIPPOPOTAMUS - 101)) | (1L << (RHINOCEROS - 101)) | (1L << (SWINE - 101)) | (1L << (SHEEP - 101)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 36, RULE_animalPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 38, RULE_cadency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__53) {
				{
				setState(211);
				match(T__53);
				}
			}

			setState(214);
			match(T__39);
			setState(215);
			cadencyNames();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				setState(216);
				tincture();
				}
			}

			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__54) {
				{
				setState(219);
				match(T__54);
				setState(220);
				_la = _input.LA(1);
				if ( !(_la==T__55 || _la==T__56) ) {
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
		public TerminalNode LOZENGE() { return getToken(testParser.LOZENGE, 0); }
		public TerminalNode CRESCENT() { return getToken(testParser.CRESCENT, 0); }
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
		enterRule(_localctx, 40, RULE_cadencyNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOZENGE:
				{
				setState(223);
				match(LOZENGE);
				}
				break;
			case T__57:
				{
				{
				setState(224);
				match(T__57);
				setState(225);
				number();
				setState(226);
				match(T__58);
				}
				}
				break;
			case CRESCENT:
				{
				setState(228);
				match(CRESCENT);
				}
				break;
			case MULLET:
				{
				setState(229);
				match(MULLET);
				}
				break;
			case MARTLET:
				{
				setState(230);
				match(MARTLET);
				}
				break;
			case ANNULET:
				{
				setState(231);
				match(ANNULET);
				}
				break;
			case FleurDeLys:
				{
				setState(232);
				match(FleurDeLys);
				}
				break;
			case ROSE:
				{
				setState(233);
				match(ROSE);
				}
				break;
			case CrossMoline:
				{
				setState(234);
				match(CrossMoline);
				}
				break;
			case DoubleQuatrefoil:
				{
				setState(235);
				match(DoubleQuatrefoil);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26 || _la==T__27) {
				{
				setState(238);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0083\u00f4\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\5\2\60\n\2\3\3\3"+
		"\3\3\3\5\3\65\n\3\3\3\5\38\n\3\3\3\5\3;\n\3\3\4\3\4\3\5\5\5@\n\5\3\5\3"+
		"\5\5\5D\n\5\3\5\5\5G\n\5\3\5\5\5J\n\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\5"+
		"\5\5S\n\5\3\5\5\5V\n\5\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\6\5\6`\n\6\5\6b"+
		"\n\6\3\7\3\7\5\7f\n\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\5\np\n\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0082\n\13\3\13\5\13\u0085\n\13\3\f\5\f\u0088\n\f\3\f\3\f\3\f\5"+
		"\f\u008d\n\f\3\f\5\f\u0090\n\f\3\f\5\f\u0093\n\f\3\f\3\f\5\f\u0097\n\f"+
		"\3\f\5\f\u009a\n\f\3\f\5\f\u009d\n\f\3\f\5\f\u00a0\n\f\3\f\3\f\5\f\u00a4"+
		"\n\f\3\f\5\f\u00a7\n\f\3\r\3\r\5\r\u00ab\n\r\3\16\5\16\u00ae\n\16\3\16"+
		"\3\16\3\16\5\16\u00b3\n\16\3\16\5\16\u00b6\n\16\3\16\7\16\u00b9\n\16\f"+
		"\16\16\16\u00bc\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\6\22\u00c9\n\22\r\22\16\22\u00ca\3\22\5\22\u00ce\n\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\5\25\u00d7\n\25\3\25\3\25\3\25\5\25\u00dc\n"+
		"\25\3\25\3\25\5\25\u00e0\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00ef\n\26\3\26\5\26\u00f2\n\26\3\26\2"+
		"\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\17\3\2\6\17\5\2"+
		"\23\24[]bb\3\2\25\26\3\2\27\30\3\2\31\32\3\2\35\36\3\2>E\4\2DDFZ\4\2L"+
		"L[f\3\2*\61\3\2g}\3\2\62\67\3\2:;\2\u0119\2/\3\2\2\2\4:\3\2\2\2\6<\3\2"+
		"\2\2\b?\3\2\2\2\na\3\2\2\2\fe\3\2\2\2\16j\3\2\2\2\20l\3\2\2\2\22o\3\2"+
		"\2\2\24\u0081\3\2\2\2\26\u0087\3\2\2\2\30\u00a8\3\2\2\2\32\u00ad\3\2\2"+
		"\2\34\u00bf\3\2\2\2\36\u00c1\3\2\2\2 \u00c3\3\2\2\2\"\u00c5\3\2\2\2$\u00d1"+
		"\3\2\2\2&\u00d3\3\2\2\2(\u00d6\3\2\2\2*\u00ee\3\2\2\2,\60\5\4\3\2-\60"+
		"\5\24\13\2.\60\5\b\5\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\3\3\2\2\2\61\64"+
		"\5\6\4\2\62\63\7\3\2\2\63\65\5\6\4\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67"+
		"\3\2\2\2\668\7\4\2\2\67\66\3\2\2\2\678\3\2\2\28;\3\2\2\29;\7\5\2\2:\61"+
		"\3\2\2\2:9\3\2\2\2;\5\3\2\2\2<=\t\2\2\2=\7\3\2\2\2>@\5\22\n\2?>\3\2\2"+
		"\2?@\3\2\2\2@A\3\2\2\2AC\5\4\3\2BD\5\24\13\2CB\3\2\2\2CD\3\2\2\2DF\3\2"+
		"\2\2EG\5\n\6\2FE\3\2\2\2FG\3\2\2\2GI\3\2\2\2HJ\7\3\2\2IH\3\2\2\2IJ\3\2"+
		"\2\2JN\3\2\2\2KM\5\26\f\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3"+
		"\2\2\2PN\3\2\2\2QS\5\n\6\2RQ\3\2\2\2RS\3\2\2\2SU\3\2\2\2TV\5(\25\2UT\3"+
		"\2\2\2UV\3\2\2\2V\t\3\2\2\2WX\7\20\2\2Xb\5\26\f\2YZ\7\21\2\2Z\\\5\36\20"+
		"\2[]\5\4\3\2\\[\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^`\5\32\16\2_^\3\2\2\2_`\3"+
		"\2\2\2`b\3\2\2\2aW\3\2\2\2aY\3\2\2\2b\13\3\2\2\2cd\7\3\2\2df\5 \21\2e"+
		"c\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\22\2\2hi\t\3\2\2i\r\3\2\2\2jk\t\4\2"+
		"\2k\17\3\2\2\2lm\t\5\2\2m\21\3\2\2\2np\t\6\2\2on\3\2\2\2op\3\2\2\2pq\3"+
		"\2\2\2qr\7\33\2\2rs\5\36\20\2s\23\3\2\2\2tu\7\34\2\2uv\5\34\17\2vw\t\7"+
		"\2\2w\u0082\3\2\2\2x\u0082\7\37\2\2y\u0082\7 \2\2z\u0082\7!\2\2{\u0082"+
		"\7\"\2\2|\u0082\7#\2\2}\u0082\7$\2\2~\u0082\7%\2\2\177\u0082\7&\2\2\u0080"+
		"\u0082\7\'\2\2\u0081t\3\2\2\2\u0081x\3\2\2\2\u0081y\3\2\2\2\u0081z\3\2"+
		"\2\2\u0081{\3\2\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0085\5\4\3"+
		"\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\25\3\2\2\2\u0086\u0088"+
		"\5\f\7\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0096\3\2\2\2\u0089"+
		"\u008c\5 \21\2\u008a\u008d\5\36\20\2\u008b\u008d\5\34\17\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0090\t\7\2\2\u008f"+
		"\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0093\5\4"+
		"\3\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0097\3\2\2\2\u0094"+
		"\u0097\5\"\22\2\u0095\u0097\5\30\r\2\u0096\u0089\3\2\2\2\u0096\u0094\3"+
		"\2\2\2\u0096\u0095\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a\5\20\t\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u009d\5\f"+
		"\7\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u00a0\7(\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a3\3\2"+
		"\2\2\u00a1\u00a4\5\32\16\2\u00a2\u00a4\5\"\22\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a7\5\16"+
		"\b\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\27\3\2\2\2\u00a8\u00aa"+
		"\t\b\2\2\u00a9\u00ab\t\7\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\31\3\2\2\2\u00ac\u00ae\7)\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00b0\5 \21\2\u00b0\u00b2\5\34\17\2\u00b1\u00b3"+
		"\t\7\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b6\5\20\t\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00ba\3"+
		"\2\2\2\u00b7\u00b9\5\f\7\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00be\5\4\3\2\u00be\33\3\2\2\2\u00bf\u00c0\t\t\2\2\u00c0\35"+
		"\3\2\2\2\u00c1\u00c2\t\n\2\2\u00c2\37\3\2\2\2\u00c3\u00c4\t\13\2\2\u00c4"+
		"!\3\2\2\2\u00c5\u00c6\5 \21\2\u00c6\u00c8\5$\23\2\u00c7\u00c9\5&\24\2"+
		"\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ce\5\f\7\2\u00cd\u00cc\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\5\4\3\2\u00d0#\3\2\2\2"+
		"\u00d1\u00d2\t\f\2\2\u00d2%\3\2\2\2\u00d3\u00d4\t\r\2\2\u00d4\'\3\2\2"+
		"\2\u00d5\u00d7\78\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d9\7*\2\2\u00d9\u00db\5*\26\2\u00da\u00dc\5\4\3\2\u00db"+
		"\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00de\79"+
		"\2\2\u00de\u00e0\t\16\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		")\3\2\2\2\u00e1\u00ef\7F\2\2\u00e2\u00e3\7<\2\2\u00e3\u00e4\5 \21\2\u00e4"+
		"\u00e5\7=\2\2\u00e5\u00ef\3\2\2\2\u00e6\u00ef\7d\2\2\u00e7\u00ef\7~\2"+
		"\2\u00e8\u00ef\7\177\2\2\u00e9\u00ef\7Z\2\2\u00ea\u00ef\7\u0080\2\2\u00eb"+
		"\u00ef\7M\2\2\u00ec\u00ef\7\u0081\2\2\u00ed\u00ef\7\u0082\2\2\u00ee\u00e1"+
		"\3\2\2\2\u00ee\u00e2\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ee"+
		"\u00e8\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00eb\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00f2\t\7\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2+\3\2\2\2"+
		"*/\64\67:?CFINRU\\_aeo\u0081\u0084\u0087\u008c\u008f\u0092\u0096\u0099"+
		"\u009c\u009f\u00a3\u00a6\u00aa\u00ad\u00b2\u00b5\u00ba\u00ca\u00cd\u00d6"+
		"\u00db\u00df\u00ee\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}