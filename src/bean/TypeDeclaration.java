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
public class TypeDeclaration {
    
    private int id;
    private String  libelle;
    private String code;

    public TypeDeclaration() {
    }

    public TypeDeclaration(int id, String libelle, String code) {
        this.id = id;
        this.libelle = libelle;
        this.code = code;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "TypeDeclaration{" + "id=" + id + ", libelle=" + libelle + ", code=" + code + '}';
    }
    
    
    
    
}
