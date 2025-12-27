package Demo2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		
		String  str = "java is powerfull langauge 1234 #$%^";
		
		int vowels=0;
		int consonents=0;
		int digits=0;
		int special=0;
		int spaces=0;
		
		
		for(char c : str.toCharArray()) {
			if(Character.isLetter(c)) {
				if("AEIOUaeiou".indexOf(c)!=-1) {
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
		System.out.println("vowels: "+vowels);
		System.out.println("consonents: "+consonents);
		System.out.println("special character :"+special);
		System.out.println("Digits: "+digits);
		System.out.println("spaces :"+ spaces);
	}		
}
