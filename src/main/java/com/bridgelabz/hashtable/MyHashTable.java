package com.bridgelabz.hashtable;

import java.util.Hashtable;
import java.util.Map.Entry;

public class MyHashTable {
	public static void countWordFreq(Hashtable<String, Integer> hashtable, String string) {

		String arr[] = string.split(" ");

		for(int i=0; i<arr.length; i++) {
			if(hashtable.containsKey(arr[i])) {
				hashtable.put(arr[i], hashtable.get(arr[i])+1);
			}
			else
				hashtable.put(arr[i], 1);
		}

		for(Entry<String, Integer> entry : hashtable.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue());
		} 
	}

	public static void main(String[] args) {
		Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();

		System.out.println("\nFrequency count for Sentence 2 \n"
				+ "Paranoids are not paranoid because they are paranoid but because they keep "
				+ "putting themselves deliberately into paranoid avoidable situations ");
		String string1 = "Paranoids are not paranoid because they are paranoid but because they keep "
				+ "putting themselves deliberately into paranoid avoidable situations";
		countWordFreq(hashtable,string1);

		System.out.println("\n \nValue for that word which is removed: "+hashtable.remove("avoidable"));
		System.out.println(hashtable);
	}
}