
package org.datacontract.schemas._2004._07.myconsoleapplication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authors_books" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}ArrayOfauthors_books" minOccurs="0"/>
 *         &lt;element name="id_author" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patronymic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="year_of_birth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="year_of_death" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authors", propOrder = {
    "authorsBooks",
    "idAuthor",
    "name",
    "patronymic",
    "surname",
    "yearOfBirth",
    "yearOfDeath"
})
public class Authors {

    @XmlElementRef(name = "authors_books", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfauthorsBooks> authorsBooks;
    @XmlElement(name = "id_author")
    protected Integer idAuthor;
    @XmlElementRef(name = "name", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "patronymic", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> patronymic;
    @XmlElementRef(name = "surname", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surname;
    @XmlElementRef(name = "year_of_birth", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> yearOfBirth;
    @XmlElementRef(name = "year_of_death", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> yearOfDeath;

    /**
     * Gets the value of the authorsBooks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfauthorsBooks }{@code >}
     *     
     */
    public JAXBElement<ArrayOfauthorsBooks> getAuthorsBooks() {
        return authorsBooks;
    }

    /**
     * Sets the value of the authorsBooks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfauthorsBooks }{@code >}
     *     
     */
    public void setAuthorsBooks(JAXBElement<ArrayOfauthorsBooks> value) {
        this.authorsBooks = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the patronymic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPatronymic() {
        return patronymic;
    }

    /**
     * Sets the value of the patronymic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPatronymic(JAXBElement<String> value) {
        this.patronymic = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurname(JAXBElement<String> value) {
        this.surname = value;
    }

    /**
     * Gets the value of the yearOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Sets the value of the yearOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setYearOfBirth(JAXBElement<String> value) {
        this.yearOfBirth = value;
    }

    /**
     * Gets the value of the yearOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getYearOfDeath() {
        return yearOfDeath;
    }

    /**
     * Sets the value of the yearOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setYearOfDeath(JAXBElement<String> value) {
        this.yearOfDeath = value;
    }

}
