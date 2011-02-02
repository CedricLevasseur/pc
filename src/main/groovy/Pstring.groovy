import Plist
public class Pstring{

	public static Integer VARIATION_NUMBER = 5

	//public static char[] specialChar = { '!','%','$','*','@','#'  } 
	public static char[] specialChar = [ 'a','b','c','d','e','f'  ] 

	ArrayList<String> listOfPstring





	public ArrayList<String> generateList(String scheme){
		//StringBuffer res
		//ArrayList<String> toReturn = new ArrayList<String>()
		Plist<String> toReturn = new Plist<String>()
		def firstMatcher
		while(scheme.length()>0){
			def res= scheme =~ /^\d+/
			if (res) {
				firstMatcher = res.getAt(0) 
				Integer number=Integer.parseInt(firstMatcher)	
				scheme=scheme.replace(firstMatcher,"")
				toReturn.addAll(variationNumber(number,5))	
				toReturn.mix(variationNumber(number,5))	
			}

			res = (scheme =~ /^[a-zA-Z]+/) 
			if(res) { 
				firstMatcher = res.getAt(0) 
				scheme=scheme.replace(firstMatcher,"")
				toReturn.mix(variationWord(firstMatcher))	
			}
			println scheme
		}
				
		//TODO
		return toReturn
			
		
	}

	public static void main(String[] args){
		Pstring p=new Pstring()
		ArrayList<String> list=p.generateList("toto12titi45tutu67")
		println list
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

	
