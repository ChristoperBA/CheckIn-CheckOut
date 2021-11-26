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

    //Metodos
    public Tripulacion(String FilaATripulacion, String ColumnaATripulacion, String Nombre, String Apellidos,String Puesto,String NVuelo) 
    {                      
        this.FilaATripulacion=FilaATripulacion;
        this.ColumnaATripulacion=ColumnaATripulacion;
        this.Nombre=Nombre;
        this.Nombre=Apellidos;
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
        JOptionPane.showMessageDialog(null,"Registrar Tripulante");
    }
    
    public void VerTripulante()
    {
        JOptionPane.showMessageDialog(null,"Ver Tripulantes");
    }















}
