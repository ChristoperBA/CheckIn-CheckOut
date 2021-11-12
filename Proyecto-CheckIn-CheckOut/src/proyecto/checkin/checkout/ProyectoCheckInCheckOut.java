/*
 Software de Control Check in /Check out para una empresa de aviación
 */
package proyecto.checkin.checkout;

import javax.swing.JOptionPane;


public class ProyectoCheckInCheckOut {

    
    public static void main(String[] args)
    {
        //Accesos al Software
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
                             JOptionPane.showMessageDialog(null,"La contraseñe es incorrecta, Intentalo nuevamente ");
                    }

            }
            else 
            {
                JOptionPane.showMessageDialog(null,"Usuario Incorrecto");
            }
        
            
        }
        
        //Iteracion de las clases
        
        //Pasajeros
        Pasajeros ClasePasajeros= new Pasajeros();
        ClasePasajeros.MensajeA();
        
        //Equipaje
        Equipaje ClaseEquipaje =new Equipaje();
        ClaseEquipaje.MensajeA();
        
        //Tripulacion
        Tripulacion ClaseTripulacion =new Tripulacion();
        ClaseTripulacion.MensajeA();
     
        //Vuelos 
        Vuelos ClaseVuelos= new Vuelos(); 
        ClaseVuelos.MensajeB();
        //Asientos 
        Asientos ClaseAsientos= new Asientos();
        ClaseAsientos.MensajeC();
        
        //Costos
        Costos ClaseCostos= new Costos();
        ClaseCostos.MensajeA();
        
        //Horario
        Horario ClaseHorario= new Horario();
        ClaseHorario.MensajeA();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//
    
    
}
