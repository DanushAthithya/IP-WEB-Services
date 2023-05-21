
package moviedb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the moviedb package. 
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

    private final static QName _Db_QNAME = new QName("http://movieDb/", "db");
    private final static QName _DbResponse_QNAME = new QName("http://movieDb/", "dbResponse");
    private final static QName _MovComp_QNAME = new QName("http://movieDb/", "movComp");
    private final static QName _MovCompResponse_QNAME = new QName("http://movieDb/", "movCompResponse");
    private final static QName _MovSearch_QNAME = new QName("http://movieDb/", "movSearch");
    private final static QName _MovSearchResponse_QNAME = new QName("http://movieDb/", "movSearchResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: moviedb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Db }
     * 
     */
    public Db createDb() {
        return new Db();
    }

    /**
     * Create an instance of {@link DbResponse }
     * 
     */
    public DbResponse createDbResponse() {
        return new DbResponse();
    }

    /**
     * Create an instance of {@link MovComp }
     * 
     */
    public MovComp createMovComp() {
        return new MovComp();
    }

    /**
     * Create an instance of {@link MovCompResponse }
     * 
     */
    public MovCompResponse createMovCompResponse() {
        return new MovCompResponse();
    }

    /**
     * Create an instance of {@link MovSearch }
     * 
     */
    public MovSearch createMovSearch() {
        return new MovSearch();
    }

    /**
     * Create an instance of {@link MovSearchResponse }
     * 
     */
    public MovSearchResponse createMovSearchResponse() {
        return new MovSearchResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Db }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movieDb/", name = "db")
    public JAXBElement<Db> createDb(Db value) {
        return new JAXBElement<Db>(_Db_QNAME, Db.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DbResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movieDb/", name = "dbResponse")
    public JAXBElement<DbResponse> createDbResponse(DbResponse value) {
        return new JAXBElement<DbResponse>(_DbResponse_QNAME, DbResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovComp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movieDb/", name = "movComp")
    public JAXBElement<MovComp> createMovComp(MovComp value) {
        return new JAXBElement<MovComp>(_MovComp_QNAME, MovComp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovCompResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movieDb/", name = "movCompResponse")
    public JAXBElement<MovCompResponse> createMovCompResponse(MovCompResponse value) {
        return new JAXBElement<MovCompResponse>(_MovCompResponse_QNAME, MovCompResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movieDb/", name = "movSearch")
    public JAXBElement<MovSearch> createMovSearch(MovSearch value) {
        return new JAXBElement<MovSearch>(_MovSearch_QNAME, MovSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movieDb/", name = "movSearchResponse")
    public JAXBElement<MovSearchResponse> createMovSearchResponse(MovSearchResponse value) {
        return new JAXBElement<MovSearchResponse>(_MovSearchResponse_QNAME, MovSearchResponse.class, null, value);
    }

}
