import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
 
 
public class UrlLibrary implements Iterable<String> {
	
    private List<String> urls = new LinkedList<String>();
    
    /*konstruktor*/
    public UrlLibrary() {
        urls.add("http://www.dhfdhdf.com");
        urls.add("http://www.hfhfgh.com/dgghfh");
        urls.add("http://news.fghfh.co.uu");
    }
 
 
//    private class UrlIterator implements Iterator<String> {
//         
//        private int index = 0;
// 
//        @Override
//        public boolean hasNext() {
//            return index < urls.size();
//        }
// 
//        @Override
//        public String next() {
//             
//            StringBuilder sb = new StringBuilder();
//             
//            try {
//                URL url = new URL(urls.get(index));
//                 
//                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
//                 
//                String line = null;
//                 
//                while( (line = br.readLine()) != null) {
//                    sb.append(line);
//                    sb.append("n");
//                }
//                 
//                br.close();
//                 
//            } catch (Exception e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//             
//            index++;
//             
//            return sb.toString();
//        }
// 
//        @Override
//        public void remove() {
//            urls.remove(index);
//        }
//         
//    }
     

    //    using Custom method  (my own)
//    @Override
//    public Iterator<String> iterator() {
//        return new UrlIterator();
//    }
 
    /*  the simplest way using not custom method */
    @Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }
   
}