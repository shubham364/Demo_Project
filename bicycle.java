
// javac bicycle.java -d ClassFiles/
// java -cp ClassFiles/ learn.bicycle
package learn;

import java.util.*;

class Gear{
	private int chainRing;
	private int cog;

	public Gear(int chainRing, int cog){
		this.chainRing = chainRing;
		this.cog = cog;
	}

	public double ratio(){
		return chainRing / (double)cog;
	}
}

public class bicycle{
	public static void main(String[] args){
		Gear obj = new Gear(52, 11);
		System.out.println(obj.ratio());
	}
}