
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.myconsoleapplication.ArrayOfauthors;
import org.datacontract.schemas._2004._07.myconsoleapplication.ArrayOfgenres;
import org.datacontract.schemas._2004._07.myconsoleapplication.ArrayOfpublishers;
import org.datacontract.schemas._2004._07.myconsoleapplication.Authors;
import org.datacontract.schemas._2004._07.myconsoleapplication.AuthorsBooks;
import org.datacontract.schemas._2004._07.myconsoleapplication.Books;
import org.datacontract.schemas._2004._07.myconsoleapplication.Genres;
import org.datacontract.schemas._2004._07.myconsoleapplication.GenresBooks;
import org.datacontract.schemas._2004._07.myconsoleapplication.Publishers;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateABAb_QNAME = new QName("http://tempuri.org/", "ab");
    private final static QName _SearchAuthorResponseSearchAuthorResult_QNAME = new QName("http://tempuri.org/", "SearchAuthorResult");
    private final static QName _SearchGenreStr_QNAME = new QName("http://tempuri.org/", "str");
    private final static QName _AuthorFilterResponseAuthorFilterResult_QNAME = new QName("http://tempuri.org/", "AuthorFilterResult");
    private final static QName _GetAllPublisherResponseGetAllPublisherResult_QNAME = new QName("http://tempuri.org/", "GetAllPublisherResult");
    private final static QName _AddPublisherPublisher_QNAME = new QName("http://tempuri.org/", "publisher");
    private final static QName _AddGBGb_QNAME = new QName("http://tempuri.org/", "gb");
    private final static QName _UpdateGenreGenre_QNAME = new QName("http://tempuri.org/", "genre");
    private final static QName _GetByIdGenreResponseGetByIdGenreResult_QNAME = new QName("http://tempuri.org/", "GetByIdGenreResult");
    private final static QName _EnterPass_QNAME = new QName("http://tempuri.org/", "pass");
    private final static QName _EnterLogin_QNAME = new QName("http://tempuri.org/", "login");
    private final static QName _GetAllAuthorResponseGetAllAuthorResult_QNAME = new QName("http://tempuri.org/", "GetAllAuthorResult");
    private final static QName _GetSortBookResponseGetSortBookResult_QNAME = new QName("http://tempuri.org/", "GetSortBookResult");
    private final static QName _GetByIdPublisherResponseGetByIdPublisherResult_QNAME = new QName("http://tempuri.org/", "GetByIdPublisherResult");
    private final static QName _AddAuthorAuthor_QNAME = new QName("http://tempuri.org/", "author");
    private final static QName _AddBookBook_QNAME = new QName("http://tempuri.org/", "book");
    private final static QName _GetByIdAuthorResponseGetByIdAuthorResult_QNAME = new QName("http://tempuri.org/", "GetByIdAuthorResult");
    private final static QName _SearchGenreResponseSearchGenreResult_QNAME = new QName("http://tempuri.org/", "SearchGenreResult");
    private final static QName _GenreFilterResponseGenreFilterResult_QNAME = new QName("http://tempuri.org/", "GenreFilterResult");
    private final static QName _GetAllGenreResponseGetAllGenreResult_QNAME = new QName("http://tempuri.org/", "GetAllGenreResult");
    private final static QName _RegistrationEmail_QNAME = new QName("http://tempuri.org/", "email");
    private final static QName _SearchPublisherResponseSearchPublisherResult_QNAME = new QName("http://tempuri.org/", "SearchPublisherResult");
    private final static QName _SearchBookResponseSearchBookResult_QNAME = new QName("http://tempuri.org/", "SearchBookResult");
    private final static QName _GetByIdBookResponseGetByIdBookResult_QNAME = new QName("http://tempuri.org/", "GetByIdBookResult");
    private final static QName _GetAllBookResponseGetAllBookResult_QNAME = new QName("http://tempuri.org/", "GetAllBookResult");
    private final static QName _GetListIdResponseGetListIdResult_QNAME = new QName("http://tempuri.org/", "GetListIdResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetByIdGenreResponse }
     * 
     */
    public GetByIdGenreResponse createGetByIdGenreResponse() {
        return new GetByIdGenreResponse();
    }

    /**
     * Create an instance of {@link AddAuthorResponse }
     * 
     */
    public AddAuthorResponse createAddAuthorResponse() {
        return new AddAuthorResponse();
    }

    /**
     * Create an instance of {@link GetByIdGenre }
     * 
     */
    public GetByIdGenre createGetByIdGenre() {
        return new GetByIdGenre();
    }

    /**
     * Create an instance of {@link DeletePublisherResponse }
     * 
     */
    public DeletePublisherResponse createDeletePublisherResponse() {
        return new DeletePublisherResponse();
    }

    /**
     * Create an instance of {@link DeletePublisher }
     * 
     */
    public DeletePublisher createDeletePublisher() {
        return new DeletePublisher();
    }

    /**
     * Create an instance of {@link DeleteGBIdResponse }
     * 
     */
    public DeleteGBIdResponse createDeleteGBIdResponse() {
        return new DeleteGBIdResponse();
    }

    /**
     * Create an instance of {@link GetSortBookResponse }
     * 
     */
    public GetSortBookResponse createGetSortBookResponse() {
        return new GetSortBookResponse();
    }

    /**
     * Create an instance of {@link GetAllPublisherResponse }
     * 
     */
    public GetAllPublisherResponse createGetAllPublisherResponse() {
        return new GetAllPublisherResponse();
    }

    /**
     * Create an instance of {@link GetLastIdBookResponse }
     * 
     */
    public GetLastIdBookResponse createGetLastIdBookResponse() {
        return new GetLastIdBookResponse();
    }

    /**
     * Create an instance of {@link DeleteABId }
     * 
     */
    public DeleteABId createDeleteABId() {
        return new DeleteABId();
    }

    /**
     * Create an instance of {@link UpdateGenreResponse }
     * 
     */
    public UpdateGenreResponse createUpdateGenreResponse() {
        return new UpdateGenreResponse();
    }

    /**
     * Create an instance of {@link Registration }
     * 
     */
    public Registration createRegistration() {
        return new Registration();
    }

    /**
     * Create an instance of {@link DeleteABIdResponse }
     * 
     */
    public DeleteABIdResponse createDeleteABIdResponse() {
        return new DeleteABIdResponse();
    }

    /**
     * Create an instance of {@link AddABResponse }
     * 
     */
    public AddABResponse createAddABResponse() {
        return new AddABResponse();
    }

    /**
     * Create an instance of {@link GetByIdAuthorResponse }
     * 
     */
    public GetByIdAuthorResponse createGetByIdAuthorResponse() {
        return new GetByIdAuthorResponse();
    }

    /**
     * Create an instance of {@link UpdatePublisher }
     * 
     */
    public UpdatePublisher createUpdatePublisher() {
        return new UpdatePublisher();
    }

    /**
     * Create an instance of {@link AddAB }
     * 
     */
    public AddAB createAddAB() {
        return new AddAB();
    }

    /**
     * Create an instance of {@link SearchBook }
     * 
     */
    public SearchBook createSearchBook() {
        return new SearchBook();
    }

    /**
     * Create an instance of {@link GetAllGenre }
     * 
     */
    public GetAllGenre createGetAllGenre() {
        return new GetAllGenre();
    }

    /**
     * Create an instance of {@link AddPublisher }
     * 
     */
    public AddPublisher createAddPublisher() {
        return new AddPublisher();
    }

    /**
     * Create an instance of {@link DeleteBook }
     * 
     */
    public DeleteBook createDeleteBook() {
        return new DeleteBook();
    }

    /**
     * Create an instance of {@link UpdateGB }
     * 
     */
    public UpdateGB createUpdateGB() {
        return new UpdateGB();
    }

    /**
     * Create an instance of {@link GetAllBook }
     * 
     */
    public GetAllBook createGetAllBook() {
        return new GetAllBook();
    }

    /**
     * Create an instance of {@link GetAllAuthor }
     * 
     */
    public GetAllAuthor createGetAllAuthor() {
        return new GetAllAuthor();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link GetAllPublisher }
     * 
     */
    public GetAllPublisher createGetAllPublisher() {
        return new GetAllPublisher();
    }

    /**
     * Create an instance of {@link DeleteGenreResponse }
     * 
     */
    public DeleteGenreResponse createDeleteGenreResponse() {
        return new DeleteGenreResponse();
    }

    /**
     * Create an instance of {@link GetSortBook }
     * 
     */
    public GetSortBook createGetSortBook() {
        return new GetSortBook();
    }

    /**
     * Create an instance of {@link AddPublisherResponse }
     * 
     */
    public AddPublisherResponse createAddPublisherResponse() {
        return new AddPublisherResponse();
    }

    /**
     * Create an instance of {@link SearchPublisherResponse }
     * 
     */
    public SearchPublisherResponse createSearchPublisherResponse() {
        return new SearchPublisherResponse();
    }

    /**
     * Create an instance of {@link Enter }
     * 
     */
    public Enter createEnter() {
        return new Enter();
    }

    /**
     * Create an instance of {@link GetAllAuthorResponse }
     * 
     */
    public GetAllAuthorResponse createGetAllAuthorResponse() {
        return new GetAllAuthorResponse();
    }

    /**
     * Create an instance of {@link AddAuthor }
     * 
     */
    public AddAuthor createAddAuthor() {
        return new AddAuthor();
    }

    /**
     * Create an instance of {@link AddGenreResponse }
     * 
     */
    public AddGenreResponse createAddGenreResponse() {
        return new AddGenreResponse();
    }

    /**
     * Create an instance of {@link SearchAuthor }
     * 
     */
    public SearchAuthor createSearchAuthor() {
        return new SearchAuthor();
    }

    /**
     * Create an instance of {@link DeleteBookResponse }
     * 
     */
    public DeleteBookResponse createDeleteBookResponse() {
        return new DeleteBookResponse();
    }

    /**
     * Create an instance of {@link AnalyticsReadResponse }
     * 
     */
    public AnalyticsReadResponse createAnalyticsReadResponse() {
        return new AnalyticsReadResponse();
    }

    /**
     * Create an instance of {@link GetLastIdBook }
     * 
     */
    public GetLastIdBook createGetLastIdBook() {
        return new GetLastIdBook();
    }

    /**
     * Create an instance of {@link GetListIdResponse }
     * 
     */
    public GetListIdResponse createGetListIdResponse() {
        return new GetListIdResponse();
    }

    /**
     * Create an instance of {@link AuthorFilter }
     * 
     */
    public AuthorFilter createAuthorFilter() {
        return new AuthorFilter();
    }

    /**
     * Create an instance of {@link GetByIdBook }
     * 
     */
    public GetByIdBook createGetByIdBook() {
        return new GetByIdBook();
    }

    /**
     * Create an instance of {@link DeleteGenre }
     * 
     */
    public DeleteGenre createDeleteGenre() {
        return new DeleteGenre();
    }

    /**
     * Create an instance of {@link UpdateAuthor }
     * 
     */
    public UpdateAuthor createUpdateAuthor() {
        return new UpdateAuthor();
    }

    /**
     * Create an instance of {@link GenreFilterResponse }
     * 
     */
    public GenreFilterResponse createGenreFilterResponse() {
        return new GenreFilterResponse();
    }

    /**
     * Create an instance of {@link EnterResponse }
     * 
     */
    public EnterResponse createEnterResponse() {
        return new EnterResponse();
    }

    /**
     * Create an instance of {@link UpdateBook }
     * 
     */
    public UpdateBook createUpdateBook() {
        return new UpdateBook();
    }

    /**
     * Create an instance of {@link GetByIdPublisher }
     * 
     */
    public GetByIdPublisher createGetByIdPublisher() {
        return new GetByIdPublisher();
    }

    /**
     * Create an instance of {@link UpdateBookResponse }
     * 
     */
    public UpdateBookResponse createUpdateBookResponse() {
        return new UpdateBookResponse();
    }

    /**
     * Create an instance of {@link DeleteGBId }
     * 
     */
    public DeleteGBId createDeleteGBId() {
        return new DeleteGBId();
    }

    /**
     * Create an instance of {@link AddGenre }
     * 
     */
    public AddGenre createAddGenre() {
        return new AddGenre();
    }

    /**
     * Create an instance of {@link RegistrationResponse }
     * 
     */
    public RegistrationResponse createRegistrationResponse() {
        return new RegistrationResponse();
    }

    /**
     * Create an instance of {@link AddGB }
     * 
     */
    public AddGB createAddGB() {
        return new AddGB();
    }

    /**
     * Create an instance of {@link GetByIdAuthor }
     * 
     */
    public GetByIdAuthor createGetByIdAuthor() {
        return new GetByIdAuthor();
    }

    /**
     * Create an instance of {@link UpdatePublisherResponse }
     * 
     */
    public UpdatePublisherResponse createUpdatePublisherResponse() {
        return new UpdatePublisherResponse();
    }

    /**
     * Create an instance of {@link UpdateABResponse }
     * 
     */
    public UpdateABResponse createUpdateABResponse() {
        return new UpdateABResponse();
    }

    /**
     * Create an instance of {@link DeleteAuthor }
     * 
     */
    public DeleteAuthor createDeleteAuthor() {
        return new DeleteAuthor();
    }

    /**
     * Create an instance of {@link UpdateAB }
     * 
     */
    public UpdateAB createUpdateAB() {
        return new UpdateAB();
    }

    /**
     * Create an instance of {@link AuthorFilterResponse }
     * 
     */
    public AuthorFilterResponse createAuthorFilterResponse() {
        return new AuthorFilterResponse();
    }

    /**
     * Create an instance of {@link UpdateGBResponse }
     * 
     */
    public UpdateGBResponse createUpdateGBResponse() {
        return new UpdateGBResponse();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link AnalyticsRead }
     * 
     */
    public AnalyticsRead createAnalyticsRead() {
        return new AnalyticsRead();
    }

    /**
     * Create an instance of {@link GenreFilter }
     * 
     */
    public GenreFilter createGenreFilter() {
        return new GenreFilter();
    }

    /**
     * Create an instance of {@link GetByIdBookResponse }
     * 
     */
    public GetByIdBookResponse createGetByIdBookResponse() {
        return new GetByIdBookResponse();
    }

    /**
     * Create an instance of {@link AddGBResponse }
     * 
     */
    public AddGBResponse createAddGBResponse() {
        return new AddGBResponse();
    }

    /**
     * Create an instance of {@link GetAllBookResponse }
     * 
     */
    public GetAllBookResponse createGetAllBookResponse() {
        return new GetAllBookResponse();
    }

    /**
     * Create an instance of {@link SearchAuthorResponse }
     * 
     */
    public SearchAuthorResponse createSearchAuthorResponse() {
        return new SearchAuthorResponse();
    }

    /**
     * Create an instance of {@link UpdateAuthorResponse }
     * 
     */
    public UpdateAuthorResponse createUpdateAuthorResponse() {
        return new UpdateAuthorResponse();
    }

    /**
     * Create an instance of {@link GetAllGenreResponse }
     * 
     */
    public GetAllGenreResponse createGetAllGenreResponse() {
        return new GetAllGenreResponse();
    }

    /**
     * Create an instance of {@link GetByIdPublisherResponse }
     * 
     */
    public GetByIdPublisherResponse createGetByIdPublisherResponse() {
        return new GetByIdPublisherResponse();
    }

    /**
     * Create an instance of {@link SearchGenreResponse }
     * 
     */
    public SearchGenreResponse createSearchGenreResponse() {
        return new SearchGenreResponse();
    }

    /**
     * Create an instance of {@link SearchBookResponse }
     * 
     */
    public SearchBookResponse createSearchBookResponse() {
        return new SearchBookResponse();
    }

    /**
     * Create an instance of {@link SearchPublisher }
     * 
     */
    public SearchPublisher createSearchPublisher() {
        return new SearchPublisher();
    }

    /**
     * Create an instance of {@link SearchGenre }
     * 
     */
    public SearchGenre createSearchGenre() {
        return new SearchGenre();
    }

    /**
     * Create an instance of {@link UpdateGenre }
     * 
     */
    public UpdateGenre createUpdateGenre() {
        return new UpdateGenre();
    }

    /**
     * Create an instance of {@link DeleteAuthorResponse }
     * 
     */
    public DeleteAuthorResponse createDeleteAuthorResponse() {
        return new DeleteAuthorResponse();
    }

    /**
     * Create an instance of {@link GetListId }
     * 
     */
    public GetListId createGetListId() {
        return new GetListId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorsBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ab", scope = UpdateAB.class)
    public JAXBElement<AuthorsBooks> createUpdateABAb(AuthorsBooks value) {
        return new JAXBElement<AuthorsBooks>(_UpdateABAb_QNAME, AuthorsBooks.class, UpdateAB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SearchAuthorResult", scope = SearchAuthorResponse.class)
    public JAXBElement<ArrayOfauthors> createSearchAuthorResponseSearchAuthorResult(ArrayOfauthors value) {
        return new JAXBElement<ArrayOfauthors>(_SearchAuthorResponseSearchAuthorResult_QNAME, ArrayOfauthors.class, SearchAuthorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "str", scope = SearchGenre.class)
    public JAXBElement<String> createSearchGenreStr(String value) {
        return new JAXBElement<String>(_SearchGenreStr_QNAME, String.class, SearchGenre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AuthorFilterResult", scope = AuthorFilterResponse.class)
    public JAXBElement<ArrayOfstring> createAuthorFilterResponseAuthorFilterResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_AuthorFilterResponseAuthorFilterResult_QNAME, ArrayOfstring.class, AuthorFilterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfpublishers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllPublisherResult", scope = GetAllPublisherResponse.class)
    public JAXBElement<ArrayOfpublishers> createGetAllPublisherResponseGetAllPublisherResult(ArrayOfpublishers value) {
        return new JAXBElement<ArrayOfpublishers>(_GetAllPublisherResponseGetAllPublisherResult_QNAME, ArrayOfpublishers.class, GetAllPublisherResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Publishers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "publisher", scope = AddPublisher.class)
    public JAXBElement<Publishers> createAddPublisherPublisher(Publishers value) {
        return new JAXBElement<Publishers>(_AddPublisherPublisher_QNAME, Publishers.class, AddPublisher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenresBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "gb", scope = AddGB.class)
    public JAXBElement<GenresBooks> createAddGBGb(GenresBooks value) {
        return new JAXBElement<GenresBooks>(_AddGBGb_QNAME, GenresBooks.class, AddGB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Genres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "genre", scope = UpdateGenre.class)
    public JAXBElement<Genres> createUpdateGenreGenre(Genres value) {
        return new JAXBElement<Genres>(_UpdateGenreGenre_QNAME, Genres.class, UpdateGenre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Genres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetByIdGenreResult", scope = GetByIdGenreResponse.class)
    public JAXBElement<Genres> createGetByIdGenreResponseGetByIdGenreResult(Genres value) {
        return new JAXBElement<Genres>(_GetByIdGenreResponseGetByIdGenreResult_QNAME, Genres.class, GetByIdGenreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = Enter.class)
    public JAXBElement<String> createEnterPass(String value) {
        return new JAXBElement<String>(_EnterPass_QNAME, String.class, Enter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = Enter.class)
    public JAXBElement<String> createEnterLogin(String value) {
        return new JAXBElement<String>(_EnterLogin_QNAME, String.class, Enter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllAuthorResult", scope = GetAllAuthorResponse.class)
    public JAXBElement<ArrayOfauthors> createGetAllAuthorResponseGetAllAuthorResult(ArrayOfauthors value) {
        return new JAXBElement<ArrayOfauthors>(_GetAllAuthorResponseGetAllAuthorResult_QNAME, ArrayOfauthors.class, GetAllAuthorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSortBookResult", scope = GetSortBookResponse.class)
    public JAXBElement<ArrayOfstring> createGetSortBookResponseGetSortBookResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetSortBookResponseGetSortBookResult_QNAME, ArrayOfstring.class, GetSortBookResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Publishers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetByIdPublisherResult", scope = GetByIdPublisherResponse.class)
    public JAXBElement<Publishers> createGetByIdPublisherResponseGetByIdPublisherResult(Publishers value) {
        return new JAXBElement<Publishers>(_GetByIdPublisherResponseGetByIdPublisherResult_QNAME, Publishers.class, GetByIdPublisherResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "str", scope = SearchPublisher.class)
    public JAXBElement<String> createSearchPublisherStr(String value) {
        return new JAXBElement<String>(_SearchGenreStr_QNAME, String.class, SearchPublisher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "author", scope = AddAuthor.class)
    public JAXBElement<Authors> createAddAuthorAuthor(Authors value) {
        return new JAXBElement<Authors>(_AddAuthorAuthor_QNAME, Authors.class, AddAuthor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorsBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ab", scope = AddAB.class)
    public JAXBElement<AuthorsBooks> createAddABAb(AuthorsBooks value) {
        return new JAXBElement<AuthorsBooks>(_UpdateABAb_QNAME, AuthorsBooks.class, AddAB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Books }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "book", scope = AddBook.class)
    public JAXBElement<Books> createAddBookBook(Books value) {
        return new JAXBElement<Books>(_AddBookBook_QNAME, Books.class, AddBook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetByIdAuthorResult", scope = GetByIdAuthorResponse.class)
    public JAXBElement<Authors> createGetByIdAuthorResponseGetByIdAuthorResult(Authors value) {
        return new JAXBElement<Authors>(_GetByIdAuthorResponseGetByIdAuthorResult_QNAME, Authors.class, GetByIdAuthorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenresBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "gb", scope = UpdateGB.class)
    public JAXBElement<GenresBooks> createUpdateGBGb(GenresBooks value) {
        return new JAXBElement<GenresBooks>(_AddGBGb_QNAME, GenresBooks.class, UpdateGB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfgenres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SearchGenreResult", scope = SearchGenreResponse.class)
    public JAXBElement<ArrayOfgenres> createSearchGenreResponseSearchGenreResult(ArrayOfgenres value) {
        return new JAXBElement<ArrayOfgenres>(_SearchGenreResponseSearchGenreResult_QNAME, ArrayOfgenres.class, SearchGenreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "str", scope = SearchAuthor.class)
    public JAXBElement<String> createSearchAuthorStr(String value) {
        return new JAXBElement<String>(_SearchGenreStr_QNAME, String.class, SearchAuthor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GenreFilterResult", scope = GenreFilterResponse.class)
    public JAXBElement<ArrayOfstring> createGenreFilterResponseGenreFilterResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GenreFilterResponseGenreFilterResult_QNAME, ArrayOfstring.class, GenreFilterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfgenres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllGenreResult", scope = GetAllGenreResponse.class)
    public JAXBElement<ArrayOfgenres> createGetAllGenreResponseGetAllGenreResult(ArrayOfgenres value) {
        return new JAXBElement<ArrayOfgenres>(_GetAllGenreResponseGetAllGenreResult_QNAME, ArrayOfgenres.class, GetAllGenreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Books }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "book", scope = UpdateBook.class)
    public JAXBElement<Books> createUpdateBookBook(Books value) {
        return new JAXBElement<Books>(_AddBookBook_QNAME, Books.class, UpdateBook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Genres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "genre", scope = AddGenre.class)
    public JAXBElement<Genres> createAddGenreGenre(Genres value) {
        return new JAXBElement<Genres>(_UpdateGenreGenre_QNAME, Genres.class, AddGenre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = Registration.class)
    public JAXBElement<String> createRegistrationPass(String value) {
        return new JAXBElement<String>(_EnterPass_QNAME, String.class, Registration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "email", scope = Registration.class)
    public JAXBElement<String> createRegistrationEmail(String value) {
        return new JAXBElement<String>(_RegistrationEmail_QNAME, String.class, Registration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = Registration.class)
    public JAXBElement<String> createRegistrationLogin(String value) {
        return new JAXBElement<String>(_EnterLogin_QNAME, String.class, Registration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfpublishers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SearchPublisherResult", scope = SearchPublisherResponse.class)
    public JAXBElement<ArrayOfpublishers> createSearchPublisherResponseSearchPublisherResult(ArrayOfpublishers value) {
        return new JAXBElement<ArrayOfpublishers>(_SearchPublisherResponseSearchPublisherResult_QNAME, ArrayOfpublishers.class, SearchPublisherResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SearchBookResult", scope = SearchBookResponse.class)
    public JAXBElement<ArrayOfstring> createSearchBookResponseSearchBookResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_SearchBookResponseSearchBookResult_QNAME, ArrayOfstring.class, SearchBookResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "author", scope = UpdateAuthor.class)
    public JAXBElement<Authors> createUpdateAuthorAuthor(Authors value) {
        return new JAXBElement<Authors>(_AddAuthorAuthor_QNAME, Authors.class, UpdateAuthor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "str", scope = SearchBook.class)
    public JAXBElement<String> createSearchBookStr(String value) {
        return new JAXBElement<String>(_SearchGenreStr_QNAME, String.class, SearchBook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Publishers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "publisher", scope = UpdatePublisher.class)
    public JAXBElement<Publishers> createUpdatePublisherPublisher(Publishers value) {
        return new JAXBElement<Publishers>(_AddPublisherPublisher_QNAME, Publishers.class, UpdatePublisher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Books }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetByIdBookResult", scope = GetByIdBookResponse.class)
    public JAXBElement<Books> createGetByIdBookResponseGetByIdBookResult(Books value) {
        return new JAXBElement<Books>(_GetByIdBookResponseGetByIdBookResult_QNAME, Books.class, GetByIdBookResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllBookResult", scope = GetAllBookResponse.class)
    public JAXBElement<ArrayOfstring> createGetAllBookResponseGetAllBookResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetAllBookResponseGetAllBookResult_QNAME, ArrayOfstring.class, GetAllBookResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetListIdResult", scope = GetListIdResponse.class)
    public JAXBElement<ArrayOfstring> createGetListIdResponseGetListIdResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetListIdResponseGetListIdResult_QNAME, ArrayOfstring.class, GetListIdResponse.class, value);
    }

}
