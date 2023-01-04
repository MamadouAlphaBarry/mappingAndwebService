package org.sid.entities;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlRootElement
  @XmlAccessorType(XmlAccessType.FIELD)
public class Releve {
    @XmlAttribute(name="RIB")
    private long rib;

    private Date dateReleve;
    private double solde;
    private List<Operations> operations= new ArrayList<>();

    public Releve() {
    }

    public Releve(long rib, Date dateReleve, double solde) {
        this.rib = rib;
        this.dateReleve = dateReleve;
        this.solde = solde;
    }

    public long getRib() {
        return rib;
    }

    public void setRib(long rib) {
        this.rib = rib;
    }

    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public  void setOperations(Operations op){
        operations.add(op);
    }

    @Override
    public String toString() {
        String details="";
        details+="RIB:"+getRib();
        details+="\n dateReleve: "+getDateReleve();
        details+="\nsolde: "+getSolde();
        for (Operations oper:operations){
            details+="\n"+oper;
        }
        return details;
    }

}
