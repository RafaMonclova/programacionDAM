package repaso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Factura{
    List<Compra> listaCompra;
    
    public Factura(List<Compra> lista){
        listaCompra =lista;
    }
    
    public String facturar(){
		
        double tot=0;
        int puntaje=0;
        String ticket ="";
        double valorCompra=0;
        Iterator it = listaCompra.iterator();
        while (it.hasNext()){
                Compra compra = (Compra)it.next();
                valorCompra = compra.valor();
                /*
                switch (compra.getTipoProd()){
                        case Compra.HARDWARE:
                                valorCompra=compra.getPrecioProd()*10.5;
                                break;
                        case Compra.SOFTWARE:
                                valorCompra=compra.getPrecioProd()*21;
                                break;
                        case Compra.OTRO:
                                valorCompra=compra.getPrecioProd()*5.5;
                                break;
                }
*/
                puntaje = compra.puntaje();
                puntaje++;
                /*
                if (compra.getTipoProd()==Compra.HARDWARE && compra.getCant()>1)
                        puntaje++;
*/
                tot+=valorCompra;
                ticket+=compra.getNomProd()+ " "+ compra.getCant()+ " "+ valorCompra+"\n";
        }
        
        ticket+="El total de su compra es "+tot+"\n";
        ticket+="Su puntaje acumulado es "+puntaje;
        
        return ticket;
    }
    
    public static void main(String[] args) {
        List<Compra> listaC = new ArrayList<>(); 
        /*
        Compra c1 = new CompraBuilder().setNombre("PC").setTipo(Compra.HARDWARE).setCantidad(2).setPrecio(1000).createCompra();
        Compra c2 = new CompraBuilder().setNombre("Antovirus").setTipo(Compra.SOFTWARE).setCantidad(1).setPrecio(150).createCompra();
        Compra c3 = new CompraBuilder().setNombre("Papel").setTipo(Compra.OTRO).setCantidad(5).setPrecio(3).createCompra();
        */
        Compra c1 = new Hardware("PC",2,1000);
        Compra c2 = new Software("Antivirus",1,150);
        Compra c3 = new Compra("Papel",5,3);
        listaC.add(c1);
        listaC.add(c2);
        listaC.add(c3);
        
        Factura f = new Factura(listaC);
        System.out.println(f.facturar());
    }
}

