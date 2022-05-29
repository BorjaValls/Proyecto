import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * Clase Menu
 *
 * Esta es la interfaz principal del programa. Contiene todos los menús y submenús para acceder
 * a las funciones del programa de una forma visual para el usuario.
 * Cuando se inicia el programa se lee el contenido que hay en cada fichero y se cargan a los arrays,
 * así que el programa puede ya contener datos en sus arrays o puede estar vacío.
 * Hay 5 submenús principales, cada uno con varios submenús dependiendo de la acción
 * que se desee hacer.
 * Cada vez que se incorpora un elemento al array éste se escribe en los ficheros.
 * Para salir del programa se debe pulsar la tecla 0.
 *
 * @author Borja Valls García
 * @version 1.1
 */

public class Menu {

	public static void main (String[] args) throws Exception{
		
		Scanner teclado = new Scanner(System.in);
		int telefono, opcion;
		String nombre, dni, direccion, cuentaBancaria, email, sexo, autorizacion, puesto;
		boolean salir = false;
		ListaUsuarios listaUsuarios = new ListaUsuarios ();
		ListaViviendas listaViviendas = new ListaViviendas ();
		ListaReserva listaReservas = new ListaReserva ();
		ListaClientes listaClientes = new ListaClientes ();
		ListaEmpleados listaEmpleados = new ListaEmpleados ();
		
		listaUsuarios.leerUsuarios();
		listaClientes.leerClientes();
		listaEmpleados.leerEmpleados();
		listaViviendas.leerViviendas();
		//listaReservas.leerReservas(listaViviendas);
		
		Vivienda buscarVivienda444 = listaViviendas.buscarNombreViv("Casa Borja");
		Vivienda buscarVivienda4444 = listaViviendas.buscarNombreViv("Piso San Luis");
		Vivienda buscarVivienda44 = listaViviendas.buscarNombreViv("La alegre");
		listaUsuarios.buscarNombre("Borja").anyadirViv(buscarVivienda444);
		listaUsuarios.buscarNombre("Borja").anyadirViv(buscarVivienda4444);
		listaUsuarios.buscarNombre("Carlos").anyadirViv(buscarVivienda44);
		
		try{
			
			do{
				
				System.out.println("\n==============================================\n");
				System.out.println("BIENVENIDO");
				System.out.println("ESTE ES EL MENU PRINCIPAL\n");
				System.out.println("1. Administrar usuario");
				System.out.println("2. Administrar cliente");
				System.out.println("3. Administrar empleado");
				System.out.println("4. Administrar vivienda");
				System.out.println("5. Administrar reservas");
				System.out.println("0. Salir");
				System.out.println("\n==============================================\n");
				
				opcion = teclado.nextInt();
				System.out.println("");
				
				switch(opcion){
					
					case 1:
						
						boolean salir2 = false;
						do{
							
							System.out.println("\n==============================================\n");
							System.out.println("ESTE ES EL MENU PARA ADMINISTRAR USUARIOS\n");
							System.out.println("1. Anyadir usuario");
							System.out.println("2. Buscar usuario");
							System.out.println("3. Eliminar usuario");
							System.out.println("4. Mostrar lista de usuarios");
							System.out.println("0. Volver al menu principal");
							System.out.println("\n==============================================\n");
							int opcion2 = teclado.nextInt();
							System.out.println("");
							
							switch(opcion2){
								
								case 1:
								
									System.out.println("Introduce el telefono");
									telefono = teclado.nextInt();
									
									nombre = teclado.nextLine();
									System.out.println("\nIntroduce el nombre y apellidos");
									nombre = teclado.nextLine();
										
									System.out.println("\nIntroduce el DNI");
									dni = teclado.nextLine();
										
									System.out.println("\nIntroduce la direccion");
									direccion = teclado.nextLine();
										
									System.out.println("\nIntroduce la cuenta bancaria");
									cuentaBancaria = teclado.nextLine();
										
									System.out.println("\nIntroduce el email");
									email = teclado.nextLine();
										
									System.out.println("\nIntroduce el sexo");
									sexo = teclado.nextLine();
										
									Usuario usuario = new Usuario (telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
									listaUsuarios.anyadir(usuario);
									System.out.println("\nUsuario creado con exito");
									listaUsuarios.guardarUsuarios();
									
								
								break;
								
								case 2:
									
									boolean salir3 = false;
									Usuario buscarUsuario;
									
									do{
										
										System.out.println("\n==============================================\n");
										System.out.println("ESTE ES EL MENU PARA BUSCAR USUARIOS\n");
										//System.out.println("1. Buscar por ID");
										System.out.println("1. Buscar por nombre");
										System.out.println("2. Buscar por DNI");
										System.out.println("0. Volver al menu de usuario");
										System.out.println("\n==============================================\n");
										int opcion3 = teclado.nextInt();
										System.out.println("");
									
										switch(opcion3){
											
											/*case 1:
												
												System.out.print("Introduce el ID: ");
												int aux = teclado.nextInt();
												buscarUsuario = listaUsuarios.buscarID(aux);
												
												System.out.println("");
												if (buscarUsuario != null){
													
													System.out.println(buscarUsuario);
												
												}else
												
													System.out.println("No existe ningun usuario con ese ID");
											
											break;*/
											
											case 1:
												
												String aux2 = teclado.nextLine();
												System.out.print("Introduce el nombre: ");
												aux2 = teclado.nextLine();
												buscarUsuario = listaUsuarios.buscarNombre(aux2);
												
												System.out.println("");
												if (buscarUsuario != null){
													
													System.out.println(buscarUsuario);
												
												}else
												
													System.out.println("No existe ningun usuario con ese nombre");
											
											break;
											
											case 2:
												
												String aux3 = teclado.nextLine();
												System.out.print("Introduce el DNI: ");
												aux3 = teclado.nextLine();
												buscarUsuario = listaUsuarios.buscarDni(aux3);
												
												System.out.println("");
												if (buscarUsuario != null){
													
													System.out.println(buscarUsuario);
												
												}else
												
													System.out.println("No existe ningun usuario con ese DNI");
											
											break;
											
											case 0:
											
												salir3 = true;
											
											break;

											default:

												System.out.println("Input no valido");

											break;
											
										}
										
									}while(!salir3);
									
								
								break;
								
								case 3:
									
									boolean salir4 = false;
									boolean buscarUsuario2;
									
									do{
										
										listaUsuarios.guardarUsuarios();
										System.out.println("\n==============================================\n");
										System.out.println("ESTE ES EL MENU PARA ELIMINAR USUARIOS\n");
										//System.out.println("1. Eliminar por ID");
										System.out.println("1. Eliminar por nombre");
										System.out.println("2. Eliminar por DNI");
										System.out.println("0. Volver al menu de usuario");
										System.out.println("\n==============================================\n");
										int opcion3 = teclado.nextInt();
										System.out.println("");
									
										switch(opcion3){
											
											/*case 1:
												
												System.out.print("Introduce el ID: ");
												int aux = teclado.nextInt();
												buscarUsuario2 = listaUsuarios.eliminarID(aux);
												
												System.out.println("");
												if (buscarUsuario2 != false){
													
													System.out.println("Borrado con exito");
												
												}else
												
													System.out.println("No existe ningun usuario con ese ID");
											
											break;*/
											
											case 1:
												
												String aux2 = teclado.nextLine();
												System.out.print("Introduce el nombre: ");
												aux2 = teclado.nextLine();
												buscarUsuario2 = listaUsuarios.eliminarNombre(aux2);
												
												System.out.println("");
												if (buscarUsuario2 != false){
													
													System.out.println("Borrado con exito");
												
												}else
												
													System.out.println("No existe ningun usuario con ese nombre");
											
											break;
											
											case 2:
												
												String aux3 = teclado.nextLine();
												System.out.print("Introduce el DNI: ");
												aux3 = teclado.nextLine();
												buscarUsuario2 = listaUsuarios.eliminarDni(aux3);
												
												System.out.println("");
												if (buscarUsuario2 != false){
													
													System.out.println("Borrado con exito");
												
												}else
												
													System.out.println("No existe ningun usuario con ese DNI");
											
											break;
											
											case 0:
											
												salir4 = true;
											
											break;

											default:

												System.out.println("Input no valido");

											break;
											
										}
										
									}while(!salir4);
									
								
								break;
								
								
								
								case 4:
								
									System.out.println("");
									System.out.println("LISTA DE USUARIOS");
									System.out.println(listaUsuarios.mostrarLU());
									System.out.println("");
								
								break;
								
								case 0:
					
									System.out.println("Volvemos al menu principal");
									salir2 = true;
								
								break;
								
								default:
					
									System.out.println("Input no valido");
					
								break;
								
							}
							
						}while(!salir2);
					
					break;
					
					case 2:
						
						boolean salir2c = false;
						do{
							
							System.out.println("\n==============================================\n");
							System.out.println("ESTE ES EL MENU PARA ADMINISTRAR CLIENTES\n");
							System.out.println("1. Anyadir cliente");
							System.out.println("2. Buscar cliente");
							System.out.println("3. Eliminar cliente");
							System.out.println("4. Mostrar lista de clientes");
							System.out.println("0. Volver al menu principal");
							System.out.println("\n==============================================\n");
							int opcionC = teclado.nextInt();
							System.out.println("");
							
							switch(opcionC){
								
								case 1:
								
									System.out.println("Introduce el telefono");
									telefono = teclado.nextInt();
									
									nombre = teclado.nextLine();
									System.out.println("\nIntroduce el nombre y apellidos");
									nombre = teclado.nextLine();
										
									System.out.println("\nIntroduce el DNI");
									dni = teclado.nextLine();
										
									System.out.println("\nIntroduce la direccion");
									direccion = teclado.nextLine();
										
									System.out.println("\nIntroduce la cuenta bancaria");
									cuentaBancaria = teclado.nextLine();
										
									System.out.println("\nIntroduce el email");
									email = teclado.nextLine();
										
									System.out.println("\nIntroduce el sexo");
									sexo = teclado.nextLine();
										
									Cliente cliente = new Cliente (telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
									listaClientes.anyadir(cliente);
									System.out.println("\nCliente creado con exito");
									listaClientes.guardarClientes();
								
								break;
								
								case 2:
									
									boolean salirC = false;
									Cliente buscarCliente;
									
									do{
										
										System.out.println("\n==============================================\n");
										System.out.println("ESTE ES EL MENU PARA BUSCAR CLIENTES\n");
										//System.out.println("1. Buscar por ID");
										System.out.println("1. Buscar por nombre");
										System.out.println("2. Buscar por DNI");
										System.out.println("0. Volver al menu de cliente");
										System.out.println("\n==============================================\n");
										int opcionCl = teclado.nextInt();
										System.out.println("");
									
										switch(opcionCl){
											
											/*case 1:
												
												System.out.print("Introduce el ID: ");
												int auxc = teclado.nextInt();
												buscarCliente = listaClientes.buscarID(auxc);
												
												System.out.println("");
												if (buscarCliente != null){
													
													System.out.println(buscarCliente);
												
												}else
												
													System.out.println("No existe ningun cliente con ese ID");
											
											break;*/
											
											case 1:
												
												String aux2c = teclado.nextLine();
												System.out.print("Introduce el nombre: ");
												aux2c = teclado.nextLine();
												buscarCliente = listaClientes.buscarNombre(aux2c);
												
												System.out.println("");
												if (buscarCliente != null){
													
													System.out.println(buscarCliente);
												
												}else
												
													System.out.println("No existe ningun cliente con ese nombre");
											
											break;
											
											case 2:
												
												String aux3c = teclado.nextLine();
												System.out.print("Introduce el DNI: ");
												aux3c = teclado.nextLine();
												buscarCliente = listaClientes.buscarDni(aux3c);
												
												System.out.println("");
												if (buscarCliente != null){
													
													System.out.println(buscarCliente);
												
												}else
												
													System.out.println("No existe ningun cliente con ese DNI");
											
											break;
											
											case 0:
											
												salirC = true;
											
											break;

											default:

												System.out.println("Input no valido");

											break;
											
										}
										
									}while(!salirC);
									
								
								break;
								
								case 3:
									
									boolean salir4c = false;
									boolean buscarUsuario2c;
									
									do{
										
										listaClientes.guardarClientes();
										System.out.println("\n==============================================\n");
										System.out.println("ESTE ES EL MENU PARA ELIMINAR CLIENTES\n");
										//System.out.println("1. Eliminar por ID");
										System.out.println("1. Eliminar por nombre");
										System.out.println("2. Eliminar por DNI");
										System.out.println("0. Volver al menu de cliente");
										System.out.println("\n==============================================\n");
										int opcion3 = teclado.nextInt();
										System.out.println("");
									
										switch(opcion3){
											
											/*case 1:
												
												System.out.print("Introduce el ID: ");
												int aux = teclado.nextInt();
												buscarUsuario2c = listaClientes.eliminarID(aux);
												
												System.out.println("");
												if (buscarUsuario2c != false){
													
													System.out.println("Borrado con exito");
												
												}else
												
													System.out.println("No existe ningun cliente con ese ID");
											
											break;*/
											
											case 1:
												
												String aux2 = teclado.nextLine();
												System.out.print("Introduce el nombre: ");
												aux2 = teclado.nextLine();
												buscarUsuario2c = listaClientes.eliminarNombre(aux2);
												
												System.out.println("");
												if (buscarUsuario2c != false){
													
													System.out.println("Borrado con exito");
												
												}else
												
													System.out.println("No existe ningun cliente con ese nombre");
											
											break;
											
											case 2:
												
												String aux3 = teclado.nextLine();
												System.out.print("Introduce el DNI: ");
												aux3 = teclado.nextLine();
												buscarUsuario2c = listaClientes.eliminarDni(aux3);
												
												System.out.println("");
												if (buscarUsuario2c != false){
													
													System.out.println("Borrado con exito");
												
												}else
												
													System.out.println("No existe ningun cliente con ese DNI");
											
											break;
											
											case 0:
											
												salir4c = true;
											
											break;

											default:

												System.out.println("Input no valido");

											break;
											
										}
										
									}while(!salir4c);
									
								
								break;
								
								
								
								case 4:
								
									System.out.println("");
									System.out.println("LISTA DE CLIENTES");
									System.out.println(listaClientes.mostrarLE());
									System.out.println("");
								
								break;
								
								case 0:
					
									System.out.println("Volvemos al menu principal");
									salir2c = true;
								
								break;
								
								default:
					
									System.out.println("Input no valido");
					
								break;
								
							}
							
						}while(!salir2c);
					
					break;
					
					case 3:
					
						boolean salir2e = false;
						do{
							
							System.out.println("\n==============================================\n");
							System.out.println("ESTE ES EL MENU PARA ADMINISTRAR EMPLEADOS\n");
							System.out.println("1. Anyadir empleado");
							System.out.println("2. Buscar empleado");
							System.out.println("3. Eliminar empleado");
							System.out.println("4. Mostrar lista de empleados");
							System.out.println("0. Volver al menu principal");
							System.out.println("\n==============================================\n");
							int opcion2 = teclado.nextInt();
							System.out.println("");
							
							switch(opcion2){
								
								case 1:
								
									System.out.println("Introduce el telefono");
									telefono = teclado.nextInt();
									
									nombre = teclado.nextLine();
									System.out.println("\nIntroduce el nombre y apellidos");
									nombre = teclado.nextLine();
										
									System.out.println("\nIntroduce el DNI");
									dni = teclado.nextLine();
										
									System.out.println("\nIntroduce la direccion");
									direccion = teclado.nextLine();
										
									System.out.println("\nIntroduce la cuenta bancaria");
									cuentaBancaria = teclado.nextLine();
										
									System.out.println("\nIntroduce el email");
									email = teclado.nextLine();
										
									System.out.println("\nIntroduce el sexo");
									sexo = teclado.nextLine();
									
									System.out.println("\nIntroduce nivel de autorizacion");
									autorizacion = teclado.nextLine();
									
									System.out.println("\nIntroduce puesto de trabajo");
									puesto = teclado.nextLine();
										
									Empleado empleado = new Empleado (autorizacion, puesto, telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
									listaEmpleados.anyadir(empleado);
									System.out.println("\nEmpleado creado con exito");
									listaEmpleados.guardarEmpleados();
									
								
								break;
								
								case 2:
									
									boolean salir3e = false;
									Empleado buscarEmpleado;
									
									do{
										
										System.out.println("\n==============================================\n");
										System.out.println("ESTE ES EL MENU PARA BUSCAR EMPLEADOS\n");
										//System.out.println("1. Buscar por ID");
										System.out.println("1. Buscar por nombre");
										System.out.println("2. Buscar por DNI");
										System.out.println("0. Volver al menu de empleados");
										System.out.println("\n==============================================\n");
										int opcion3e = teclado.nextInt();
										System.out.println("");
									
										switch(opcion3e){
											
											/*case 1:
												
												System.out.print("Introduce el ID: ");
												int aux = teclado.nextInt();
												buscarEmpleado = listaEmpleados.buscarID(aux);
												
												System.out.println("");
												if (buscarEmpleado != null){
													
													System.out.println(buscarEmpleado);
												
												}else
												
													System.out.println("No existe ningun empleado con ese ID");
											
											break;*/
											
											case 1:
												
												String aux2 = teclado.nextLine();
												System.out.print("Introduce el nombre: ");
												aux2 = teclado.nextLine();
												buscarEmpleado = listaEmpleados.buscarNombre(aux2);
												
												System.out.println("");
												if (buscarEmpleado != null){
													
													System.out.println(buscarEmpleado);
												
												}else
												
													System.out.println("No existe ningun empleado con ese nombre");
											
											break;
											
											case 2:
												
												String aux3 = teclado.nextLine();
												System.out.print("Introduce el DNI: ");
												aux3 = teclado.nextLine();
												buscarEmpleado = listaEmpleados.buscarDni(aux3);
												
												System.out.println("");
												if (buscarEmpleado != null){
													
													System.out.println(buscarEmpleado);
												
												}else
												
													System.out.println("No existe ningun empleado con ese DNI");
											
											break;
											
											case 0:
											
												salir3e = true;
											
											break;

											default:

												System.out.println("Input no valido");

											break;
											
										}
										
									}while(!salir3e);
									
								
								break;
								
								case 3:
									
									boolean salir4e = false;
									boolean buscarEmpleado2;
									
									do{
										
										listaEmpleados.guardarEmpleados();
										System.out.println("\n==============================================\n");
										System.out.println("ESTE ES EL MENU PARA ELIMINAR EMPLEADOS\n");
										//System.out.println("1. Eliminar por ID");
										System.out.println("1. Eliminar por nombre");
										System.out.println("2. Eliminar por DNI");
										System.out.println("0. Volver al menu de empleados");
										System.out.println("\n==============================================\n");
										int opcion3 = teclado.nextInt();
										System.out.println("");
									
										switch(opcion3){
											
											/*case 1:
												
												System.out.print("Introduce el ID: ");
												int aux = teclado.nextInt();
												buscarEmpleado2 = listaEmpleados.eliminarID(aux);
												
												System.out.println("");
												if (buscarEmpleado2 != false){
													
													System.out.println("Borrado con exito");
												
												}else
												
													System.out.println("No existe ningun cliente con ese ID");
											
											break;*/
											
											case 1:
												
												String aux2 = teclado.nextLine();
												System.out.print("Introduce el nombre: ");
												aux2 = teclado.nextLine();
												buscarEmpleado2 = listaEmpleados.eliminarNombre(aux2);
												
												System.out.println("");
												if (buscarEmpleado2 != false){
													
													System.out.println("Borrado con exito");
												
												}else
												
													System.out.println("No existe ningun cliente con ese nombre");
											
											break;
											
											case 2:
												
												String aux3 = teclado.nextLine();
												System.out.print("Introduce el DNI: ");
												aux3 = teclado.nextLine();
												buscarEmpleado2 = listaEmpleados.eliminarDni(aux3);
												
												System.out.println("");
												if (buscarEmpleado2 != false){
													
													System.out.println("Borrado con exito");
												
												}else
												
													System.out.println("No existe ningun cliente con ese DNI");
											
											break;
											
											case 0:
											
												salir4e = true;
											
											break;

											default:

												System.out.println("Input no valido");

											break;
											
										}
										
									}while(!salir4e);
									
								
								break;
								
								
								
								case 4:
								
									System.out.println("");
									System.out.println("LISTA DE EMPLEADOS");
									System.out.println(listaEmpleados.mostrarLE());
									System.out.println("");
								
								break;
								
								case 0:
					
									System.out.println("Volvemos al menu principal");
									salir2e = true;
								
								break;
								
								default:
					
									System.out.println("Input no valido");
					
								break;
								
							}
							
						}while(!salir2e);
					
					break;
					
					case 4:
					
						boolean salir4e = false;
						do{
							
							System.out.println("\n==============================================\n");
							System.out.println("ESTE ES EL MENU PARA ADMINISTRAR VIVIENDAS\n");
							System.out.println("1. Anyadir vivenda");
							System.out.println("2. Buscar vivienda");
							System.out.println("3. Eliminar vivienda");
							System.out.println("4. Mostrar lista de viviendas");
							System.out.println("0. Volver al menu principal");
							System.out.println("\n==============================================\n");
							int opcion4 = teclado.nextInt();
							System.out.println("");
							
							switch(opcion4){
								
								case 1:
								
									System.out.println("\nIntroduce el precio por noche");
									double precio = teclado.nextDouble();
									
									String nombre2 = teclado.nextLine();
									System.out.println("\nIntroduce el nombre");
									nombre2 = teclado.nextLine();
										
									System.out.println("\nIntroduce las dimensiones");
									String dimensiones = teclado.nextLine();
									
									System.out.println("\nIntroduce la direccion");
									String direccion2 = teclado.nextLine();
									
									System.out.println("\nIntroduce el estado de la vivienda");
									String estado = teclado.nextLine();	
										
									System.out.println("\nIntroduce la descripcion de la vivienda (si es necesaria)");
									String descripcion = teclado.nextLine();
										
									Vivienda vivienda = new Vivienda (precio, nombre2, dimensiones, direccion2, estado, descripcion);
									listaViviendas.anyadir(vivienda);
										
									System.out.println("\nVivienda creada con exito");
									
									boolean introducido = false;
									
									while (!introducido){
										
										System.out.println("Introduce el usuario al que pertenece la vivienda");
										System.out.println("Pulsar 1 para introducir nombre, 2 para introducir DNI");
										int idUs, auxInt = teclado.nextInt();
										String usuarioViv;
										Usuario buscar;
										
										switch(auxInt){
											
											/*case 1:
											
												System.out.println("Introduce ID");
												idUs = teclado.nextInt();
												buscar = listaUsuarios.buscarID(idUs);
												
												if (buscar != null){
													
													listaUsuarios.buscarID(idUs).anyadirViv(vivienda);
													System.out.println("Vivienda anyadida a usuario con exito");
													introducido = true;
													
												}else System.out.println("El ID no existe");
											
											break;*/
											
											case 1:
												
												usuarioViv = teclado.nextLine();
												System.out.println("Introduce nombre");
												usuarioViv = teclado.nextLine();
												buscar = listaUsuarios.buscarNombre(usuarioViv);
												
												if (buscar != null){
													
													listaUsuarios.buscarNombre(usuarioViv).anyadirViv(vivienda);
													System.out.println("Vivienda anyadida a usuario con exito");
													introducido = true;
													
												}else System.out.println("El nombre no existe");
											
											break;
											
											case 2:
												
												usuarioViv = teclado.nextLine();
												System.out.println("Introduce DNI");
												usuarioViv = teclado.nextLine();
												buscar = listaUsuarios.buscarDni(usuarioViv);
												
												if (buscar != null){
													
													listaUsuarios.buscarDni(usuarioViv).anyadirViv(vivienda);
													System.out.println("Vivienda anyadida a usuario con exito");
													introducido = true;
													
												}else System.out.println("El DNI no existe");
											
											break;

											default:

												System.out.println("Input no valido");

											break;
											
										}
										
									}
									
									listaViviendas.guardarViviendas();
									
								break;
								
								case 2:
									
									boolean salir4f = false;
									Vivienda buscarVivienda;
									
									do{
										
										System.out.println("\n==============================================\n");
										System.out.println("ESTE ES EL MENU PARA BUSCAR VIVIENDA\n");
										System.out.println("1. Buscar por nombre");
										System.out.println("0. Volver al menu de viviendas");
										System.out.println("\n==============================================\n");
										int opcion3e = teclado.nextInt();
										System.out.println("");
									
										switch(opcion3e){
											
											case 1:
												
												String aux = teclado.nextLine();
												System.out.print("Introduce el nombre: ");
												aux = teclado.nextLine();
												buscarVivienda = listaViviendas.buscarNombreViv(aux);
												
												System.out.println("");
												if (buscarVivienda != null){
													
													System.out.println(buscarVivienda);
												
												}else
												
													System.out.println("No existe ninguna vivienda con ese nombre");
											
											break;
											
											case 0:
											
												salir4f = true;
											
											break;

											default:

												System.out.println("Input no valido");

											break;
											
										}
										
									}while(!salir4f);
									
								
								break;
								
								case 3:
									
									boolean salir4g = false;
									boolean buscarVivienda2;
									
									do{
										
										listaViviendas.guardarViviendas();
										System.out.println("\n==============================================\n");
										System.out.println("ESTE ES EL MENU PARA ELIMINAR VIVIENDA\n");
										System.out.println("1. Eliminar por nombre");
										System.out.println("0. Volver al menu de viviendas");
										System.out.println("\n==============================================\n");
										int opcion3 = teclado.nextInt();
										System.out.println("");
									
										switch(opcion3){
											
											case 1:
												
												String aux = teclado.nextLine();
												System.out.print("Introduce el nombre: ");
												aux = teclado.nextLine();
												buscarVivienda2 = listaUsuarios.borrarVivUs(aux);
												
												System.out.println("");
												if (buscarVivienda2 != false){
													
													listaViviendas.eliminarNombreViv(aux);
													System.out.println("Borrado con exito");
												
												}else
												
													System.out.println("No existe ninguna vivienda con ese nombre");
											
											break;
											
											case 0:
											
												salir4g = true;
											
											break;

											default:

												System.out.println("Input no valido");

											break;
											
										}
										
									}while(!salir4g);
									
								
								break;
								
								case 4:
								
									System.out.println("");
									System.out.println("LISTA DE VIVIENDAS");
									System.out.println(listaViviendas.mostrarLV());
									System.out.println("");
								
								break;
								
								case 0:
					
									System.out.println("Volvemos al menu principal");
									salir4e = true;
								
								break;
								
								default:
					
									System.out.println("Input no valido");
					
								break;
								
							}
							
						}while(!salir4e);
					
					break;
					
					case 5:
						
						boolean salir5c = false;
						do{
							
							System.out.println("\n==============================================\n");
							System.out.println("ESTE ES EL MENU PARA ADMINISTRAR RESERVAS\n");
							System.out.println("1. Anyadir reserva");
							System.out.println("2. Buscar reserva");
							System.out.println("3. Eliminar reserva");
							System.out.println("4. Mostrar lista de reservas");
							System.out.println("0. Volver al menu principal");
							System.out.println("\n==============================================\n");
							int opcionR = teclado.nextInt();
							System.out.println("");
							
							switch(opcionR){
								
								case 1:
									
									String pago = teclado.nextLine();
									System.out.println("\nIntroduce el tipo de pago");
									pago = teclado.nextLine();
										
									System.out.println("\nIntroduce detalles a añadir");
									String detalles = teclado.nextLine();
										
									System.out.println("\nIntroduce nombre de la vivienda");
									String auxx = teclado.nextLine();
									
									Vivienda buscarVivienda2 = listaViviendas.buscarNombreViv(auxx);
									
									if (buscarVivienda2 == null){
										
										System.out.println("\nLa vivienda no existe, repita el proceso");
										break;
										
									}
									
									Reserva reserva = new Reserva (pago, detalles, buscarVivienda2);
									listaReservas.anyadir(reserva);
									
									System.out.println("\nIntroduce el dia de entrada en formato dd/MM/yyyy");
									String inicio = teclado.next();
									reserva.setInicio(inicio);
									
									System.out.println("\nIntroduce el dia de salida en formato dd/MM/yyyy");
									String fin = teclado.next();
									reserva.setFinal(fin);
									reserva.setImporte();
									reserva.setDuracion();
									
									System.out.println("\nReserva creada con exito");
									System.out.println("\nReserva generada: \n\n" +reserva.mostrarReserva());
									listaReservas.guardarReservas();
									listaReservas.generarReserva(reserva);
									
								
								break;
								
								case 2:
									
									boolean salirR2 = false;
									Reserva buscarReserva;
									
									do{
										
										System.out.println("\n==============================================\n");
										System.out.println("ESTE ES EL MENU PARA BUSCAR RESERVAS\n");
										System.out.println("1. Buscar por ID");
										System.out.println("0. Volver al menu de reservas");
										System.out.println("\n==============================================\n");
										int opcionR2 = teclado.nextInt();
										System.out.println("");
									
										switch(opcionR2){
											
											case 1:
												
												System.out.print("Introduce el ID: ");
												int auxr = teclado.nextInt();
												buscarReserva = listaReservas.buscarCodReserva(auxr);
												
												System.out.println("");
												if (buscarReserva != null){
													
													System.out.println(buscarReserva);
												
												}else
												
													System.out.println("No existe ninguna reserva con ese ID");
											
											break;
											
											case 0:
											
												salirR2 = true;
											
											break;

											default:

												System.out.println("Input no valido");

											break;
											
										}
										
									}while(!salirR2);
									
								
								break;
								
								case 3:
									
									boolean salir5r = false;
									boolean buscarReserva2c;
									
									do{
										
										listaReservas.guardarReservas();
										System.out.println("\n==============================================\n");
										System.out.println("ESTE ES EL MENU PARA ELIMINAR RESERVAS\n");
										System.out.println("1. Eliminar por ID");
										System.out.println("0. Volver al menu de reserva");
										System.out.println("\n==============================================\n");
										int opcion3r = teclado.nextInt();
										System.out.println("");
									
										switch(opcion3r){
											
											case 1:
												
												System.out.print("Introduce el ID: ");
												int auxr = teclado.nextInt();
												buscarReserva2c = listaReservas.eliminarCodReserva(auxr);
												
												System.out.println("");
												if (buscarReserva2c != false){
													
													System.out.println("Borrado con exito");
												
												}else
												
													System.out.println("No existe ninguna reserva con ese ID");
											
											break;
											
											case 0:
											
												salir5r = true;
											
											break;

											default:

												System.out.println("Input no valido");

											break;
											
										}
										
									}while(!salir5r);
									
								
								break;
								
								
								
								case 4:
								
									System.out.println("");
									System.out.println("LISTA DE RESERVAS");
									System.out.println(listaReservas.mostrarLR());
									System.out.println("");
								
								break;
								
								case 0:
					
									System.out.println("Volvemos al menu principal");
									salir5c = true;
								
								break;
								
								default:
					
									System.out.println("Input no valido");
					
								break;
								
							}
							
						}while(!salir5c);
					
					break;
					
					case 0:
						
						System.out.println("Gracias por utilizar el programa!!");
						salir = true;
					
					break;
					
					default:
					
						System.out.println("Input no valido");
					
					break;
					
				}
			
			}while(!salir);
		
		}catch (Exception e){
			
			System.out.println("Algo ha salido mal, intentar otra vez");
			
		}
		
	}
	
}

