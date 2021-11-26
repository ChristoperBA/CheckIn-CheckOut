
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

    //Constructor
    public Pasajeros()
    {
        FiladeAsiento="";
        ColumnadeAsiento="";
        Nombre = "";
        Apellidos = "";
        Ciudadania = "";
    }
    //Constructor que llene los asientos en blano
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
    public Pasajeros(String FiladeAsiento,String ColumnadeAsiento, String Nombre, String Apellidos,String Ciudadania) 
    {
        this.FiladeAsiento=FiladeAsiento;
        this.ColumnadeAsiento=ColumnadeAsiento;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Ciudadania = Ciudadania;

    }
    
    //Metodo de registro de Pasajeros
    public void RegistrarPasajero() 
    {
                String FiladeAsiento =JOptionPane.showInputDialog("Escriba su Fila de Asiento[A-B-C-D]");
                
                String word= "ABCD";
                String temp=FiladeAsiento;
                int Fila=word.indexOf(temp);
                String ColumnadeAsiento =JOptionPane.showInputDialog("Escriba su Columna del asiento [1-20]");
                int colu=Integer.parseInt(ColumnadeAsiento);
                String Nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
                String Apellidos = JOptionPane.showInputDialog("Escriba su Apellido: ");
                String Ciudadania= JOptionPane.showInputDialog("Escriba su Ciudadania: ");
                Asientos[Fila-1][colu-1]= new Pasajeros(FiladeAsiento,ColumnadeAsiento,Nombre,Apellidos,Ciudadania);
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


