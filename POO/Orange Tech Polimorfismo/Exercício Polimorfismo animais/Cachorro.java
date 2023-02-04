package POOPolimorfismo;

public class Cachorro extends Animal{        //------------> clico

	@Override //--> sobrescrita de método
	public void som() {	
		System.out.println("Som do cachorro: au au au...");
		
	}

	@Override //--> sobrescrita de método
	public void movimento() {	
		System.out.println("Cachorro correndo...");
		
	}

	

}
