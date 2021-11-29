/*
 
 */
package proyecto.checkin.checkout;

import javax.swing.JOptionPane;
public class Equipaje 
{
    //Inicializa el Array
    private Equipaje[][] Espacio = new Equipaje[4][40];
    //Atributos
    public String FilaBodega;
    public String ColumnaBodega;
    public String Color;
    public String NAsiento;
    public String Peso;
    public String Estado;
    String mensaje;
    

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
            for (int j=0;j<40;j++)
            {
                Espacio[i][j]= new Equipaje();
            }
        }
    }

    //Metodos funcionales
    //Registro de Equipajes
    public void RegistrarEquipaje()
    {
            String FilaBodega =JOptionPane.showInputDialog("Escriba la Fila de la Bodega[ A-B-C-D ]: ");
            String word= "ABCD";
            String temp=FilaBodega;
            int Fila=word.indexOf(temp);
            String ColumnaBodega =JOptionPane.showInputDialog("Escriba la Columna de la Bodega [ 1-40 ]: ");
            int Colu=Integer.parseInt(ColumnaBodega)-1;
            //Creamos un if para verificar, si el espacio esta vacio
            if( Espacio[Fila][Colu].Estado=="0" )
                {
                    String Color = JOptionPane.showInputDialog("Escriba el color del Equipaje: ");
                    String NAsiento = JOptionPane.showInputDialog("Escriba el numero de Asiento: ");
                    String Peso= JOptionPane.showInputDialog("Escriba el peso del equipaje: ");
                    String Estado ="1";
                    Espacio[Fila][Colu]= new Equipaje(FilaBodega,ColumnaBodega,Color,NAsiento,Peso,Estado);
                    JOptionPane.showMessageDialog(null,"El equipaje de color: "+Color+" con un Peso:"+Peso+" y su dueño porta el numero de Asiento: "+NAsiento+"\n Ha sido registrado con exito :)");
                }
            else
                {
                    JOptionPane.showMessageDialog(null,"Lo lamentamos, el campo elegido esta lleno\nIntentelo nuevamente :(");
                }
            
    }
    //Busqueda de equipajes
    public void BuscarEquipaje()
    {
                String FiladeAsiento =JOptionPane.showInputDialog("Busqueda de Equipaje"+"Escriba la Fila de Asiento[ A-B-C-D ]");
                String word= "ABCD";
                String temp=FiladeAsiento;
                int Fila=word.indexOf(temp);
                String ColumnadeAsiento =JOptionPane.showInputDialog("Escriba la Columna del asiento [ 1-40 ]");
                int Colu=Integer.parseInt(ColumnadeAsiento)-1;
                if( Espacio[Fila][Colu].Estado=="0" )
                {
                    JOptionPane.showMessageDialog(null,"El espacio seleccionado  de la bodega se encuentra vacio");
                }
                else
                {

                }
                JOptionPane.showMessageDialog(null,"El espacio: "+FiladeAsiento+ColumnadeAsiento+" se encuentra ocupado por el equipaje de:\n"+
                " Numero de Asiento del dueño "+Espacio[Fila][Colu].NAsiento+" Color: "+Espacio[Fila][Colu].Color+" Peso: "
                +Espacio[Fila][Colu].Peso);
                
                
    }

    //Vista de equipajes Graficamente
    public void VerEquipaje()
    {
        {
            mensaje="Filas:[ A B C D ]\nColumnas:[ 1-40 ]\n";
            for (int i=0;i<4;i++)
            {
                for (int j=0;j<40;j++)
                {
                    if(Espacio[i][j].Estado=="0")
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
            
            JOptionPane.showMessageDialog(null,"╔═.✰.══════════════════════════════════════════════════════════════════════════.✰.═╗\n"+
                                                "                           Bodega de Equipajes \n\n"+mensaje+
                                                "╚═.✰.═════════════════════════════════════════════════════════════════════════.✰.═╝");
        }
    }








}//Fin clase Equipaje
