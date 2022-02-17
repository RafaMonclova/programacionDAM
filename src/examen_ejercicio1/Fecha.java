//RAFAEL MONCLOVA SUANO 1ºDAM
package examen_ejercicio1;

public class Fecha {
    
int dia;
int mes;
int año;

Fecha(){
    
    dia = 1;
    mes = 1;
    año = 2019;
    
}
    
Fecha(int dia, int mes, int año){
    
    this.dia = dia;
    this.mes = mes;
    this.año = año;
    
    
}    
    
void setFecha(int dia, int mes, int año){
    
    if(dia >= 1 && dia <=30 && mes >= 1 && mes <= 12){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    else{
        System.out.println("Fecha inválida: Día entre 1 y 30, Mes entre 1 y 12");
    }
    
}    
    
void setFecha(String fecha){
    
    int dia = Integer.parseInt(fecha.substring(0,2));
    int mes = Integer.parseInt(fecha.substring(3,5));
    int año = Integer.parseInt(fecha.substring(6,10));
    
    if(dia >= 1 && dia <=30 && mes >= 1 && mes <= 12){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    else{
        System.out.println("Fecha inválida: Día entre 1 y 30, Mes entre 1 y 12");
    }
    
}

String getFecha(){
    return(dia+"/"+mes+"/"+año);
}

String periodo(String nuevaFecha){
    
    int diferenciaDia = this.dia - Integer.parseInt(nuevaFecha.substring(0,2));
    int diferenciaMes = this.mes - Integer.parseInt(nuevaFecha.substring(3,5));
    int diferenciaAño = this.año - Integer.parseInt(nuevaFecha.substring(6,10));
    
    if(diferenciaDia < 0){
        diferenciaDia = diferenciaDia*-1;
    }
    if(diferenciaMes < 0){
        diferenciaMes = diferenciaMes*-1;
    }
    if(diferenciaAño < 0){
        diferenciaAño = diferenciaAño*-1;
    }
    
    return("Dias: "+diferenciaDia+" Meses: "+diferenciaMes+" Años: "+diferenciaAño);
    
}

String menor(String nuevaFecha){
    
    int dia = Integer.parseInt(nuevaFecha.substring(0,2));
    int mes = Integer.parseInt(nuevaFecha.substring(3,5));
    int año = Integer.parseInt(nuevaFecha.substring(6,10));
    
    if(año > this.año){
        return(this.dia+"/"+this.mes+"/"+this.año);  
    }
    else{
        if(mes > this.mes){
            return(this.dia+"/"+this.mes+"/"+this.año); 
        }
        else{
            if(dia > this.dia){
                return(this.dia+"/"+this.mes+"/"+this.año); 
            }
        }
    }
    
    return(dia+"/"+mes+"/"+año); 
    
}



public static void main(String [] args){
    
    Fecha fecha1 = new Fecha();
    Fecha fecha2 = new Fecha(20,12,2020);
    
    fecha1.setFecha("10/10/2018");
    
    System.out.println("FECHA 1: ");
    System.out.println(fecha1.getFecha());
    System.out.println("FECHA 2: ");
    System.out.println(fecha2.getFecha());
    
    System.out.println("FECHA MENOR: ");
    System.out.println(fecha1.menor("01/12/2018"));

    System.out.println("PERIODO: ");
    System.out.println(fecha1.periodo("01/12/2018"));
    
    
}



    
}
