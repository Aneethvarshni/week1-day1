package week1.day1;

import java.util.ArrayList;
import java.util.List;

public class OddOrEven {
public static void main(String[] args) {
		
		List<Integer> evenList = new ArrayList<Integer>();
		List<Integer> oddList = new ArrayList<Integer>();
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				evenList.add(i);
				//System.out.println("even no:"+evenList);
			} else {
				oddList.add(i);
				//System.out.println("odd no:"+i);
			}
		}
		System.out.println("even no:"+evenList);
		System.out.println("odd no:"+oddList);
	}
}
