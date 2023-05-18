
package companydb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the companydb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Compsear_QNAME = new QName("http://companyDB/", "compsear");
    private final static QName _CompsearResponse_QNAME = new QName("http://companyDB/", "compsearResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: companydb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Compsear }
     * 
     */
    public Compsear createCompsear() {
        return new Compsear();
    }

    /**
     * Create an instance of {@link CompsearResponse }
     * 
     */
    public CompsearResponse createCompsearResponse() {
        return new CompsearResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compsear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://companyDB/", name = "compsear")
    public JAXBElement<Compsear> createCompsear(Compsear value) {
        return new JAXBElement<Compsear>(_Compsear_QNAME, Compsear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompsearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://companyDB/", name = "compsearResponse")
    public JAXBElement<CompsearResponse> createCompsearResponse(CompsearResponse value) {
        return new JAXBElement<CompsearResponse>(_CompsearResponse_QNAME, CompsearResponse.class, null, value);
    }

}
