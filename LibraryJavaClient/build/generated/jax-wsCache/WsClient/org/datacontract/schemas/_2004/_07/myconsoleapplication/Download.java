
package org.datacontract.schemas._2004._07.myconsoleapplication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for download complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="download">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="books" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}books" minOccurs="0"/>
 *         &lt;element name="id_book" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id_download" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id_user" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="users" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}users" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "download", propOrder = {
    "books",
    "idBook",
    "idDownload",
    "idUser",
    "users"
})
public class Download {

    @XmlElementRef(name = "books", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<Books> books;
    @XmlElement(name = "id_book")
    protected Integer idBook;
    @XmlElement(name = "id_download")
    protected Integer idDownload;
    @XmlElement(name = "id_user")
    protected Integer idUser;
    @XmlElementRef(name = "users", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<Users> users;

    /**
     * Gets the value of the books property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Books }{@code >}
     *     
     */
    public JAXBElement<Books> getBooks() {
        return books;
    }

    /**
     * Sets the value of the books property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Books }{@code >}
     *     
     */
    public void setBooks(JAXBElement<Books> value) {
        this.books = value;
    }

    /**
     * Gets the value of the idBook property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdBook() {
        return idBook;
    }

    /**
     * Sets the value of the idBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdBook(Integer value) {
        this.idBook = value;
    }

    /**
     * Gets the value of the idDownload property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdDownload() {
        return idDownload;
    }

    /**
     * Sets the value of the idDownload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdDownload(Integer value) {
        this.idDownload = value;
    }

    /**
     * Gets the value of the idUser property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdUser(Integer value) {
        this.idUser = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Users }{@code >}
     *     
     */
    public JAXBElement<Users> getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Users }{@code >}
     *     
     */
    public void setUsers(JAXBElement<Users> value) {
        this.users = value;
    }

}
