public class Pstring{

	public static Integer VARIATION_NUMBER = 5

	//public static char[] specialChar = { '!','%','$','*','@','#'  } 
	public static char[] specialChar = [ 'a','b','c','d','e','f'  ] 

	ArrayList<String> listOfPstring





	public ArrayList<String> generateList(String scheme){

		
		
	}
	
	public List<String> variationNumber(Integer number,variation){
		ArrayList<String> toReturn = new ArrayList<String>() 
		for(int  i=number; i < number+variation; i++){
			toReturn.add((String)i);
		}
		return toReturn; 
	}

	public List<String> variationSpecialChar(){
		ArrayList<String> toReturn = new ArrayList<String>() 
		specialChar.each(){
			toReturn.add(it)
		}
		return toReturn; 
	
	}

}

	