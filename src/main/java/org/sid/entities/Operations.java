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
public class Operations {
@XmlAttribute
    private Date dateDebut;
    @XmlAttribute
    private Date dateFin;

    public List<Operation> operation= new ArrayList<>();

    public Operations() {
    }

    public Operations(Date dateDebut, Date dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public Operations(Date dateDebut, Date dateFin, List<Operation> operation) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.operation = operation;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
    public  void  setOperation(Operation operation){
      this.operation.add(operation);
    }


    @Override
    public String toString() {
        String details="dateDebu\tdateFin\tdateFin";
        details+= "\n"+getDateDebut()+"\t"+getDateFin();
        details+= "\ndateFin: "+getDateFin();
        details="\nOperationType\t\tdate\tmontant\t\tdescription";
        for (Operation op:operation){
            details+="\n"+op;
        }
        return details;
    }
}
