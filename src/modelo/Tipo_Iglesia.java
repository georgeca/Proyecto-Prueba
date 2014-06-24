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
public class Tipo_Iglesia {
    private int idTi;
    private String nom_tip;

    public Tipo_Iglesia() {
    }

    public Tipo_Iglesia(String nom_tip) {
        this.nom_tip = nom_tip;
    }

    public int getIdTi() {
        return idTi;
    }

    public void setIdTi(int idTi) {
        this.idTi = idTi;
    }

    public String getNom_tip() {
        return nom_tip;
    }

    public void setNom_tip(String nom_tip) {
        this.nom_tip = nom_tip;
    }
}
