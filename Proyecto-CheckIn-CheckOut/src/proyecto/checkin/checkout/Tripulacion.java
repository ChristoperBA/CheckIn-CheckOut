/*
 
 */
package proyecto.checkin.checkout;

import javax.swing.JOptionPane;
public class Tripulacion 
{
    //Inicializa el Array
    private Tripulacion[][] AsientoTripulante = new Tripulacion[4][2];
    //Atributos
    public String FilaATripulacion;
    public String ColumnaATripulacion;
    public String Nombre;
    public String Apellidos;
    public String Puesto;
    public String NVuelo;
    public Estados Estado;

    //Metodos
    public Tripulacion(String FilaATripulacion, String ColumnaATripulacion, String Nombre, String Apellidos,String Puesto,String NVuelo) 
    {                      
        this.FilaATripulacion=FilaATripulacion;
        this.ColumnaATripulacion=ColumnaATripulacion;
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.NVuelo=NVuelo;
        this.Puesto=Puesto;
    }
    //Constructores
    public Tripulacion()
    {
        FilaATripulacion="";
        ColumnaATripulacion="";
        Nombre = "";
        Apellidos="";
        Puesto = "";
        NVuelo = "";
        Estado=Estados.Disponible;
    }
    //Constructor que llene los espacio vacios
    public void LlenadoVacio()
    {
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<2;j++)
            {
                AsientoTripulante[i][j]= new Tripulacion();
            }
        }
    }
    


    //Metodo Mensajes
    public void RegistrarTripulante()
    {
        String FilaATripulacion =JOptionPane.showInputDialog("Escriba la Fila de la Bodega[A-B-C-D]: ");
            String word= "ABCD";
            String temp=FilaATripulacion;
            int Fila=word.indexOf(temp);
            String ColumnaATripulacion =JOptionPane.showInputDialog("Escriba la Columna de la Bodega [1-20]: ");
            int Colu=Integer.parseInt(ColumnaATripulacion)-1;
            //if 
            String Nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
            String Apellidos = JOptionPane.showInputDialog("Escriba sus apellido: ");
            String NVuelo = JOptionPane.showInputDialog("Escriba el numero de Vuelo: ");
            String Puesto= JOptionPane.showInputDialog("Escriba el puesto del tripulante: ");
            //Espacio[Fila][colu]= new Equipaje(FilaBodega,ColumnaBodega,Color,NVuelo,Peso);
            AsientoTripulante[Fila][Colu].FilaATripulacion=FilaATripulacion;
            AsientoTripulante[Fila][Colu].ColumnaATripulacion=ColumnaATripulacion;
            AsientoTripulante[Fila][Colu].Nombre=Nombre;
            AsientoTripulante[Fila][Colu].Apellidos=Apellidos;
            AsientoTripulante[Fila][Colu].NVuelo=NVuelo;
            AsientoTripulante[Fila][Colu].Puesto=Puesto;
            AsientoTripulante[Fila][Colu].Estado=Estados.Ocupado;
    }
    
    public void VerTripulante()
    {
        JOptionPane.showMessageDialog(null,"Ver Tripulantes");
    }















}
