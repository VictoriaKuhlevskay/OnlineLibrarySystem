
package org.datacontract.schemas._2004._07.myconsoleapplication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authors_books complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authors_books">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authors" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}authors" minOccurs="0"/>
 *         &lt;element name="books" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}books" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id_author" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id_book" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authors_books", propOrder = {
    "authors",
    "books",
    "id",
    "idAuthor",
    "idBook"
})
public class AuthorsBooks {

    @XmlElementRef(name = "authors", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<Authors> authors;
    @XmlElementRef(name = "books", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<Books> books;
    protected Integer id;
    @XmlElement(name = "id_author")
    protected Integer idAuthor;
    @XmlElement(name = "id_book")
    protected Integer idBook;

    /**
     * Gets the value of the authors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Authors }{@code >}
     *     
     */
    public JAXBElement<Authors> getAuthors() {
        return authors;
    }

    /**
     * Sets the value of the authors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Authors }{@code >}
     *     
     */
    public void setAuthors(JAXBElement<Authors> value) {
        this.authors = value;
    }

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the idAuthor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAuthor() {
        return idAuthor;
    }

    /**
     * Sets the value of the idAuthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAuthor(Integer value) {
        this.idAuthor = value;
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

}
