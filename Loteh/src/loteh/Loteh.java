package loteh;

public class Loteh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modelo mi_objeto_modelo= new Modelo();
		Vista mi_objeto_vista= new Vista();
		Controlador el_controlador= new Controlador(mi_objeto_modelo,mi_objeto_vista);
		el_controlador.iniciarVista();S

	}

}
