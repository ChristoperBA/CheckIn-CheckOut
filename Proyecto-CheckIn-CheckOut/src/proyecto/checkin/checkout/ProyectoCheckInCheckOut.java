/*
 Software de Control Check in /Check out para una empresa de aviación
 */
package proyecto.checkin.checkout;

import javax.swing.JOptionPane;


public class ProyectoCheckInCheckOut 
{
    public static void main(String[] args)
            {
                
               // Acceso(); NO BORRAR
                Menu();
        
            }//fin del main

    //Inicio de Acceso
    /*NO BORRAR
    public static void Acceso()
    {
        int p=1;
        while (p<2)
            {
                String Usuario=JOptionPane.showInputDialog("Usuario ");
                if (Usuario.equals("admin"))
                {
                        String password=JOptionPane.showInputDialog("Digite su contraseña");
                        if (password.equals("123"))
                        {
                            JOptionPane.showMessageDialog(null,"Bienvenido Admin ");
                            break;
                        }
                        else
                        {
                                JOptionPane.showMessageDialog(null,"La contraseña es incorrecta, Intentalo nuevamente ");
                        }
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Usuario Incorrecto");
                }
            }
            
    }*/
    

    //Inicio Del Menú
    public static void Menu()
        {
            
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
                opcion= Integer.parseInt(JOptionPane.showInputDialog(null,"____________________"+"Menu del Sistema"+"____________________\n"
                +"\n[1] Control Pasajeros"+"\n[2] Control Equipaje"+"\n[3] Control Tripulantes"+"\n[4] Falta*********"+
                "\n[5] Falta**********"+"\n[7] Salir del sistema"));
                switch(opcion)
                {
                    case 1:
                        int OpcionPasajeros;
                        do
                        {  
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
                                
                                    JOptionPane.showMessageDialog(null,"Saliendo del Menu de Pasajeros");
                                    break;
                                    
                                
                                default:
                                
                                    JOptionPane.showMessageDialog(null,"Opcion invalida");
                                    
                                 
                            }
                        }while(OpcionPasajeros!=4);
                        break;    
                 case 2:
                        int OpcionEquipaje;
                        do
                        {
                            OpcionEquipaje= Integer.parseInt(JOptionPane.showInputDialog(null,"____________________"+"Menu Equipaje"+"____________________"
                            +"\n[1] Registrar Equipaje"+"\n[2] Eliminar Equipaje"+"\n[3] Buscar Equipaje"+"\n[4] Ver todos Equipaje"+"\n[4] Ver Lista Equipaje"+"\n[6] Salir Menu Equipaje"));
                            switch(OpcionEquipaje)
                            {
                                case 1:
                                    equipaje.RegistrarEquipaje();
                                    break; 
                                case 2:
                                     equipaje.EliminarEquipaje(); 
                                case 3:
                                    equipaje.BuscarEquipaje();
                                    break;
                                case 4:
                                    equipaje.VerEquipaje();
                                    break;
                                case 5:
                                    equipaje.VerListaEquipajes();
                                case 6:
                                    JOptionPane.showMessageDialog(null,"Saliendo del Menu de Equipaje...");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null,"Opcion Invalida, Intentelo nuevamente");   
                            }  
                        }while(OpcionEquipaje!=4);
                        break;
                        
                        
                 case 3:
                    
                        int OpcionTripulante;
                        do
                        {
                            OpcionTripulante= Integer.parseInt(JOptionPane.showInputDialog(null,"____________________"+"Menu Tripulante"+"____________________"
                            +"\n[1] Registrar Tripulante"+"\n[2] Busqueda de Tripulante"+"\n[3] Ver todos los Tripulante"+"\n[4] Salir Menu Tripulante"));
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
                                    JOptionPane.showMessageDialog(null,"Saliendo del Menu de Tripulante");
                                    break;  
                                default:
                                    JOptionPane.showMessageDialog(null,"Opcion Invalida, Intentelo nuevamente"); 
                            }      
                        } while(OpcionTripulante==3);
                         break;  
                 case 4:
                        JOptionPane.showMessageDialog(null,"Opcion 4");
                        break;
                        
                 case 5:
                    
                        JOptionPane.showMessageDialog(null,"Opcion 5");
                        break;
                        
                 case 6:
                        JOptionPane.showMessageDialog(null,"Opcion 6");
                        break;
                        
                 case 7:
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
