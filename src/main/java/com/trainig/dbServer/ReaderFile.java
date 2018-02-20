package com.trainig.dbServer;
import java.io.*;
import java.util.ArrayList;
public class ReaderFile
{
	public void method() throws IOException {
	  File file = new File("ipl.csv");
	  BufferedReader br = new BufferedReader(new FileReader(file));
	  String header[]=null;
	  String line,temp = "";
	  
	  ArrayList<Integer> data=new ArrayList();
	  ArrayList<String> data1=new ArrayList();
	  header=br.readLine().split(",");
	  while ((line=br.readLine())!= null)
		  {for (String e : line.split(",")) {
			try {  //temp=f;
			data.add(Integer.parseInt(e));
		  }
		  catch(Exception e1){
			  //data1.add(temp);
		  }
	  
	  }

	}
	  System.out.println(data);
	
	  
	}}