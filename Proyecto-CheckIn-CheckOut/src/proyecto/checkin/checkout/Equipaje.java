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
    public String NVuelo;
    public String Peso;

    //Metodos
    public Equipaje(String FilaBodega, String ColumnaBodega, String Color, String NVuelo,String Peso) 
    {                      
        this.FilaBodega=FilaBodega;
        this.ColumnaBodega=ColumnaBodega;
        this.Color=Color;
        this.NVuelo=NVuelo;
        this.Peso=Peso;
    }

    //Constructores
    public Equipaje()
    {
        FilaBodega="";
        ColumnaBodega="";
        Color = "";
        NVuelo = "";
        Peso = "";
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
            String FilaBodega =JOptionPane.showInputDialog("Escriba la Fila de la Bodega[A-B-C-D]: ");
            String word= "ABCD";
            String temp=FilaBodega;
            int Fila=word.indexOf(temp);
            String ColumnaBodega =JOptionPane.showInputDialog("Escriba la Columna de la Bodega [1-20]: ");
            int colu=Integer.parseInt(ColumnaBodega);
            String Color = JOptionPane.showInputDialog("Escriba el color del Equipaje: ");
            String NVuelo = JOptionPane.showInputDialog("Escriba el numero de Vuelo: ");
            String Peso= JOptionPane.showInputDialog("Escriba el peso del equipaje: ");
            Espacio[Fila-1][colu-1]= new Equipaje(FilaBodega,ColumnaBodega,Color,NVuelo,Peso);
    }
    public void BuscarEquipaje()
    {
        JOptionPane.showMessageDialog(null,"Buscar Equipaje");
    }
    public void VerEquipaje()
    {
        JOptionPane.showMessageDialog(null,"Ver Equipajes");
    }








}
