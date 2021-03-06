package chap8;

class Unit{
	int hp;
	final int MAX;
	Unit(int hp){
		this.hp = hp;
		MAX = hp;
	}
}

class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}

interface Repairable{
	
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(15);
	}
	public String toString() {
		return "Tank";
	}
}

class DropShip extends AirUnit implements Repairable{
	DropShip(){
		super(125);
	}
	public String toString() {
		return "DropShip";
	}
}

class Marine extends GroundUnit{
	Marine(){
		super(40);
	}
	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
	}
	public String toString() {
		return "SCV";
	}
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			u.hp = u.MAX;
			System.out.println(r + " ���� �Ϸ�");
		}
	}
}

public class InterfaceEx3 {

	
	public static void main(String[] args) {
		Tank tank = new Tank();
		DropShip dropship = new DropShip();
		Marine marine = new Marine();
		SCV scv = new SCV();
		scv.repair(tank);
		scv.repair(dropship);
		scv.repair(scv);
		scv.repair((Repairable) marine);
		
	}
}
