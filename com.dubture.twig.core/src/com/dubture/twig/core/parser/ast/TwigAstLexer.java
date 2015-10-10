/* The following code was generated by JFlex 1.4.1 on 7/17/15 6:22 PM */

/*******************************************************************************
 * This file is part of the Twig eclipse plugin.
 * 
 * (c) Robert Gruendler <r.gruendler@gmail.com>
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 ******************************************************************************/
/* --------------------------Usercode Section------------------------ */

package com.dubture.twig.core.parser.ast;

import java_cup.runtime.*;
import java_cup.sym;

/**
 * This class is a scanner generated by <a href="http://www.jflex.de/">JFlex</a>
 * 1.4.1 on 7/17/15 6:22 PM from the specification file
 * <tt>ast_scanner.jflex</tt>
 */
public class TwigAstLexer implements java_cup.runtime.Scanner {

	/** This character denotes the end of file */
	public static final int YYEOF = -1;

	/** initial size of the lookahead buffer */
	private static final int ZZ_BUFFERSIZE = 16384;

	/** lexical states */
	public static final int ST_TWIG_BLOCK_NAME = 3;
	public static final int ST_TWIG_VAR = 1;
	public static final int ST_DOUBLE_QUOTES = 4;
	public static final int YYINITIAL = 0;
	public static final int ST_BACKQUOTE = 4;
	public static final int ST_TWIG_BLOCK = 2;

	/**
	 * Translates characters to character classes
	 */
	private static final String ZZ_CMAP_PACKED = "\11\0\2\6\2\0\1\6\22\0\1\14\1\0\1\10\2\0\1\3"
			+ "\1\0\1\21\1\16\1\17\2\0\1\15\1\0\1\7\1\0\12\5" + "\5\0\1\12\1\0\1\4\1\20\20\4\1\4\7\4\1\0\1\11"
			+ "\2\0\1\4\1\0\1\4\1\20\20\4\1\13\7\4\1\1\1\0" + "\1\2\1\0\201\4\uff00\0";

	/**
	 * Translates characters to character classes
	 */
	private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

	/**
	 * Translates DFA states to action switch labels.
	 */
	private static final int[] ZZ_ACTION = zzUnpackAction();

	private static final String ZZ_ACTION_PACKED_0 = "\5\0\3\1\2\2\1\3\1\4\1\5\1\2\1\6"
			+ "\1\7\1\3\2\2\1\4\1\10\1\11\1\0\1\12" + "\1\13\1\0\1\14\1\0\1\15\3\0\1\16\1\1";

