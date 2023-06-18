package clases.empleado;

import javax.swing.JOptionPane;

public class EmpleadoPlanilla extends Empleado {
    private double salarioMensual;
    private double porcentajeAdicionalPorHoraExtra;
    
    @Override
    public void registrarDatos() {
    	super.registrarDatos();
    	
    	salarioMensual = Double.parseDouble(JOptionPane.showInputDialog("ingrese el salario Menusal"));
    	porcentajeAdicionalPorHoraExtra = Double.parseDouble(JOptionPane.showInputDialog("ingrese el porcentaje adicional por Horas extras"));
    
    	
    }
    
    @Override
    public void imprimirDatosPersona(String datos) {
    	super.imprimirDatosPersona(datos);
    	
    	datos = "salario mensual " + salarioMensual + "\n";
    	datos += "porcentaje adicionale por hora extra " + porcentajeAdicionalPorHoraExtra + "\n";
    	
    	System.out.println(datos);
    	
    }
    
    public double getSalarioMensual() {
        return salarioMensual;
    }
    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    public double getPorcentajeAdicionalPorHoraExtra() {
        return porcentajeAdicionalPorHoraExtra;
    }
    public void setPorcentajeAdicionalPorHoraExtra
        (double porcentajeAdicionalPorHoraExtra) {
            this.porcentajeAdicionalPorHoraExtra = porcentajeAdicionalPorHoraExtra;
        }
}