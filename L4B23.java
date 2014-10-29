package day4;

import java.util.Arrays;

public class L4B23 {

	public static void main(String[] args) {

		Tank[] tanks = new Tank[5];
		tanks[0] = new Tank();
		tanks[0].color = "yellow";
		tanks[0].crew = 545;
		tanks[0].maxSpeed = 12;
		
		tanks[1] = new Tank();
		tanks[1].color = "blue";
		tanks[1].crew = 58;
		tanks[1].maxSpeed = 58;
		
		
		tanks[2] = new Tank();
		tanks[2].color = "magenta";
		tanks[2].crew = 89;
		tanks[2].maxSpeed = 78;
		
		
		tanks[3] = new Tank();
		tanks[3].color = "black";
		tanks[3].crew = 133;
		tanks[3].maxSpeed = 123;
		
		tanks[4] = new Tank();
		tanks[4].color = "white";
		tanks[4].crew = 15;
		tanks[4].maxSpeed = 14;
		
		printTankInfo(tanks);
		
	}
	
	static void printTankInfo(Tank[] data) {
		for (int i = 0; i < data.length; i++) {
		System.out.println("      ");
		System.out.println(data[i].color);
		System.out.println(data[i].crew);
		System.out.println(data[i].maxSpeed);
		}
	}

}