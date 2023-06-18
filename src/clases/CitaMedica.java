package clases;

import clases.empleado.Medico;

public class CitaMedica {
	
	private Paciente paciente;
	private Medico medico;
	private String servicio;
	private	String fechaConsulta;
	private String horaConsulta;
	private String lugar;
	
	
	public CitaMedica(Paciente paciente, Medico medico, String servicio, String fechaConsulta, String horaConsulta, String lugar) {
		this.paciente = paciente;
		this.medico = medico;
		this.servicio = servicio;
		this.fechaConsulta = fechaConsulta;
		this.horaConsulta = horaConsulta;
		this.lugar = lugar;
	}
	
	public String informacionCitaMedica() {
		
		String datosCita = "<< INFORMACION CITA MEDICA >> \n"
				+ "Paciente " + paciente.getNombre() + "\n"
				+ "Medico " + medico.getNombre() + "\n"
				+ "Motivo consulta " + servicio + "\n"
				+ "Fecha consulta " + fechaConsulta + " - Hora " + horaConsulta + "\n"
				+ "Lugar " + lugar+ "\n\n";
				
		return datosCita;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public Medico getMedico() {
		return medico;
	}
	
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	
	public String getServicio() {
		return servicio;
	}
	
	public void setFechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	
	public String getFechaConsulta() {
		return fechaConsulta;
	}
	
	public void setHoraConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
	}
	
	public String getHoraConsulta() {
		return horaConsulta;
	}
	
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

}
