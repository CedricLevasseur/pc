public class Plist extends ArrayList{


	public Plist(){
		super()
	}

	public Plist(Object o){
		this.add(o)
	}
	
	public static Plist toPlist(ArrayList a){
		Plist p=new Plist();
		p.addAll(a);
		return p;
	}	
	
	

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

	public void generateList(List<String> list){
		doStuff(list.reverse())
	}

	public void doStuff(List<String> list){
		if(list.size()>0){
			ArrayList<String> left=list.pop()
			this.mix(left)
			this.doStuff(list)
		}
	} 	



}
