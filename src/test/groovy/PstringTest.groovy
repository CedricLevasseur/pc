import groovy.util.GroovyTestCase;

class PstringTest extends GroovyTestCase{

	public void testVariationSpecialCher(){

	Pstring p1 = new Pstring()
	ArrayList<String> r1 = new ArrayList<String>()
	r1=p1.variationSpecialChar()
	assert r1.size() == p1.specialChar.length		

	}
	public void testVariationNumber(){

	Pstring p1 = new Pstring()
	ArrayList<String> r1 = new ArrayList<String>()
	r1=p1.variationNumber(23,p1.VARIATION_NUMBER)
	assert r1.size() == p1.VARIATION_NUMBER
	//assert [23..28].equals(r1)
	/*for(Integer i in 23..28){
		assert i in r1		
	}*/
	}

	public void testCapitalize(){
	Pstring word=new Pstring()
	assert word.capitalize("cédric") == "Cédric"
	}
	
	public void testMix(){
	//assert Pstring.mix(["a","b"],["1","2"])	== ["a1", "a2", "b1", "b2"]
	//assert Pstring.mix(Pstring.mix(["a","b"],["1","2"]),["A","B"])	== ["a1A", "a1B", "a2A", "a2B", "b1A", "b1B", "b2A", "b2B"] 
	assert Pstring.launcher([["a","b"],["1","2"],["A","B"]])== ["a1A", "a1B", "a2A", "a2B", "b1A", "b1B", "b2A", "b2B"] 
	}

}
