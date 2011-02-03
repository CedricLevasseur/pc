public class Plist extends ArrayList{


	public void mix(ArrayList<String> list2){

		if(this.size()==0){
			this.addAll(list2)
		}else {

			ArrayList<String> toReturn = new ArrayList<String>()
			this.each(){ String it1 ->
				list2.each(){ String it2 ->
					toReturn.add(it1 + it2)
				}	

			}
			this.clear()
			this.addAll(toReturn);
		}
	}

}
