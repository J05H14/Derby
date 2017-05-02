package derby;

public class Truck extends Vehicle {

	private boolean hasHitch;

	public Truck(int size, boolean hasHitch){
		super();
		sizeInTons = size;
		this.hasHitch = hasHitch;
		maneuverability = .35;
	}
	@Override
	public void attemptRunDown(Vehicle v) {
		System.out.println(toString() + " attements to run down " + v.toString());
		if(r.nextDouble() > v.getManeuverability()){
			double damage = (double)sizeInTons / v.sizeInTons;
			if(hasHitch){
				damage += .05;
			}
			System.out.println(damage);
			v.receiveCrashDamage(damage);
		}
		else{
			System.out.println("It Missed!");
		}
	}

	public String toString(){
		if(hasHitch){
			return "#" + id + ", a truck with a hitch weighing " + sizeInTons + " ton(s) with maneuverabiliy " + maneuverability + " and condition " + condition;
		}
		else{
			return "#" + id + ", a truck without a hitch weighing " + sizeInTons + " ton(s) with maneuverabiliy " + maneuverability + " and condition " + condition;
		}
	}

}
