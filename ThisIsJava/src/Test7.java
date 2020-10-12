class Unit {
}

class AirUnit extends Unit {
}

class GroundUnit extends Unit {
}

class Tank extends GroundUnit {
}

class AirCraft extends AirUnit {

}


class Exc0 extends Exception { }

class Exc1 extends Exc0 { }

public class Test7 {

   public static void main(String args[]) {
	   Unit u = new GroundUnit();

	      Tank t = new Tank();

	       AirCraft ac = new AirCraft();
		u = ac;
     }

}