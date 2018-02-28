package class19;//2016.8.15.am6

import class19.FruitColor.Color;

public class Apple {
	private String appleName;
	@FruitColor(fruitColor=Color.RED)
	private String appleColor;
	@FruitProvider(id=11,name="北京",address="奶茶")
	private String FruitProvider;
	@FruitName(name="香蕉 ")
	public void setAppleColor(String name){
		this.appleColor = name; 
	}
	public String getAooleColor(){
		return appleColor;
	}
	public String getAppleName() {
		return appleName;
	}
	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}
	public String getFruitProvider() {
		return FruitProvider;
	}
	public void setFruitProvider(String fruitProvider) {
		FruitProvider = fruitProvider;
	}
	
}
