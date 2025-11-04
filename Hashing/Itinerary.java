import java.util.HashMap;
public class Itinerary {
    public static String getStart(HashMap<String,String> map){

        HashMap<String,String> remap=new HashMap<>();

        for(String key :map.keySet()){
           remap.put(map.get(key), key);
        }
        for(String key:map.keySet()){
            if(!(remap.containsKey(key))){
                return key; // starting point 
            }
        }
        return null;

    }
    public static void main(String[] args) {
        String cities[][]={{"Chennai","Bengaluru"},{"Mumbai","Delhi"},{"Goa","Chennai"},{"Delhi","Goa"}};
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<cities.length;i++){
            
                map.put(cities[i][0],cities[i][1]);
        }

       System.out.println(map);
       String start= getStart(map);
       System.out.print(start);

       for(String key : map.keySet()){
        System.out.print("->"+map.get(start));
        start=map.get(start);

       }      
    }
    
}
