
package org.datacontract.schemas._2004._07.myconsoleapplication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.myconsoleapplication package. 
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

    private final static QName _ArrayOfdownload_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "ArrayOfdownload");
    private final static QName _Authors_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "authors");
    private final static QName _ArrayOfauthorsBooks_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "ArrayOfauthors_books");
    private final static QName _Books_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "books");
    private final static QName _ArrayOfauthors_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "ArrayOfauthors");
    private final static QName _Users_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "users");
    private final static QName _ArrayOfgenres_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "ArrayOfgenres");
    private final static QName _ArrayOfgenresBooks_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "ArrayOfgenres_books");
    private final static QName _Publishers_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "publishers");
    private final static QName _AuthorsBooks_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "authors_books");
    private final static QName _Download_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "download");
    private final static QName _Genres_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "genres");
    private final static QName _ArrayOfbooks_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "ArrayOfbooks");
    private final static QName _GenresBooks_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "genres_books");
    private final static QName _ArrayOfpublishers_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "ArrayOfpublishers");
    private final static QName _UsersLogin_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "login");
    private final static QName _UsersEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "email");
    private final static QName _UsersPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "password");
    private final static QName _AuthorsName_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "name");
    private final static QName _AuthorsYearOfDeath_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "year_of_death");
    private final static QName _AuthorsYearOfBirth_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "year_of_birth");
    private final static QName _AuthorsPatronymic_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "patronymic");
    private final static QName _AuthorsSurname_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "surname");
    private final static QName _PublishersNamePublisher_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "name_publisher");
    private final static QName _GenresNameGenre_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "name_genre");
    private final static QName _BooksAbout_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "about");
    private final static QName _BooksText_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "text");
    private final static QName _BooksNameBook_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "name_book");
    private final static QName _BooksImage_QNAME = new QName("http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", "image");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.myconsoleapplication
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Genres }
     * 
     */
    public Genres createGenres() {
        return new Genres();
    }

    /**
     * Create an instance of {@link ArrayOfpublishers }
     * 
     */
    public ArrayOfpublishers createArrayOfpublishers() {
        return new ArrayOfpublishers();
    }

    /**
     * Create an instance of {@link Authors }
     * 
     */
    public Authors createAuthors() {
        return new Authors();
    }

    /**
     * Create an instance of {@link Publishers }
     * 
     */
    public Publishers createPublishers() {
        return new Publishers();
    }

    /**
     * Create an instance of {@link AuthorsBooks }
     * 
     */
    public AuthorsBooks createAuthorsBooks() {
        return new AuthorsBooks();
    }

    /**
     * Create an instance of {@link GenresBooks }
     * 
     */
    public GenresBooks createGenresBooks() {
        return new GenresBooks();
    }

    /**
     * Create an instance of {@link Books }
     * 
     */
    public Books createBooks() {
        return new Books();
    }

    /**
     * Create an instance of {@link ArrayOfauthors }
     * 
     */
    public ArrayOfauthors createArrayOfauthors() {
        return new ArrayOfauthors();
    }

    /**
     * Create an instance of {@link ArrayOfgenres }
     * 
     */
    public ArrayOfgenres createArrayOfgenres() {
        return new ArrayOfgenres();
    }

    /**
     * Create an instance of {@link ArrayOfbooks }
     * 
     */
    public ArrayOfbooks createArrayOfbooks() {
        return new ArrayOfbooks();
    }

    /**
     * Create an instance of {@link Users }
     * 
     */
    public Users createUsers() {
        return new Users();
    }

    /**
     * Create an instance of {@link ArrayOfauthorsBooks }
     * 
     */
    public ArrayOfauthorsBooks createArrayOfauthorsBooks() {
        return new ArrayOfauthorsBooks();
    }

    /**
     * Create an instance of {@link Download }
     * 
     */
    public Download createDownload() {
        return new Download();
    }

    /**
     * Create an instance of {@link ArrayOfgenresBooks }
     * 
     */
    public ArrayOfgenresBooks createArrayOfgenresBooks() {
        return new ArrayOfgenresBooks();
    }

    /**
     * Create an instance of {@link ArrayOfdownload }
     * 
     */
    public ArrayOfdownload createArrayOfdownload() {
        return new ArrayOfdownload();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdownload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "ArrayOfdownload")
    public JAXBElement<ArrayOfdownload> createArrayOfdownload(ArrayOfdownload value) {
        return new JAXBElement<ArrayOfdownload>(_ArrayOfdownload_QNAME, ArrayOfdownload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "authors")
    public JAXBElement<Authors> createAuthors(Authors value) {
        return new JAXBElement<Authors>(_Authors_QNAME, Authors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthorsBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "ArrayOfauthors_books")
    public JAXBElement<ArrayOfauthorsBooks> createArrayOfauthorsBooks(ArrayOfauthorsBooks value) {
        return new JAXBElement<ArrayOfauthorsBooks>(_ArrayOfauthorsBooks_QNAME, ArrayOfauthorsBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Books }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "books")
    public JAXBElement<Books> createBooks(Books value) {
        return new JAXBElement<Books>(_Books_QNAME, Books.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "ArrayOfauthors")
    public JAXBElement<ArrayOfauthors> createArrayOfauthors(ArrayOfauthors value) {
        return new JAXBElement<ArrayOfauthors>(_ArrayOfauthors_QNAME, ArrayOfauthors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Users }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "users")
    public JAXBElement<Users> createUsers(Users value) {
        return new JAXBElement<Users>(_Users_QNAME, Users.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfgenres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "ArrayOfgenres")
    public JAXBElement<ArrayOfgenres> createArrayOfgenres(ArrayOfgenres value) {
        return new JAXBElement<ArrayOfgenres>(_ArrayOfgenres_QNAME, ArrayOfgenres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfgenresBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "ArrayOfgenres_books")
    public JAXBElement<ArrayOfgenresBooks> createArrayOfgenresBooks(ArrayOfgenresBooks value) {
        return new JAXBElement<ArrayOfgenresBooks>(_ArrayOfgenresBooks_QNAME, ArrayOfgenresBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Publishers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "publishers")
    public JAXBElement<Publishers> createPublishers(Publishers value) {
        return new JAXBElement<Publishers>(_Publishers_QNAME, Publishers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorsBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "authors_books")
    public JAXBElement<AuthorsBooks> createAuthorsBooks(AuthorsBooks value) {
        return new JAXBElement<AuthorsBooks>(_AuthorsBooks_QNAME, AuthorsBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Download }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "download")
    public JAXBElement<Download> createDownload(Download value) {
        return new JAXBElement<Download>(_Download_QNAME, Download.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Genres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "genres")
    public JAXBElement<Genres> createGenres(Genres value) {
        return new JAXBElement<Genres>(_Genres_QNAME, Genres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfbooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "ArrayOfbooks")
    public JAXBElement<ArrayOfbooks> createArrayOfbooks(ArrayOfbooks value) {
        return new JAXBElement<ArrayOfbooks>(_ArrayOfbooks_QNAME, ArrayOfbooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenresBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "genres_books")
    public JAXBElement<GenresBooks> createGenresBooks(GenresBooks value) {
        return new JAXBElement<GenresBooks>(_GenresBooks_QNAME, GenresBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfpublishers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "ArrayOfpublishers")
    public JAXBElement<ArrayOfpublishers> createArrayOfpublishers(ArrayOfpublishers value) {
        return new JAXBElement<ArrayOfpublishers>(_ArrayOfpublishers_QNAME, ArrayOfpublishers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "login", scope = Users.class)
    public JAXBElement<String> createUsersLogin(String value) {
        return new JAXBElement<String>(_UsersLogin_QNAME, String.class, Users.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "email", scope = Users.class)
    public JAXBElement<String> createUsersEmail(String value) {
        return new JAXBElement<String>(_UsersEmail_QNAME, String.class, Users.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdownload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "download", scope = Users.class)
    public JAXBElement<ArrayOfdownload> createUsersDownload(ArrayOfdownload value) {
        return new JAXBElement<ArrayOfdownload>(_Download_QNAME, ArrayOfdownload.class, Users.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "password", scope = Users.class)
    public JAXBElement<String> createUsersPassword(String value) {
        return new JAXBElement<String>(_UsersPassword_QNAME, String.class, Users.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Users }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "users", scope = Download.class)
    public JAXBElement<Users> createDownloadUsers(Users value) {
        return new JAXBElement<Users>(_Users_QNAME, Users.class, Download.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Books }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "books", scope = Download.class)
    public JAXBElement<Books> createDownloadBooks(Books value) {
        return new JAXBElement<Books>(_Books_QNAME, Books.class, Download.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "name", scope = Authors.class)
    public JAXBElement<String> createAuthorsName(String value) {
        return new JAXBElement<String>(_AuthorsName_QNAME, String.class, Authors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "year_of_death", scope = Authors.class)
    public JAXBElement<String> createAuthorsYearOfDeath(String value) {
        return new JAXBElement<String>(_AuthorsYearOfDeath_QNAME, String.class, Authors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "year_of_birth", scope = Authors.class)
    public JAXBElement<String> createAuthorsYearOfBirth(String value) {
        return new JAXBElement<String>(_AuthorsYearOfBirth_QNAME, String.class, Authors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthorsBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "authors_books", scope = Authors.class)
    public JAXBElement<ArrayOfauthorsBooks> createAuthorsAuthorsBooks(ArrayOfauthorsBooks value) {
        return new JAXBElement<ArrayOfauthorsBooks>(_AuthorsBooks_QNAME, ArrayOfauthorsBooks.class, Authors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "patronymic", scope = Authors.class)
    public JAXBElement<String> createAuthorsPatronymic(String value) {
        return new JAXBElement<String>(_AuthorsPatronymic_QNAME, String.class, Authors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "surname", scope = Authors.class)
    public JAXBElement<String> createAuthorsSurname(String value) {
        return new JAXBElement<String>(_AuthorsSurname_QNAME, String.class, Authors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Books }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "books", scope = GenresBooks.class)
    public JAXBElement<Books> createGenresBooksBooks(Books value) {
        return new JAXBElement<Books>(_Books_QNAME, Books.class, GenresBooks.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Genres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "genres", scope = GenresBooks.class)
    public JAXBElement<Genres> createGenresBooksGenres(Genres value) {
        return new JAXBElement<Genres>(_Genres_QNAME, Genres.class, GenresBooks.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "authors", scope = AuthorsBooks.class)
    public JAXBElement<Authors> createAuthorsBooksAuthors(Authors value) {
        return new JAXBElement<Authors>(_Authors_QNAME, Authors.class, AuthorsBooks.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Books }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "books", scope = AuthorsBooks.class)
    public JAXBElement<Books> createAuthorsBooksBooks(Books value) {
        return new JAXBElement<Books>(_Books_QNAME, Books.class, AuthorsBooks.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "name_publisher", scope = Publishers.class)
    public JAXBElement<String> createPublishersNamePublisher(String value) {
        return new JAXBElement<String>(_PublishersNamePublisher_QNAME, String.class, Publishers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfbooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "books", scope = Publishers.class)
    public JAXBElement<ArrayOfbooks> createPublishersBooks(ArrayOfbooks value) {
        return new JAXBElement<ArrayOfbooks>(_Books_QNAME, ArrayOfbooks.class, Publishers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfgenresBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "genres_books", scope = Genres.class)
    public JAXBElement<ArrayOfgenresBooks> createGenresGenresBooks(ArrayOfgenresBooks value) {
        return new JAXBElement<ArrayOfgenresBooks>(_GenresBooks_QNAME, ArrayOfgenresBooks.class, Genres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "name_genre", scope = Genres.class)
    public JAXBElement<String> createGenresNameGenre(String value) {
        return new JAXBElement<String>(_GenresNameGenre_QNAME, String.class, Genres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "about", scope = Books.class)
    public JAXBElement<String> createBooksAbout(String value) {
        return new JAXBElement<String>(_BooksAbout_QNAME, String.class, Books.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Publishers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "publishers", scope = Books.class)
    public JAXBElement<Publishers> createBooksPublishers(Publishers value) {
        return new JAXBElement<Publishers>(_Publishers_QNAME, Publishers.class, Books.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "text", scope = Books.class)
    public JAXBElement<String> createBooksText(String value) {
        return new JAXBElement<String>(_BooksText_QNAME, String.class, Books.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "name_book", scope = Books.class)
    public JAXBElement<String> createBooksNameBook(String value) {
        return new JAXBElement<String>(_BooksNameBook_QNAME, String.class, Books.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfgenresBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "genres_books", scope = Books.class)
    public JAXBElement<ArrayOfgenresBooks> createBooksGenresBooks(ArrayOfgenresBooks value) {
        return new JAXBElement<ArrayOfgenresBooks>(_GenresBooks_QNAME, ArrayOfgenresBooks.class, Books.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "image", scope = Books.class)
    public JAXBElement<String> createBooksImage(String value) {
        return new JAXBElement<String>(_BooksImage_QNAME, String.class, Books.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauthorsBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "authors_books", scope = Books.class)
    public JAXBElement<ArrayOfauthorsBooks> createBooksAuthorsBooks(ArrayOfauthorsBooks value) {
        return new JAXBElement<ArrayOfauthorsBooks>(_AuthorsBooks_QNAME, ArrayOfauthorsBooks.class, Books.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdownload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", name = "download", scope = Books.class)
    public JAXBElement<ArrayOfdownload> createBooksDownload(ArrayOfdownload value) {
        return new JAXBElement<ArrayOfdownload>(_Download_QNAME, ArrayOfdownload.class, Books.class, value);
    }

}
