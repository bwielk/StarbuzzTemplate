package coffee;

public class Coffee extends CaffeineHotDrink {
	
	private boolean isGrindBrewed = false;
	private boolean isServedWithMilkAndSugar = false;
	
	protected void brew(){
		isGrindBrewed = true;
	}
	
	protected void addCondiments(){
		if(!isServedWithMilkAndSugar){
			isServedWithMilkAndSugar = true;
		}
	}

	public boolean isBeansBrewed() {
		return isGrindBrewed;
	}


	public boolean isServedWithMilkAndSugar() {
		return isServedWithMilkAndSugar;
	}
}
