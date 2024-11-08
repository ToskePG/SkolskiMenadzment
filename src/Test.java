
public class Test {
	
	public static void main(String[] args) {
		
		Predmet p1 = new Predmet("Matematika", 5);
		Predmet p2 = new Predmet("Crnogorski", 5);
		Predmet p3 = new Predmet("Anatomija", 4);
		
		Profesor profesor1 = new Profesor("Kenan", "Dukovic", 5, 12, 34);
		
		profesor1.addPredmet(p1);
		
		profesor1.printProfesor();
		
		System.out.println("-----------------------------------");
		
		profesor1.addPredmet(p2);
		
		profesor1.printProfesor();
		
		System.out.println("-----------------------------------");
		
		profesor1.deletePredmet(p3);
		
		profesor1.deletePredmet(p1);
		
		profesor1.printProfesor();
		
	}
	
	
}
