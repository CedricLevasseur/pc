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

	
	public void testDoStuff(){
		Plist<String> p= new Plist()
		Plist<String> r= new Plist()
		ArrayList<String> a= new ArrayList<String>()
		ArrayList<String> b= new ArrayList<String>()
		ArrayList<String> c= new ArrayList<String>()
		a.add("a")
		a.add("b")
		a.add("c")
		b.add("1")
		b.add("2")
		b.add("3")
		c.add("A")
		c.add("B")
		c.add("C")
		/*p.add(["a","b","c"])
		p.add(["1","2","3"])
		p.add(["A","B","C"])*/
		p.add(a)
		p.add(b)
		p.add(c)
		println p
		r.doStuff(p);
		println r
		assert r.size() == 27

	}
}
