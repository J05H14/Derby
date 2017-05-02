package derby;

public class Car extends Vehicle {

	public Car(int size){
		super();
		sizeInTons = size;
		maneuverability = .8;
	}
	@Override
	public void attemptRunDown(Vehicle v) {
		System.out.println(toString() + " attements to run down " + v.toString());
		if(r.nextDouble() > v.getManeuverability()){
			double damage = (double)sizeInTons / v.sizeInTons;
			System.out.println(damage);
			v.receiveCrashDamage(damage);
		}
		else{
			System.out.println("It Missed!");
		}
	}
	
	public String toString(){
		return "#" + id + ", a car weighing " + sizeInTons + " ton(s) with maneuverabiliy " + maneuverability + " and condition " + condition;
	}

}
