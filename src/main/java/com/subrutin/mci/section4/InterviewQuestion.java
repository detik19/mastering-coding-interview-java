package com.subrutin.mci.section4;

public class InterviewQuestion {

	public Boolean containsCommonItem(char[] array1, char[] array2) {
		int[] counters = new int[127];
		for(int i =0 ; i<array1.length;i++) {
			counters[array1[i]]++;
		}
		System.out.println(counters);
		for(int i =0 ; i<array2.length;i++) {
			if(counters[array2[i]]>0) {
				return true;
			}
		}
		return false;
		
	}
}
