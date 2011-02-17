import Plist
public class Pstring{

	private static String  inputFilename= "src/main/ressources/in.txt"
	private static String outputFilename= "src/main/ressources/out.txt"

	public static Integer VARIATION_NUMBER = 5

	public static String[] specialChar=['','!','%','$','*','@','#']

	ArrayList<String> listOfPstring


	public ArrayList<String> generateVariations(String scheme){
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
		def file=new File(inputFilename)
		ArrayList list = new ArrayList()
		println ("processing from "+inputFilename)
		//file.eachLine{ String it ->  list.add(p.generateList(it)) }
		file.eachLine{ String it -> list=p.generateVariations(it) }
		Plist<String> r=new Plist<String>()
		r.generateList(list)
		//r.doStuff(list.reverse())
		p.persist(r)
	}

	public void persist(Plist result){
		def file=new File(outputFilename)
		file.text='' //erase the file
		result.each(){
			file << it+'\n'
		}
		println (result.size()+" words written to "+outputFilename)
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

	
