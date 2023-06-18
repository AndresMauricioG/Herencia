package clases;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Paciente extends Persona{
	
	private int numeroHistoriaClinica;
	private String sexo;
	private String grupoSanguineo;
	private ArrayList<String> listaMedicamentosAlergicos;
	
	
	@Override
	public void registrarDatos() {
		
		super.registrarDatos();
		
		listaMedicamentosAlergicos = new ArrayList<String>();
		numeroHistoriaClinica = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de la historia clinica"));
		sexo = JOptionPane.showInputDialog("ingrese el sexo");
		grupoSanguineo = JOptionPane.showInputDialog("ingrese el grupo sanguineo");
		
		String preguntas = JOptionPane.showInputDialog("�es alegico a algun medicamento si o no?");
		
		if(preguntas.equalsIgnoreCase("si")) {
			String medicamentos = "";
			String continuar = "";
			do {
				
				medicamentos= JOptionPane.showInputDialog("ingrese el nombre del medicamento al cual es alergico");
				listaMedicamentosAlergicos.add(medicamentos);
				
			}while(continuar.equalsIgnoreCase("si"));
		}
		
		
	}
	
	@Override
	public void imprimirDatosPersona(String datos) {
		super.imprimirDatosPersona(datos);
		
		datos = "numero historia clinica" + numeroHistoriaClinica + "\n"
		+ "sexo " + sexo + "\n"
		+ "grupo sanguineo " + grupoSanguineo + "\n";
		
		if(listaMedicamentosAlergicos.size()>0) {
			
			datos+= "listado de medicamentos a los que es alergico ";
			
				for(int i = 0; i < listaMedicamentosAlergicos.size(); i++) {
					datos+= "\t" + listaMedicamentosAlergicos.get(i)+ "\n";
			}
		}else {
			datos+="el paciente, no es alergico a ningun medicamento";
		}
		System.out.println(datos);
	}
	
}