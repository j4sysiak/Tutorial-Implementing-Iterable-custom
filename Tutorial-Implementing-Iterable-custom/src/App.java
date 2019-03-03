import java.util.Iterator;


public class App {

	public static void main(String[] args) {
	 
		UrlLibrary urlLibrary = new UrlLibrary();
		
		/*Custom zaimplementowany w klasie UrlLibrary*/
		for(String x : urlLibrary){
			System.out.println(x);
		}
		
		//--lub
		
		
		/*standardowy zaimplementowany w Collections*/
		Iterator<String> it = urlLibrary.iterator();
		
		while(it.hasNext()){
			String value = it.next();
			System.out.println(value);
		}
 
	}
}


 
