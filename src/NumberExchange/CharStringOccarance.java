package NumberExchange;

import java.util.HashMap;
import java.util.Map;

public class CharStringOccarance {
	public static void main(String[] args) {
	 String s = "Java is advance language";
	 Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	 char a[] = s.toCharArray();
	 for(char b : a)
	 {
		 if(charMap.containsKey(b))
		 {
			 charMap.put(b, charMap.get(b)+1);
		 }
		 else
		 {
			 charMap.put(b, 1);
		 }
	 }
	 System.out.println(s + " : \n" + charMap);

	}

}
