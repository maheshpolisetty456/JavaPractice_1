package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Test8 {

	public static void main(String[] args) {
//		//revese a word in sentence
//		
//		String str = "java is a very powerfull language";
//		String output = "";
//				
//		String[] strArr= str.split(" ");
//		for(int i = strArr.length-1;i>=0;i--) {St
//			output=output+strArr[i]+" ";
//		}
//		System.out.println(output.trim());
		
		//revese the each word in the sentence
//		String str = "Java is a very usefull langauge";
//		
//		String output =Arrays.stream(str.split(" ")).map(c->new StringBuilder(c).reverse().toString()).collect(Collectors.joining(" "));
//		System.out.println(output)
		
		//remove the duplicate characters from the string
		
//		String str = "Mahesh is good boy";
//		String str2 = str.replace(" ", "");
//		System.out.println();
//		
//		String output= Arrays.stream(str2.split("")).distinct().collect(Collectors.joining());
//		System.out.println(output);
//		
		//sort map by keys
		
//		Map<Integer,  String> map = new HashMap<Integer, String>();
//		
//		map.put(3, "Mahesh");
//		map.put(2, "Mahi");
//		map.put(1, "kai");
//		
//		Map<Integer,String> tree = new TreeMap<Integer, String>(map);
//		System.out.println(tree);
//		
//		//find the duplicate elemtets fin the arrays
//		
//
//		List<Integer> list = Arrays.asList(1,2,3,4,5,4,3,2,6,7,8,9);
//		Set<Integer> set =list.stream().filter(i->Collections.frequency(list, i)>1).collect(Collectors.toSet());
//		System.out.println(set);		
//		
		//find the dulicate elemtes from the arrays
		
//		int[] arr = {1,2,3,4,5,4,3,2,6,7,8,9};
//		List<Integer> list = new ArrayList<Integer>();
//		for(int i : arr) {
//			list.add(i);
//		}
//		
//		Set<Integer> set = list.stream().filter(c->Collections.frequency(list, c)>1).collect(Collectors.toSet());
//		System.out.println(set);
		
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i] == arr[j]) {
//					System.out.println("Duplciate: "+arr[i] );
////				}
//			}
//		}
		//find the vowels, cosonents, digits, special characters and spaces
		
		String str = "Java is a programing language @12345#$";
		
		int vowels=0;
		int consonents=0;
		int digits=0;
		int special=0;
		int spaces =0;
		
		for(char c : str.toCharArray()) {
			if(Character.isLetter(c)) {
				if("AEIOUaeiou".indexOf(c) != -1) {
					vowels++;
				}else {
					consonents++;
				}
			}else if(Character.isDigit(c)) {
				digits++;
			}else if(c == ' ') {
				spaces++;
			}else {
				special++;
			}
		}
		
		System.out.println("Vowels: "+vowels);
		System.out.println("Consonents: "+consonents);
		System.out.println("Digits: "+digits);
		System.out.println("Special: "+special);
		System.out.println(" Spaces: "+spaces);

      }

}

