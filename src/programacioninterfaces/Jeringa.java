package programacioninterfaces;

public  class Jeringa implements Herramienta {

	@Override
	public String getNombre() {
		return "Jeringa";
	}

	@Override
	public String getHabilidad() {
		return "hacer sufrir";
	}

}
