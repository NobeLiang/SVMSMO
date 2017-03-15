package com.example;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class TestSVM {
	public static void main(String[] args) throws IOException {
//		double[][] trainSamples = {{1, 3}, 
//				{2, 3}, 
//				{2, 2}, 
//				{1, 1}, 
//				{1, 2},
//				{2, 1}};
//		
//		int[] trainLabels = {1, 1, 1, -1, -1, -1};
//		SVM test = new SVM(trainSamples, trainLabels, 100);
//		test.mainRoutine();	
//		double[] w = test.getW();
//		double[] alph = test.getAlph();
//		double b = test.getB();
//		for(int i = 0; i < alph.length; i++) {
//			System.out.println("alph " + i + " : " + alph[i]);
//		}
//		
//		for(int i = 0; i < w.length; i++) {
//			System.out.println("w" + i + " = " + w[i]);
//		}
//		System.out.println("b = " + b);
	
		LoadData loader = new LoadData();
		String filename = "circle1.txt";
//		String filename = "D:\\Course\\AI\\Experiment\\train\\scaleData01.txt";
		double[][] data = loader.readFile(filename);
		double[][] trainSamples = loader.getAttribute(data);
		int[] trainLabels = loader.getLabel(data);
		
		SVM svm = new SVM(trainSamples, trainLabels, 100);
		long startTime = System.currentTimeMillis();
		svm.mainRoutine();
		long endTime = System.currentTimeMillis();
		
//		String testFilename = "D:\\Course\\AI\\Experiment\\test\\testData01.txt";
//		double[][] testData = loader.readFile(testFilename);
//		double[][] testSamples = loader.getAttribute(testData);
//		int[] testLabels = loader.getLabel(testData);
//		
//		int[] plabels = svm.predict(testSamples);
//		double accu = svm.accuracy(testLabels, plabels);
//		System.out.println((accu * 100) + "% predicted correctly.");
		
		System.out.println("time = " + (endTime - startTime));
		double[] alph = svm.getAlph();
		double[] w = svm.getW();
		double b = svm.getB();
		
		System.out.println();
		
		for(int i = 0; i < alph.length; i++) {
			if(alph[i] != 0) {
				System.out.println("alph " + i);
			}
		}
		System.out.println();
		
		for(int i = 0; i < w.length; i++) {
			System.out.println("w" + i +" = " + w[i]);
		}
		System.out.println("b = " + b);
		System.out.println("\nTime Cost: " + (endTime - startTime));
	}
}
