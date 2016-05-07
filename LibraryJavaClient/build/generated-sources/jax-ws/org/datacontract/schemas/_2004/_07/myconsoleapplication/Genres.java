
package org.datacontract.schemas._2004._07.myconsoleapplication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genres complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="genres">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genres_books" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}ArrayOfgenres_books" minOccurs="0"/>
 *         &lt;element name="id_genre" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="name_genre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genres", propOrder = {
    "genresBooks",
    "idGenre",
    "nameGenre"
})
public class Genres {

    @XmlElementRef(name = "genres_books", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfgenresBooks> genresBooks;
    @XmlElement(name = "id_genre")
    protected Integer idGenre;
    @XmlElementRef(name = "name_genre", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nameGenre;

    /**
     * Gets the value of the genresBooks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfgenresBooks }{@code >}
     *     
     */
    public JAXBElement<ArrayOfgenresBooks> getGenresBooks() {
        return genresBooks;
    }

    /**
     * Sets the value of the genresBooks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfgenresBooks }{@code >}
     *     
     */
    public void setGenresBooks(JAXBElement<ArrayOfgenresBooks> value) {
        this.genresBooks = value;
    }

    /**
     * Gets the value of the idGenre property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdGenre() {
        return idGenre;
    }

    /**
     * Sets the value of the idGenre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdGenre(Integer value) {
        this.idGenre = value;
    }

    /**
     * Gets the value of the nameGenre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameGenre() {
        return nameGenre;
    }

    /**
     * Sets the value of the nameGenre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameGenre(JAXBElement<String> value) {
        this.nameGenre = value;
    }

}
