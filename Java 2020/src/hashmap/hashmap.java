package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(30);
		arr.add(60);
		arr.add(15);
		HashMap<Integer, ArrayList<Integer>>hashMap=new HashMap<Integer, ArrayList<Integer>>();
		hashMap.put(1, arr);
		hashMap.put(10, arr);
		hashMap.put(20, arr);
	
		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("Nadeen");
		arr2.add("Dames");
		
		HashMap<String, ArrayList<String>>hashMap2=new HashMap<String, ArrayList<String>>();
		hashMap2.put("Firstname", arr2);    //Key,value
		//hashMap2.put(key, value);
		
		System.out.println(hashMap2.get("Firstname"));
           
		System.out.println(hashMap);
		
		ArrayList<String> arr3=new ArrayList<String>();
		arr3.add("Albalqa");
		
		hashMap2.put("Uni",arr3);
		System.out.println(hashMap2.get("Uni"));

	}

}
