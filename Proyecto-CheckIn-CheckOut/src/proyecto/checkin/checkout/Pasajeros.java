
package proyecto.checkin.checkout;

import javax.swing.JOptionPane;
public class Pasajeros 
{
    //Inicializa el Array
    private Pasajeros[][] Asientos = new Pasajeros[4][20];

    //Atributos
    public String FiladeAsiento;
    public String ColumnadeAsiento;
    public String Nombre;
    public String Apellidos;
    public String Ciudadania;
    public String Estado;

    

    //Constructor
    public Pasajeros()
    {
        FiladeAsiento="";
        ColumnadeAsiento="";
        Nombre = "";
        Apellidos = "";
        Ciudadania = "";
        Estado= "0";
    }
    //Constructor que llene los asientos en blanco
    public void LlenadoVacio()
    {
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<20;j++)
            {
                Asientos[i][j]= new Pasajeros();
            }
        }
    }
    //Metodos
    
    public Pasajeros(String FiladeAsiento,String ColumnadeAsiento, String Nombre, String Apellidos,String Ciudadania,String Estado) 
    {
        this.FiladeAsiento=FiladeAsiento;
        this.ColumnadeAsiento=ColumnadeAsiento;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Ciudadania = Ciudadania;
        this.Estado =Estado;
    }  
    
    //Metodo de registro de Pasajeros
    public void RegistrarPasajero() 
    {       
                //Le pedimos al usuario que Ingrese el numero de fila y columna
                String FiladeAsiento =JOptionPane.showInputDialog("Escriba su Fila de Asiento[ A-B-C-D ]");
                String word= "ABCD";
                String temp=FiladeAsiento;
                int Fila=word.indexOf(temp);
                String ColumnadeAsiento =JOptionPane.showInputDialog("Escriba su Columna del asiento [ 1-20 ]");
                int Colu=Integer.parseInt(ColumnadeAsiento)-1;

                //Hacemos una comprobacion por si el campo ya fue elegido
                
                if( Asientos[Fila][Colu].Estado=="0" )
                {

                String Nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
                String Apellidos = JOptionPane.showInputDialog("Escriba su Apellido: ");
                String Ciudadania= JOptionPane.showInputDialog("Escriba su Ciudadania: ");
                String Estado ="1";
                Asientos[Fila][Colu]= new Pasajeros(FiladeAsiento,ColumnadeAsiento,Nombre,Apellidos,Ciudadania,Estado);
                JOptionPane.showMessageDialog(null,"El pasajero: "+Nombre+" "+Apellidos+" con Ciudadania: "+Ciudadania+" y Numero de Asiento:  "+FiladeAsiento+ColumnadeAsiento+"\n Ha sido registrado con exito :)");
               
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Lo lamentamos, el campo elegido ya ha sido ocupado por otro Pasajero\nIntentelo nuevamente :( ");
                }
                
    
    }
    
    //Metodo de Busqueda de Pasajeros por Numero de asiento
    public void BuscarPasajero()
    {
        JOptionPane.showMessageDialog(null,"Buscar Pasajero");
    }


    //Metodo de vista de Pasajeros en el vuelo
    public void VerPasajeros()
    {
        
        JOptionPane.showMessageDialog(null,"Buscar Pasajero");
    }
    
    






}//Fin  Clase Pasajeros


