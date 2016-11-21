package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import testBizzdevs.*;

public class Testing {
	
	@Test
	public void testBonjourRacaille(){
		IPersonne pers = new Racaille("Toto", "Tata", 2); 
		if( ! pers.Bonjour().equals ("Wesh magl, mon tag c " + "Tata" + " " + "Toto" +". J'ai " + "2" + " piges tmtc") ){
			fail("Expected result unsatisfied on BonjourRacaille UnitTest");
		}
	}

	@Test
	public void testBonjourGentleman(){
		IPersonne pers = new Gentleman("Tutu", "Titi", 26);
		if( !pers.Bonjour().equals( "Bonjour, je m'appelle " + "Titi" + " " + "Tutu" + " et j'ai " + "26" + " ans." )){
			fail("Expected result unsatisfied on BonjourGentleman UnitTest");
		}
	}
	
}
