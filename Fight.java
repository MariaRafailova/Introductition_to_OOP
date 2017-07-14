package Task3;

import java.util.Random;

public class Fight {
public static void main(String[] args) {
	
	Fighter first = new Fighter();
	first.name = "First";
		
	Fighter second = new Fighter();
	second.name = "Second";
	
	first.enemy = second;
	second.enemy = first;
	
	//5 fights:
	for (int i = 0; i < 5; i++) {
		while(!first.isDead() || !second.isDead()){
			int r = new Random().nextInt(2);
			
				Fighter fighting = r == 0 ? first : second;
				Fighter beaten = r == 0 ? second : first;
				
				int r2 = new Random().nextInt(100);
				
				if(r2 <= 5){
					fighting.criticalHit();
				}
				else if(r2>5 && r2<=30){
					beaten.block();
				}
				else if(r2>30 && r2<=100){
					fighting.hit();
				}			
			
			if(first.isDead()){
				System.out.println("The winner is " + second.name);
				break;
			}
			
			if(second.isDead()){
				System.out.println("The winner is " + first.name);
				break;
			}
		}
		
		first.revive();
		second.revive();
	}
}
}
