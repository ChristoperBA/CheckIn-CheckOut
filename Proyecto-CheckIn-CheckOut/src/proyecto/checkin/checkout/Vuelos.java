/*

 */
package proyecto.checkin.checkout;

//import javax.swing.JOptionPane;


public class Vuelos 
{/*
     //Atributos
     private String Nombre;
     private String ID;
     private String Salida;
     private String Llegada;
            
    //metodo Mensajes 
    public void MensajeB()
    {
        JOptionPane.showMessageDialog(null, "Clase Vuelos");  
    }*/
 public void Mensaje2()
            {
                reserva = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite 1 si desea reservar un asiento: ")); 
                
                if (reserva == 1){
                    viaje = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite su número de vuelo (1-4):  "));
 
                    static Scanner entrada = new Scanner (System.in);
                        int cont = 0;
                        int c - 1, fila, columna;
                        int [] [] asiento = new int [2] [40]:
                        while ( c <= 80) {

                            JOptionpane.out.printl( "Favor ingresar el numero de fila (1-2) "):
                            fila = entrada.nextInt ():
                            JOptionpane.out.printl( "Favor ingresar el numero de asiento (1-40) ");
                            columna = entrada.next Int ();

                            if (asiento[fila - 1] [columna - 1] == 0) {
                                asiento [fila - 1] [columna - 1] = 1;
                                c = c + 1;
                               JOptionpane.out.printl( "Reserva exitosa");
                            else if c = 1 * valor
                            JOptionpane.out.printl("Ganancia")
                            }else
                                JOptionpane.out.printl( "Asiento ocupado");
                    }
                        for (int i - 0; i < 2; i++) {
                            for (int j = 0; j < 40; j++)
                                JOptionpane.out.printl(asiento[i][j) + "\t");                                 
                                JOptionpane.out.printl(); }
                    }
                     
    
}
                }
            }
 
        public void VueloInformacion ()
        {
          Nombre = javax.swing.JOptionPane.showInputDialog("Digite su nombre: ");
          ID = = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite su ID: "));
          Salida = javax.swing.JOptionPane.showInputDialog("Digite su lugar de salida: ");
          Llegada = javax.swing.JOptionPane.showInputDialog("Digite su lugar de llegada: ");
        }
            public void Mensaje1()
            {
                JOptionPane.showMessageDialog(null, "Nombre: " + Nombre +"ID: " + ID +"Salida: " + Salida +"Llegada: " + Llegada);
            }
        }
}
 }
                                                               
