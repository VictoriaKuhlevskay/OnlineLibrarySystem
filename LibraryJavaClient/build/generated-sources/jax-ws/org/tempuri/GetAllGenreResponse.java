
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.myconsoleapplication.ArrayOfgenres;


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
 *         &lt;element name="GetAllGenreResult" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}ArrayOfgenres" minOccurs="0"/>
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
    "getAllGenreResult"
})
@XmlRootElement(name = "GetAllGenreResponse")
public class GetAllGenreResponse {

    @XmlElementRef(name = "GetAllGenreResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfgenres> getAllGenreResult;

    /**
     * Gets the value of the getAllGenreResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfgenres }{@code >}
     *     
     */
    public JAXBElement<ArrayOfgenres> getGetAllGenreResult() {
        return getAllGenreResult;
    }

    /**
     * Sets the value of the getAllGenreResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfgenres }{@code >}
     *     
     */
    public void setGetAllGenreResult(JAXBElement<ArrayOfgenres> value) {
        this.getAllGenreResult = value;
    }

}
