package testcases;


import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.trainig.dbServer.QuerySelector;

public class QuerySelectorTest {
	@Test
	public void testQuery()
	{ 	QuerySelector q=new QuerySelector();
		ArrayList<String> s=q.CSV("select city,winner,player_match from ipl.csv where season > 2014 and city = 'Bangalore'");
		Assertions.assertEquals("ipl.csv",s.get(0));}

}
