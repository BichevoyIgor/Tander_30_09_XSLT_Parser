package com.BichevoyIgor;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class Main {

    public static void main(String[] args) throws TransformerException {
        TransformerFactory factory = TransformerFactory.newInstance();
        factory.setAttribute("indent-number", new Integer(2)); //отступ тэгов
        Source xslt = new StreamSource(new File("src/main/resources/template2.xsl"));
        Transformer transformer = factory.newTransformer(xslt);
        Source xml = new StreamSource(new File("1.xml"));
        transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // перенос
        transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC,"yes"); //перенос рута
        transformer.transform(xml, new StreamResult(new File("output.xml")));
    }
}


