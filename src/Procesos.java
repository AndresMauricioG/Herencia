import javax.swing.JOptionPane;

import clases.CitaMedica;
import clases.ModeladoDatos;
import clases.Paciente;
import clases.empleado.EmpleadoEventual;
import clases.empleado.EmpleadoPlanilla;
import clases.empleado.Medico;

public class Procesos {

	ModeladoDatos miModeloDatos;
	
	public Procesos() {
		
		miModeloDatos = new ModeladoDatos();
		presentarMenuOpciones();
		
	}
	
	private void presentarMenuOpciones() {
		
		String menu = "MENU HOSPITAL \n"
				+ "1 Registrar paciente \n"
				+ "2 Resgistrar Empleado \n"
				+ "3 Registrar Cita Medica \n"
				+ "4 Imprimir Informacion \n"
				+ "5 Salir \n"
				+ "Ingrese una opcion";
		
		int opcion = 0;
		
		do {
			
			opcion =Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1: registrarPaciente(); break; 
			case 2: registrarEmpleado(); break;
			case 3: registrarCitaMedica(); break;
			case 4: imprimirInformacion(); break;
			case 5: System.out.println("el sistema ha terminado"); break;
			default: System.out.println("no existe la opcion verifique nuevamente");
			break;
			}
			
			
		}while(opcion != 5);
		
	}
	
	
	
	
	private void registrarPaciente() {
		Paciente miPaciente = new Paciente();
		miPaciente.registrarDatos();
		
		miModeloDatos.registrarPersona(miPaciente);
	}
	
	private void registrarEmpleado() {
		String menuTipoEmpleado  ="Registro de Empleado \n"
				+ "1 Empleado Eventual \n"
				+ "2 Empleado por Planilla \n"
				+ "seleccione el tipo de empleado a registrar";
		
		int tipoEmpleado = Integer.parseInt(JOptionPane.showInputDialog(menuTipoEmpleado));
		
		switch (tipoEmpleado) {
			case 1:
				EmpleadoEventual miEmpleadoEventual = new EmpleadoEventual();
				miEmpleadoEventual.registrarDatos();
				miModeloDatos.registrarPersona(miEmpleadoEventual);
				break;
			case 2:
				String resp = JOptionPane.showInputDialog("ingrese si, si es un medico, de lo contrario es otro tipo de empleado");
				if(resp.equalsIgnoreCase("si")) {
					Medico miMedico = new Medico();
					miMedico.registrarDatos();
					miModeloDatos.registrarPersona(miMedico);
				}else {
					EmpleadoPlanilla miEmpleadoPlanilla = new EmpleadoPlanilla();
					miEmpleadoPlanilla.registrarDatos();
					miModeloDatos.registrarPersona(miEmpleadoPlanilla);
				}
				
				break;
				
			default:System.out.println("el tipo de empleado no es valido, intenteolo nuevamente");
			    	break; 	
				
		}
		
	}
	
	private void imprimirInformacion() {
		
			String menuImprimir = "MENU IMPRESIONES \n"
					+ "1 listar Pacientes \n"
					+ "2 listar Empleados Eventuales \n"
					+ "3 listar Empleados por planilla \n"
					+ "4 listar Medicos \n"
					+ "5 listar citas programadas"
					+ "ingrese una opcion";
			
			System.out.println("**************************************************");
			
			int opcion= Integer.parseInt(JOptionPane.showInputDialog(menuImprimir));
			
			switch(opcion) {
			case 1: miModeloDatos.imprimirPacientes(); break;
			case 2: miModeloDatos.imprimirEmpleadosEventuales(); break;
			case 3: miModeloDatos.imprimirEmpleadosPorPlanilla(); break;
			case 4: miModeloDatos.imprimirMedicos(); break;
			case 5: miModeloDatos.imprimirCitasMedicasProgramadas(); break;
			
			default: System.out.println("No existe esa opcion");
				break;
			}
		
	}
	
	
	private void registrarCitaMedica() {
		String documentoPaciente = JOptionPane.showInputDialog("ingrese el documento del paciente");
		
		Paciente pacienteEncontrado=miModeloDatos.consultarPacientePorDocumento(documentoPaciente);
		
		if(pacienteEncontrado!= null) {
			String nombreMedico = JOptionPane.showInputDialog("ingrese el nombre del medico");
			Medico medicoEncontrado= miModeloDatos.consultaMedicoPorNombre(nombreMedico);
			
			if(medicoEncontrado!= null) {
				String servicio=JOptionPane.showInputDialog("ingrese el servicio o motivo de la consulta");
				String fechaConsulta= JOptionPane.showInputDialog("ingrese la fecha de la consulta");
				String horaConsulta= JOptionPane.showInputDialog("ingrese la hora de la consulta");
				
				String lugar= "la cita sera en el consultorio " + medicoEncontrado.getNumeroDeConsultorio();
				CitaMedica miCita = new CitaMedica(pacienteEncontrado, medicoEncontrado, servicio, fechaConsulta, horaConsulta, lugar);
				miModeloDatos.registrarCitaMedica(miCita);
			}else {
				System.out.println("el medico no se encuentra registrado en el sistema");
			}
			
		}else {
			System.out.println("el paciente no se encuentra registrado en el sistema");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
