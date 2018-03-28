// Generated from C:/Users/Julio/Desktop/Estudios/UVG/2018/Primer Semestre/Base de Datos/proyecto1\gramaticaProyecto.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaProyectoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		CHAR=10, SAYS=11, SHOUTS=12, WORD=13, WHITESPACE=14, NEWLINE=15, TEXT=16;
	public static final int
		RULE_prule = 0, RULE_chat = 1, RULE_line = 2, RULE_message = 3, RULE_name = 4, 
		RULE_command = 5, RULE_emoticon = 6, RULE_link = 7, RULE_color = 8, RULE_mention = 9;
	public static final String[] ruleNames = {
		"prule", "chat", "line", "message", "name", "command", "emoticon", "link", 
		"color", "mention"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'create database '", "':'", "'-'", "')'", "'('", "'['", "']'", 
		"'/'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "CHAR", "SAYS", 
		"SHOUTS", "WORD", "WHITESPACE", "NEWLINE", "TEXT"
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
	public String getGrammarFileName() { return "gramaticaProyecto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaProyectoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PruleContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(gramaticaProyectoParser.CHAR, 0); }
		public PruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).enterPrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).exitPrule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaProyectoVisitor ) return ((gramaticaProyectoVisitor<? extends T>)visitor).visitPrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PruleContext prule() throws RecognitionException {
		PruleContext _localctx = new PruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			match(CHAR);
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

	public static class ChatContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(gramaticaProyectoParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ChatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).enterChat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).exitChat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaProyectoVisitor ) return ((gramaticaProyectoVisitor<? extends T>)visitor).visitChat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChatContext chat() throws RecognitionException {
		ChatContext _localctx = new ChatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_chat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				line();
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(28);
			match(EOF);
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

	public static class LineContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(gramaticaProyectoParser.NEWLINE, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaProyectoVisitor ) return ((gramaticaProyectoVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			name();
			setState(31);
			command();
			setState(32);
			message();
			setState(33);
			match(NEWLINE);
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

	public static class MessageContext extends ParserRuleContext {
		public List<EmoticonContext> emoticon() {
			return getRuleContexts(EmoticonContext.class);
		}
		public EmoticonContext emoticon(int i) {
			return getRuleContext(EmoticonContext.class,i);
		}
		public List<LinkContext> link() {
			return getRuleContexts(LinkContext.class);
		}
		public LinkContext link(int i) {
			return getRuleContext(LinkContext.class,i);
		}
		public List<ColorContext> color() {
			return getRuleContexts(ColorContext.class);
		}
		public ColorContext color(int i) {
			return getRuleContext(ColorContext.class,i);
		}
		public List<MentionContext> mention() {
			return getRuleContexts(MentionContext.class);
		}
		public MentionContext mention(int i) {
			return getRuleContext(MentionContext.class,i);
		}
		public List<TerminalNode> WORD() { return getTokens(gramaticaProyectoParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(gramaticaProyectoParser.WORD, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(gramaticaProyectoParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(gramaticaProyectoParser.WHITESPACE, i);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).exitMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaProyectoVisitor ) return ((gramaticaProyectoVisitor<? extends T>)visitor).visitMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_message);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(41);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(35);
						emoticon();
						}
						break;
					case T__5:
						{
						setState(36);
						link();
						}
						break;
					case T__7:
						{
						setState(37);
						color();
						}
						break;
					case T__8:
						{
						setState(38);
						mention();
						}
						break;
					case WORD:
						{
						setState(39);
						match(WORD);
						}
						break;
					case WHITESPACE:
						{
						setState(40);
						match(WHITESPACE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(gramaticaProyectoParser.WORD, 0); }
		public TerminalNode WHITESPACE() { return getToken(gramaticaProyectoParser.WHITESPACE, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaProyectoVisitor ) return ((gramaticaProyectoVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(WORD);
			setState(46);
			match(WHITESPACE);
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(gramaticaProyectoParser.WHITESPACE, 0); }
		public TerminalNode SAYS() { return getToken(gramaticaProyectoParser.SAYS, 0); }
		public TerminalNode SHOUTS() { return getToken(gramaticaProyectoParser.SHOUTS, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaProyectoVisitor ) return ((gramaticaProyectoVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==SAYS || _la==SHOUTS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(49);
			match(T__1);
			setState(50);
			match(WHITESPACE);
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

	public static class EmoticonContext extends ParserRuleContext {
		public EmoticonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emoticon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).enterEmoticon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).exitEmoticon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaProyectoVisitor ) return ((gramaticaProyectoVisitor<? extends T>)visitor).visitEmoticon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmoticonContext emoticon() throws RecognitionException {
		EmoticonContext _localctx = new EmoticonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_emoticon);
		int _la;
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__1);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(53);
					match(T__2);
					}
				}

				setState(56);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(T__1);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(58);
					match(T__2);
					}
				}

				setState(61);
				match(T__4);
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

	public static class LinkContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(gramaticaProyectoParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(gramaticaProyectoParser.TEXT, i);
		}
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).exitLink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaProyectoVisitor ) return ((gramaticaProyectoVisitor<? extends T>)visitor).visitLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__5);
			setState(65);
			match(TEXT);
			setState(66);
			match(T__6);
			setState(67);
			match(T__4);
			setState(68);
			match(TEXT);
			setState(69);
			match(T__3);
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(gramaticaProyectoParser.WORD, 0); }
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaProyectoVisitor ) return ((gramaticaProyectoVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__7);
			setState(72);
			match(WORD);
			setState(73);
			match(T__7);
			setState(74);
			message();
			setState(75);
			match(T__7);
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

	public static class MentionContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(gramaticaProyectoParser.WORD, 0); }
		public MentionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mention; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).enterMention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaProyectoListener ) ((gramaticaProyectoListener)listener).exitMention(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaProyectoVisitor ) return ((gramaticaProyectoVisitor<? extends T>)visitor).visitMention(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MentionContext mention() throws RecognitionException {
		MentionContext _localctx = new MentionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mention);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__8);
			setState(78);
			match(WORD);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22S\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\3\6\3\33\n\3\r\3\16\3\34\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\6\5,\n\5\r\5\16\5-\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\5\b9\n\b\3\b\3\b\3\b\5\b>\n\b\3\b\5\bA\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f"+
		"\16\20\22\24\2\3\3\2\r\16\2R\2\26\3\2\2\2\4\32\3\2\2\2\6 \3\2\2\2\b+\3"+
		"\2\2\2\n/\3\2\2\2\f\62\3\2\2\2\16@\3\2\2\2\20B\3\2\2\2\22I\3\2\2\2\24"+
		"O\3\2\2\2\26\27\7\3\2\2\27\30\7\f\2\2\30\3\3\2\2\2\31\33\5\6\4\2\32\31"+
		"\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37"+
		"\7\2\2\3\37\5\3\2\2\2 !\5\n\6\2!\"\5\f\7\2\"#\5\b\5\2#$\7\21\2\2$\7\3"+
		"\2\2\2%,\5\16\b\2&,\5\20\t\2\',\5\22\n\2(,\5\24\13\2),\7\17\2\2*,\7\20"+
		"\2\2+%\3\2\2\2+&\3\2\2\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,-\3"+
		"\2\2\2-+\3\2\2\2-.\3\2\2\2.\t\3\2\2\2/\60\7\17\2\2\60\61\7\20\2\2\61\13"+
		"\3\2\2\2\62\63\t\2\2\2\63\64\7\4\2\2\64\65\7\20\2\2\65\r\3\2\2\2\668\7"+
		"\4\2\2\679\7\5\2\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:A\7\6\2\2;=\7\4\2\2"+
		"<>\7\5\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?A\7\7\2\2@\66\3\2\2\2@;\3\2\2"+
		"\2A\17\3\2\2\2BC\7\b\2\2CD\7\22\2\2DE\7\t\2\2EF\7\7\2\2FG\7\22\2\2GH\7"+
		"\6\2\2H\21\3\2\2\2IJ\7\n\2\2JK\7\17\2\2KL\7\n\2\2LM\5\b\5\2MN\7\n\2\2"+
		"N\23\3\2\2\2OP\7\13\2\2PQ\7\17\2\2Q\25\3\2\2\2\b\34+-8=@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}