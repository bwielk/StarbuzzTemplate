package coffee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TeaTest {

	private Tea tea;
	
	@Before
	public void before(){
		tea = new Tea();
	}

	@Test
	public void hasBoilingWater() {
		tea.prepareRecipe();
		assertEquals(true, tea.isWaterBoiled());
	}
	
	@Test
	public void brewsGrind(){
		tea.prepareRecipe();
		assertEquals(true, tea.isTeaBagBrewed());
	}
	
	@Test
	public void pouredInCup(){
		tea.prepareRecipe();
		assertEquals(true, tea.isPouredIn());
	}
	
	@Test
	public void isWithMilkAndSugar(){
		tea.prepareRecipe();
		assertEquals(true, tea.isLemonAdded());
	}

}
