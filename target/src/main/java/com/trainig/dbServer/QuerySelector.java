package com.trainig.dbServer;
import java.util.regex.*;
import java.util.*;

public class QuerySelector {
	
			Scanner sc=new Scanner(System.in);
			
			//Function to match strings and print the matched strings
			public ArrayList<String> matching(String MatchWith,String MatchFrom)
			{		ArrayList<String> s=new ArrayList();
				 	Pattern pattern=Pattern.compile(MatchWith);
			        Matcher match=pattern.matcher(MatchFrom);
			        while(match.find())
			        {	s.add(match.group());
			        }
			        return s;
			}
			
			//This function tokenize the strings
			public void tokenize(String str) {
	        StringTokenizer st=new StringTokenizer(str);
	        while(st.hasMoreTokens())
	        {System.out.println(st.nextToken());}
			}
	        
			//this will print csv file name
			public ArrayList<String> CSV(String str){
			ArrayList<String> s=matching("[a-zA-Z0-9]*.csv",str);
	        return s;
			}
	        
			
			public ArrayList<String> operators(String str) {
			ArrayList<String> s=matching("[a-zA-Z0-9]* [,/!%<>=]* ['a-zA-Z0-9]*",str);
			return s;
	        }
	        
	        public ArrayList<String> OperatorsWord(String str){
	        	ArrayList<String> s=matching("and |or |not ",str);
	        	return s;
	        }
	        
	        public void Feilds(String str) {
	    	ArrayList <String> fields=new ArrayList();
	    	if(str != null) {
	    			int startPos = str.toLowerCase().indexOf("select");
	    			int endPos =str.toLowerCase().indexOf("from");
	    			if(startPos >= 0 && endPos <str.length()) {
	    				 String sub[] = (str.substring((startPos+7), endPos-1)).split(",");
	    				for (String i : sub)
	    					{
	    						fields.add(i);
	    					}
	    			}
	    	}
	    	System.out.println(fields);  
	        }
	        
	        
	        public ArrayList<String> Aggregate(String str) {
	        	ArrayList<String> s=new ArrayList();
	    	if (str != null) {
	    		s=matching ("(avg|sum|min|max|count)(\\(\\w*|\\*\\))(\\))",str);
			}
	    	return s;
	        }
	}


