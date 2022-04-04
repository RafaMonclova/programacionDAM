/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccionExamen2Ismael;

/**
 *
 * @author ismae
 */
public class Plaguicida {

    /**
     * @param args the command line arguments
     */
    int [][] campo;
    Plaguicida(){
        campo=new int [4][4];
        rellenar();
    }
   void   rellenar(){
      for (int i =0; i < campo.length;i++)
          for (int j =0; j < campo[i].length;j++){
              campo[i][j]=(int)(Math.random()*9)+1;
          }
  }
   void mostrar(){
        for (int i =0; i < campo.length;i++){
          for (int j =0; j < campo[i].length;j++){
              System.out.print(campo[j][i]+" ");
          }
          System.out.println();
        }
   }
   void Glifosato(){
      int potencia=(int)(Math.random()*3)+1;
   
      int coordenadaX=(int)(Math.random()*4);
      int coordenadaY=(int)(Math.random()*4);
       System.out.println("potencia:"+potencia+" x:"+coordenadaX+" y:"+coordenadaY);
         // potencia--;
     for (int i =(coordenadaX-potencia+1); i <= (coordenadaX+potencia-1);i++)
          for (int j =(coordenadaY-potencia+1); j <= (coordenadaY+potencia-1);j++){ 
              
              if (i>=0 && i< campo.length && j>=0 && j< campo.length ){
                 int diferencia=0;
                  if( Math.abs(coordenadaX-i)>Math.abs(coordenadaY-j))
                        diferencia=Math.abs(coordenadaX-i);
                  else
                       diferencia=Math.abs(coordenadaY-j);
                /*
                  campo[i][j]-=(potencia-diferencia); 
                  if(campo[i][j]<0) campo[i][j]=0;
                  */
              
                  if (campo[i][j]<(potencia-diferencia))
                      campo[i][j]=0;
                  else
                      campo[i][j]-=(potencia-diferencia);

              }
              
          }
      
   }
   boolean eliminado(){
       boolean eliminado=true;
   
      for (int i =0; i < campo.length;i++)
          for (int j =0; j < campo[i].length;j++){
              if(campo[j][i]>0){
                 eliminado=false;
                 break;
              }
          }
   
        return  eliminado;
   }
    public static void main(String[] args) {
        // TODO code application logic here
        
          Plaguicida p= new Plaguicida();
           p.mostrar();
          while (!p.eliminado()){
           
            p.Glifosato();
             p.mostrar();
             System.out.println();
          }
          
           
           
           
        
        
    }
    
}
