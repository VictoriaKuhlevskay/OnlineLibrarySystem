
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.myconsoleapplication.ArrayOfpublishers;


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
 *         &lt;element name="GetAllPublisherResult" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}ArrayOfpublishers" minOccurs="0"/>
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
    "getAllPublisherResult"
})
@XmlRootElement(name = "GetAllPublisherResponse")
public class GetAllPublisherResponse {

    @XmlElementRef(name = "GetAllPublisherResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfpublishers> getAllPublisherResult;

    /**
     * Gets the value of the getAllPublisherResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfpublishers }{@code >}
     *     
     */
    public JAXBElement<ArrayOfpublishers> getGetAllPublisherResult() {
        return getAllPublisherResult;
    }

    /**
     * Sets the value of the getAllPublisherResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfpublishers }{@code >}
     *     
     */
    public void setGetAllPublisherResult(JAXBElement<ArrayOfpublishers> value) {
        this.getAllPublisherResult = value;
    }

}
