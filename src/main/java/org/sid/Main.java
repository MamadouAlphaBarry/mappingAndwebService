package org.sid;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.sid.entities.Operation;
import org.sid.entities.Operations;
import org.sid.entities.Releve;
import org.sid.enums.OperationType;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws ParseException, JAXBException {

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("");

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
      LocalDate localDate= LocalDate.parse(LocalDate.of(2022,06,25).format(f));

/*


        SimpleDateFormat dateformatter = new SimpleDateFormat("yyyy-mm-dd");
       String dateStr= dateformatter.format(new Date());
       Date formattedDate= dateformatter.parse(dateStr);*/
        Operation op1 = new Operation(OperationType.CREDIT,new Date(),5000,"Virement");
        Operation op2 = new Operation(OperationType.Debit,new Date(),50000,"Prelevement");
        Operation op3 = new Operation(OperationType.CREDIT, new Date(),25000,"Virement");
        Operation op4 = new Operation(OperationType.Debit, new Date(),47000,"chequesn guichet");

        Operation op5 = new Operation(OperationType.CREDIT, new Date(),new Random().nextInt(80)*98.34,"Virement");
        Operation op6 = new Operation(OperationType.Debit, new Date(),new Random().nextInt(80)*98.34,"Prelevement");
        Operation op7 = new Operation(OperationType.CREDIT, new Date(),new Random().nextInt(80)*98.34,"Virement");
        Operation op8 = new Operation(OperationType.Debit, new Date(),47000,"chequesn guichet");

        Operations operations= new Operations(new Date(),new Date());
      Operations operations1= new Operations(new Date(),new Date());
        operations.setOperation(op1);
        operations.setOperation(op2);
        operations.setOperation(op3);
        operations.setOperation(op4);
        operations.setOperation(op5);
        operations.setOperation(op6);
        operations.setOperation(op7);
        operations.setOperation(op8);

      operations1.setOperation(op1);
      operations1.setOperation(op2);
      operations1.setOperation(op3);
      operations1.setOperation(op4);
      operations1.setOperation(op5);

        Releve releve =new Releve(12478569, new Date(),71000);
        releve.setOperations(operations);
      releve.setOperations(operations1);
        JAXBContext jaxbContext= JAXBContext.newInstance(Releve.class);
        Marshaller marshaller= jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(releve,new File("releve.xml"));
        System.out.print(releve.toString());
    }
}