
package org.datacontract.schemas._2004._07.myconsoleapplication;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfgenres_books complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfgenres_books">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genres_books" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}genres_books" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfgenres_books", propOrder = {
    "genresBooks"
})
public class ArrayOfgenresBooks {

    @XmlElement(name = "genres_books", nillable = true)
    protected List<GenresBooks> genresBooks;

    /**
     * Gets the value of the genresBooks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genresBooks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenresBooks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenresBooks }
     * 
     * 
     */
    public List<GenresBooks> getGenresBooks() {
        if (genresBooks == null) {
            genresBooks = new ArrayList<GenresBooks>();
        }
        return this.genresBooks;
    }

}
