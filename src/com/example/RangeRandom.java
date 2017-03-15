package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class RangeRandom {
	//����0��n-1���ظ��������
	public int[] rangeRandom(int n) {
		int[] randomSequences = new int[n];
		ArrayList<Integer> contain = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			contain.add(i);
		}
		
		for(int i = 0; i < n; i++) {
			int size = contain.size();
			int index = (int)(size * Math.random());
			randomSequences[i] = contain.get(index);
			contain.remove(index);
		}
		return randomSequences;
	}
	
	//�������������������
	public int[] rSequence(Set<Integer> set) {
		Iterator<Integer> it = set.iterator();
		ArrayList<Integer> contain = new ArrayList<Integer>();
		while(it.hasNext()) {
			contain.add(it.next());
		}
		
		int[] randoms = new int[contain.size()];
		for(int i = 0; i < randoms.length; i++) {
			int size = contain.size();
			int index = (int)(size * Math.random());
			randoms[i] = contain.get(index);
			contain.remove(index);
		}
		return randoms;
	}
}
