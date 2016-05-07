
package org.datacontract.schemas._2004._07.myconsoleapplication;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfauthors_books complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfauthors_books">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authors_books" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}authors_books" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfauthors_books", propOrder = {
    "authorsBooks"
})
public class ArrayOfauthorsBooks {

    @XmlElement(name = "authors_books", nillable = true)
    protected List<AuthorsBooks> authorsBooks;

    /**
     * Gets the value of the authorsBooks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorsBooks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorsBooks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorsBooks }
     * 
     * 
     */
    public List<AuthorsBooks> getAuthorsBooks() {
        if (authorsBooks == null) {
            authorsBooks = new ArrayList<AuthorsBooks>();
        }
        return this.authorsBooks;
    }

}
