/*

 */
package proyecto.checkin.checkout;

import javax.swing.JOptionPane;

public class Vuelos 
{
     //Atributos
     private String Nombre;
     private String ID;
     private String Salida;
     private String Llegada;
     int reserva;
     String viaje;
     int valor;
     
            
    //metodo Mensajes 
  
    public Vuelos()
    {
        Nombre="";
        ID="";
        Salida="";
        Nombre = "";
        Llegada="";
    }

    public void Mensaje2()
    {
                reserva = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si desea reservar un asiento:\nDidite 2  para cerrar reserva: ")); 
                if (reserva == 1)
                {
                        viaje = JOptionPane.showInputDialog("Digite su número de vuelo Elija el Vuelo\n1-Costa Rica-Miami\n2-Costa Rica-Paris\n3-Costa Rica-Panamá\n4-Costa Rica-Japón:  ");
                        String Fila;
                        int columna;
                        int [] [] asiento = new int [2] [20];
                        
                        Fila =JOptionPane.showInputDialog( "Favor ingresar el numero de fila (A-B-C-D) ");
                        String word= "ABCD";
                        String temp=Fila;
                        int fila=word.indexOf(temp);
                        columna=Integer.parseInt(JOptionPane.showInputDialog( "Favor ingresar el numero de asiento (1-20) "));
                            
                        if (asiento[fila - 1] [columna - 1] == 0) 
                        {
                        
                                    
                        JOptionPane.showMessageDialog(null,"Reserva exitosa");
                        }
                
                        else
                        {
                        JOptionPane.showMessageDialog(null, "Asiento ocupado");
                        }              
                }   
                else
                {
                    JOptionPane.showMessageDialog(null,"Cerrando reserva...");
                }
    }

    public void VueloInformacion ()
        {
          String Nombre = javax.swing.JOptionPane.showInputDialog("Digite su nombre: ");
          int ID =  Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite su ID: "));
          String Salida = javax.swing.JOptionPane.showInputDialog("Digite su lugar de salida: ");
          String Llegada = javax.swing.JOptionPane.showInputDialog("Digite su lugar de llegada: ");
          JOptionPane.showMessageDialog(null, "Nombre: " + Nombre +"ID: " + ID +"Salida: " + Salida +"Llegada: " + Llegada);
        }

}
