/*
 Software de Control Check in /Check out para una empresa de aviación
 */
package proyecto.checkin.checkout;

import javax.swing.JOptionPane;


public class ProyectoCheckInCheckOut {

    
    public static void main(String[] args)
    {
        
        Pasajeros FIDE_CLASE= new Pasajeros(null, null, null, null, null);
        
        FIDE_CLASE.Prueba();
        
        

       //Acceso al Software de Control
       /* NO BORRAR
       int i=1;
        while (i<2)
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
        }//Fin while acceso

        NO BORRAR */

        //Inicio del Menu
        
        int a=1;
        while (a<2)
        {
            String opcion= JOptionPane.showInputDialog(null,"____________________"+"Menu del Sistema"+"____________________\n"
            +"\n[1] Control Pasajeros"+"\n[2] Control Equipaje"+"\n[3] Control Tripulantes"+"\n[4] Falta*********"+
            "\n[5] Falta**********"+"\n[7] Salir del sistema");
            
            if (opcion.equals("1"))
            {
                int b=2;
                while (b<2)
                {
                    String OpcionPasajeros= JOptionPane.showInputDialog(null,"____________________"+"Menu Pasajeros"+"____________________"
                    +"\n[1] Registrar Pasajero"+"\n[2] Buscar Pasajero"+"\n[3] Ver todos Pasajeros"+"\n[4] Salir Menu Pasajeros");
                    if (OpcionPasajeros.equals("1"))
                    {
                        JOptionPane.showMessageDialog(null,"Registrar Pasajeros");
                    }
                    else if (OpcionPasajeros.equals("2"))
                    {
                        JOptionPane.showMessageDialog(null,"Buscar Pasajeros");
                    }
                    else if (OpcionPasajeros.equals("3"))
                    {
                        JOptionPane.showMessageDialog(null,"Ver Todos Pasajeros");
                    }
                    else if (OpcionPasajeros.equals("4"))
                    {
                        JOptionPane.showMessageDialog(null,"Saliendo del Menu de Pasajeros");
                        break;
                    }   
                }

            }
            else if (opcion.equals("2"))
            {
                int c=2;
                while (c<2)
                {
                    String OpcionEquipaje= JOptionPane.showInputDialog(null,"____________________"+"Menu Equipaje"+"____________________"
                    +"\n[1] Registrar Equipaje"+"\n[2] Buscar Equipaje"+"\n[3] Ver todos Equipaje"+"\n[4] Salir Menu Equipaje");
                    if (OpcionEquipaje.equals("1"))
                    {
                        JOptionPane.showMessageDialog(null,"Registrar Equipaje");
                    }
                    else if (OpcionEquipaje.equals("2"))
                    {
                        JOptionPane.showMessageDialog(null,"Buscar Equipaje");
                    }
                    else if (OpcionEquipaje.equals("3"))
                    {
                        JOptionPane.showMessageDialog(null,"Ver Todos Equipaje");
                    }
                    else if (OpcionEquipaje.equals("4"))
                    {
                        JOptionPane.showMessageDialog(null,"Saliendo del Menu de Equipaje...");
                        break;
                    }   
                }
            }
                       
            else if (opcion.equals("3"))
            {
                int d=2;
                while (d<2)
                {
                    String OpcionTripulante= JOptionPane.showInputDialog(null,"____________________"+"Menu Equipaje"+"____________________"
                    +"\n[1] Registrar Tribulante"+"\n[2] Buscar Tripulante"+"\n[3] Ver todos los Tripulante"+"\n[4] Salir Menu Tripulante");
                    if (OpcionTripulante.equals("1"))
                    {
                        JOptionPane.showMessageDialog(null,"Registrar Tripulante");
                    }
                    else if (OpcionTripulante.equals("2"))
                    {
                        JOptionPane.showMessageDialog(null,"Buscar Tripulante");
                    }
                    
                    else if (OpcionTripulante.equals("3"))
                    {
                        JOptionPane.showMessageDialog(null,"Saliendo del Menu de Tripulante");
                        break;
                    }   
                }
            }
                   
            else if (opcion.equals("4"))
            {
                JOptionPane.showMessageDialog(null,"Opcion 4");
            }
                
            else if (opcion.equals("5"))
            {
                JOptionPane.showMessageDialog(null,"Opcion 5");
            }
                
            else if (opcion.equals("6"))
            {
                JOptionPane.showMessageDialog(null,"Opcion 6");
            }
            else if (opcion.equals("7"))
            {
                JOptionPane.showMessageDialog(null,"Cerrando Programa...\n");
                JOptionPane.showMessageDialog(null,"El programa fue cerrado con exito\n ");
                JOptionPane.showMessageDialog(null,"___________________________Fin del programa___________________________");
            }
                
            else
            {
                JOptionPane.showMessageDialog(null,"Opcion Invalida, Intentelo nuevamente");
            }
        


        }//Fin while Menu
        
    
  
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    }//fin del main
    
    
}//Fin clase ProyectoCheckin/Checkout
