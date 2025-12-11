package MapExample;

import java.util.HashMap;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> map = new HashMap<>();
		
		map.put("name", "krushna");
		map.put("age", "20");
		
		String getname = map.get("name");
		
		System.out.println(map.get("name"));
		System.out.println(map);
		
		boolean containtsName = map.containsKey(getname);
		
		System.out.println(containtsName);
				
		

	}

}
