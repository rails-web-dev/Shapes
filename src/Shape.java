
public abstract class Shape 
{
	private String name;
	private Double perimeter, surfaceArea;
	
	abstract String getName();
	abstract void setName(String name);
	abstract Double getPerimeter();
	abstract void setPerimeter(Double perimeter);
	abstract Double getSurfaceArea();
	abstract void setSurfaceArea(Double surfaceArea);
}
