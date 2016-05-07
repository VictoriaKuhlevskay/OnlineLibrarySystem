using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using MyConsoleApplication.Model;
using System.Data;

namespace MyConsoleApplication
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IMyService" in both code and config file together.
    [ServiceContract]
    public partial interface IMyService
    {
        [OperationContract]
        List<publishers> GetAllPublisher();

        [OperationContract]
        publishers GetByIdPublisher(int id);

        [OperationContract]
        void AddPublisher(publishers publisher);

        [OperationContract]
        void UpdatePublisher(publishers publisher);

        [OperationContract]
        void DeletePublisher(int id);

        [OperationContract]
        List<publishers> SearchPublisher(String str);

        //Авторы
        [OperationContract]
        List<authors> GetAllAuthor();

        [OperationContract]
        authors GetByIdAuthor(int id);

        [OperationContract]
        void AddAuthor(authors author);

        [OperationContract]
        void UpdateAuthor(authors author);

        [OperationContract]
        void DeleteAuthor(int id);

        [OperationContract]
        List<authors> SearchAuthor(String str);


        //Жанры
        [OperationContract]
        List<genres> GetAllGenre();

        [OperationContract]
        genres GetByIdGenre(int id);

        [OperationContract]
        void AddGenre(genres genre);

        [OperationContract]
        void UpdateGenre(genres genre);

        [OperationContract]
        void DeleteGenre(int id);

        [OperationContract]
        List<genres> SearchGenre(String str);


        //Книги
        [OperationContract]
        List<String> GetAllBook();

        [OperationContract]
        books GetByIdBook(int id);

        [OperationContract]
        void AddBook(books book);

        [OperationContract]
        void UpdateBook(books book);

        [OperationContract]
        void DeleteBook(int id);

        [OperationContract]
        List<String> SearchBook(String str);

        [OperationContract]
        int GetLastIdBook();

        // Авторы Книги
        [OperationContract]
        void AddAB(authors_books ab);

        [OperationContract]
        void UpdateAB(authors_books ab);

        [OperationContract]
        void DeleteABId(int l);
        

        // Жанры Книги
        [OperationContract]
        void AddGB(genres_books gb);

        [OperationContract]
        void UpdateGB(genres_books gb);
        
        [OperationContract]
        void DeleteGBId(int l);


        // Фильтр
        [OperationContract]
        List<String> GenreFilter(int id);

        [OperationContract]
        List<String> AuthorFilter(int id);

        //Регистрация

        [OperationContract]
        void Registration(String login, String pass, String email);

        [OperationContract]
        int Enter(String login, String pass);

        // Аналитика

        [OperationContract]
        void AnalyticsRead(int id);

        [OperationContract]
        List<String> GetListId();

        [OperationContract]
        List<String> GetSortBook();
    }
}
