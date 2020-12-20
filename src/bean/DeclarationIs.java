/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author hp
 */
public class DeclarationIs {
    
    private int id;
    private Societe societe;
    private Date annee;
    private Date dateDeclaration;
    private  double totalCharge;
    private double totalGain;
    private double benefice;
    private  double mtBase;

    public DeclarationIs() {
    }

    public DeclarationIs(int id, Societe societe, Date annee, Date dateDeclaration, double totalCharge, double totalGain, double benefice, double mtBase) {
        this.id = id;
        this.societe = societe;
        this.annee = annee;
        this.dateDeclaration = dateDeclaration;
        this.totalCharge = totalCharge;
        this.totalGain = totalGain;
        this.benefice = benefice;
        this.mtBase = mtBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public Date getAnnee() {
        return annee;
    }

    public void setAnnee(Date annee) {
        this.annee = annee;
    }

    public Date getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(Date dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public double getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(double totalCharge) {
        this.totalCharge = totalCharge;
    }

    public double getTotalGain() {
        return totalGain;
    }

    public void setTotalGain(double totalGain) {
        this.totalGain = totalGain;
    }

    public double getBenefice() {
        return benefice;
    }

    public void setBenefice(double benefice) {
        this.benefice = benefice;
    }

    public double getMtBase() {
        return mtBase;
    }

    public void setMtBase(double mtBase) {
        this.mtBase = mtBase;
    }

    @Override
    public String toString() {
        return "DeclarationIs{" + "id=" + id + ", societe=" + societe + ", annee=" + annee + ", dateDeclaration=" + dateDeclaration + ", totalCharge=" + totalCharge + ", totalGain=" + totalGain + ", benefice=" + benefice + ", mtBase=" + mtBase + '}';
    }
    
    
    
    
    
}
