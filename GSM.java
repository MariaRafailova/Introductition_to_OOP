package Task2;
public class GSM {
	
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	double outgoingCallsDuration; //min
	double lastIncomingCall; //min
	double lastOutgoingCall; //min
	
	void insertSimCard(String simMobileNumber){
		int mobile = simMobileNumber.indexOf("08");
		int length = simMobileNumber.length();
		
		if (mobile == 0 && length == 10) {			
			this.simMobileNumber = simMobileNumber;
			hasSimCard = true;
		}
		else{			
			System.out.println("Invalid number");
		}
	}
	
	void removeSimCard(){
		hasSimCard = false;
	}
	
	
	void call(GSM receiver, double duration){
		boolean validation = true;
		
		if(duration<0 && duration>60){
			validation = false;			
		}
		
		if (simMobileNumber.equals(receiver.simMobileNumber)) {
			validation = false;	
		}
		
		if (receiver.hasSimCard == false || hasSimCard == false) {
			validation = false;	
		}
		
		if(validation){
			lastOutgoingCall = duration;
			receiver.lastIncomingCall = duration;
			outgoingCallsDuration += duration;
		}
	}
	

	double getSumForCall(double priceForAMinute){
		
		return outgoingCallsDuration*priceForAMinute;
	}
		
	void printInfoForTheLastOutgoingCall(){
		System.out.println("The last outgoing call duration is "+ lastOutgoingCall+" min");
		}
	
	void printInfoForTheLastIncomingCall(){
		System.out.println("The Last Incoming Call duration is "+ lastIncomingCall+" min");
		}
}
