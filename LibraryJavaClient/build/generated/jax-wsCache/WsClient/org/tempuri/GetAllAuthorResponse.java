
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.myconsoleapplication.ArrayOfauthors;


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
 *         &lt;element name="GetAllAuthorResult" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}ArrayOfauthors" minOccurs="0"/>
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
    "getAllAuthorResult"
})
@XmlRootElement(name = "GetAllAuthorResponse")
public class GetAllAuthorResponse {

    @XmlElementRef(name = "GetAllAuthorResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfauthors> getAllAuthorResult;

    /**
     * Gets the value of the getAllAuthorResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfauthors }{@code >}
     *     
     */
    public JAXBElement<ArrayOfauthors> getGetAllAuthorResult() {
        return getAllAuthorResult;
    }

    /**
     * Sets the value of the getAllAuthorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfauthors }{@code >}
     *     
     */
    public void setGetAllAuthorResult(JAXBElement<ArrayOfauthors> value) {
        this.getAllAuthorResult = value;
    }

}
