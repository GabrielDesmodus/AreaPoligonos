package poligonos;

public class Poligonos {
	
	public static void main(String[] args) {
		Area retangulo = new Area("retangulo", 10,5);
		Area triangulo = new Area("triangulo", 10,5);
		Area trapezio = new Area("trapezio", 5,10,8);
		
		System.out.println("�rea do Ret�ngulo: " + retangulo.CalcArea());
		System.out.println("�rea do Tri�ngulo: " + triangulo.CalcArea());
		System.out.println("�rea do Trap�zio: " + trapezio.CalcArea());
		
		
	}
}
