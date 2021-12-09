/*
Clase Pasajeros:
Aqui se hacen todas las funciones con respecto al Pasajeros
Contiene Métodos de Agregación,Eliminación,Busqueda,Vista Gráfica,Lista Textual de Pasajeros
*/ 
package proyecto.checkin.checkout;
//Importación de la libreria de 
import javax.swing.JOptionPane;

//Inicio Clase Pasajeros 
public class Pasajeros 
{
    //Inicializa el Array
    private Pasajeros[][][] Asientos = new Pasajeros[4][4][20];

    //Declaracíon de variables
    String mensaje;
    String Lista;

    //Atributos
    public String Vuelo;
    public String FiladeAsiento;
    public String ColumnadeAsiento;
    public String Nombre;
    public String Apellidos;
    public String Ciudadania;
    public String Estado;
    public static int opcionfinalizar;
    
    //Constructor
    public Pasajeros()
    {
        Vuelo="";
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
            for (int j=0;j<4;j++)
            {
                for (int k=0;k<20;k++)
                {
                    Asientos[i][j][k]= new Pasajeros();
                }
            }
        }
    }
    //Métodos
    public Pasajeros(String Vuelo,String FiladeAsiento,String ColumnadeAsiento, String Nombre, String Apellidos,String Ciudadania,String Estado) 
    {
        this.Vuelo=Vuelo;
        this.FiladeAsiento=FiladeAsiento;
        this.ColumnadeAsiento=ColumnadeAsiento;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Ciudadania = Ciudadania;
        this.Estado =Estado;
       
    }  
    
    //Métodos funcionales
    //Método de registro de Pasajeros
    public void RegistrarPasajero() 
    {       
                //Pedido de datos para el cliente
                String Vuelo=JOptionPane.showInputDialog("Registrar Pasajero\n"+"Elija su Vuelo\n1-Costa Rica-Miami\n2-Costa Rica-Paris\n3-Costa Rica-Panamá\n4-Costa Rica-Japón");
                int OpcionVuelo=Integer.parseInt(Vuelo)-1;
                String[] Destinos = {"Costa Rica-Miami", "Costa Rica-Paris", "Costa Rica-Panamá", "Costa Rica-Japón"};
                String FiladeAsiento =JOptionPane.showInputDialog("Escriba su Fila de Asiento[ A-B-C-D ]");

                //Comprobacion de la fila del asiento
                if (FiladeAsiento.equals("A") ||FiladeAsiento.equals("B") ||FiladeAsiento.equals("C") ||FiladeAsiento.equals("D") )
                {
                    String word= "ABCD";
                    String temp=FiladeAsiento;
                    int Fila=word.indexOf(temp);
                    String ColumnadeAsiento =JOptionPane.showInputDialog("Escriba su Columna del asiento [ 1-20 ]");
                    int Colu=Integer.parseInt(ColumnadeAsiento)-1;

                    //Comprobación de la disponibilidad del asiento
                    if( Asientos[OpcionVuelo][Fila][Colu].Estado=="0" )
                    {
                        Vuelo=Destinos[OpcionVuelo];
                        String Nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
                        String Apellidos = JOptionPane.showInputDialog("Escriba su Apellido: ");
                        String Ciudadania= JOptionPane.showInputDialog("Escriba su Ciudadania: ");
                        String Estado ="1";
                        Asientos[OpcionVuelo][Fila][Colu]= new Pasajeros(Vuelo,FiladeAsiento,ColumnadeAsiento,Nombre,Apellidos,Ciudadania,Estado);
                        JOptionPane.showMessageDialog(null,Vuelo+"\n El pasajero: "+Nombre+" "+Apellidos+" con Ciudadania: "+Ciudadania+" y Numero de Asiento:  "+FiladeAsiento+ColumnadeAsiento+"\n Ha sido registrado con exito :)");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Lo lamentamos, el campo elegido ya ha sido ocupado por otro Pasajero\nIntentelo nuevamente :( ");
                    }
                }
            else
                {
                        JOptionPane.showMessageDialog(null,"La Fila Ingresada no es válida, Intentalo Nuevamente");
                }
    }
    //Método de eliminación de un pasajero
    public void EliminarPasajero() 
    {
            //Pedido de datos para el cliente
            String Vuelo=JOptionPane.showInputDialog("Eliminar Pasajero\n "+"Elija el Vuelo\n 1-Costa Rica-Miami\n2-Costa Rica-Paris\n3-Costa Rica-Panamá\n4-Costa Rica-Japón");
            int OpcionVuelo=Integer.parseInt(Vuelo)-1;
            String FiladeAsiento =JOptionPane.showInputDialog("Escriba la Fila de Asiento[ A-B-C-D ]");

            //Comprobacion de la fila del asiento
            if (FiladeAsiento.equals("A") ||FiladeAsiento.equals("B") ||FiladeAsiento.equals("C") ||FiladeAsiento.equals("D") )
            {
                String word= "ABCD";
                String temp=FiladeAsiento;
                int Fila=word.indexOf(temp);
                String ColumnadeAsiento =JOptionPane.showInputDialog("Escriba la Columna del asiento [ 1-20 ]");
                int Colu=Integer.parseInt(ColumnadeAsiento)-1;

                //Comprobación de la disponibilidad del asiento
                if( Asientos[OpcionVuelo][Fila][Colu].Estado=="1" )
                {
                    Vuelo="";
                    FiladeAsiento="";
                    ColumnadeAsiento="";
                    Nombre = "";
                    Apellidos = "";
                    Ciudadania = "";
                    Estado= "0";
                    Asientos[OpcionVuelo][Fila][Colu]= new Pasajeros(Vuelo,FiladeAsiento,ColumnadeAsiento,Nombre,Apellidos,Ciudadania,Estado);
                    JOptionPane.showMessageDialog(null,"El pasajero ha sido eliminado con exito ");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"El espacio ya se encuentra vacio ");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"La Fila Ingresada no es válida, Intentalo Nuevamente");
            }
    }
    
    //Método de Búsqueda de Pasajeros por Número de asiento
    public void BuscarPasajero()
    {
            //Pedido de datos para el cliente
            String Vuelo=JOptionPane.showInputDialog("Buscar Pasajero\n "+"Elija el Vuelo\n1-Costa Rica-Miami\n2-Costa Rica-Paris\n3-Costa Rica-Panamá\n4-Costa Rica-Japón");
            int OpcionVuelo=Integer.parseInt(Vuelo)-1;
            String[] Destinos = {"Costa Rica-Miami", "Costa Rica-Paris", "Costa Rica-Panamá", "Costa Rica-Japón"};
            String FiladeAsiento =JOptionPane.showInputDialog("Escriba la Fila de Asiento[ A-B-C-D ]");

            //Comprobacion de la fila del asiento
            if (FiladeAsiento.equals("A") ||FiladeAsiento.equals("B") ||FiladeAsiento.equals("C") ||FiladeAsiento.equals("D") )
            {
                String word= "ABCD";
                String temp=FiladeAsiento;
                int Fila=word.indexOf(temp);
                String ColumnadeAsiento =JOptionPane.showInputDialog("Escriba la Columna del asiento [ 1-20 ]");
                int Colu=Integer.parseInt(ColumnadeAsiento)-1;
                //Comprobación de la disponibilidad del asiento
                if( Asientos[OpcionVuelo][Fila][Colu].Estado=="0" )
                    {
                        JOptionPane.showMessageDialog(null,"El espacio seleccionado se encuentra vacio");
                    }
                else
                    {
                        Vuelo=Destinos[OpcionVuelo];
                        JOptionPane.showMessageDialog(null,Vuelo+"\nEl espacio: "+FiladeAsiento+ColumnadeAsiento+" se encuentra ocupado por:\n"+
                        "Nombre: "+Asientos[OpcionVuelo][Fila][Colu].Nombre+" Apellidos: "+Asientos[OpcionVuelo][Fila][Colu].Apellidos+" Ciudadania: "+
                        Asientos[OpcionVuelo][Fila][Colu].Ciudadania);
                    }   
            }
            else
            {
                JOptionPane.showMessageDialog(null,"La Fila Ingresada no es válida, Intentalo Nuevamente");
            }
    }

    //Método de visualización del Pasajeros por medio de una lista
    public void VerListaPasajeros()
    {
        Lista="";
        for (int i=0;i<4;i++)
            {
                String[] Destinos = {"Costa Rica-Miami", "Costa Rica-Paris", "Costa Rica-Panamá", "Costa Rica-Japón"};
                Lista=Lista+"\n"+Destinos[i]+"\n";
                for (int j=0;j<4;j++)
                    {
                        for (int k=0;k<20;k++)
                        {
                            if(Asientos[i][j][k].Estado=="0")
                            {
                                Lista=Lista+"";
                            }
                            else
                            {
                                Lista=Lista+"\nEl espacio: "+Asientos[i][j][k].FiladeAsiento+Asientos[i][j][k].ColumnadeAsiento+" se encuentra ocupado por:\n"+
                                "Nombre: "+Asientos[i][j][k].Nombre+" Apellidos: "+Asientos[i][j][k].Apellidos+" Ciudadania: "+
                                Asientos[i][j][k].Ciudadania;
                            }
                        }
                    }
            }
            JOptionPane.showMessageDialog(null,"╔═.✰.═════════════════════════════════════.✰.═╗\n"+
                                                "                           Lista de Pasajeros\n\n"+Lista+
                                                "\n╚═.✰.════════════════════════════════════.✰.═╝\n");
    }
    //Metodo de Vista Grafica de  los Pasajeros en el vuelo
    public void VerPasajeros()
    {
            mensaje="Filas( - ):[ A B C D ]\nColumnas( | ):[ 1-20 ]\n\n";
            String[] Destinos = {"Costa Rica-Miami", "Costa Rica-Paris", "Costa Rica-Panamá", "Costa Rica-Japón"};
            for (int i=0;i<4;i++)
            {
                mensaje=mensaje+Destinos[i]+"\n";
                for (int j=0;j<4;j++)
                    {
                        for (int k=0;k<20;k++)
                        {
                            if(Asientos[i][j][k].Estado=="0")
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
                    mensaje = mensaje +"\n";
            }
            JOptionPane.showMessageDialog(null,"╔═.✰.═════════════════════════════════════.✰.═╗\n"+
                                                "                           Asientos de los Pasajeros\n\n"+mensaje+
                                                "╚═.✰.════════════════════════════════════.✰.═╝");
    }

    public void CheckoutPasajeros()
    {
            //Instancian las clases
            Equipaje equipaje= new Equipaje();
            Tripulacion tripulacion=new Tripulacion();

            //Pedimos una opcion para finalizar el viaje a los pasajeros
            opcionfinalizar = Integer.parseInt(JOptionPane.showInputDialog(null,"____________________"+"Menu Finalizar Viaje"+
            "____________________\nQue Vuelo deseas Finalizar: \n1-Costa Rica-Miami\n2-Costa Rica-Paris\n3-Costa Rica-Panamá\n4-Costa Rica-Japón"));
            opcionfinalizar= opcionfinalizar-1; 

            //Instanciamos los metodos
            tripulacion.CheckoutTripulantes();
            equipaje.CheckoutEquipaje();

            //Inicio del ciclo
            do
            {
                if (opcionfinalizar>=0 &&opcionfinalizar<4)
                {
                    for (int i=0;i<1;i++)
                    {
                        for (int j=0;j<4;j++)
                            {
                            for (int k=0;k<20;k++)
                                {
                                    Vuelo="";
                                    FiladeAsiento="";
                                    ColumnadeAsiento="";
                                    Nombre = "";
                                    Apellidos = "";
                                    Ciudadania = "";
                                    Estado= "0";
                                    Asientos[opcionfinalizar][j][k]= new Pasajeros(Vuelo,FiladeAsiento,ColumnadeAsiento,Nombre,Apellidos,Ciudadania,Estado);
                                                
                                }
                            }
                    }
                    JOptionPane.showMessageDialog(null,"Vuelo Finalizado");
                }
                else if (opcionfinalizar==4)
                    {
                        JOptionPane.showMessageDialog(null,"Saliendo del menu Finalizar Viajes");
                    }
                else
                {
                    JOptionPane.showMessageDialog(null,"Opcion Invalida");
                }
            
                
            
            }while (opcionfinalizar<0&&opcionfinalizar>4);
    }
}//Fin  Clase Pasajeros