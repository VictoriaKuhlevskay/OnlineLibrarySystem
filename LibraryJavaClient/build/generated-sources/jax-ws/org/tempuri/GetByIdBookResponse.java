
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.myconsoleapplication.Books;


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
 *         &lt;element name="GetByIdBookResult" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}books" minOccurs="0"/>
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
    "getByIdBookResult"
})
@XmlRootElement(name = "GetByIdBookResponse")
public class GetByIdBookResponse {

    @XmlElementRef(name = "GetByIdBookResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Books> getByIdBookResult;

    /**
     * Gets the value of the getByIdBookResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Books }{@code >}
     *     
     */
    public JAXBElement<Books> getGetByIdBookResult() {
        return getByIdBookResult;
    }

    /**
     * Sets the value of the getByIdBookResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Books }{@code >}
     *     
     */
    public void setGetByIdBookResult(JAXBElement<Books> value) {
        this.getByIdBookResult = value;
    }

}
