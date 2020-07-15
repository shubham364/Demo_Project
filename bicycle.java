
// javac bicycle.java -d ClassFiles/
// java -cp ClassFiles/ learn.bicycle
package learn;

import java.util.*;

class Wheel{
	private int rim;
	private double tire;

	public Wheel(int rim, double tire){
		this.rim = rim;
		this.tire = tire;
	}

	public double diameter(){
		return rim + (tire * 2.0);
	}

	public double circumference(){
		return diameter() * Math.PI;
	}
}

class Gear {
	private int chainRing;
	private int cog;
	Wheel obj = null;

	public Gear(int chainRing, int cog){
		this.chainRing = chainRing;
		this.cog = cog;
		//this.obj = obj;
	}

	public void setObj(Wheel obj){
		this.obj = obj;
	}

	public double ratio(){
		return chainRing / (double)cog;
	}

	public double gear_inches(){
		return ratio() * obj.diameter();
	}
}

public class bicycle{
	public static void main(String[] args){
		//Gear obj = new Gear(52, 11); won't work now 
		// Gear obj = new Gear(52, 11, 26, 1.5);
		// System.out.println(obj.gear_inches());
		// obj = new Gear(52, 11, 25, 1.5);
		// System.out.println(obj.gear_inches());
		Wheel mrf = new Wheel(26, 1.5);
		System.out.println(mrf.circumference());
		Gear obj = new Gear(52, 11);
		obj.setObj(mrf);
		System.out.println(obj.gear_inches());
		System.out.println(obj.ratio());
	}
}