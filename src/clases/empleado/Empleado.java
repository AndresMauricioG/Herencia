package clases.empleado;
import javax.swing.JOptionPane;


import clases.Persona;


public class Empleado extends Persona {
    private String codigoDeEmpleado;
    private int numeroDeHorasExtras;
    private String fechaDeIngreso;
    private String area;
    private String cargo;
    
    
    @Override
    public void registrarDatos() {
    	
    	super.registrarDatos();
    	
    	codigoDeEmpleado = JOptionPane.showInputDialog("ingrese el codigo del empleado");
    	numeroDeHorasExtras = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero  de horas extras"));
    	fechaDeIngreso = JOptionPane.showInputDialog("ingrese la fecha de ingreso (dd/mm/aaaa)");
    	area = JOptionPane.showInputDialog("ingrese el area");
    	cargo = JOptionPane.showInputDialog("ingrese el cargo");
    	
    }
    
    @Override
    public void imprimirDatosPersona(String datos) {
    	super.imprimirDatosPersona(datos);
    	
    	datos = "codigo de empleados " + codigoDeEmpleado + "\n"
    	+ "Numero de horas extras" + numeroDeHorasExtras + "\n"
    	+ "Fecha de ingreso " + fechaDeIngreso + "\n"
    	+ "Area" + area + "\n"
    	+ "Cargo" + cargo + "\n";
    	
    	System.out.println(datos);
    	
    }
    
    
    
    public String getCodigoDeEmpleado() {
        return codigoDeEmpleado;
    }
    public void setCodigoDeEmpleado(String codigoDeEmpleado) {
        this.codigoDeEmpleado = codigoDeEmpleado;
    }
    public int getNumeroDeHorasExtras() {
        return numeroDeHorasExtras;
    }
    public void setNumeroDeHorasExtras(int numeroDeHorasExtras) {
        this.numeroDeHorasExtras = numeroDeHorasExtras;
    }
    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }
    public void setFechaDeIngreso(String fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
