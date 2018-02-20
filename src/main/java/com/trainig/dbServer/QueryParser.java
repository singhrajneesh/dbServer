package com.trainig.dbServer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryParser {
	public void Date() throws IOException {
		  File file = new File("ipl.csv");
		  BufferedReader br = new BufferedReader(new FileReader(file));
		  String header[]=null;
		  String line;
		  ArrayList<String[]> data1=new ArrayList();
		  header=br.readLine().split(",");
		  while ((line=br.readLine())!= null)
			  {for (String f: line.split(",")) {
				try {
					
				}
			  catch(Exception e){
			  }
		  
				}

			  }
		  System.out.println(data1);
		}

}
