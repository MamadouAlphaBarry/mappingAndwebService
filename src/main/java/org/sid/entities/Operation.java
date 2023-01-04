package org.sid.entities;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.sid.enums.OperationType;

import java.time.LocalDate;
import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Operation {
   @XmlAttribute(name = "type")
    private OperationType operationType;
    @XmlAttribute
    private Date date;
    @XmlAttribute
    private  double montant;
    @XmlAttribute
    private String description;

    public Operation() {
    }

    public Operation(OperationType operationType, Date date, double montant, String description) {
        this.operationType = operationType;
        this.date = date;
        this.montant = montant;
        this.description = description;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        String details="";
        details+="\n"+getOperationType()+"\t\t\t"+getDate()+"\t"+getMontant()+"\t\t"+getDescription();

        return details;
    }
}
