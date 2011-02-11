import groovy.util.GroovyTestCase;

class PlistTest extends GroovyTestCase{

	public void testMix(){

	Plist<String> p0 = new Plist<String>()
	Plist<String> p1 = new Plist<String>()
	p1.add("a")
	p1.add("b")
	Plist<String> p2 = new Plist<String>()
	p2.add("1")
	p2.add("2")
	assert p1.size() >= 0
	Plist<String> p3 = new Plist<String>()
	p3.add("c")
	p3.add("d")

	p0.mix(p1)
	assert p0 == p1	
	

	p1.mix(p2)
	p1.mix(p3)
	assert p1.size() == 8
	assert p1.contains("a1c")
	assert p1.contains("a2c")
	assert p1.contains("b1c")
	assert p1.contains("b2c")
	assert p1.contains("a1d")
	assert p1.contains("a2d")
	assert p1.contains("b1d")
	assert p1.contains("b2d")

	println p1
	}

	public void testMagimix(){
		assert true == true
	}

	public void testRecurse(){
		assert Plist.recurse(["A", "B", "C"]) == "CBA"
		println Plist.recurse(["A","B","C"])
	}

	public void testRecurse2(){
		println ([["A","B","C"],["a","b"]])
		println Plist.recurse([["A","B","C"],["a","b"]])
		assert Plist.recurse([["A","B","C"],["a","b"]]) == "baCBA"
	}
}
