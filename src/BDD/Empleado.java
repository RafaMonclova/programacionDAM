/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;

/**
 *
 * @author alumno
 */
public class Empleado {
    
    
    private int EMPNO;
    private String ENAME;
    private String JOB;
    private int MGR;
    private String HIREDATE;
    private double SAL;
    private double COMM;
    private int DEPTNO;

    public Empleado(int EMPNO, String ENAME, String JOB, int MGR, String HIREDATE, double SAL, double COMM, int DEPTNO) {
        this.EMPNO = EMPNO;
        this.ENAME = ENAME;
        this.JOB = JOB;
        this.MGR = MGR;
        this.HIREDATE = HIREDATE;
        this.SAL = SAL;
        this.COMM = COMM;
        this.DEPTNO = DEPTNO;
    }

    public int getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(int EMPNO) {
        this.EMPNO = EMPNO;
    }

    public String getENAME() {
        return ENAME;
    }

    public void setENAME(String ENAME) {
        this.ENAME = ENAME;
    }

    public String getJOB() {
        return JOB;
    }

    public void setJOB(String JOB) {
        this.JOB = JOB;
    }

    public int getMGR() {
        return MGR;
    }

    public void setMGR(int MGR) {
        this.MGR = MGR;
    }

    public String getHIREDATE() {
        return HIREDATE;
    }

    public void setHIREDATE(String HIREDATE) {
        this.HIREDATE = HIREDATE;
    }

    public double getSAL() {
        return SAL;
    }

    public void setSAL(double SAL) {
        this.SAL = SAL;
    }

    public double getCOMM() {
        return COMM;
    }

    public void setCOMM(double COMM) {
        this.COMM = COMM;
    }

    public int getDEPTNO() {
        return DEPTNO;
    }

    public void setDEPTNO(int DEPTNO) {
        this.DEPTNO = DEPTNO;
    }

    @Override
    public String toString() {
        return "EMPNO=" + EMPNO + ", ENAME=" + ENAME + ", JOB=" + JOB + ", MGR=" + MGR + ", HIREDATE=" + HIREDATE + ", SAL=" + SAL + ", COMM=" + COMM + ", DEPTNO=" + DEPTNO;
    }
    
    
    
    
    
    
}
