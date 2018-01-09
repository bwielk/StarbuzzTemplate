package coffee;

public abstract class CaffeineHotDrink {

	boolean isWaterBoiled = false;
	boolean isPouredIn = false;
	
	final void prepareRecipe(){
		boilWater();
		brew();
		pourIn();
		addCondiments();
	}
	
	protected abstract void brew();
	protected abstract void addCondiments();
	
	public void boilWater() {
		if(!isWaterBoiled){
			isWaterBoiled = true;
		}
	}
	
	public void pourIn(){
		if(!isPouredIn){
			isPouredIn = true;
		}
	}
	
	public boolean isPouredIn() {
		return isPouredIn;
	}
	
	public boolean isWaterBoiled(){
		return isWaterBoiled;
	}
}
