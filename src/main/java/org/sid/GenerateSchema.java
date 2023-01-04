package org.sid;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.SchemaOutputResolver;
import org.sid.entities.Releve;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class GenerateSchema {
    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext jaxbContext= JAXBContext.newInstance(Releve.class);
        jaxbContext.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String s, String s1) throws IOException {
                File file = new File("releve.xsd");
                StreamResult streamResult= new StreamResult(file);
                return streamResult;
            }
        });


    }
}
