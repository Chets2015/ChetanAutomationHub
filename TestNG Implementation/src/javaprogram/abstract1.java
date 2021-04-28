package javaprogram;

	abstract class Vehicle{
	    abstract void start ();
	    abstract void stop ();
	    abstract void accelerate();
	    abstract void brake ();
	}
	     
	class Car extends Vehicle{
	    void start () { System.out.println("The car is start");}
	    void stop () { System.out.println("The car is stop");}
	    void accelerate () {System.out.println("The car is Accelerate");}
	    void brake () { System.out.println("The car is brake");}
	}
	class Bike extends Vehicle{
	    void start () { System.out.println("The Bike is start");}
	    void stop () { System.out.println("The Bike is stop");}
	    void accelerate () { System.out.println("The Bike is Accelerate");}
	    void brake () { System.out.println("The Bike is brake");}
	}
	class Scooter extends Vehicle{
	    void start () { System.out.println("The Scooter is start");}
	    void stop () { System.out.println("The Scooter is stop");}
	    void accelerate () { System.out.println("The Scooter is accelerate");}
	    void brake () {System.out.println("The Scooter is brake");}
	}
	Class Main1()
	{
	public static void main(String args[]){
	Vehicle v;
	v=new Car();
	System.out.prinln(v.start() + v.stop() + v.accelerate() + v.brake());
	v=new Bike();
	System.out.prinln(v.start() + v.stop() + v.accelerate() + v.brake());
	v=new Scooter();
	System.out.prinln(v.start() + v.stop() + v.accelerate() + v.brake());
	}
}
