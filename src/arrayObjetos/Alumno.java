
package arrayObjetos;
import java.util.*;

public class Alumno {

String nombre;
double trimestre1;
double trimestre2;
double trimestre3;
double notaFinal = 0;


Alumno(){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce nombre de alumno");
    nombre = sc.nextLine();
    trimestre1 = -1;
    trimestre2 = -1;
    trimestre3 = -1;
    
    
}

Alumno(String nNombre, double nTrimestre1, double nTrimestre2, double nTrimestre3){
    
    nombre = nNombre;
    trimestre1 = nTrimestre1;
    trimestre2 = nTrimestre2;
    trimestre3 = nTrimestre3;
    
    
}

String getNombre(){
    return nombre;
    
}

double getTrimestre1(){
    return trimestre1;
    
}

double getTrimestre2(){
    return trimestre2;
    
}

double getTrimestre3(){
    return trimestre3;
    
}

void setNombre(String nNombre){
    nombre = nNombre;
    
}

void setTrimestre1(double nTrimestre1){
    trimestre1 = nTrimestre1;
    
}

void setTrimestre2(double nTrimestre2){
    trimestre2 = nTrimestre2;
    
}

void setTrimestre3(double nTrimestre3){
    trimestre3 = nTrimestre3;
    
}

double getNotaFinal(){
    
    if(trimestre1 == -1 || trimestre2 == -1 || trimestre3 == -3){
        
        notaFinal = -1;
        
    }
    else{
        notaFinal = (trimestre1+trimestre2+trimestre3)/3;
    }
  
    return notaFinal;
       
}

public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce num de alumnos");
    int nAlumnos = sc.nextInt();
 
    Alumno[] clase = new Alumno[nAlumnos];
    
    double sumaNotas = 0;
    double media = 0;
    int alumnosEvaluados = 0;
    
    for(int i = 0; i < clase.length;i++){
        
         System.out.println("Introduce nombre");
             sc.nextLine();
         String nombreIntroducido=sc.nextLine();
        System.out.println("Introduce trimestre 1");
       
       double notaIntroducida1=sc.nextDouble();
        System.out.println("Introduce trimestre 2");
       double notaIntroducida2=sc.nextDouble();
        System.out.println("Introduce trimestre 3");
        double notaIntroducida3=sc.nextDouble();
        
        clase[i] = new Alumno(nombreIntroducido,notaIntroducida1,notaIntroducida2,notaIntroducida3);
        
        if(clase[i].getNotaFinal() != -1){
            media = media + clase[i].getNotaFinal();
        }
        
    }
    
    for(int i = 0; i < clase.length;i++){
        System.out.println("NOMBRE: ");
        System.out.println(clase[i].getNombre());
        System.out.println("NOTA FINAL: ");
        System.out.println(clase[i].getNotaFinal());
    }
    
    System.out.println("La media de notas finales es: "+media);
}
    
}