	private static int[] zzUnpackAction() {
		int[] result = new int[34];
		int offset = 0;
		offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackAction(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/**
	 * Translates a state to a row index in the transition table
	 */
	private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

	private static final String ZZ_ROWMAP_PACKED_0 = "\0\0\0\22\0\44\0\66\0\110\0\132\0\154\0\176"
			+ "\0\220\0\242\0\264\0\306\0\220\0\330\0\220\0\220"
			+ "\0\352\0\374\0\u010e\0\220\0\u0120\0\u0132\0\u0144\0\220"
			+ "\0\220\0\u0156\0\220\0\330\0\220\0\u0168\0\374\0\u017a" + "\0\220\0\220";

	private static int[] zzUnpackRowMap() {
		int[] result = new int[34];
		int offset = 0;
		offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackRowMap(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int high = packed.charAt(i++) << 16;
			result[j++] = high | packed.charAt(i++);
		}
		return j;
	}

	/**
	 * The transition table of the DFA
	 */
	private static final int[] ZZ_TRANS = zzUnpackTrans();

	private static final String ZZ_TRANS_PACKED_0 = "\1\6\1\7\12\6\1\10\5\6\2\11\1\12\1\11"
			+ "\1\13\1\11\1\14\1\15\1\16\2\11\1\13\1\14" + "\1\11\1\17\1\20\1\21\1\22\3\11\1\23\1\13"
			+ "\1\11\1\14\1\15\1\16\2\11\1\13\1\14\1\24" + "\1\17\1\20\1\21\1\22\4\11\1\25\1\11\1\26"
			+ "\1\15\3\11\1\25\1\26\3\11\1\25\23\11\1\6" + "\1\27\21\6\1\30\1\6\1\31\6\6\2\0\7\6"
			+ "\1\32\20\6\24\0\1\33\23\0\2\13\5\0\1\13" + "\4\0\1\13\7\0\1\14\5\0\1\14\5\0\10\34"
			+ "\1\35\1\36\10\34\4\0\2\13\2\0\1\34\2\0" + "\1\13\4\0\1\13\12\37\1\40\7\37\1\35\2\0"
			+ "\1\41\23\0\2\25\5\0\1\25\4\0\1\25\7\0" + "\1\26\5\0\1\26\5\0\1\6\1\0\1\6\1\0"
			+ "\6\6\2\0\7\6\1\0\1\6\1\0\6\6\1\0" + "\1\42\6\6\7\0\1\34\21\0\1\37\12\0";

	private static int[] zzUnpackTrans() {
		int[] result = new int[396];
		int offset = 0;
		offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackTrans(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			value--;
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/* error codes */
	private static final int ZZ_UNKNOWN_ERROR = 0;
	private static final int ZZ_NO_MATCH = 1;
	private static final int ZZ_PUSHBACK_2BIG = 2;

	/* error messages for the codes above */
	private static final String ZZ_ERROR_MSG[] = { "Unkown internal scanner error", "Error: could not match input",
			"Error: pushback value was too large" };

	/**
	 * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
	 */
	private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

	private static final String ZZ_ATTRIBUTE_PACKED_0 = "\5\0\3\1\1\11\3\1\1\11\1\1\2\11\3\1"
			+ "\1\11\2\1\1\0\2\11\1\0\1\11\1\0\1\11" + "\3\0\2\11";

	private static int[] zzUnpackAttribute() {
		int[] result = new int[34];
		int offset = 0;
		offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackAttribute(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/** the input device */
	private java.io.Reader zzReader;

	/** the current state of the DFA */
	private int zzState;

	/** the current lexical state */
	private int zzLexicalState = YYINITIAL;

	/**
	 * this buffer contains the current text to be matched and is the source of
	 * the yytext() string
	 */
	private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

	/** the textposition at the last accepting state */
	private int zzMarkedPos;

	/** the textposition at the last state to be included in yytext */
	private int zzPushbackPos;

	/** the current text position in the buffer */
	private int zzCurrentPos;

	/** startRead marks the beginning of the yytext() string in the buffer */
	private int zzStartRead;

	/**
	 * endRead marks the last character in the buffer, that has been read from
	 * input
	 */
	private int zzEndRead;

	/** number of newlines encountered up to the start of the matched text */
	private int yyline;

	/** the number of characters up to the start of the matched text */
	private int yychar;

	/**
	 * the number of characters from the last newline up to the start of the
	 * matched text
	 */
	private int yycolumn;

	/**
	 * zzAtBOL == true <=> the scanner is currently at the beginning of a line
	 */
	private boolean zzAtBOL = true;

	/** zzAtEOF == true <=> the scanner is at the EOF */
	private boolean zzAtEOF;

	/** denotes if the user-EOF-code has already been executed */
	private boolean zzEOFDone;

	/* user code: */

	protected int getTokenStartPosition() {
		return zzStartRead - zzPushbackPos;
	}

	protected int getTokenLength() {
		return zzMarkedPos - zzStartRead;
	}

	private Symbol symbol(int type) {

		int leftPosition = getTokenStartPosition();
		return new Symbol(type, leftPosition, leftPosition + getTokenLength());
	}

	private Symbol fullSymbol(int type) {

		Symbol symbol = symbol(type);
		symbol.value = yytext();
		return symbol;
	}

	public boolean isEOF() {
		return zzAtEOF;
	}

	/**
	 * Creates a new scanner There is also a java.io.InputStream version of this
	 * constructor.
	 *
	 * @param in
	 *            the java.io.Reader to read input from.
	 */
	public TwigAstLexer(java.io.Reader in) {
		this.zzReader = in;
	}

	/**
	 * Creates a new scanner. There is also java.io.Reader version of this
	 * constructor.
	 *
	 * @param in
	 *            the java.io.Inputstream to read input from.
	 */
	public TwigAstLexer(java.io.InputStream in) {
		this(new java.io.InputStreamReader(in));
	}

	/**
	 * Unpacks the compressed character translation table.
	 *
	 * @param packed
	 *            the packed character translation table
	 * @return the unpacked character translation table
	 */
	private static char[] zzUnpackCMap(String packed) {
		char[] map = new char[0x10000];
		int i = 0; /* index in packed string */
		int j = 0; /* index in unpacked array */
		while (i < 88) {
			int count = packed.charAt(i++);
			char value = packed.charAt(i++);
			do
				map[j++] = value;
			while (--count > 0);
		}
		return map;
	}

	/**
	 * Refills the input buffer.
	 *
	 * @return <code>false</code>, iff there was new input.
	 * 
	 * @exception java.io.IOException
	 *                if any I/O-Error occurs
	 */
	private boolean zzRefill() throws java.io.IOException {

		/* first: make room (if you can) */
		if (zzStartRead > 0) {
			System.arraycopy(zzBuffer, zzStartRead, zzBuffer, 0, zzEndRead - zzStartRead);

			/* translate stored positions */
			zzEndRead -= zzStartRead;
			zzCurrentPos -= zzStartRead;
			zzMarkedPos -= zzStartRead;
			zzPushbackPos -= zzStartRead;
			zzStartRead = 0;
		}

		/* is the buffer big enough? */
		if (zzCurrentPos >= zzBuffer.length) {
			/* if not: blow it up */
			char newBuffer[] = new char[zzCurrentPos * 2];
			System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
			zzBuffer = newBuffer;
		}

		/* finally: fill the buffer with new input */
		int numRead = zzReader.read(zzBuffer, zzEndRead, zzBuffer.length - zzEndRead);

		if (numRead < 0) {
			return true;
		} else {
			zzEndRead += numRead;
			return false;
		}
	}

	/**
	 * Closes the input stream.
	 */
	public final void yyclose() throws java.io.IOException {
		zzAtEOF = true; /* indicate end of file */
		zzEndRead = zzStartRead; /* invalidate buffer */

		if (zzReader != null)
			zzReader.close();
	}

	/**
	 * Resets the scanner to read from a new input stream. Does not close the
	 * old reader.
	 *
	 * All internal variables are reset, the old input stream <b>cannot</b> be
	 * reused (internal buffer is discarded and lost). Lexical state is set to
	 * <tt>ZZ_INITIAL</tt>.
	 *
	 * @param reader
	 *            the new input stream
	 */
	public final void yyreset(java.io.Reader reader) {
		zzReader = reader;
		zzAtBOL = true;
		zzAtEOF = false;
		zzEndRead = zzStartRead = 0;
		zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
		yyline = yychar = yycolumn = 0;
		zzLexicalState = YYINITIAL;
	}

	/**
	 * Returns the current lexical state.
	 */
	public final int yystate() {
		return zzLexicalState;
	}

	/**
	 * Enters a new lexical state
	 *
	 * @param newState
	 *            the new lexical state
	 */
	public final void yybegin(int newState) {
		zzLexicalState = newState;
	}

	/**
	 * Returns the text matched by the current regular expression.
	 */
	public final String yytext() {
		return new String(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
	}

	/**
	 * Returns the character at position <tt>pos</tt> from the matched text.
	 * 
	 * It is equivalent to yytext().charAt(pos), but faster
	 *
	 * @param pos
	 *            the position of the character to fetch. A value from 0 to
	 *            yylength()-1.
	 *
	 * @return the character at position pos
	 */
	public final char yycharat(int pos) {
		return zzBuffer[zzStartRead + pos];
	}

	/**
	 * Returns the length of the matched text region.
	 */
	public final int yylength() {
		return zzMarkedPos - zzStartRead;
	}

	/**
	 * Reports an error that occured while scanning.
	 *
	 * In a wellformed scanner (no or only correct usage of yypushback(int) and
	 * a match-all fallback rule) this method will only be called with things
	 * that "Can't Possibly Happen". If this method is called, something is
	 * seriously wrong (e.g. a JFlex bug producing a faulty scanner etc.).
	 *
	 * Usual syntax/scanner level error handling should be done in error
	 * fallback rules.
	 *
	 * @param errorCode
	 *            the code of the errormessage to display
	 */
	private void zzScanError(int errorCode) {
		String message;
		try {
			message = ZZ_ERROR_MSG[errorCode];
		} catch (ArrayIndexOutOfBoundsException e) {
			message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
		}

		throw new Error(message);
	}

	/**
	 * Pushes the specified amount of characters back into the input stream.
	 *
	 * They will be read again by then next call of the scanning method
	 *
	 * @param number
	 *            the number of characters to be read again. This number must
	 *            not be greater than yylength()!
	 */
	public void yypushback(int number) {
		if (number > yylength())
			zzScanError(ZZ_PUSHBACK_2BIG);

		zzMarkedPos -= number;
	}

	/**
	 * Contains user EOF-code, which will be executed exactly once, when the end
	 * of file is reached
	 */
	private void zzDoEOF() throws java.io.IOException {
		if (!zzEOFDone) {
			zzEOFDone = true;
			yyclose();
		}
	}

	/**
	 * Resumes scanning until the next regular expression is matched, the end of
	 * input is encountered or an I/O-Error occurs.
	 *
	 * @return the next token
	 * @exception java.io.IOException
	 *                if any I/O-Error occurs
	 */
	public java_cup.runtime.Symbol next_token() throws java.io.IOException {
		int zzInput;
		int zzAction;

		// cached fields:
		int zzCurrentPosL;
		int zzMarkedPosL;
		int zzEndReadL = zzEndRead;
		char[] zzBufferL = zzBuffer;
		char[] zzCMapL = ZZ_CMAP;

		int[] zzTransL = ZZ_TRANS;
		int[] zzRowMapL = ZZ_ROWMAP;
		int[] zzAttrL = ZZ_ATTRIBUTE;

		while (true) {
			zzMarkedPosL = zzMarkedPos;

			boolean zzR = false;
			for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL; zzCurrentPosL++) {
				switch (zzBufferL[zzCurrentPosL]) {
				case '\u000B':
				case '\u000C':
				case '\u0085':
				case '\u2028':
				case '\u2029':
					yyline++;
					zzR = false;
					break;
				case '\r':
					yyline++;
					zzR = true;
					break;
				case '\n':
					if (zzR)
						zzR = false;
					else {
						yyline++;
					}
					break;
				default:
					zzR = false;
				}
			}

			if (zzR) {
				// peek one character ahead if it is \n (if we have counted one
				// line too much)
				boolean zzPeek;
				if (zzMarkedPosL < zzEndReadL)
					zzPeek = zzBufferL[zzMarkedPosL] == '\n';
				else if (zzAtEOF)
					zzPeek = false;
				else {
					boolean eof = zzRefill();
					zzEndReadL = zzEndRead;
					zzMarkedPosL = zzMarkedPos;
					zzBufferL = zzBuffer;
					if (eof)
						zzPeek = false;
					else
						zzPeek = zzBufferL[zzMarkedPosL] == '\n';
				}
				if (zzPeek)
					yyline--;
			}
			zzAction = -1;

			zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

			zzState = zzLexicalState;

			zzForAction: {
				while (true) {

					if (zzCurrentPosL < zzEndReadL)
						zzInput = zzBufferL[zzCurrentPosL++];
					else if (zzAtEOF) {
						zzInput = YYEOF;
						break zzForAction;
					} else {
						// store back cached positions
						zzCurrentPos = zzCurrentPosL;
						zzMarkedPos = zzMarkedPosL;
						boolean eof = zzRefill();
						// get translated positions and possibly new buffer
						zzCurrentPosL = zzCurrentPos;
						zzMarkedPosL = zzMarkedPos;
						zzBufferL = zzBuffer;
						zzEndReadL = zzEndRead;
						if (eof) {
							zzInput = YYEOF;
							break zzForAction;
						} else {
							zzInput = zzBufferL[zzCurrentPosL++];
						}
					}
					int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput]];
					if (zzNext == -1)
						break zzForAction;
					zzState = zzNext;

					int zzAttributes = zzAttrL[zzState];
					if ((zzAttributes & 1) == 1) {
						zzAction = zzState;
						zzMarkedPosL = zzCurrentPosL;
						if ((zzAttributes & 8) == 8)
							break zzForAction;
					}

				}
			}

			// store back cached position
			zzMarkedPos = zzMarkedPosL;

			switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
			case 12: {
				yybegin(YYINITIAL);
				return symbol(ParserConstants.TWIG_VAR_CLOSE);
			}
			case 15:
				break;
			case 8: {
				yybegin(ST_TWIG_BLOCK);
				return fullSymbol(ParserConstants.T_BLOCK_NAME);
			}
			case 16:
				break;
			case 5: { // do nothing
			}
			case 17:
				break;
			case 13: {
				return fullSymbol(ParserConstants.T_CONSTANT_ENCAPSED_STRING);
			}
			case 18:
				break;
			case 2: {
				System.out.print(yytext());
			}
			case 19:
				break;
			case 14: {
				yybegin(YYINITIAL);
				return symbol(ParserConstants.TWIG_STMT_CLOSE);
			}
			case 20:
				break;
			case 6: {
				return symbol(ParserConstants.T_OPEN_PARENTHESE);
			}
			case 21:
				break;
			case 7: {
				return symbol(ParserConstants.T_CLOSE_PARENTHESE);
			}
			case 22:
				break;
			case 3: {
				return fullSymbol(ParserConstants.T_VARIABLE);
			}
			case 23:
				break;
			case 9: { /* just skip what was found, do nothing */
			}
			case 24:
				break;
			case 11: {
				yybegin(ST_TWIG_BLOCK_NAME);
				return symbol(ParserConstants.TWIG_STMT_OPEN);
			}
			case 25:
				break;
			case 1: { // raw content
				return symbol(ParserConstants.T_INLINE_HTML);
			}
			case 26:
				break;
			case 10: {
				yybegin(ST_TWIG_VAR);
				return symbol(ParserConstants.TWIG_VAR_OPEN);
			}
			case 27:
				break;
			case 4: {
			}
			case 28:
				break;
			default:
				if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
					zzAtEOF = true;
					zzDoEOF();
					{
						return new java_cup.runtime.Symbol(sym.EOF);
					}
				} else {
					zzScanError(ZZ_NO_MATCH);
				}
			}
		}
	}

	/**
	 * Runs the scanner on input files.
	 *
	 * This is a standalone scanner, it will print any unmatched text to
	 * System.out unchanged.
	 *
	 * @param argv
	 *            the command line, contains the filenames to run the scanner
	 *            on.
	 */
	public static void main(String argv[]) {
		if (argv.length == 0) {
			System.out.println("Usage : java TwigAstLexer <inputfile>");
		} else {
			for (int i = 0; i < argv.length; i++) {
				TwigAstLexer scanner = null;
				try {
					scanner = new TwigAstLexer(new java.io.FileReader(argv[i]));
					while (!scanner.zzAtEOF)
						scanner.next_token();
				} catch (java.io.FileNotFoundException e) {
					System.out.println("File not found : \"" + argv[i] + "\"");
				} catch (java.io.IOException e) {
					System.out.println("IO error scanning file \"" + argv[i] + "\"");
					System.out.println(e);
				} catch (Exception e) {
					System.out.println("Unexpected exception:");
					e.printStackTrace();
				}
			}
		}
	}

}
