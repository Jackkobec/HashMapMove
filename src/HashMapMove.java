import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Jack on 15.10.2016.
 */
public class HashMapMove {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "Vasa");
        map.put("2", "Kola");
        map.put("3", "Peta");

        map.forEach((k, v) -> System.out.println(k + " " + v));

        Iterator iter = map.values().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        Set<Map.Entry<String, String>> set = map.entrySet();
        for(Map.Entry<String, String> i : set){
            System.out.println(i.getKey() + " " + i.getValue());

        }



    }
}
