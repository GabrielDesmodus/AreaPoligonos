package poligonos;

public class Area {
	private double base;
	private double area;
	private double altura;
	private double basemenor;
	private double basemaior;
	private String type;
	
	public Area(String type, double base, double altura) {
		this.base = base;
		this.altura = altura;
		this.type = type;
	}
	
	public Area(String type, double altura, double basemaior, double basemenor) {
		this.altura = altura;
		this.basemaior = basemaior;
		this.basemenor = basemenor;
		this.type = type;
	}
	
	public double CalcArea(){
		if(type=="trapezio"){
			area=((basemaior+basemenor)*altura/2);
		}
		else if(type=="retangulo"){
			area=base*altura;
		}
		else if(type=="triangulo"){
			area=(base*altura)/2;
		}
		else{
			return 0;
		}
		return area;
	}
	
}


