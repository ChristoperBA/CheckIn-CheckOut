/*
Clase Tripulación:
Aqui se hacen todas las funciones con respecto a la Tripulación
Contiene Metodos de Agregación,Eliminación,Busqueda,Vista Gráfica,Lista Textual de Tripulación
*/ 
package proyecto.checkin.checkout;

//Importación de la libreria para las ventanas de diálogo
import javax.swing.JOptionPane;


//Inicio Clase Tripulación 
public class Tripulacion 
{
    //Inicializa el Array
    private Tripulacion[][][] AsientoTripulante = new Tripulacion[4][4][2];
    //Atributos
    public String Vuelo;
    public String FilaATripulacion;
    public String ColumnaATripulacion;
    public String Nombre;
    public String Apellidos;
    public String Puesto;
    public String NVuelo;
    public String Estado;
    public static int opcionfinalizar;

    //Declaración de variables 
    String mensaje;
    String Lista;
    
    //Metodos
    public Tripulacion(String Vuelo,String FilaATripulacion, String ColumnaATripulacion, String Nombre, String Apellidos,String Puesto,String NVuelo,String Estado) 
    {               
        this.Vuelo=Vuelo;       
        this.FilaATripulacion=FilaATripulacion;
        this.ColumnaATripulacion=ColumnaATripulacion;
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.NVuelo=NVuelo;
        this.Puesto=Puesto;
        this.Estado=Estado;

    }
    //Constructores
    public Tripulacion()
    {
        Vuelo="";
        FilaATripulacion="";
        ColumnaATripulacion="";
        Nombre = "";
        Apellidos="";
        Puesto = "";
        NVuelo = "";
        Estado="0";
        
    }
    //Constructor que llene los espacio vacios
    public void LlenadoVacio()
    {
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            {
                for (int k=0;k<2;k++)
                {
                    AsientoTripulante[i][j][k]= new Tripulacion();
                }
            }
        }
    }

    //Métodos funcionales
    //Metodo Mensajes
    public void RegistrarTripulante()
    {
            //Pedido de datos para el cliente
            String Vuelo=JOptionPane.showInputDialog("Registrar Tripulante\n"+"Elija su Vuelo\n1-Costa Rica-Miami\n2-Costa Rica-Paris\n3-Costa Rica-Panamá\n4-Costa Rica-Japón");
            int OpcionVuelo=Integer.parseInt(Vuelo)-1;
            String[] Destinos = {"Costa Rica-Miami", "Costa Rica-Paris", "Costa Rica-Panamá", "Costa Rica-Japón"};
            String FilaATripulacion =JOptionPane.showInputDialog("Escriba la Fila del Asiento[A-B-C-D]: ");
            if (FilaATripulacion.equals("A") ||FilaATripulacion.equals("B") ||FilaATripulacion.equals("C") ||FilaATripulacion.equals("D") )
            {
                String word= "ABCD";
                String temp=FilaATripulacion;
                int Fila=word.indexOf(temp);
                String ColumnaATripulacion =JOptionPane.showInputDialog("Escriba la Columna del Asiento [1-2]: ");
                int Colu=Integer.parseInt(ColumnaATripulacion)-1;

                //Comprobación de la disponibilidad del asiento
                if ( AsientoTripulante[OpcionVuelo][Fila][Colu].Estado=="0" )
                {
                    Vuelo=Destinos[OpcionVuelo];
                    String Nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
                    String Apellidos = JOptionPane.showInputDialog("Escriba sus apellido: ");
                    String NVuelo = JOptionPane.showInputDialog("Escriba el numero de Vuelo: ");
                    String Puesto= JOptionPane.showInputDialog("Escriba el puesto del tripulante: ");
                    String Estado ="1";
                    AsientoTripulante[OpcionVuelo][Fila][Colu]= new Tripulacion(Vuelo,FilaATripulacion,ColumnaATripulacion,Nombre,Apellidos,NVuelo,Puesto,Estado);
                    JOptionPane.showMessageDialog(null,Vuelo+"\n Puesto: "+Puesto+" "+Nombre+" "+Apellidos+" Numero de Vuelo : "+
                    NVuelo+" y Numero de Asiento:  "+FilaATripulacion+ColumnaATripulacion+"\n Ha sido registrado con exito :)");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Lo lamentamos, el campo elegido ya ha sido ocupado por otro Tripulante\nIntentelo nuevamente :( ");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"La Fila Ingresada no es válida, Intentalo Nuevamente");
            }
    }
    
    //Método de Búsqueda de Tripulantes
    public void BusquedaTripulante()
    {
            //Pedido de datos para el cliente
            String Vuelo=JOptionPane.showInputDialog("Buscar Pasajero\n "+"Elija el Vuelo\n 1-Costa Rica-Miami\n2-Costa Rica-Paris\n3-Costa Rica-Panamá\n4-Costa Rica-Japón");
            int OpcionVuelo=Integer.parseInt(Vuelo)-1;
            String[] Destinos = {"Costa Rica-Miami", "Costa Rica-Paris", "Costa Rica-Panamá", "Costa Rica-Japón"};
            String FilaATripulacion =JOptionPane.showInputDialog("Escriba la Fila del Asiento[A-B-C-D]: ");
            if (FilaATripulacion.equals("A") ||FilaATripulacion.equals("B") ||FilaATripulacion.equals("C") ||FilaATripulacion.equals("D") )
            {
                String word= "ABCD";
                String temp=FilaATripulacion;
                int Fila=word.indexOf(temp);
                String ColumnaATripulacion =JOptionPane.showInputDialog("Escriba la Columna del Asiento [1-2]: ");
                int Colu=Integer.parseInt(ColumnaATripulacion)-1;

                //Comprobación de la disponibilidad del asiento
                if( AsientoTripulante[OpcionVuelo][Fila][Colu].Estado=="0" )
                    {
                        JOptionPane.showMessageDialog(null,"El espacio seleccionado  de la bodega se encuentra vacio");
                    }
                    else
                    {
                        Vuelo=Destinos[OpcionVuelo];
                        JOptionPane.showMessageDialog(null,Vuelo+"\nEl Asiento de tripulacion: "+FilaATripulacion+ColumnaATripulacion+" se encuentra ocupado por:\n "+
                        Puesto+" Nombre: "+AsientoTripulante[OpcionVuelo][Fila][Colu].Nombre+" Apellidos: "+AsientoTripulante[OpcionVuelo][Fila][Colu].Apellidos+" Numero de Vuelo: "+
                        AsientoTripulante[OpcionVuelo][Fila][Colu].NVuelo);
                        
                        
                    }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"La Fila Ingresada no es válida, Intentalo Nuevamente");
            }
    }

    //Método Lista de Pasajeros
    public void VerListaTripulacion()
    {
        Lista="";
        String[] Destinos = {"Costa Rica-Miami", "Costa Rica-Paris", "Costa Rica-Panamá", "Costa Rica-Japón"};
        for (int i=0;i<4;i++)
            {
                Lista=Lista+"\n"+Destinos[i];
                for (int j=0;j<4;j++)
                    {
                        for (int k=0;k<2;k++)
                        {
                            if(AsientoTripulante[i][j][k].Estado=="0")
                            {
                                Lista=Lista+"";
                            }
                            else
                            {
                                Lista=Lista+"\nEl espacio: "+AsientoTripulante[i][j][k].FilaATripulacion+AsientoTripulante[i][j][k]. ColumnaATripulacion+
                                " se encuentra ocupado por:\n"+" Nombre: "+AsientoTripulante[i][j][k].Nombre+
                                " Apellidos: "+AsientoTripulante[i][j][k].Apellidos+" Puesto: "+AsientoTripulante[i][j][k].Puesto+AsientoTripulante[i][j][k].NVuelo;
                            }
                        }
                        
                    }
                }    
            JOptionPane.showMessageDialog(null,"╔═.✰.═════════════════════════════════════.✰.═╗\n"+
                                                "                           Lista de Pasajeros\n\n"+Lista+
                                                "\n╚═.✰.════════════════════════════════════.✰.═╝\n");
    }

    //Método de Vista Gráfica de los Tripulantes
    public void VerTripulante()
    {
        mensaje="Filas:[ A B C D ]\nColumnas:[ 1-2 ]\n";
        String[] Destinos = {"Costa Rica-Miami", "Costa Rica-Paris", "Costa Rica-Panamá", "Costa Rica-Japón"};
        for (int i=0;i<4;i++)
        {
                mensaje=mensaje+"\n"+Destinos[i]+"\n";
                for (int j=0;j<4;j++)
                {
                    for (int k=0;k<2;k++)
                    {
                        if(AsientoTripulante[i][j][k].Estado=="0")
                        {
                            mensaje= mensaje + " _ ";
                        }
                        else
                        {
                            mensaje= mensaje + " X ";
                        }
                    }
                    mensaje = mensaje +"\n";
                }
        }
        JOptionPane.showMessageDialog(null,"╔═.✰.═════════════════════════════════════.✰.═╗\n"+
                                                "                        Asientos para Tripulación \n\n"+mensaje+
                                            "╚═.✰.════════════════════════════════════.✰.═╝");
    }
    
    public void CheckoutTripulantes()
    {
    
            
            if (opcionfinalizar>=0 && opcionfinalizar<=3) 
            {        
                for (int i=0;i<1;i++)
                {
                    for (int j=0;j<4;j++)
                        {
                        for (int k=0;k<2;k++)
                            {
                                Vuelo="";
                                FilaATripulacion="";
                                ColumnaATripulacion="";
                                Nombre = "";
                                Apellidos="";
                                Puesto = "";
                                NVuelo = "";
                                Estado="0";
                                AsientoTripulante[opcionfinalizar][j][k]= new Tripulacion(Vuelo,FilaATripulacion,ColumnaATripulacion,Nombre,Apellidos,NVuelo,Puesto,Estado);                
                            }
                        }
                }
             }
             else
             {
                JOptionPane.showMessageDialog(null,"Opcion invalida, intentalo nuevamente");
             }           
}








}//Fin clase Tripulación
