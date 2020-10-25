
public class Main {

	public static void main(String[] args) {

		OldCoffeeMachine machine = new OldCoffeeMachine();
		CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(machine);
		adapter.chooseFirstSelection();
	}

}
