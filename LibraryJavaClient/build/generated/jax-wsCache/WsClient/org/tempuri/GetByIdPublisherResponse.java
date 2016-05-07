
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.myconsoleapplication.Publishers;


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
 *         &lt;element name="GetByIdPublisherResult" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}publishers" minOccurs="0"/>
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
    "getByIdPublisherResult"
})
@XmlRootElement(name = "GetByIdPublisherResponse")
public class GetByIdPublisherResponse {

    @XmlElementRef(name = "GetByIdPublisherResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Publishers> getByIdPublisherResult;

    /**
     * Gets the value of the getByIdPublisherResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Publishers }{@code >}
     *     
     */
    public JAXBElement<Publishers> getGetByIdPublisherResult() {
        return getByIdPublisherResult;
    }

    /**
     * Sets the value of the getByIdPublisherResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Publishers }{@code >}
     *     
     */
    public void setGetByIdPublisherResult(JAXBElement<Publishers> value) {
        this.getByIdPublisherResult = value;
    }

}
