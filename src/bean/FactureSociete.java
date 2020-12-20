/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author hp
 */
public class FactureSociete {
    
    private int id;
    private String libelle;
    private Societe societeSource;
    private Societe societeDestination;
    private String description;
    private double mthtt;
    private double mtttc;
    private double mttva;
    private double tva;
    private TypeDeclaration typedeclaration;

    public FactureSociete() {
    }

    public FactureSociete(int id, String libelle, Societe societeSource, Societe societeDestination, String description, double mthtt, double mtttc, double mttva, TypeDeclaration typedeclaration) {
        this.id = id;
        this.libelle = libelle;
        this.societeSource = societeSource;
        this.societeDestination = societeDestination;
        this.description = description;
        this.mthtt = mthtt;
        this.mtttc = mtttc;
        this.mttva = mttva;
        this.typedeclaration = typedeclaration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Societe getSocieteSource() {
        return societeSource;
    }

    public void setSocieteSource(Societe societeSource) {
        this.societeSource = societeSource;
    }

    public Societe getSocieteDestination() {
        return societeDestination;
    }

    public void setSocieteDestination(Societe societeDestination) {
        this.societeDestination = societeDestination;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMthtt() {
        return mthtt;
    }

    public void setMthtt(double mthtt) {
        this.mthtt = mthtt;
    }

    public double getMtttc() {
        return mtttc;
    }

    public void setMtttc(double mtttc) {
        this.mtttc = mtttc;
    }

    public double getMttva() {
        return mttva;
    }

    public void setMttva(double mttva) {
        this.mttva = mttva;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    public TypeDeclaration getTypedeclaration() {
        return typedeclaration;
    }

    public void setTypedeclaration(TypeDeclaration typedeclaration) {
        this.typedeclaration = typedeclaration;
    }

    @Override
    public String toString() {
        return "FactureSociete{" + "id=" + id + ", libelle=" + libelle + ", societeSource=" + societeSource + ", societeDestination=" + societeDestination + ", description=" + description + ", mthtt=" + mthtt + ", mtttc=" + mtttc + ", mttva=" + mttva + ", tva=" + tva + ", typedeclaration=" + typedeclaration + '}';
    }
     
    
    
}
