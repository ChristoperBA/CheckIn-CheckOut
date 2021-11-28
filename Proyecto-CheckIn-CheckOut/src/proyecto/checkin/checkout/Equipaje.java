/*
 
 */
package proyecto.checkin.checkout;

import javax.swing.JOptionPane;
public class Equipaje 
{
    //Inicializa el Array
    private Equipaje[][] Espacio = new Equipaje[4][20];
    //Atributos
    public String FilaBodega;
    public String ColumnaBodega;
    public String Color;
    public String NAsiento;
    public String Peso;
    public String Estado;
    

    //Metodos
    public Equipaje(String FilaBodega, String ColumnaBodega, String Color, String NAsiento,String Peso,String Estado) 
    {                      
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
            for (int j=0;j<20;j++)
            {
                Espacio[i][j]= new Equipaje();
            }
        }
    }

    //Metodo Mensajes
    public void RegistrarEquipaje()
    {
            String FilaBodega =JOptionPane.showInputDialog("Escriba la Fila de la Bodega[ A-B-C-D ]: ");
            String word= "ABCD";
            String temp=FilaBodega;
            int Fila=word.indexOf(temp);
            String ColumnaBodega =JOptionPane.showInputDialog("Escriba la Columna de la Bodega [ 1-20 ]: ");
            int Colu=Integer.parseInt(ColumnaBodega)-1;
            //Creamos un if para verificar, si el espacio esta vacio
            if( Espacio[Fila][Colu].Estado=="0" )
                {
                    String Color = JOptionPane.showInputDialog("Escriba el color del Equipaje: ");
                    String NVuelo = JOptionPane.showInputDialog("Escriba el numero de Asiento: ");
                    String Peso= JOptionPane.showInputDialog("Escriba el peso del equipaje: ");
                    String Estado ="1";
                    Espacio[Fila][Colu]= new Equipaje(FilaBodega,ColumnaBodega,Color,NVuelo,Peso,Estado);
                    JOptionPane.showMessageDialog(null,"El equipaje de color: "+Color+" con un Peso:"+Peso+"y su dueño porta el numero de Asiento: "+NAsiento+"\n Ha sido registrado con exito :)");
                }
            else
                {
                    JOptionPane.showMessageDialog(null,"Lo lamentamos, el campo elegido esta lleno\nIntentelo nuevamente :(");
                }
            
    
    }
    public void BuscarEquipaje()
    {
        JOptionPane.showMessageDialog(null,"Buscar Equipaje");
    }
    public void VerEquipaje()
    {
        JOptionPane.showMessageDialog(null,"Ver Equipajes");
    }








}//Fin clase Equipaje
