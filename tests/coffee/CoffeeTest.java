package coffee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CoffeeTest {
	
	private Coffee coffee;
	
	@Before
	public void before(){
		coffee = new Coffee();
	}

	@Test
	public void hasBoilingWater() {
		coffee.prepareRecipe();
		assertEquals(true, coffee.isWaterBoiled());
	}
	
	@Test
	public void brewsGrind(){
		coffee.prepareRecipe();
		assertEquals(true, coffee.isBeansBrewed());
	}
	
	@Test
	public void pouredInCup(){
		coffee.prepareRecipe();
		assertEquals(true, coffee.isPouredIn());
	}
	
	@Test
	public void isWithMilkAndSugar(){
		coffee.prepareRecipe();
		assertEquals(true, coffee.isServedWithMilkAndSugar());
	}

}
