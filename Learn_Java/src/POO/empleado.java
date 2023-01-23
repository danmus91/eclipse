package POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class empleado {
	
	public static void main (String args[])
	{
		GregorianCalendar tiempito = new GregorianCalendar(1991,4,16);		
//		empleadoClass emp = new empleadoClass("Sergio","Mollinedo","Uriona",7000.0,tiempito);
//		empleadoClass emp2 = new empleadoClass("Daniel","Saguez","Molina",6000.0,1980,5,30);
//		empleadoClass emp3 = new empleadoClass("Raquel","Hinojosa","Berna",5000.0,new Date());
//		empleadoClass emp4 = new empleadoClass("Raquel","Hinojosa","Berna",5000.0,new Date());
//		System.out.println(emp.toString());
//		System.out.println(emp2.toString());
//		System.out.println(emp3.toString());
//		System.out.println(emp4.toString());
////		emp.aumentoSueldo(5.0);
////		emp2.aumentoSueldo(10.0);
////		emp3.aumentoSueldo(8.0);
////		emp4.aumentoSueldo(8.0);
////		System.out.println(emp.toString());
////		System.out.println(emp2.toString());
////		System.out.println(emp3.toString());
////		System.out.println(emp4.toString());
//		//Lista de empleados
//		empleadoClass[] empleados = new empleadoClass[3];
//		empleados[0] = new empleadoClass("Jason","Momoa","Junkyserqpoi",17000.0,tiempito);		
//		empleados[1] = new empleadoClass("Lana","Torrez","Callejas",7400.0,tiempito);		
//		empleados[2] = new empleadoClass("Igor","Beltran","Neruda",1500.0,tiempito);		
//		System.out.println("------Lista de Empleados-------");
//		for (empleadoClass empleadoClass : empleados) {
//			empleadoClass.aumentoSueldo(5.0);
//			System.out.println("IdEmpleado: " + empleadoClass.getId() +" Empleado : " + empleadoClass.getNombre() + " su antiguo sueldo era :  " + empleadoClass.getAntiguoSueldo() + "  y el aumento es del 5% su nuevo sueldo es : " + empleadoClass.getSueldo());
//		}
		
		empleadoClass [] Empleados= new empleadoClass[3];
		Empleados[0] = new empleadoClass("Sergio","Mollinedo","Uriona",7000.0,tiempito);
		Empleados[1] = new empleadoClass("Daniel","Saguez","Molina",6000.0,1980,5,30);
		Empleados[2] = new empleadoClass("Raquel","Hinojosa","Berna",5000.0,new Date());
		
		for (empleadoClass empleado : Empleados) {
			System.out.println("Sueldo antiguo : " + empleado.toString());
			empleado.aumentoSueldo(5.0);
			System.out.println("Sueldo nuevo : " + empleado.toString());
		}
		 
	}

}

class empleadoClass{
	
	public static int nextval = 1;
	private int id;
	private String nombre;
	private String apellido_Paterno;
	private String apellido_Materno;
	private double sueldo;
	private double antiguoSueldo;
	private Date fechaAlta;
	
	empleadoClass(String nomb, String Appat, String Apmat, double sueldo, Date fechaAlta)	{
		
		nombre = nomb;
		apellido_Paterno = 	Appat;
		apellido_Materno =  Apmat;
		this.sueldo = sueldo;
		this.fechaAlta = fechaAlta;
		id=nextval;
		nextval++;
	}
	
	empleadoClass(String nomb, String Appat, String Apmat, double sueldo, GregorianCalendar fechaAlta)	{
		
		nombre = nomb;
		apellido_Paterno = 	Appat;
		apellido_Materno =  Apmat;
		this.sueldo = sueldo;
		this.fechaAlta = fechaAlta.getTime();
		id=nextval;
		nextval++;
	}


	empleadoClass(String nomb, String Appat, String Apmat, double sueldo, int anio, int mes, int dia)	{
		nombre = nomb;
		apellido_Paterno = 	Appat;
		apellido_Materno =  Apmat;
		this.sueldo = sueldo;
		GregorianCalendar Calendario = new GregorianCalendar(anio,mes-1,dia);
		fechaAlta = Calendario.getTime();
		id=nextval;
		nextval++;
	}
	
	public double getAntiguoSueldo() {
		return antiguoSueldo;
	}

	public void setAntiguoSueldo(double antiguoSueldo) {
		this.antiguoSueldo = antiguoSueldo;
	}
	
	public void aumentoSueldo (double porcentaje)
	{
		antiguoSueldo = sueldo;
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_Paterno() {
		return apellido_Paterno;
	}

	public void setApellido_Paterno(String apellido_Paterno) {
		this.apellido_Paterno = apellido_Paterno;
	}

	public String getApellido_Materno() {
		return apellido_Materno;
	}

	public void setApellido_Materno(String apellido_Materno) {
		this.apellido_Materno = apellido_Materno;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "empleadoClass [id=" + id + ", nombre=" + nombre + ", apellido_Paterno=" + apellido_Paterno
				+ ", apellido_Materno=" + apellido_Materno + ", sueldo=" + sueldo + ", antiguoSueldo=" + antiguoSueldo
				+ ", fechaAlta=" + fechaAlta + "]";
	}
	
	
}

