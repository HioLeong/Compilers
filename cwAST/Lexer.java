/* The following code was generated by JFlex 1.4.3 on 22/04/13 03:46 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 22/04/13 03:46 from the specification file
 * <tt>Q.lex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int ERROR = 4;
  public static final int INCOMMENT = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\6\1\1\1\3\2\0\1\2\16\6\4\0\1\1\1\35\1\22"+
    "\1\0\1\5\1\0\1\37\1\23\1\54\1\55\1\41\1\40\1\56"+
    "\1\17\1\21\1\4\12\20\1\43\1\53\1\44\1\45\1\46\2\0"+
    "\32\5\1\51\1\0\1\52\1\42\1\5\1\0\1\14\1\24\1\30"+
    "\1\34\1\12\1\13\1\32\1\31\1\26\2\5\1\15\1\5\1\27"+
    "\1\25\1\57\1\5\1\10\1\16\1\7\1\11\1\33\1\60\3\5"+
    "\1\47\1\36\1\50\1\0\41\6\2\0\4\5\4\0\1\5\2\0"+
    "\1\6\7\0\1\5\4\0\1\5\5\0\27\5\1\0\37\5\1\0"+
    "\u01ca\5\4\0\14\5\16\0\5\5\7\0\1\5\1\0\1\5\21\0"+
    "\160\6\5\5\1\0\2\5\2\0\4\5\10\0\1\5\1\0\3\5"+
    "\1\0\1\5\1\0\24\5\1\0\123\5\1\0\213\5\1\0\5\6"+
    "\2\0\236\5\11\0\46\5\2\0\1\5\7\0\47\5\11\0\55\6"+
    "\1\0\1\6\1\0\2\6\1\0\2\6\1\0\1\6\10\0\33\5"+
    "\5\0\3\5\15\0\4\6\7\0\1\5\4\0\13\6\5\0\53\5"+
    "\25\6\12\20\4\0\2\5\1\6\143\5\1\0\1\5\10\6\1\0"+
    "\6\6\2\5\2\6\1\0\4\6\2\5\12\20\3\5\2\0\1\5"+
    "\17\0\1\6\1\5\1\6\36\5\33\6\2\0\131\5\13\6\1\5"+
    "\16\0\12\20\41\5\11\6\2\5\4\0\1\5\5\0\26\5\4\6"+
    "\1\5\11\6\1\5\3\6\1\5\5\6\22\0\31\5\3\6\244\0"+
    "\4\6\66\5\3\6\1\5\22\6\1\5\7\6\12\5\2\6\2\0"+
    "\12\20\1\0\7\5\1\0\7\5\1\0\3\6\1\0\10\5\2\0"+
    "\2\5\2\0\26\5\1\0\7\5\1\0\1\5\3\0\4\5\2\0"+
    "\1\6\1\5\7\6\2\0\2\6\2\0\3\6\1\5\10\0\1\6"+
    "\4\0\2\5\1\0\3\5\2\6\2\0\12\20\4\5\7\0\1\5"+
    "\5\0\3\6\1\0\6\5\4\0\2\5\2\0\26\5\1\0\7\5"+
    "\1\0\2\5\1\0\2\5\1\0\2\5\2\0\1\6\1\0\5\6"+
    "\4\0\2\6\2\0\3\6\3\0\1\6\7\0\4\5\1\0\1\5"+
    "\7\0\12\20\2\6\3\5\1\6\13\0\3\6\1\0\11\5\1\0"+
    "\3\5\1\0\26\5\1\0\7\5\1\0\2\5\1\0\5\5\2\0"+
    "\1\6\1\5\10\6\1\0\3\6\1\0\3\6\2\0\1\5\17\0"+
    "\2\5\2\6\2\0\12\20\1\0\1\5\17\0\3\6\1\0\10\5"+
    "\2\0\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0\5\5"+
    "\2\0\1\6\1\5\7\6\2\0\2\6\2\0\3\6\10\0\2\6"+
    "\4\0\2\5\1\0\3\5\2\6\2\0\12\20\1\0\1\5\20\0"+
    "\1\6\1\5\1\0\6\5\3\0\3\5\1\0\4\5\3\0\2\5"+
    "\1\0\1\5\1\0\2\5\3\0\2\5\3\0\3\5\3\0\14\5"+
    "\4\0\5\6\3\0\3\6\1\0\4\6\2\0\1\5\6\0\1\6"+
    "\16\0\12\20\11\0\1\5\7\0\3\6\1\0\10\5\1\0\3\5"+
    "\1\0\27\5\1\0\12\5\1\0\5\5\3\0\1\5\7\6\1\0"+
    "\3\6\1\0\4\6\7\0\2\6\1\0\2\5\6\0\2\5\2\6"+
    "\2\0\12\20\22\0\2\6\1\0\10\5\1\0\3\5\1\0\27\5"+
    "\1\0\12\5\1\0\5\5\2\0\1\6\1\5\7\6\1\0\3\6"+
    "\1\0\4\6\7\0\2\6\7\0\1\5\1\0\2\5\2\6\2\0"+
    "\12\20\1\0\2\5\17\0\2\6\1\0\10\5\1\0\3\5\1\0"+
    "\51\5\2\0\1\5\7\6\1\0\3\6\1\0\4\6\1\5\10\0"+
    "\1\6\10\0\2\5\2\6\2\0\12\20\12\0\6\5\2\0\2\6"+
    "\1\0\22\5\3\0\30\5\1\0\11\5\1\0\1\5\2\0\7\5"+
    "\3\0\1\6\4\0\6\6\1\0\1\6\1\0\10\6\22\0\2\6"+
    "\15\0\60\5\1\6\2\5\7\6\4\0\10\5\10\6\1\0\12\20"+
    "\47\0\2\5\1\0\1\5\2\0\2\5\1\0\1\5\2\0\1\5"+
    "\6\0\4\5\1\0\7\5\1\0\3\5\1\0\1\5\1\0\1\5"+
    "\2\0\2\5\1\0\4\5\1\6\2\5\6\6\1\0\2\6\1\5"+
    "\2\0\5\5\1\0\1\5\1\0\6\6\2\0\12\20\2\0\2\5"+
    "\42\0\1\5\27\0\2\6\6\0\12\20\13\0\1\6\1\0\1\6"+
    "\1\0\1\6\4\0\2\6\10\5\1\0\44\5\4\0\24\6\1\0"+
    "\2\6\5\5\13\6\1\0\44\6\11\0\1\6\71\0\53\5\24\6"+
    "\1\5\12\20\6\0\6\5\4\6\4\5\3\6\1\5\3\6\2\5"+
    "\7\6\3\5\4\6\15\5\14\6\1\5\1\6\12\20\4\6\2\0"+
    "\46\5\12\0\53\5\1\0\1\5\3\0\u0149\5\1\0\4\5\2\0"+
    "\7\5\1\0\1\5\1\0\4\5\2\0\51\5\1\0\4\5\2\0"+
    "\41\5\1\0\4\5\2\0\7\5\1\0\1\5\1\0\4\5\2\0"+
    "\17\5\1\0\71\5\1\0\4\5\2\0\103\5\2\0\3\6\40\0"+
    "\20\5\20\0\125\5\14\0\u026c\5\2\0\21\5\1\0\32\5\5\0"+
    "\113\5\3\0\3\5\17\0\15\5\1\0\4\5\3\6\13\0\22\5"+
    "\3\6\13\0\22\5\2\6\14\0\15\5\1\0\3\5\1\0\2\6"+
    "\14\0\64\5\40\6\3\0\1\5\3\0\2\5\1\6\2\0\12\20"+
    "\41\0\3\6\2\0\12\20\6\0\130\5\10\0\51\5\1\6\1\5"+
    "\5\0\106\5\12\0\35\5\3\0\14\6\4\0\14\6\12\0\12\20"+
    "\36\5\2\0\5\5\13\0\54\5\4\0\21\6\7\5\2\6\6\0"+
    "\12\20\46\0\27\5\5\6\4\0\65\5\12\6\1\0\35\6\2\0"+
    "\1\6\12\20\6\0\12\20\15\0\1\5\130\0\5\6\57\5\21\6"+
    "\7\5\4\0\12\20\21\0\11\6\14\0\3\6\36\5\12\6\3\0"+
    "\2\5\12\20\6\0\46\5\16\6\14\0\44\5\24\6\10\0\12\20"+
    "\3\0\3\5\12\20\44\5\122\0\3\6\1\0\25\6\4\5\1\6"+
    "\4\5\1\6\15\0\300\5\47\6\25\0\4\6\u0116\5\2\0\6\5"+
    "\2\0\46\5\2\0\6\5\2\0\10\5\1\0\1\5\1\0\1\5"+
    "\1\0\1\5\1\0\37\5\2\0\65\5\1\0\7\5\1\0\1\5"+
    "\3\0\3\5\1\0\7\5\3\0\4\5\2\0\6\5\4\0\15\5"+
    "\5\0\3\5\1\0\7\5\16\0\5\6\32\0\5\6\20\0\2\5"+
    "\23\0\1\5\13\0\5\6\5\0\6\6\1\0\1\5\15\0\1\5"+
    "\20\0\15\5\3\0\32\5\26\0\15\6\4\0\1\6\3\0\14\6"+
    "\21\0\1\5\4\0\1\5\2\0\12\5\1\0\1\5\3\0\5\5"+
    "\6\0\1\5\1\0\1\5\1\0\1\5\1\0\4\5\1\0\13\5"+
    "\2\0\4\5\5\0\5\5\4\0\1\5\21\0\51\5\u0a77\0\57\5"+
    "\1\0\57\5\1\0\205\5\6\0\4\5\3\6\16\0\46\5\12\0"+
    "\66\5\11\0\1\5\17\0\1\6\27\5\11\0\7\5\1\0\7\5"+
    "\1\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5"+
    "\1\0\7\5\1\0\40\6\57\0\1\5\u01d5\0\3\5\31\0\11\5"+
    "\6\6\1\0\5\5\2\0\5\5\4\0\126\5\2\0\2\6\2\0"+
    "\3\5\1\0\132\5\1\0\4\5\5\0\51\5\3\0\136\5\21\0"+
    "\33\5\65\0\20\5\u0200\0\u19b6\5\112\0\u51cc\5\64\0\u048d\5\103\0"+
    "\56\5\2\0\u010d\5\3\0\20\5\12\20\2\5\24\0\57\5\1\6"+
    "\14\0\2\6\1\0\31\5\10\0\120\5\2\6\45\0\11\5\2\0"+
    "\147\5\2\0\4\5\1\0\2\5\16\0\12\5\120\0\10\5\1\6"+
    "\3\5\1\6\4\5\1\6\27\5\5\6\20\0\1\5\7\0\64\5"+
    "\14\0\2\6\62\5\21\6\13\0\12\20\6\0\22\6\6\5\3\0"+
    "\1\5\4\0\12\20\34\5\10\6\2\0\27\5\15\6\14\0\35\5"+
    "\3\0\4\6\57\5\16\6\16\0\1\5\12\20\46\0\51\5\16\6"+
    "\11\0\3\5\1\6\10\5\2\6\2\0\12\20\6\0\27\5\3\0"+
    "\1\5\1\6\4\0\60\5\1\6\1\5\3\6\2\5\2\6\5\5"+
    "\2\6\1\5\1\6\1\5\30\0\3\5\43\0\6\5\2\0\6\5"+
    "\2\0\6\5\11\0\7\5\1\0\7\5\221\0\43\5\10\6\1\0"+
    "\2\6\2\0\12\20\6\0\u2ba4\5\14\0\27\5\4\0\61\5\u2104\0"+
    "\u012e\5\2\0\76\5\2\0\152\5\46\0\7\5\14\0\5\5\5\0"+
    "\1\5\1\6\12\5\1\0\15\5\1\0\5\5\1\0\1\5\1\0"+
    "\2\5\1\0\2\5\1\0\154\5\41\0\u016b\5\22\0\100\5\2\0"+
    "\66\5\50\0\15\5\3\0\20\6\20\0\7\6\14\0\2\5\30\0"+
    "\3\5\31\0\1\5\6\0\5\5\1\0\207\5\2\0\1\6\4\0"+
    "\1\5\13\0\12\20\7\0\32\5\4\0\1\5\1\0\32\5\13\0"+
    "\131\5\3\0\6\5\2\0\6\5\2\0\6\5\2\0\3\5\3\0"+
    "\2\5\3\0\2\5\22\0\3\6\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\10\4\1\5\1\6\1\7"+
    "\2\1\5\4\1\10\2\1\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\4\3\2\1\30\2\31\1\0"+
    "\1\32\13\4\2\0\1\33\1\0\1\4\1\34\1\35"+
    "\2\4\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\4\1\50\1\2\11\4\1\51"+
    "\2\4\1\52\1\53\1\4\1\54\3\4\1\55\1\56"+
    "\3\4\1\57\1\4\1\60\1\61\1\4\1\62\1\63"+
    "\1\64\3\4\1\65\1\66\1\4\1\67\1\70\1\71"+
    "\1\72";

  private static int [] zzUnpackAction() {
    int [] result = new int[126];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\u0157"+
    "\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae\0\u02df"+
    "\0\223\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4\0\u0405\0\u0436"+
    "\0\u0467\0\u0498\0\u04c9\0\223\0\223\0\223\0\u04fa\0\u052b"+
    "\0\u055c\0\u058d\0\223\0\223\0\u05be\0\223\0\223\0\223"+
    "\0\223\0\223\0\u05ef\0\u0620\0\223\0\u0651\0\223\0\u0682"+
    "\0\223\0\u06b3\0\223\0\u06e4\0\u0715\0\u0746\0\u0777\0\u07a8"+
    "\0\u07d9\0\u080a\0\u083b\0\u086c\0\u089d\0\u08ce\0\u08ff\0\u0310"+
    "\0\223\0\u0930\0\u0961\0\u0126\0\u0992\0\u09c3\0\u09f4\0\u0126"+
    "\0\223\0\223\0\223\0\223\0\223\0\223\0\223\0\223"+
    "\0\223\0\u0a25\0\223\0\u06b3\0\u0a56\0\u0a87\0\u0ab8\0\u0ae9"+
    "\0\u0b1a\0\u0b4b\0\u0b7c\0\u0bad\0\u0bde\0\u0126\0\u0c0f\0\u0c40"+
    "\0\u08ff\0\223\0\u0c71\0\u0126\0\u0ca2\0\u0cd3\0\u0d04\0\u0126"+
    "\0\u0126\0\u0d35\0\u0d66\0\u0d97\0\u0126\0\u0dc8\0\u0126\0\u0126"+
    "\0\u0df9\0\u0126\0\u0126\0\u0126\0\u0e2a\0\u0e5b\0\u0e8c\0\u0126"+
    "\0\u0126\0\u0ebd\0\u0126\0\u0126\0\u0126\0\u0126";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[126];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
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
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\3\5\1\6\1\7\1\4\1\10\1\11\1\12"+
    "\1\13\1\14\1\7\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\7\1\25\1\7\1\26\2\7"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\7\1\53\3\54\1\55"+
    "\35\54\1\56\17\54\1\57\3\60\43\57\2\61\2\57"+
    "\3\61\3\57\62\0\3\5\61\0\1\62\34\0\1\63"+
    "\24\0\12\7\1\0\1\7\3\0\11\7\22\0\2\7"+
    "\5\0\3\7\1\64\6\7\1\0\1\7\3\0\10\7"+
    "\1\65\22\0\2\7\5\0\5\7\1\66\4\7\1\0"+
    "\1\7\3\0\11\7\22\0\2\7\5\0\12\7\1\0"+
    "\1\7\3\0\3\7\1\67\5\7\22\0\2\7\5\0"+
    "\10\7\1\70\1\7\1\0\1\7\3\0\11\7\22\0"+
    "\2\7\5\0\7\7\1\71\1\72\1\7\1\0\1\7"+
    "\3\0\10\7\1\73\22\0\2\7\5\0\5\7\1\74"+
    "\4\7\1\0\1\7\3\0\2\7\1\75\6\7\22\0"+
    "\2\7\5\0\2\7\1\76\7\7\1\0\1\7\3\0"+
    "\11\7\22\0\2\7\20\0\1\20\60\0\1\20\1\77"+
    "\37\0\22\100\1\101\36\100\3\102\1\0\55\102\5\0"+
    "\12\7\1\0\1\7\3\0\1\7\1\103\7\7\22\0"+
    "\2\7\5\0\6\7\1\104\3\7\1\0\1\7\3\0"+
    "\3\7\1\105\5\7\22\0\2\7\5\0\12\7\1\0"+
    "\1\7\3\0\5\7\1\106\3\7\22\0\2\7\5\0"+
    "\12\7\1\0\1\7\3\0\1\7\1\107\7\7\22\0"+
    "\2\7\5\0\12\7\1\0\1\7\3\0\1\7\1\110"+
    "\7\7\22\0\2\7\45\0\1\111\51\0\1\112\13\0"+
    "\1\113\45\0\1\114\64\0\1\115\62\0\1\116\60\0"+
    "\1\117\60\0\1\120\51\0\1\121\27\0\12\7\1\0"+
    "\1\7\3\0\5\7\1\122\3\7\22\0\2\7\3\54"+
    "\1\0\35\54\1\0\17\54\4\0\1\123\55\0\3\60"+
    "\55\0\2\62\1\124\1\55\55\62\5\0\4\7\1\125"+
    "\5\7\1\0\1\7\3\0\11\7\22\0\2\7\5\0"+
    "\5\7\1\126\4\7\1\0\1\7\3\0\11\7\22\0"+
    "\2\7\5\0\2\7\1\127\7\7\1\0\1\7\3\0"+
    "\11\7\22\0\1\130\1\7\5\0\2\7\1\131\7\7"+
    "\1\0\1\7\3\0\11\7\22\0\2\7\5\0\11\7"+
    "\1\132\1\0\1\7\3\0\11\7\22\0\2\7\5\0"+
    "\10\7\1\133\1\7\1\0\1\7\3\0\11\7\22\0"+
    "\2\7\5\0\12\7\1\0\1\7\3\0\1\7\1\134"+
    "\7\7\22\0\2\7\5\0\5\7\1\135\4\7\1\0"+
    "\1\7\3\0\11\7\22\0\2\7\5\0\12\7\1\0"+
    "\1\7\3\0\3\7\1\136\5\7\22\0\2\7\5\0"+
    "\11\7\1\137\1\0\1\7\3\0\11\7\22\0\2\7"+
    "\5\0\3\7\1\140\6\7\1\0\1\7\3\0\11\7"+
    "\22\0\2\7\20\0\1\141\63\0\1\142\42\0\12\7"+
    "\1\0\1\7\3\0\1\7\1\143\7\7\22\0\2\7"+
    "\5\0\2\7\1\144\7\7\1\0\1\7\3\0\11\7"+
    "\22\0\2\7\5\0\7\7\1\145\2\7\1\0\1\7"+
    "\3\0\11\7\22\0\2\7\5\0\12\7\1\0\1\7"+
    "\3\0\2\7\1\146\6\7\22\0\2\7\5\0\12\7"+
    "\1\0\1\7\3\0\2\7\1\147\6\7\22\0\2\7"+
    "\5\0\5\7\1\150\4\7\1\0\1\7\3\0\11\7"+
    "\22\0\2\7\5\0\6\7\1\151\3\7\1\0\1\7"+
    "\3\0\11\7\22\0\2\7\5\0\4\7\1\152\5\7"+
    "\1\0\1\7\3\0\11\7\22\0\2\7\5\0\5\7"+
    "\1\153\4\7\1\0\1\7\3\0\11\7\22\0\2\7"+
    "\5\0\12\7\1\0\1\7\3\0\2\7\1\154\6\7"+
    "\22\0\2\7\5\0\5\7\1\155\4\7\1\0\1\7"+
    "\3\0\11\7\22\0\2\7\5\0\11\7\1\125\1\0"+
    "\1\7\3\0\11\7\22\0\2\7\5\0\7\7\1\156"+
    "\2\7\1\0\1\7\3\0\11\7\22\0\2\7\5\0"+
    "\6\7\1\157\3\7\1\0\1\7\3\0\11\7\22\0"+
    "\2\7\5\0\2\7\1\160\7\7\1\0\1\7\3\0"+
    "\11\7\22\0\2\7\5\0\12\7\1\0\1\7\3\0"+
    "\2\7\1\161\6\7\22\0\2\7\5\0\10\7\1\162"+
    "\1\7\1\0\1\7\3\0\11\7\22\0\2\7\5\0"+
    "\3\7\1\163\6\7\1\0\1\7\3\0\11\7\22\0"+
    "\2\7\5\0\12\7\1\0\1\7\3\0\10\7\1\164"+
    "\22\0\2\7\5\0\10\7\1\165\1\7\1\0\1\7"+
    "\3\0\11\7\22\0\2\7\5\0\3\7\1\166\6\7"+
    "\1\0\1\7\3\0\11\7\22\0\2\7\5\0\7\7"+
    "\1\167\2\7\1\0\1\7\3\0\11\7\22\0\2\7"+
    "\5\0\10\7\1\170\1\7\1\0\1\7\3\0\11\7"+
    "\22\0\2\7\5\0\2\7\1\171\7\7\1\0\1\7"+
    "\3\0\11\7\22\0\2\7\5\0\12\7\1\0\1\7"+
    "\3\0\3\7\1\172\5\7\22\0\2\7\5\0\5\7"+
    "\1\173\4\7\1\0\1\7\3\0\11\7\22\0\2\7"+
    "\5\0\12\7\1\0\1\7\3\0\3\7\1\174\5\7"+
    "\22\0\2\7\5\0\2\7\1\175\7\7\1\0\1\7"+
    "\3\0\11\7\22\0\2\7\5\0\12\7\1\0\1\7"+
    "\3\0\6\7\1\176\2\7\22\0\2\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3822];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\14\1\1\11\12\1\3\11\4\1\2\11"+
    "\1\1\5\11\2\1\1\11\1\1\1\11\1\1\1\11"+
    "\1\0\1\11\13\1\2\0\1\11\1\0\6\1\11\11"+
    "\1\1\1\11\16\1\1\11\34\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[126];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
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
	QHelper h;
	public int getLine() { return yyline; }
	public int getCol() {return yycolumn; }
	private StringBuilder badinput = null;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
  	h = new QHelper(this);
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2212) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
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
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
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
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 49: 
          { return h.sym(sym.LIST);
          }
        case 59: break;
        case 13: 
          { return h.sym(sym.LESSTHAN);
          }
        case 60: break;
        case 14: 
          { return h.sym(sym.ASSIGN);
          }
        case 61: break;
        case 23: 
          { return h.sym(sym.COMMA);
          }
        case 62: break;
        case 11: 
          { return h.sym(sym.POWER);
          }
        case 63: break;
        case 56: 
          { return h.sym(sym.RETURN);
          }
        case 64: break;
        case 38: 
          { return h.sym(sym.GREATERTHANEQUAL);
          }
        case 65: break;
        case 35: 
          { return h.sym(sym.CONCAT);
          }
        case 66: break;
        case 1: 
          { yybegin(ERROR);
       			badinput = new StringBuilder(yytext());
          }
        case 67: break;
        case 30: 
          { return h.sym(sym.DO);
          }
        case 68: break;
        case 25: 
          { yypushback(1);
						yybegin(YYINITIAL);
						System.err.println("Error: unknown input " + badinput + " found at line " + yyline + ", character " + yycolumn);
          }
        case 69: break;
        case 48: 
          { return h.sym(sym.FDEF);
          }
        case 70: break;
        case 18: 
          { return h.sym(sym.LEFTBRACKET);
          }
        case 71: break;
        case 9: 
          { return h.sym(sym.PLUS);
          }
        case 72: break;
        case 28: 
          { return h.sym(sym.IF);
          }
        case 73: break;
        case 21: 
          { return h.sym(sym.LEFTPAREN);
          }
        case 74: break;
        case 52: 
          { return h.sym(sym.VOID);
          }
        case 75: break;
        case 39: 
          { return h.sym(sym.LEFTTBRACKET);
          }
        case 76: break;
        case 32: 
          { return h.sym(sym.OR);
          }
        case 77: break;
        case 29: 
          { return h.sym(sym.IN);
          }
        case 78: break;
        case 40: 
          { yybegin(YYINITIAL);
          }
        case 79: break;
        case 6: 
          { return h.parseInteger(yytext());
          }
        case 80: break;
        case 47: 
          { return h.sym(sym.ELSE);
          }
        case 81: break;
        case 43: 
          { return h.parseChar(yytext());
          }
        case 82: break;
        case 27: 
          { return h.parseString(yytext());
          }
        case 83: break;
        case 7: 
          { return h.sym(sym.DOT);
          }
        case 84: break;
        case 46: 
          { return h.sym(sym.TDEF);
          }
        case 85: break;
        case 20: 
          { return h.sym(sym.SEMICOLON);
          }
        case 86: break;
        case 45: 
          { return h.parseBool(yytext());
          }
        case 87: break;
        case 17: 
          { return h.sym(sym.RIGHTBRACE);
          }
        case 88: break;
        case 26: 
          { yybegin(INCOMMENT);
          }
        case 89: break;
        case 51: 
          { return h.sym(sym.CHAR);
          }
        case 90: break;
        case 50: 
          { return h.sym(sym.BOOL);
          }
        case 91: break;
        case 33: 
          { return h.sym(sym.RIGHTTBRACKET);
          }
        case 92: break;
        case 24: 
          { badinput.append(yytext());
          }
        case 93: break;
        case 44: 
          { return h.sym(sym.INT);
          }
        case 94: break;
        case 58: 
          { return h.sym(sym.STRING);
          }
        case 95: break;
        case 3: 
          { return h.sym(sym.DIVIDE);
          }
        case 96: break;
        case 12: 
          { return h.sym(sym.COLON);
          }
        case 97: break;
        case 8: 
          { return h.sym(sym.NOT);
          }
        case 98: break;
        case 34: 
          { return h.sym(sym.AND);
          }
        case 99: break;
        case 15: 
          { return h.sym(sym.GREATERTHAN);
          }
        case 100: break;
        case 37: 
          { return h.sym(sym.EQUAL);
          }
        case 101: break;
        case 55: 
          { return h.sym(sym.WHILE);
          }
        case 102: break;
        case 42: 
          { return h.parseFloat(yytext());
          }
        case 103: break;
        case 57: 
          { return h.sym(sym.REPEAT);
          }
        case 104: break;
        case 53: 
          { return h.sym(sym.UNTIL);
          }
        case 105: break;
        case 4: 
          { return h.sym(sym.ID, yytext());
          }
        case 106: break;
        case 19: 
          { return h.sym(sym.RIGHTBRACKET);
          }
        case 107: break;
        case 22: 
          { return h.sym(sym.RIGHTPAREN);
          }
        case 108: break;
        case 36: 
          { return h.sym(sym.LESSTHANEQUAL);
          }
        case 109: break;
        case 54: 
          { return h.sym(sym.FLOAT);
          }
        case 110: break;
        case 41: 
          { return h.sym(sym.LENGTH);
          }
        case 111: break;
        case 10: 
          { return h.sym(sym.MULTIPLY);
          }
        case 112: break;
        case 31: 
          { return h.sym(sym.NOTEQUAL);
          }
        case 113: break;
        case 5: 
          { return h.sym(sym.MINUS);
          }
        case 114: break;
        case 16: 
          { return h.sym(sym.LEFTBRACE);
          }
        case 115: break;
        case 2: 
          { 
          }
        case 116: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
