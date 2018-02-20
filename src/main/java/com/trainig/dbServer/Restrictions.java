package com.trainig.dbServer;

import java.util.ArrayList;
import java.util.Scanner;

public class Restrictions {
	public void str(String str) {
        String str1="where";
        int quit_position = str.indexOf(str1);
        if (quit_position >= 0) {
            System.out.println(str.substring(0, quit_position));
        } else {
            System.out.println(str);
        }
        System.out.println(str.substring(quit_position+str1.length()+1,str.length()));
		}
	
	public ArrayList<String> OrderBy(String str) {
		QuerySelector query=new QuerySelector();
    	ArrayList<String> s=query.matching("((?<=order by\\s)[A-Za-z0-9_]+)",str);
    	return s;
    }
    
    public ArrayList<String> GroupBy(String str) {
    	QuerySelector query=new QuerySelector();
    	ArrayList<String> s=query.matching("((?<=group by\\s)[A-Za-z0-9_]+)",str);
    	return s;
    }
    

}
