/*
Clase Equipaje:
Aqui se hacen todas las funciones con respecto al Equipaje
Contiene Metodos de Agregación,Eliminación,Busqueda,Vista Gráfica,Lista Textual de Equipajes
*/ 
package proyecto.checkin.checkout;

//Importación de la libreria para las ventanas de diálogo
import javax.swing.JOptionPane;

//Inicio Clase Equipaje
public class Equipaje 
{
    //Inicializa el Array
    private Equipaje[][][] Espacio = new Equipaje[4][4][40];

    //Atributos
    public String Vuelo;
    public String FilaBodega;
    public String ColumnaBodega;
    public String Color;
    public String NAsiento;
    public String Peso;
    public String Estado;
    public static int opcionfinalizar;

    //Declaración de variables
    String mensaje;
    String Lista;
    
    //Métodos
    public Equipaje(String Vuelo,String FilaBodega, String ColumnaBodega, String Color, String NAsiento,String Peso,String Estado) 
    {          
        this.Vuelo=Vuelo;            
        this.FilaBodega=FilaBodega;
        this.ColumnaBodega=ColumnaBodega;
        this.Color=Color;
        this.NAsiento=NAsiento;
        this.Peso=Peso;
        this.Estado=Estado;
    }

    //Constructores
    public Equipaje()
    {
        Vuelo="";
        FilaBodega="";
        ColumnaBodega="";
        Color = "";
        NAsiento = "";
        Peso = "";
        Estado="0";
        
    }
    //Constructor que llene los espacio vacios
    public void LlenadoVacio()
    {
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
                {
                    for (int k=0;k<40;k++)
                    {
                        Espacio[i][j][k]= new Equipaje();
                    }
                }
        }   
    }

    //Métodos funcionales
    //Método de Registro de Equipajes
    public void RegistrarEquipaje()
    {
            //Pedido de datos para el cliente
            String Vuelo=JOptionPane.showInputDialog("Registrar Equipaje\n"+"Elija el Vuelo\n1-Costa Rica-Miami\n2-Costa Rica-Paris\n3-Costa Rica-Panamá\n4-Costa Rica-Japón");
            int OpcionVuelo=Integer.parseInt(Vuelo)-1;
            String[] Destinos = {"Costa Rica-Miami", "Costa Rica-Paris", "Costa Rica-Panamá", "Costa Rica-Japón"};
            String FilaBodega =JOptionPane.showInputDialog("Escriba la Fila de la Bodega[ A-B-C-D ]: ");
            if (FilaBodega.equals("A") ||FilaBodega.equals("B") ||FilaBodega.equals("C") ||FilaBodega.equals("D") )
            {
                String word= "ABCD";
                String temp=FilaBodega;
                int Fila=word.indexOf(temp);
                String ColumnaBodega =JOptionPane.showInputDialog("Escriba la Columna de la Bodega [ 1-40 ]: ");
                int Colu=Integer.parseInt(ColumnaBodega)-1;

                //Comprobación de la disponibilidad del espacio en la bodega
                if( Espacio[OpcionVuelo][Fila][Colu].Estado=="0" )
                    {
                        Vuelo=Destinos[OpcionVuelo];
                        String Color = JOptionPane.showInputDialog("Escriba el color del Equipaje: ");
                        String NAsiento = JOptionPane.showInputDialog("Escriba el numero de Asiento: ");
                        String Peso= JOptionPane.showInputDialog("Escriba el peso del equipaje: ");
                        String Estado ="1";
                        Espacio[OpcionVuelo][Fila][Colu]= new Equipaje(Vuelo,FilaBodega,ColumnaBodega,Color,NAsiento,Peso,Estado);
                        JOptionPane.showMessageDialog(null,"El equipaje de color: "+Color+" con un Peso:"+Peso+" y su dueño porta el numero de Asiento: "+NAsiento+"\n Ha sido registrado con exito :)");
                    }
                else
                    {
                        JOptionPane.showMessageDialog(null,"Lo lamentamos, el campo elegido esta lleno\nIntentelo nuevamente :(");
                    }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"La Fila Ingresada no es válida, Intentalo Nuevamente");
            }
    }
    //Método de Eliminacion de Equipaje
    public void EliminarEquipaje()
    {
            //Pedido de datos para el cliente
            String Vuelo=JOptionPane.showInputDialog("Eliminar Equipaje\n "+"Elija el Vuelo\n 1-Costa Rica-Miami\n2-Costa Rica-Paris\n3-Costa Rica-Panamá\n4-Costa Rica-Japón");
            int OpcionVuelo=Integer.parseInt(Vuelo)-1;
            String FiladeAsiento =JOptionPane.showInputDialog("Escriba la Fila de Asiento[ A-B-C-D ]");
            if (FilaBodega.equals("A") ||FilaBodega.equals("B") ||FilaBodega.equals("C") ||FilaBodega.equals("D") )
            {
                String word= "ABCD";
                String temp=FiladeAsiento;
                int Fila=word.indexOf(temp);
                String ColumnadeAsiento =JOptionPane.showInputDialog("Escriba la Columna del asiento [ 1-20 ]");
                int Colu=Integer.parseInt(ColumnadeAsiento)-1;

                //Comprobación de la disponibilidad del asiento
                if( Espacio[OpcionVuelo][Fila][Colu].Estado=="1" )
                {
                    Vuelo="";
                    FilaBodega="";
                    ColumnaBodega="";
                    Color = "";
                    NAsiento = "";
                    Peso = "";
                    Estado="0";
                    Espacio[OpcionVuelo][Fila][Colu]= new Equipaje(Vuelo,FilaBodega,ColumnaBodega,Color,NAsiento,Peso,Estado);
                    JOptionPane.showMessageDialog(null,"El Equipaje ha sido eliminado con exito ");
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
    //Método de Busqueda de equipajes
    public void BuscarEquipaje()
    {
                //Pedido de datos para el cliente
                String Vuelo=JOptionPane.showInputDialog("Buscar Equipaje"+"Elija el Vuelo\n1-Costa Rica-Miami\n2-Costa Rica-Paris\n3-Costa Rica-Panamá\n4-Costa Rica-Japón");
                int OpcionVuelo=Integer.parseInt(Vuelo)-1;
                String[] Destinos = {"Costa Rica-Miami", "Costa Rica-Paris", "Costa Rica-Panamá", "Costa Rica-Japón"};
                String FiladeAsiento =JOptionPane.showInputDialog("Busqueda de Equipaje"+"Escriba la Fila de Bodega[ A-B-C-D ]");
                if (FilaBodega.equals("A") ||FilaBodega.equals("B") ||FilaBodega.equals("C") ||FilaBodega.equals("D") )
                {
                    String word= "ABCD";
                    String temp=FiladeAsiento;
                    int Fila=word.indexOf(temp);
                    String ColumnadeAsiento =JOptionPane.showInputDialog("Escriba la Columna del Bodega [ 1-40 ]");
                    int Colu=Integer.parseInt(ColumnadeAsiento)-1;

                    //Comprobación de la disponibilidad del asiento
                    if( Espacio[OpcionVuelo][Fila][Colu].Estado=="0" )
                    {
                        JOptionPane.showMessageDialog(null,"El espacio seleccionado  de la Bodega se encuentra vacio");
                    }
                    else
                    {
                        Vuelo=Destinos[OpcionVuelo];
                        JOptionPane.showMessageDialog(null,Vuelo+"\nEl espacio: "+FilaBodega+ColumnaBodega+" se encuentra ocupado por el equipaje de:\n"+
                        " Numero de Asiento del dueño "+Espacio[OpcionVuelo][Fila][Colu].NAsiento+" Color: "+Espacio[OpcionVuelo][Fila][Colu].Color+
                        " Peso: "+Espacio[OpcionVuelo][Fila][Colu].Peso);
                    }    
                }
    }
    //Método de Lista de Equipajes
    public void VerListaEquipajes()
    {
        Lista="";
        for (int i=0;i<4;i++)
            {
                String[] Destinos = {"Costa Rica-Miami", "Costa Rica-Paris", "Costa Rica-Panamá", "Costa Rica-Japón"};
                Lista=Lista+Destinos[i]+"\n";
                for (int j=0;j<4;j++)
                    {
                        for (int k=0;k<40;k++)
                        {
                            if(Espacio[i][j][k].Estado=="0")
                            {
                                Lista=Lista+"";
                            }
                            else
                            {
                                
                                Lista=Lista+"\nEl espacio de bodega: "+Espacio[i][j][k].FilaBodega+Espacio[i][j][k].ColumnaBodega+
                                " se encuentra ocupado por:"+Espacio[i][j][k].NAsiento+"Color: "+Espacio[i][j][k].Color+" Numero Asiento: "+
                                Espacio[i][j][k].NAsiento+" Peso: "+Espacio[i][j][k].Peso;
                            }
                        }
                    }
            }
            JOptionPane.showMessageDialog(null,"╔═.✰.═════════════════════════════════════.✰.═╗\n"+
                                                "                           Inventario de Bodegas\n\n"+Lista+
                                                "\n╚═.✰.════════════════════════════════════.✰.═╝\n");
    }

    //Vista de Equipajes Gráficamente
    public void VerEquipaje()
    {
        mensaje="Filas:[ A B C D ]\nColumnas:[ 1-40 ]\n";
        String[] Destinos = {"Costa Rica-Miami", "Costa Rica-Paris", "Costa Rica-Panamá", "Costa Rica-Japón"};
        for (int i=0;i<4;i++)
        {
            mensaje=mensaje+Destinos[i]+"\n";
            for (int j=0;j<4;j++)
            {
                for (int k=0;k<40;k++)
                {
                    if(Espacio[i][j][k].Estado=="0")
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
        JOptionPane.showMessageDialog(null,"╔═.✰.══════════════════════════════════════════════════════════════════════════.✰.═╗\n"+
        "                                        Bodega de Equipajes \n\n"+mensaje+
        "╚═.✰.═════════════════════════════════════════════════════════════════════════.✰.═╝");
    }

    public void CheckoutEquipaje()
{
              
            opcionfinalizar-=1;    
            if (opcionfinalizar>=0 && opcionfinalizar<=3) 
            {        
                for (int i=0;i<1;i++)
                {
                    for (int j=0;j<4;j++)
                        {
                         for (int k=0;k<40;k++)
                            {
                                Vuelo="";
                                FilaBodega="";
                                ColumnaBodega="";
                                Color = "";
                                NAsiento = "";
                                Peso = "";
                                Estado="0";
                                Espacio[opcionfinalizar][j][k]= new Equipaje(Vuelo,FilaBodega,ColumnaBodega,Color,NAsiento,Peso,Estado);

                            
               
                            }
                        }
                }
             }
             else
             {
                JOptionPane.showMessageDialog(null,"Opcion invalida, intentalo nuevamente");
             }           
}
    
}//Fin clase Equipaje