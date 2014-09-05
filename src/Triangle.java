
public class Triangle extends Shape
{
	
	private String name;
	private Double sideA;
	private Double sideB;
	private Double sideC;
	private Double perimeter;
	private Double surfaceArea;
	
	public Triangle(String name, Double sideA, Double sideB, Double sideC) {
		if (!findIfValid(sideA, sideB, sideC)) {
			throw new ArithmeticException("This triangle is impossible to create");
		}
		this.name = findTriangleType() + " " + name;
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		this.perimeter = sideA + sideB + sideC;
		Double semiPerimeter = this.perimeter / 2;
		this.surfaceArea = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * 
				(semiPerimeter - sideB) * (semiPerimeter - sideC));
	}
	
	//determines if the triangle meets the triangle inequality theorm
	private Boolean findIfValid(Double sideA, Double sideB, Double sideC)
	{
		if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
			return true;
		}
		return false;
	}
	
	//determines what kind of triangle was created
	private String findTriangleType() {
		if (this.sideA == this.sideB && this.sideA == this.sideC) {
			return "Equilateral";
		}
		else if (this.sideA == this.sideB || this.sideA == this.sideC || this.sideB == this.sideC) {
			return "Isoceles";
		}
		else {
			return "Scalene";
		}
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
	
	public Double getSideA() {
		return this.sideA;
	}
	
	public void setSideA(Double sideA) {
		
	}
	
	public Double getSideB() {
		return this.sideB;
	}
	
	public void setSideB(Double sideB) {
		this.sideB = sideB;
	}
	
public Double getSideC() {
		return this.sideC;
	}
	
	public void setSideC(Double sideC) {
		this.sideC = sideC;
	}

}
