import java.util.Iterator;


public class App {

	public static void main(String[] args) {
	 
		UrlLibrary urlLibrary = new UrlLibrary();
		
		Iterator<String> it = urlLibrary.iterator();
		
		while(it.hasNext()){
			String value = it.next();
			System.out.println(value);
		}
		
		//--lub
		
		for(String url : urlLibrary){
			System.out.println(url);
		}
	}
}


 
