
package org.datacontract.schemas._2004._07.myconsoleapplication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for publishers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="publishers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="books" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}ArrayOfbooks" minOccurs="0"/>
 *         &lt;element name="id_publisher" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="name_publisher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publishers", propOrder = {
    "books",
    "idPublisher",
    "namePublisher"
})
public class Publishers {

    @XmlElementRef(name = "books", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfbooks> books;
    @XmlElement(name = "id_publisher")
    protected Integer idPublisher;
    @XmlElementRef(name = "name_publisher", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> namePublisher;

    /**
     * Gets the value of the books property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfbooks }{@code >}
     *     
     */
    public JAXBElement<ArrayOfbooks> getBooks() {
        return books;
    }

    /**
     * Sets the value of the books property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfbooks }{@code >}
     *     
     */
    public void setBooks(JAXBElement<ArrayOfbooks> value) {
        this.books = value;
    }

    /**
     * Gets the value of the idPublisher property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPublisher() {
        return idPublisher;
    }

    /**
     * Sets the value of the idPublisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPublisher(Integer value) {
        this.idPublisher = value;
    }

    /**
     * Gets the value of the namePublisher property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNamePublisher() {
        return namePublisher;
    }

    /**
     * Sets the value of the namePublisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNamePublisher(JAXBElement<String> value) {
        this.namePublisher = value;
    }

}
