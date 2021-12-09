
package proyecto.checkin.checkout;

//import javax.swing.JOptionPane;
public class Costos 
{
    /*
    //Atributos
    private int valor;
    private String ID;
    private String NAsientos;
    private int Total;  
    
    //Metodo Mensajes
    public void MensajeA()
    {
        JOptionPane.showMessageDialog(null,"Clase Costos");
    }
}*/
    public class Costos 
{
    
    //Atributos
    private int valor = 250;
    private String ID;
    private String NAsientos;
    private int Total; 
    private String Nombre;
    
    //Metodo Mensajes
    public void MensajeA()
    {
        javax.swing.JOptionPane.showMessageDialog(null,"Clase Costos");
    }
    
    public void Factura()
    {
       NAsientos = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite el número de asientos que agendó:"));
       Nombre = javax.swing.JOptionPane.showInputDialog("Digite su nombre: ");
       ID = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite su ID: "));
       Total = valor * NAsientos
     }
        public void Mensaje1()
    {
        javax.swing.JOptionPane.showMessageDialog(null,"Nombre: " + Nombre +"ID: " + ID + "Su número de asientos reservados: " + NAsientos +"El total de su compra es de:$ " + Total);
    }
}
}
