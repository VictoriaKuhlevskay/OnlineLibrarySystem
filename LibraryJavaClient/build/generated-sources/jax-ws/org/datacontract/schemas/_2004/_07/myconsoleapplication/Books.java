
package org.datacontract.schemas._2004._07.myconsoleapplication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for books complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="books">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="about" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authors_books" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}ArrayOfauthors_books" minOccurs="0"/>
 *         &lt;element name="download" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}ArrayOfdownload" minOccurs="0"/>
 *         &lt;element name="genres_books" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}ArrayOfgenres_books" minOccurs="0"/>
 *         &lt;element name="id_book" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id_publisher" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imprint_date" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="name_book" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="publishers" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}publishers" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "books", propOrder = {
    "about",
    "authorsBooks",
    "download",
    "genresBooks",
    "idBook",
    "idPublisher",
    "image",
    "imprintDate",
    "nameBook",
    "pages",
    "publishers",
    "text"
})
public class Books {

    @XmlElementRef(name = "about", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> about;
    @XmlElementRef(name = "authors_books", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfauthorsBooks> authorsBooks;
    @XmlElementRef(name = "download", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfdownload> download;
    @XmlElementRef(name = "genres_books", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfgenresBooks> genresBooks;
    @XmlElement(name = "id_book")
    protected Integer idBook;
    @XmlElement(name = "id_publisher")
    protected Integer idPublisher;
    @XmlElementRef(name = "image", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> image;
    @XmlElement(name = "imprint_date")
    protected Integer imprintDate;
    @XmlElementRef(name = "name_book", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nameBook;
    protected Integer pages;
    @XmlElementRef(name = "publishers", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<Publishers> publishers;
    @XmlElementRef(name = "text", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> text;

    /**
     * Gets the value of the about property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAbout() {
        return about;
    }

    /**
     * Sets the value of the about property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAbout(JAXBElement<String> value) {
        this.about = value;
    }

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
     * Gets the value of the download property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfdownload }{@code >}
     *     
     */
    public JAXBElement<ArrayOfdownload> getDownload() {
        return download;
    }

    /**
     * Sets the value of the download property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfdownload }{@code >}
     *     
     */
    public void setDownload(JAXBElement<ArrayOfdownload> value) {
        this.download = value;
    }

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
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImage(JAXBElement<String> value) {
        this.image = value;
    }

    /**
     * Gets the value of the imprintDate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImprintDate() {
        return imprintDate;
    }

    /**
     * Sets the value of the imprintDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImprintDate(Integer value) {
        this.imprintDate = value;
    }

    /**
     * Gets the value of the nameBook property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameBook() {
        return nameBook;
    }

    /**
     * Sets the value of the nameBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameBook(JAXBElement<String> value) {
        this.nameBook = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPages(Integer value) {
        this.pages = value;
    }

    /**
     * Gets the value of the publishers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Publishers }{@code >}
     *     
     */
    public JAXBElement<Publishers> getPublishers() {
        return publishers;
    }

    /**
     * Sets the value of the publishers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Publishers }{@code >}
     *     
     */
    public void setPublishers(JAXBElement<Publishers> value) {
        this.publishers = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setText(JAXBElement<String> value) {
        this.text = value;
    }

}
