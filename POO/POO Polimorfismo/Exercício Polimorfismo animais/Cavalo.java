package POOPolimorfismo;

public class Cavalo extends Animal {

	@Override // --> sobrescrita de método
	public void som() {
		System.out.println("Som do cavalo: rinhéee rinhée...");

	}

	@Override // --> sobrescrita de método
	public void movimento() {
		System.out.println("Cavalo correndo...");

	}

}