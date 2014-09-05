
public class Circle extends Shape
{
	private String name;
	private Double radius;
	private Double perimeter;
	private Double surfaceArea;
	
	public Circle(String name, Double radius) {
		this.name = name;
		this.radius = radius;
		this.perimeter = 2 * Math.PI * radius;
		this.surfaceArea = 4 * Math.PI * (radius * radius);
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Double getPerimeter() {
		return this.perimeter;
	}
	
	@Override
	public void setPerimeter(Double perimeter) {
		this.perimeter = perimeter;
	}
	
	@Override
	public Double getSurfaceArea() {
		return this.surfaceArea;
	}
	
	@Override
	public void setSurfaceArea(Double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	
	public Double getRadius() {
		return this.radius;
	}
	
	public void setRadius(Double radius) {
		this.radius = radius;
	}
}
