import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

class testAdapterPattern {

	@Test
	void testAdapter() {
		
		OldCoffeeMachine machine = new OldCoffeeMachine();
		CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(machine);
		
		assertEquals("A", adapter.chooseFirstSelection());
		assertEquals("B", adapter.chooseSecondSelection());
	}

}
