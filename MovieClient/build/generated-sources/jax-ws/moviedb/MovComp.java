
package moviedb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for movComp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="movComp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="movie_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="movie_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movComp", propOrder = {
    "movie1",
    "movie2"
})
public class MovComp {

    @XmlElement(name = "movie_1")
    protected String movie1;
    @XmlElement(name = "movie_2")
    protected String movie2;

    /**
     * Gets the value of the movie1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovie1() {
        return movie1;
    }

    /**
     * Sets the value of the movie1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovie1(String value) {
        this.movie1 = value;
    }

    /**
     * Gets the value of the movie2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovie2() {
        return movie2;
    }

    /**
     * Sets the value of the movie2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovie2(String value) {
        this.movie2 = value;
    }

}
