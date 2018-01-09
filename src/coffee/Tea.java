package coffee;

public class Tea {
	
	private boolean isWaterBoiled = false;
	private boolean isTeaBagBrewed = false;
	private boolean isPouredIn = false;
	private boolean isLemonAdded = false;
	
	public void prepareRecipe(){
		boilWater();
		brewTeabag();
		pourIn();
		addLemon();
	}

	private void boilWater() {
		if(!isWaterBoiled){
			isWaterBoiled = true;
		}
	}
	private void brewTeabag(){
		isTeaBagBrewed = true;
	}
	
	private void pourIn(){
		if(!isPouredIn){
			isPouredIn = true;
		}
	}
	
	private void addLemon(){
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

	public boolean isPouredIn() {
		return isPouredIn;
	}

	public boolean isLemonAdded() {
		return isLemonAdded;
	}

}
