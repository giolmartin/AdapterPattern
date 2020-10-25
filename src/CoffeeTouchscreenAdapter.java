
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface{

	
	OldCoffeeMachine newMachine;

	public CoffeeTouchscreenAdapter(OldCoffeeMachine machine) {
		newMachine = machine;
	}

	public String chooseFirstSelection() {
		return newMachine.selectA();
	}

	
	public String chooseSecondSelection() {
		return newMachine.selectB();		
	} 
	
	
}
