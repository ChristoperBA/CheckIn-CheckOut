/* 
Proyecto Introducción a la programación
Creacion de un Software de control Check-in/Check out para una empresa de aviación comercial
Integrantes: Christopher Briceño Arias Valeria Chacón Quintero Josué Palavicini Godinez
Profesora: Christy Aguero Valverde

--------Año 2021-------- 
*/
package proyecto.checkin.checkout;

//Se importa la libreria para las ventanas de dialogo
import javax.swing.JOptionPane;

public class ProyectoCheckInCheckOut 
{
    //Clase Main
    public static void main(String[] args)
            {

                //Iniciamos el Menú
                Menu();

            }//fin del main


    //Inicio Del Menú
    public static void Menu()
        {
            //Inicio de Acceso
            //Inicio del ciclo para Inicio de sesión
            boolean Acceso = false;
            while (!Acceso)
                {
                    String Usuario=JOptionPane.showInputDialog("Usuario ");
                    if (Usuario.equals("admin"))
                    {
                            String password=JOptionPane.showInputDialog("Digite su contraseña");
                            if (password.equals("123"))
                            {
                                JOptionPane.showMessageDialog(null,"Bienvenido Admin :) ");
                                Acceso = true;
                                break;
                            }
                            else
                            {
                                    JOptionPane.showMessageDialog(null,"La contraseña es incorrecta, Intentalo nuevamente :(");
                            }
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(null,"Usuario Incorrecto :(");
                    }
                }

            //Se instancias las Clases
            Pasajeros pasajeros=new Pasajeros();
            Equipaje equipaje= new Equipaje();
            Tripulacion tripulacion=new Tripulacion();

            //Se instancian los llenados de los arrays utilizados 
            pasajeros.LlenadoVacio();
            equipaje.LlenadoVacio();
            tripulacion.LlenadoVacio();

            //Inicio del ciclo del Menú
            boolean salir = false;
            int opcion;
            while(!salir)
            {
                //Se pide una opcion al cliente sobre las funciones del menú
                opcion= Integer.parseInt(JOptionPane.showInputDialog(null,"____________________"+"Menu del Sistema"+"____________________\n"
                +"\n[1] Control Pasajeros"+"\n[2] Control Equipaje"+"\n[3] Control Tripulantes"+"\n[4] Falta*********"+
                "\n[5] Falta**********"+"\n[6] Salir del sistema"));
                switch(opcion)
                {
                    case 1:
                        int OpcionPasajeros;
                        do
                        {  
                            //Se pide una opcion al cliente sobre las funciones del contro de Pasajeros
                            OpcionPasajeros= Integer.parseInt(JOptionPane.showInputDialog(null,"____________________"+"Menu Pasajeros"+"____________________"+
                            "\n[1] Registrar Pasajero"+"\n[2] Eliminar Pasajero "+"\n[3] Busqueda Pasajeros\n[4] Ver todos Pasajeros"+"\n[5] Ver lista Pasajeros\n[6] Salir Menu Pasajeros"));
                            switch(OpcionPasajeros)
                            {
                                case 1:
                                    pasajeros.RegistrarPasajero();
                                    break;
                                case 2:
                                    pasajeros.EliminarPasajero();
                                    break;
                                case 3:
                                    pasajeros.BuscarPasajero();
                                    break;
                                case 4:
                                    pasajeros.VerPasajeros();
                                    break;
                                case 5:
                                    pasajeros.VerListaPasajeros();
                                    break;
                                case 6:
                                    JOptionPane.showMessageDialog(null,"Saliendo del Menú de Pasajeros");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null,"Opción invalida");
                            }
                        }while(OpcionPasajeros!=6);
                        break;    
                 case 2:
                        int OpcionEquipaje;
                        do
                        {
                            //Se pide una opcion al cliente sobre las funciones del contro de Equipajes
                            OpcionEquipaje= Integer.parseInt(JOptionPane.showInputDialog(null,"____________________"+"Menu Equipaje"+"____________________"
                            +"\n[1] Registrar Equipaje"+"\n[2] Eliminar Equipaje"+"\n[3] Buscar Equipaje"+"\n[4] Vista de Equipajes"+"\n[5] Lista Equipajes"+"\n[6] Salir Menu Equipajes"));
                            switch(OpcionEquipaje)
                            {
                                case 1:
                                    equipaje.RegistrarEquipaje();
                                    break; 
                                case 2:
                                    equipaje.EliminarEquipaje();
                                    break; 
                                case 3:
                                    equipaje.BuscarEquipaje();
                                    break;
                                case 4:
                                    equipaje.VerEquipaje();
                                    break;
                                case 5:
                                    equipaje.VerListaEquipajes();
                                    break; 
                                case 6:
                                    JOptionPane.showMessageDialog(null,"Saliendo del Menu de Equipaje...");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null,"Opcion Invalida, Intentelo nuevamente");   
                            }  
                        }while(OpcionEquipaje!=6);
                        break; 
                 case 3:
                        int OpcionTripulante;
                        do
                        {
                            //Se pide una opcion al cliente sobre las funciones del contro de Tripulantes
                            OpcionTripulante= Integer.parseInt(JOptionPane.showInputDialog(null,"____________________"+"Menu Tripulante"+"____________________"
                            +"\n[1] Registrar Tripulante"+"\n[2] Busqueda de Tripulante"+"\n[3] Vista Tripulantes"+"\n[4] Lista Tripulantes"+"\n[5] Salir Menu Tripulante"));
                            switch(OpcionTripulante)
                            {
                                case 1:
                                    tripulacion.RegistrarTripulante();
                                    break;
                                case 2:
                                    tripulacion.BusquedaTripulante();
                                    break;
                                case 3:
                                    tripulacion.VerTripulante();
                                    break;
                                case 4:
                                    tripulacion.VerListaTripulacion();
                                    break;
                                case 5:
                                    JOptionPane.showMessageDialog(null,"Saliendo del Menu de Tripulante");
                                    break;  
                                default:
                                    JOptionPane.showMessageDialog(null,"Opcion Invalida, Intentelo nuevamente"); 
                            }      
                        } while(OpcionTripulante==5);
                         break;  
                 case 4:
                        JOptionPane.showMessageDialog(null,"Opcion 4*********FALTA************");
                        break;
                 case 5:
                        JOptionPane.showMessageDialog(null,"Opcion 5*********FALTA************");
                        break;
                 case 6:
                        salir=true;
                        JOptionPane.showMessageDialog(null,"Cerrando Programa...\n"+
                        "El programa fue cerrado con exito\n\n"+
                        "___________________________Fin del programa___________________________");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion Invalida, Intentelo nuevamente");
                        
                }//Fin Switch Principal

            }//Fin del While Menú

        }//Contenido Menú
    
}//Fin clase ProyectoCheckin/Checkout
