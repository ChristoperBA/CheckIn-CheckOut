
package proyecto.checkin.checkout;

import javax.swing.JOptionPane;
public class Pasajeros 
{
    //Filas 
    char Filas[] = {'A','B','C','D'};
    //Columnas
    int[] Columnas={0,1,2,3,4,5,6,7,8,9};
    
    String[][] Asientos = new String[4][10];
    //Atributos
    public String FiladeAsiento;
    public String ColumnadeAsiento;
    public String Nombre;
    public String Apellidos;
    public String Ciudadania;
    
    //Metodo Mensajes
    public Pasajeros(String FiladeAsiento,String ColumnadeAsiento, String Nombre, String Apellidos,String Ciudadania) {
        this.FiladeAsiento=FiladeAsiento;
        this.ColumnadeAsiento=ColumnadeAsiento;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Ciudadania = Ciudadania;

    }
    public void Prueba()
    {
        for(int x=0;x<4;x++)
        {
            for (int y=0;y<5;y++)
            {
                Asientos[x][y]="_";
                
            }
        }
        JOptionPane.showMessageDialog(null,Asientos);
    }
    
    public void RegistrarPasajero()
    {
           
                String FiladeAsiento =JOptionPane.showInputDialog("Escriba su Fila de Asiento[A,B,C,D]");
                int temp= Integer.parseInt(FiladeAsiento);
                String ColumnadeAsiento =JOptionPane.showInputDialog("Escriba su Columna del asiento[1,2,3,4,5,6,7,8,9,10]");
                int aux=Integer.parseInt(ColumnadeAsiento);
                String Nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
                String Apellidos = JOptionPane.showInputDialog("Escriba su Apellido: ");
                String Ciudadania= JOptionPane.showInputDialog("Escriba su Ciudadania: ");
                //Asientos[temp][aux]= new Pasajeros(FiladeAsiento,ColumnadeAsiento,Nombre,Apellidos,Ciudadania);
                

    }
    
    public void BuscarPasajero()
    {
        JOptionPane.showMessageDialog(null,"Buscar Pasajero");
    }


    /*
    public void VerPasajeros()
    {
        
        System.out.println("Pasajeros");
        for(int x=0 ;x<4 ;x++)
        {
            for(int y=0;y<10; y++)
            {
                JOptionPane.showMessageDialog(null,Asientos[x][y]+"-");
                
            }
            
        }
    }
    */
    






}


