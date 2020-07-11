
// javac bicycle.java -d ClassFiles/
// java -cp ClassFiles/ learn.bicycle
package learn;

import java.util.*;

class Gear{
	private int chainRing;
	private int cog;
	private int rim;
	private double tire;

	Gear(int chainRing, int cog, int rim, double tire){
		this.chainRing = chainRing;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}

	public double ratio(){
		return chainRing / (double)cog;
	}

	public double gear_inches(){
		return ratio() * (rim + (tire * 2));
	}
}

public class bicycle{
	public static void main(String[] args){
		//Gear obj = new Gear(52, 11); won't work now 
		Gear obj = new Gear(52, 11, 26, 1.5);
		System.out.println(obj.gear_inches());
	}
}