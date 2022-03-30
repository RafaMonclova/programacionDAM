package entregaBiblioteca;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    private static final int [] diasMeses = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public Fecha(int d, int m, int y){
        setAnio(y);
        setMes(m);
        setDia(d);
    }
    public void setAnio(int anio){
        if((anio>1950) && (anio<2100))
            this.anio=anio;
        else
            throw new IllegalArgumentException("el año debe estar entre 1950-2100");
    }
    public int getAnio(){
        return anio;
    }
    public void setMes(int m){
        if ((m>0)&&(m<=12))
            mes = m;
        else
            throw new IllegalArgumentException("el mes debe estar entre 1-12");
    }
    public int getMes(){
        return mes;
    }
    public void setDia(int d){
        if ((d>0)&&(d<=diasMeses[mes]))
            dia = d;
        else
            if ((mes==2) && (d==29)&&(anio%400==0 || anio%4==0 && anio%100!=0))
                dia = d;
            else
            throw new IllegalArgumentException("el día está fuera de rango");
    }
    public int getDia(){
        return dia;
    }
    public String toString(){
        return String.format("%d/%d/%d", dia, mes, anio);
    }
}