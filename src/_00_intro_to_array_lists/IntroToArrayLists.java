package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
ArrayList<String> arrayListString = new ArrayList<String>();
		//2. Add five Strings to your list
        String one = "One";
        String two = "Two";
        String three = "Three";
        String four = "Four";
        String five = "Five";
        arrayListString.add(one);
        arrayListString.add(two);
        arrayListString.add(three);
        arrayListString.add(four);
        arrayListString.add(five);
		//3. Print all the Strings using a standard for-loop
        System.out.println("--------------------------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(arrayListString.get(i));
		}
		//4. Print all the Strings using a for-each loop
		System.out.println("--------------------------------------------------");
		for (String string : arrayListString) {
			System.out.println(string);
		}
		//5. Print only the even numbered elements in the list.
		System.out.println("--------------------------------------------------");
		for (int i = 0; i < arrayListString.size(); i++) {
			if(i%2==0) {
				System.out.println(arrayListString.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		System.out.println("--------------------------------------------------");
		for (int i = arrayListString.size()-1; i >= 0; i--) {
			System.out.println(arrayListString.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println("--------------------------------------------------");
		for (int i = 0; i < arrayListString.size(); i++) {
			for(int j = 0; j < arrayListString.get(i).length(); j++) {
				if( arrayListString.get(i).charAt(j)== 'e' ) {
					System.out.println(arrayListString.get(i));
					break;
				    }
				}
		}
		System.out.println("--------------------------------------------------");
	/*	String s = "hello";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'h') {
				System.out.println(s.charAt(i));
			}
		}
		*/
	}
}
