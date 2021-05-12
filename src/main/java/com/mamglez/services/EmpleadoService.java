/**
 * 
 */
package com.mamglez.services;

import java.util.ArrayList;
import java.util.List;

import com.mamglez.entity.Empleado;

/**
 * @author skype
 * clase permite realizar logica de negocia para empleados
 */
public class EmpleadoService {
	
	/**
	 * @return {@link Empleado}
	 * permite consultar lista empleados
	 */
	public List<Empleado> consultarEmpleados(){
		List<Empleado> empleados = new ArrayList<Empleado>();
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("digoe");
		empleadoIBM.setPrimerApellido("pan");
		empleadoIBM.setSegundoApellido("agua");
		empleadoIBM.setPuesto("senior developer java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("digoe1");
		empleadoMicrosoft.setPrimerApellido("pan1");
		empleadoMicrosoft.setSegundoApellido("agua1");
		empleadoMicrosoft.setPuesto("senior developer java1");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("digoe2");
		empleadoApple.setPrimerApellido("pan2");
		empleadoApple.setSegundoApellido("agua2");
		empleadoApple.setPuesto("senior developer java2");
		empleadoApple.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
		
		
	}

}
