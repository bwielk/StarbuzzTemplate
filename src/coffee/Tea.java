package coffee;

public class Tea extends CaffeineHotDrink {
	
	private boolean isTeaBagBrewed = false;
	private boolean isLemonAdded = false;
	
	protected void brew(){
		isTeaBagBrewed = true;
	}
	
	protected void addCondiments(){
		if(!isLemonAdded){
			isLemonAdded = true;
		}
	}
	
	public boolean isWaterBoiled(){
		return isWaterBoiled;
	}

	public boolean isTeaBagBrewed() {
		return isTeaBagBrewed;
	}

	public boolean isLemonAdded() {
		return isLemonAdded;
	}
}
