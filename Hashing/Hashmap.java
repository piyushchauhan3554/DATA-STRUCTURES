import java.util.HashMap;
class Hashmap{
    public static void main(String args[]){
        HashMap<String ,Integer> map=new HashMap<>();

        // add pairs in hashmap 
        map.put("India",100);
        map.put("Australia",90);
        map.put("England",80);
        map.put("South Africa",45);
        map.put("New Zealand",70);

        System.out.println(map); // hashmap is unordered
         
        // get value 
        int value=map.get("New Zealand");
        System.out.println(value);
        
        System.out.println(map.get("Omam"));

        //containsKey  
        System.out.println(map.containsKey("Australia"));
        System.out.println(map.containsKey("Bangladesh"));

        // remove pair and return value 
        System.out.println(map.remove("England"));
        System.out.println(map);

        // size 
        System.out.println(map.size());

        // isEmpty
        System.out.println(map.isEmpty());

        // clear the hashmap
        map.clear();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        

    }
}