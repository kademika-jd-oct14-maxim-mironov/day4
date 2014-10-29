package day4;

import java.util.Arrays;

public class L4B14 {

	public static void main(String[] args) {

//		System.out.println(t.maxSpeed);
		
		Tank[] tankObject = new Tank[5];
		//tankObject[1] = new Tank();
		tankObject[1].color = "green";
		
		System.out.println(tankObject[1].color);
		//System.out.println(Arrays.toString(arrays[1].color));

	}
	
	void printTankInfo(String color, int crew, int maxSpeed){
		System.out.println(color);
	}

}
