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
public class Societe {
    private int id;
    private String ice;
    private String siegeSociete;
    private TypeSociete typesociete;

    public Societe() {
    }

    public Societe(int id, String ice, String siegeSociete, TypeSociete typesociete) {
        this.id = id;
        this.ice = ice;
        this.siegeSociete = siegeSociete;
        this.typesociete = typesociete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public String getSiegeSociete() {
        return siegeSociete;
    }

    public void setSiegeSociete(String siegeSociete) {
        this.siegeSociete = siegeSociete;
    }

    public TypeSociete getTypesociete() {
        return typesociete;
    }

    public void setTypesociete(TypeSociete typesociete) {
        this.typesociete = typesociete;
    }

    @Override
    public String toString() {
        return "Societe{" + "id=" + id + ", ice=" + ice + ", siegeSociete=" + siegeSociete + ", typesociete=" + typesociete + '}';
    }
    
   
    
    
    
}
