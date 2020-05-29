/**
 * 
 */
package com.trowe.price;

/**
 * @author Roopesh Babu Kandregula
 *
 */
public class LongestWordLengthOfString {

	public static void main(String[] args) {
		LongestWordLengthOfString obj = new LongestWordLengthOfString();
		System.out.println(obj.findLongestWordandLength("The cow jumped over the moon."));

	}

	public String findLongestWordandLength(String a) {
		String[] words = a.split(" ");
		int maxlength = 0;
		int index=0;
		for(int i=0; i<words.length; i++) {
			if(words[i].length()>maxlength) {
				maxlength = words[i].length();
				index=i;
			}
		}
		return words[index]+" "+maxlength;
	}
}
