package derby;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Derby {
	
	List<Vehicle> vehicles = new ArrayList<Vehicle>();
	Random r = new Random();
	
	public void main(){
		Derby derby = new Derby();
		drive();
	}
	
	public void drive(){
		int v1, v2;
		Vehicle car1 = new Car(r.nextInt(2) + 1);
		Vehicle car2 = new Car(r.nextInt(2) + 1);
		Vehicle car3 = new Car(r.nextInt(2) + 1);
		Vehicle car4 = new Car(r.nextInt(2) + 1);
		Vehicle car5 = new Car(r.nextInt(2) + 1);
		Vehicle truck1 = new Truck(r.nextInt(4) + 2, r.nextBoolean());
		Vehicle truck2 = new Truck(r.nextInt(4) + 2, r.nextBoolean());
		Vehicle truck3 = new Truck(r.nextInt(4) + 2, r.nextBoolean());
		vehicles.add(car1);
		vehicles.add(car2);
		vehicles.add(car3);
		vehicles.add(car4);
		vehicles.add(car5);
		vehicles.add(truck1);
		vehicles.add(truck2);
		vehicles.add(truck3);
		//start derby
		while(vehicles.size() > 1){
			v1 = r.nextInt(vehicles.size());
			v2 = r.nextInt(vehicles.size());
	
			if(v1 == v2){
				
			}
			else{
				vehicles.get(v1).attemptRunDown(vehicles.get(v2));
				if(vehicles.get(v2).isRunning() == false){
					vehicles.remove(v2);
				}
			}
		}
		if(vehicles.size() == 1){
			System.out.println("The Winner and NEW Demolition Derby Champions... " + vehicles.get(0).toString());
		}
	}

}
