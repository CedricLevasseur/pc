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
	

}
