package java018_collection;

import java.util.ArrayList;
import java.util.Arrays;

import java017_collection.Ascending;

public class Java206_clone {

	public static void main(String[] args) {
		Integer[]it=new Integer[] {3,5,2,4,7};
		
		ArrayList<Integer> sourceList=new ArrayList<Integer>(Arrays.asList(it));
		System.out.println("sourceList:"+sourceList.toString());
		
		
		ArrayList<Integer> destList=(ArrayList<Integer>)sourceList.clone();
		System.out.println("destList:"+destList.toString());
		
		sourceList.sort(new Ascending());
		System.out.println("sourceList:"+ sourceList);
		System.out.println("destList:"+destList.toString());

	}

}
