import groovy.util.GroovyTestCase;

class PasswordListTest extends GroovyTestCase{

	public void testMix(){

	PasswordList<String> p1 = new PasswordList<String>()
	p1.add("a")
	p1.add("b")
	PasswordList<String> p2 = new PasswordList<String>()
	p2.add("1")
	p2.add("2")
	
	p1.mix(p2)
	assert p1.size() == 4
	assert p1.contains("a1")
	assert p1.contains("a2")
	assert p1.contains("b1")
	assert p1.contains("b2")

	}
}
