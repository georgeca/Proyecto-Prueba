/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author alum.fial7
 */
public class Iglesia {
    private int idI;
    private int idDi;
    private int idTI;
    private String igle;
    private String cuenta;

    public Iglesia() {
    }

    public Iglesia(int idDi, int idTI, String igle, String cuenta) {
        this.idDi = idDi;
        this.idTI = idTI;
        this.igle = igle;
        this.cuenta = cuenta;
    }

    public int getIdI() {
        return idI;
    }

    public void setIdI(int idI) {
        this.idI = idI;
    }

    public int getIdDi() {
        return idDi;
    }

    public void setIdDi(int idDi) {
        this.idDi = idDi;
    }

    public int getIdTI() {
        return idTI;
    }

    public void setIdTI(int idTI) {
        this.idTI = idTI;
    }

    public String getIgle() {
        return igle;
    }

    public void setIgle(String igle) {
        this.igle = igle;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
}
