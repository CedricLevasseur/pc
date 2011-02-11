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
	
	public void launcher(ArrayList<String> list){
		
		while(l.size()>0){
			mix(l.pop(),l)
		}
	}






	public String  magiMix(StringBuffer toReturn, int indexArray, int indexPos ){
		
		if(indexPos > this.getAt(indexArray).size)
			 
		if(indexArray > this.size)
			return toReturn; 
		if(!(this.first() instanceof List)){
			return magiMix(toReturn + this.pop())
		} 

	}


	public void magimix(Object o, List list, def function){
		if(o instanceof List){
			o.each(){ it->
				magimix(it,list,function)
			}
		}else{
			list.each(){
				
			}
		}
	}
/*
	public void magimix(List l1, List l2, def f){
		if(l2 == null)
			l2=l1.pop()
			magimix(l1,l2,f)
		if(l2.last() instanceof List){
			l2.each(){
				magimix(l1,it,f)
			}
		}else{
			f(
		}
	
	}


	public void magimix(List l,def func){
		l.pop().each(){
			this.each(){
				it + magimix() l	
			}
	}

	}

*/
	public static String recurse(List l)
	{
		if(l.size()>0)
			return l.pop()+recurse(l);
		else
			return "" 
	}

	public static ArrayList<String> recurse2(List l){
		if(!l instanceof List){
			return l
		}	
		l.pop().each(){
			recurse2(l)
			
		}
	
	}

	



}
