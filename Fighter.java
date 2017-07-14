package Task3;

public class Fighter {

	String name;
	double maxHealth = 100;
	double health = maxHealth;
	double damagePerHit = 10;	
	Fighter enemy; 
	
	void hit(){
		enemy.health -= enemy.damagePerHit;
		System.out.println(this.name + " hits "+enemy.name+ ". "+enemy.name +" health " + enemy.health);
	}
	
	void criticalHit(){		
		enemy.health -= 2*enemy.damagePerHit;
		System.out.println(this.name + " hits critical "+enemy.name+ ". "+enemy.name +" health " + enemy.health);
	}
	
	void block(){			
		this.health -= 0.6*damagePerHit;
		System.out.println(this.name+ " blocked the hit. "+this.name +" health " + this.health);
	}
	
	boolean isDead(){
		if(this.health <=0){
			return true;
		}
		return false;
	}
	
	void revive(){
		this.health = maxHealth;
	}
}
