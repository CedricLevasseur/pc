import groovy.util.GroovyTestCase;

class PasswordTest extends GroovyTestCase{

	public void testVariationSpecialCher(){

	Password p1 = new Password()
	ArrayList<String> r1 = new ArrayList<String>()
	r1=p1.variationSpecialChar()
	assert r1.size() == p1.specialChar.length		

	}
	public void testVariationNumber(){

	Password p1 = new Password()
	ArrayList<String> r1 = new ArrayList<String>()
	r1=p1.variationNumber(23,p1.VARIATION_NUMBER)
	assert r1.size() == p1.VARIATION_NUMBER
	//assert [23..28].equals(r1)
	/*for(Integer i in 23..28){
		assert i in r1		
	}*/
	}
}
