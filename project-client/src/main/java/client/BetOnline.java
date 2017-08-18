package client;

import feign.Feign;
import feign.Logger;
import feign.RequestLine;
import feign.jaxb.JAXBContextFactory;
import feign.jaxb.JAXBDecoder;
import pojos.betonline.LineFeed;

/**
 * Created by charlie on 7/5/17.
 */
public interface BetOnline {

    String BASE_URL = "http://livelines.betonline.com/sys/LineXML/LiveLineObjXml.asp";

    enum Sport {
        Baseball, Basketball, Football
    }

    @RequestLine("GET ?sport=Baseball")
    LineFeed getLines();

    static BetOnline connect() {

        JAXBContextFactory jaxbFactory = new JAXBContextFactory.Builder()
                .build();

        JAXBDecoder decoder = new JAXBDecoder.Builder()
                .withJAXBContextFactory(jaxbFactory)
                .withNamespaceAware(false)
                .build();

        return Feign.builder()
                .decoder(decoder)
                .logger(new Logger.ErrorLogger())
                .logLevel(Logger.Level.BASIC)
                .target(BetOnline.class, BASE_URL);
    }
}
