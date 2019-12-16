package java_basics;

import java.util.Scanner;
import java.util.Arrays;
public class array_indexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements:");
		int []age=new int[5];
		for (int i = 0; i < age.length; i++) {
			age[i]=s.nextInt();	}
		System.out.println("Print Array Elements:");
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i]+" ");}
		System.out.println();
		Arrays.sort(age);
		System.out.println("Sorting Array");
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i]+" ");}
		int min=1000;
             for (int i = 0; i < age.length; i++) {
				if(min>age[i]) {
					min=age[i];}}
             System.out.println();
				System.out.print("Min Number: "+min+" ");
             int max=0;
             for (int i = 0; i < age.length; i++) {
				if(max<age[i]) {
					max=age[i];}}
             System.out.println();
				System.out.print("Max Number: "+max+" ");

	}
	

}
