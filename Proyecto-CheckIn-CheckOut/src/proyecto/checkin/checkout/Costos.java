
package proyecto.checkin.checkout;

import javax.swing.JOptionPane;
public class Costos 
{
    //Atributos
    private int valor;
    private int ID;
    private int NAsientos;
    private int Total;  
    private String Nombre;
    
    //Metodo Mensajes
    public void Factura()
    {
        Total=0;
        valor=250;
        NAsientos=0;
        int catidadAsientos = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite el número de asientos que agendó:"));
        Nombre = javax.swing.JOptionPane.showInputDialog("Digite su nombre: ");
        ID = Integer.parseInt(JOptionPane.showInputDialog("Digite su ID: "));
        Total = valor * catidadAsientos;
        NAsientos+=catidadAsientos;
        javax.swing.JOptionPane.showMessageDialog(null,"Nombre: " + Nombre +" ID: " + ID + " Su número de asientos reservados: " + NAsientos +" El total de su compra es de:$ " + Total);
    }
       
    
 }
