package seng6250.football.parser;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Writing a Parser in Java: The Tokenizer
 * http://cogitolearning.co.uk/?p=525
 */
public class Tokenizer {
	  private LinkedList<TokenInfo> tokenInfos;
	  private LinkedList<Token> tokens;
	  
	  public Tokenizer()
	  {
	    tokenInfos = new LinkedList<TokenInfo>();
	    tokens = new LinkedList<Token>();
	  }
	  
	  public LinkedList<Token> getTokens()
	  {
	    return tokens;
	  }	  
	  
	  public void add(String regex, int token)
	  {
	    tokenInfos.add(new TokenInfo(Pattern.compile("^"+regex), token));
	  }
	  
	  public void tokenize(String str)
	  {
	    String s = str.trim();
	    tokens.clear();
	    while (!s.equals(""))
	    {
	      boolean match = false;
	      for (TokenInfo info : tokenInfos)
	      {
	        Matcher m = info.regex.matcher(s);
	        if (m.find())
	        {
	          match = true;
	          String tok = m.group().trim();
	          s = m.replaceFirst("").trim();
	          tokens.add(new Token(info.token, tok));
	          break;
	        }
	      }
	      if (!match) throw new ParserException("Unexpected character in input: "+s);
	    }
	  }	  
}
