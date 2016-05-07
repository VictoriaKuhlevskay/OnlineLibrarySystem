
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
 *         &lt;element name="publisher" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}publishers" minOccurs="0"/>
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
    "publisher"
})
@XmlRootElement(name = "AddPublisher")
public class AddPublisher {

    @XmlElementRef(name = "publisher", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Publishers> publisher;

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Publishers }{@code >}
     *     
     */
    public JAXBElement<Publishers> getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Publishers }{@code >}
     *     
     */
    public void setPublisher(JAXBElement<Publishers> value) {
        this.publisher = value;
    }

}
