package org.sid;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.sid.entities.Operation;
import org.sid.entities.Operations;
import org.sid.entities.Releve;
import org.sid.enums.OperationType;

import java.util.Date;
import java.util.List;
import java.util.Random;

@WebService
public class ReleveWS {

    @WebMethod
    public  Releve  consulter(@WebParam long rid){
        Releve releve= new Releve();
      releve.setRib(rid);
      releve.setDateReleve(new Date());
      releve.setSolde(804852.654);
      releve.setOperations(new Operations(new Date(),new Date(), List.of(
              new Operation(OperationType.CREDIT,new Date(),5000,"Virement"),
         new Operation(OperationType.Debit,new Date(),50000,"Prelevement"),
         new Operation(OperationType.CREDIT, new Date(),25000,"Virement"),
        new Operation(OperationType.Debit, new Date(),47000,"chequesn guichet"),

        new Operation(OperationType.CREDIT, new Date(),new Random().nextInt(80)*98.34,"Virement"),
         new Operation(OperationType.Debit, new Date(),new Random().nextInt(80)*98.34,"Prelevement"),
        new Operation(OperationType.CREDIT, new Date(),new Random().nextInt(80)*98.34,"Virement"),
         new Operation(OperationType.Debit, new Date(),47000,"chequesn guichet"),
        new Operation(OperationType.CREDIT,new Date(),5000,"Virement"),
                new Operation(OperationType.Debit,new Date(),50000,"Prelevement"),
                new Operation(OperationType.CREDIT, new Date(),25000,"Virement"),
                new Operation(OperationType.Debit, new Date(),47000,"chequesn guichet"),

                new Operation(OperationType.CREDIT, new Date(),new Random().nextInt(80)*98.34,"Virement"),
                new Operation(OperationType.Debit, new Date(),new Random().nextInt(80)*98.34,"Prelevement"),
                new Operation(OperationType.CREDIT, new Date(),new Random().nextInt(80)*98.34,"Virement"),
                new Operation(OperationType.Debit, new Date(),47000,"chequesn guichet")

      )));
      return releve;
    }
}
