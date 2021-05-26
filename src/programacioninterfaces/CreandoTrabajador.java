package programacioninterfaces;

public class CreandoTrabajador {
	public static void main(String[] args) {
		Herramienta herramienta = new Martillo();
		
		Trabajador trabajador = new Trabajador();
		trabajador.setHerramienta(herramienta);
		
	System.out.println("El nombre de la herramienta del trabajador es: "+ trabajador.getHerramienta().getNombre());
	}

}
