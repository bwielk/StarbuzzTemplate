package coffee;

public class Coffee {
	
	private boolean isWaterBoiled = false;
	private boolean isGrindBrewed = false;
	private boolean isPouredIn = false;
	private boolean isServedWithMilkAndSugar = false;
	
	public void prepareRecipe(){
		boilWater();
		brewGrind();
		pourIn();
		addMilkAndSugar();
	}

	private void boilWater() {
		if(!isWaterBoiled){
			isWaterBoiled = true;
		}
	}
	private void brewGrind(){
		isGrindBrewed = true;
	}
	
	private void pourIn(){
		if(!isPouredIn){
			isPouredIn = true;
		}
	}
	
	private void addMilkAndSugar(){
		if(!isServedWithMilkAndSugar){
			isServedWithMilkAndSugar = true;
		}
	}
	
	public boolean isWaterBoiled(){
		return isWaterBoiled;
	}

	public boolean isBeansBrewed() {
		return isGrindBrewed;
	}

	public boolean isPouredIn() {
		return isPouredIn;
	}

	public boolean isServedWithMilkAndSugar() {
		return isServedWithMilkAndSugar;
	}
}
