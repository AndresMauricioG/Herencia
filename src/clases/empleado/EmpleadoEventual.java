package clases.empleado;

import javax.swing.JOptionPane;

public class EmpleadoEventual extends Empleado {
    private double honorariosPorHora;
    private String fechaTerminoContrato;
    
    @Override
    public void registrarDatos() {
    	super.registrarDatos();
    	
    	honorariosPorHora = Double.parseDouble(JOptionPane.showInputDialog("ingrese su especialidad"));
    	fechaTerminoContrato = JOptionPane.showInputDialog("ingrese su fecha de nacimiento");
    }
    
    @Override
    public void imprimirDatosPersona(String datos) {
    	super.imprimirDatosPersona(datos);
    	
    	datos = "honorarios por hora" + honorariosPorHora + "\n"
    	+ "fecha termino de contrato" + fechaTerminoContrato + "\n";
    	
    	System.out.println(datos);
    	
    }

    public double getHonorariosPorHora() {
        return honorariosPorHora;
    }
    public void setHonorariosPorHora(double honorariosPorHora) {
        this.honorariosPorHora = honorariosPorHora;
    }
    public String getFechaTerminoContrato() {
        return fechaTerminoContrato;
    }
    public void setFechaTerminoContrato(String fechaTerminoContrato) {
        this.fechaTerminoContrato = fechaTerminoContrato;
    }

}