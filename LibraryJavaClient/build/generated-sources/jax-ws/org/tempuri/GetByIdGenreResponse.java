
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.myconsoleapplication.Genres;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetByIdGenreResult" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}genres" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getByIdGenreResult"
})
@XmlRootElement(name = "GetByIdGenreResponse")
public class GetByIdGenreResponse {

    @XmlElementRef(name = "GetByIdGenreResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Genres> getByIdGenreResult;

    /**
     * Gets the value of the getByIdGenreResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Genres }{@code >}
     *     
     */
    public JAXBElement<Genres> getGetByIdGenreResult() {
        return getByIdGenreResult;
    }

    /**
     * Sets the value of the getByIdGenreResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Genres }{@code >}
     *     
     */
    public void setGetByIdGenreResult(JAXBElement<Genres> value) {
        this.getByIdGenreResult = value;
    }

}
