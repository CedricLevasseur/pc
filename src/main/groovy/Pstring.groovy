import Plist
public class Pstring{

	public static Integer VARIATION_NUMBER = 5

	public static String[] specialChar=['','!','%','$','*','@','#']
	//public static String[] specialChar=['','a','b','c','d','e','f']
	//public static String[] specialChar=["a"]

	ArrayList<String> listOfPstring


	public ArrayList<String> generateList(String scheme){
		ArrayList listOfVariations= new ArrayList() 
		def firstMatcher
		while(scheme.length()>0){
			def res= scheme =~ /^\d+/
			if (res) {
				firstMatcher = res.getAt(0) 
				Integer number=Integer.parseInt(firstMatcher)	
				scheme=scheme.replace(firstMatcher,"")
				listOfVariations.add(variationNumber(number,5))
			}

			res = (scheme =~ /^[a-zA-Z]+/) 
			if(res) { 
				firstMatcher = res.getAt(0) 
				scheme=scheme.replace(firstMatcher,"")
				listOfVariations.add(variationWord(firstMatcher))
			}
			listOfVariations.add(variationSpecialChar())

		}

				
		//return toReturn
		return listOfVariations
	}	

	public static void main(String[] args){
		Pstring p=new Pstring()
		def file=new File('src/main/ressources/in.txt')
		ArrayList list = new ArrayList()
		//file.eachLine{ String it ->  list.add(p.generateList(it)) }
		file.eachLine{ String it -> list=p.generateList(it) }
		Plist<String> r=new Plist<String>()
		r.doStuff(list)
		println r.size()
		println list.size()
		p.persist(r)
	}

	public void persist(Plist result){
		def file=new File('src/main/ressources/out.txt')
		//file.withWriter('ISO8859-1')text(result)
		result.each(){
			file << it+'\n'
		}
			
		
	}

	public static List<String> mix(List<String> l1, List<String> list2){

		if(l1.size()==0){
			l1.addAll(list2)
		}
		println "l1="+l1
		List<String> toReturn = new ArrayList<String>()
		l1.each(){ String it1 ->
			list2.each(){ String it2 ->
				toReturn.add(it1 + it2)
			}	

		}
		l1.clear()
		return(toReturn);

	}
	
	public static void launcher(ArrayList<String> l){
		
		while(l.size()>0){
			println "-->"+l
			mix(l.pop(),l)
		}
	
	}
	








	public List<String> variationNumber(Integer number,variation){
		ArrayList<String> toReturn = new ArrayList<String>() 
		for(int  i=number; i < number+variation; i++){
			toReturn.add((String)i);
		}
		return toReturn; 
	}

	public List<String> variationWord(String word){
		ArrayList<String> toReturn = new ArrayList<String>() 
		toReturn.add(word)
		toReturn.add(capitalize(word))
		if(word.length()>1)
			toReturn.add(word.toUpperCase())
		return toReturn 
	}

	public String capitalize(String word){
		String letter=word.charAt(0)
		word=letter.toUpperCase()+word.substring(1)
		return word	
	}

	public List<String> variationSpecialChar(){
		ArrayList<String> toReturn = new ArrayList<String>() 
		specialChar.each(){
			toReturn.add(it)
		}
		return toReturn 
	
	}


}

	
