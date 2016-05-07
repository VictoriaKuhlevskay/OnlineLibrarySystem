
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.myconsoleapplication.Authors;


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
 *         &lt;element name="GetByIdAuthorResult" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}authors" minOccurs="0"/>
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
    "getByIdAuthorResult"
})
@XmlRootElement(name = "GetByIdAuthorResponse")
public class GetByIdAuthorResponse {

    @XmlElementRef(name = "GetByIdAuthorResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Authors> getByIdAuthorResult;

    /**
     * Gets the value of the getByIdAuthorResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Authors }{@code >}
     *     
     */
    public JAXBElement<Authors> getGetByIdAuthorResult() {
        return getByIdAuthorResult;
    }

    /**
     * Sets the value of the getByIdAuthorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Authors }{@code >}
     *     
     */
    public void setGetByIdAuthorResult(JAXBElement<Authors> value) {
        this.getByIdAuthorResult = value;
    }

}
