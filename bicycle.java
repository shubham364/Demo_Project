
// javac bicycle.java -d ClassFiles/
// java -cp ClassFiles/ learn.bicycle
package learn;

import java.util.*;

class Wheel{
	private int rim;
	private double tire;
	Gear obj = null;

	public Wheel(int rim, double tire, int chainRing, int cog){
		this.rim = rim;
		this.tire = tire;
		obj = new Gear(chainRing,cog);
	}

	public double diameter(){
		return rim + (tire * 2.0);
	}

	public double gear_inches(){
		return obj.gear_inches(diameter());
	}
}

class Gear {
	private int chainRing;
	private int cog;

	public Gear(int chainRing, int cog){
		this.chainRing = chainRing;
		this.cog = cog;
	}

	public double ratio(){
		return chainRing / (double)cog;
	}

	public double gear_inches(double diameter){
		return ratio() * diameter;
	}
}

class Cycle{
	private String size;
	private String tape_color;

	public Cycle(String size, String tape_color){
		this.size = size;
		this.tape_color = tape_color;
	}

	public void spares(){
		String chain = "10-speed";
		int tire_size = 23;
		String tape_color = this.tape_color;
	}
}
public class bicycle{
	public static void main(String[] args){
		//Gear obj = new Gear(52, 11); won't work now 
		// Gear obj = new Gear(52, 11, 26, 1.5);
		// System.out.println(obj.gear_inches());
		// obj = new Gear(52, 11, 25, 1.5);
		// System.out.println(obj.gear_inches());
		// Wheel mrf = new Wheel(26, 1.5, 52, 11);
		// System.out.println(mrf.gear_inches());
		// Gear obj = new Gear(52, 11);
		// obj.setObj(mrf);
		// System.out.println(obj.gear_inches());
		// System.out.println(obj.ratio());
		Cycle atlas = new Cycle("M", "red");
	}
}