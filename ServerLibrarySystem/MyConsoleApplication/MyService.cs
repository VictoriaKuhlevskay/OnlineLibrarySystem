using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;
using System.Data;
using System.ServiceModel.Activation;
using MyConsoleApplication.Model;
using System.Runtime.Serialization;
using System.ServiceModel;
using System;
using System.Collections.Generic;

namespace MyConsoleApplication
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "MyService" in both code and config file together.
    public class MyService : IMyService
    {
        public void Add(String str)
        {
            Console.WriteLine("String " + str);
        }



        libraryEntities db = new libraryEntities();
        SqlConnection con = new SqlConnection(@"Data Source=DESKTOP-TB41UU5\SQLEXPRESS; Initial Catalog = library; Integrated Security=SSPI;");
        public void GetAllPublisher(String str)
        {
            //{
            //    con.Open();
            //    SqlDataAdapter da = new SqlDataAdapter("select id_publisher as 'ID', name_publisher as 'Название' from publishers", con);
            //    SqlCommandBuilder cb = new SqlCommandBuilder(da);
            //    DataSet ds = new DataSet();
            //    da.Fill(ds, "publishers");
            //    return ds;
            Console.WriteLine("String " + str);
        }

        //Издательства
        public List<publishers> GetAllPublisher()
        {
            List<publishers> list = new List<publishers>();
            con.Open();
            String str = "select id_publisher as 'ID', name_publisher as 'Название' from publishers";
            SqlCommand cmd = new SqlCommand(str, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            while (sdr.Read())
            {
                publishers p = new publishers();
                p.id_publisher = sdr.GetInt32(0);
                p.name_publisher = sdr.GetString(1);
                list.Add(p);
            }
            sdr.Close();
            return list;
        }

        public publishers GetByIdPublisher(int id)
        {
            con.Open();
            String str = "select * from publishers where id_publisher = '" + id + "'";
            SqlCommand cmd = new SqlCommand(str, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            publishers p = new publishers();
            while (sdr.Read())
            {
                p.id_publisher = sdr.GetInt32(0);
                p.name_publisher = sdr.GetString(1);
            }
            sdr.Close();
            return p;
        }

        public void AddPublisher(publishers publisher)
        {
            db.publishers.Add(publisher);
            db.SaveChanges();
        }

        public void UpdatePublisher(publishers publisher)
        {
            db.Entry(publisher).State = System.Data.EntityState.Modified;
            db.SaveChanges();
        }

        public void DeletePublisher(int id)
        {
            publishers publisher = db.publishers.Find(id);
            db.publishers.Remove(publisher);
            db.SaveChanges();
        }

        public List<publishers> SearchPublisher(String str)
        {
            List<publishers> list = new List<publishers>();
            con.Open();
            String s = "select * from publishers where name_publisher like '%" + str + "%'";
            SqlCommand cmd = new SqlCommand(s, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            while (sdr.Read())
            {
                publishers p = new publishers();
                p.id_publisher = sdr.GetInt32(0);
                p.name_publisher = sdr.GetString(1);
                list.Add(p);
            }
            sdr.Close();
            return list;
        }

        //Авторы
        public List<authors> GetAllAuthor()
        {
            List<authors> list = new List<authors>();
            con.Open();
            String str = "select id_author as 'ID', surname as 'Фамилия', name as 'Имя', patronymic as 'Отчество', year_of_birth as 'Год рождения', year_of_death as 'Год смерти' from authors";
            SqlCommand cmd = new SqlCommand(str, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            while (sdr.Read())
            {
                authors a = new authors();
                a.id_author = sdr.GetInt32(0);
                a.name = sdr.GetString(2);
                a.surname = sdr.GetString(1);
                a.patronymic = sdr.GetString(3);
                a.year_of_birth = sdr.GetString(4);
                a.year_of_death = sdr.GetString(5);
                list.Add(a);
            }
            sdr.Close();
            return list;
        }
        public authors GetByIdAuthor(int id)
        {
            con.Open();
            String str = "select * from authors where id_author = '" + id + "'";
            SqlCommand cmd = new SqlCommand(str, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            authors a = new authors();
            while (sdr.Read())
            {
                a.id_author = sdr.GetInt32(0);
                a.name = sdr.GetString(2);
                a.surname = sdr.GetString(1);
                a.patronymic = sdr.GetString(3);
                a.year_of_birth = sdr.GetString(4);
                a.year_of_death = sdr.GetString(5);
            }
            sdr.Close();
            return a;
        }

        public void AddAuthor(authors author)
        {
            db.authors.Add(author);
            db.SaveChanges();
        }

        public void UpdateAuthor(authors author)
        {
            db.Entry(author).State = System.Data.EntityState.Modified;
            db.SaveChanges();
        }

        public void DeleteAuthor(int id)
        {
            authors author = db.authors.Find(id);
            db.authors.Remove(author);
            db.SaveChanges();
        }

        public List<authors> SearchAuthor(String str)
        {
            List<authors> list = new List<authors>();
            con.Open();
            String s = "select * from authors where surname like '%" + str + "%'";
            SqlCommand cmd = new SqlCommand(s, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            while (sdr.Read())
            {
                authors a = new authors();
                a.id_author = sdr.GetInt32(0);
                a.name = sdr.GetString(1);
                a.surname = sdr.GetString(2);
                a.patronymic = sdr.GetString(3);
                a.year_of_birth = sdr.GetString(4);
                a.year_of_death = sdr.GetString(5);
                list.Add(a);
            }
            sdr.Close();
            return list;
        }


        //Жанры
        public List<genres> GetAllGenre()
        {
            List<genres> list = new List<genres>();
            con.Open();
            String str = "select id_genre as 'ID', name_genre as 'Название' from genres";
            SqlCommand cmd = new SqlCommand(str, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            while (sdr.Read())
            {
                genres g = new genres();
                g.id_genre = sdr.GetInt32(0);
                g.name_genre = sdr.GetString(1);
                list.Add(g);
            }
            sdr.Close();
            return list;
        }

        public genres GetByIdGenre(int id)
        {
            con.Open();
            String str = "select * from genres where id_genre = '" + id + "'";
            SqlCommand cmd = new SqlCommand(str, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            genres g = new genres();
            while (sdr.Read())
            {
                g.id_genre = sdr.GetInt32(0);
                g.name_genre = sdr.GetString(1);
            }
            sdr.Close();
            return g;
        }

        public void AddGenre(genres genre)
        {
            db.genres.Add(genre);
            db.SaveChanges();
        }

        public void UpdateGenre(genres genre)
        {
            db.Entry(genre).State = System.Data.EntityState.Modified;
            db.SaveChanges();
        }

        public void DeleteGenre(int id)
        {
            genres genre = db.genres.Find(id);
            db.genres.Remove(genre);
            db.SaveChanges();
        }

        public List<genres> SearchGenre(String str)
        {
            List<genres> list = new List<genres>();
            con.Open();
            String s = "select * from genres where name_genre like '%" + str + "%'";
            SqlCommand cmd = new SqlCommand(s, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            while (sdr.Read())
            {
                genres g = new genres();
                g.id_genre = sdr.GetInt32(0);
                g.name_genre = sdr.GetString(1);
                list.Add(g);
            }
            sdr.Close();
            return list;
        }


        //Книги
        public List<String> GetAllBook()
        {
            string text = System.IO.File.ReadAllText(@"D:\Учёба\8 сем\курсач\КП\new\Example\Example\script.txt");

            con.Open();
            SqlCommand cmd = new SqlCommand(text, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            String str;
            List<String> listStr = new List<String>();
            while (sdr.Read())
            {
                str = sdr.GetInt32(0) + ";" + sdr.GetString(1) + ";" + sdr.GetString(2) + ";" + sdr.GetString(3) + ";" + sdr.GetString(4) +
                    ";" + sdr.GetInt32(5) + ";" + sdr.GetInt32(6) + ";" + sdr.GetString(7) + ";" + sdr.GetString(8) + ";" + sdr.GetString(9);
                listStr.Add(str);
            }
            sdr.Close();
            return listStr;
        }

        public books GetByIdBook(int id)
        {
            con.Open();
            String str = "select * from books where id_book = '" + id + "'";
            SqlCommand cmd = new SqlCommand(str, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            books b = new books();
            while (sdr.Read())
            {
                b.id_book = sdr.GetInt32(0);
                b.name_book = sdr.GetString(1);
                b.id_publisher = sdr.GetInt32(2);
                b.imprint_date = sdr.GetInt32(3);
                b.pages = sdr.GetInt32(4);
                b.about = sdr.GetString(5);
                b.text = sdr.GetString(6);
                b.image = sdr.GetString(7);
            }
            sdr.Close();
            return b;
        }

        public void AddBook(books book)
        {
            db.books.Add(book);
            db.SaveChanges();
        }

        public void UpdateBook(books book)
        {
            db.Entry(book).State = System.Data.EntityState.Modified;
            db.SaveChanges();
        }

        public void DeleteBook(int id)
        {
            books book = db.books.Find(id);
            db.books.Remove(book);
            db.SaveChanges();
        }

        public List<String> SearchBook(String str)
        {
            List<String> listStr = new List<String>();
            con.Open();
            String s;
            String text = System.IO.File.ReadAllText(@"D:\Учёба\8 сем\курсач\КП\new\Example\Example\script2.txt") + "'%" + str + "%'";
            SqlCommand cmd = new SqlCommand(text, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            while (sdr.Read())
            {
                s = sdr.GetInt32(0) + ";" + sdr.GetString(1) + ";" + sdr.GetString(2) + ";" + sdr.GetString(3) + ";" + sdr.GetString(4) +
                    ";" + sdr.GetInt32(5) + ";" + sdr.GetInt32(6) + ";" + sdr.GetString(7) + ";" + sdr.GetString(8) + ";" + sdr.GetString(9);
                listStr.Add(s);
            }
            sdr.Close();
            return listStr;
        }

        public int GetLastIdBook()
        {
            con.Open();
            SqlCommand mycommand = new SqlCommand();
            mycommand.CommandText = "SELECT MAX(id_book) from books";
            mycommand.CommandType = CommandType.Text;
            mycommand.Connection = con;
            object value = mycommand.ExecuteScalar();
            con.Close();
            if (value != null)
            {
                Console.WriteLine(Convert.ToInt32(value));
                return Convert.ToInt32(value);
            }
            return -1;
        }


        public void AddAB(authors_books ab)
        {
            db.authors_books.Add(ab);
            db.SaveChanges();
        }

        public void AddGB(genres_books gb)
        {
            db.genres_books.Add(gb);
            db.SaveChanges();
        }

        public void UpdateAB(authors_books ab)
        {
            db.Entry(ab).State = System.Data.EntityState.Modified;
            db.SaveChanges();
        }

        public void UpdateGB(genres_books gb)
        {
            db.Entry(gb).State = System.Data.EntityState.Modified;
            db.SaveChanges();
        }


        public void DeleteABId(int l)
        {
            con.Open();
            SqlCommand mycommand = new SqlCommand();
            mycommand.CommandText = "DELETE FROM authors_books WHERE id_book = '" + l + "'";
            mycommand.CommandType = CommandType.Text;
            mycommand.Connection = con;
            mycommand.ExecuteReader();
            con.Close();

        }

        public void DeleteGBId(int l)
        {
            con.Open();
            SqlCommand mycommand = new SqlCommand();
            mycommand.CommandText = "DELETE FROM genres_books WHERE id_book = '" + l + "'";
            mycommand.CommandType = CommandType.Text;
            mycommand.Connection = con;
            mycommand.ExecuteReader();
            con.Close();
        }


        public List<String> GenreFilter(int id)
        {
            string text = System.IO.File.ReadAllText(@"D:\Учёба\8 сем\курсач\КП\new\Example\Example\script3.txt") + id + "))";

            con.Open();
            SqlCommand cmd = new SqlCommand(text, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            String str;
            List<String> listStr = new List<String>();
            while (sdr.Read())
            {
                str = sdr.GetInt32(0) + ";" + sdr.GetString(1) + ";" + sdr.GetString(2) + ";" + sdr.GetString(3) + ";" + sdr.GetString(4) +
                    ";" + sdr.GetInt32(5) + ";" + sdr.GetInt32(6) + ";" + sdr.GetString(7) + ";" + sdr.GetString(8) + ";" + sdr.GetString(9);
                listStr.Add(str);
            }
            sdr.Close();
            return listStr;
        }

        public List<String> AuthorFilter(int id)
        {
            string text = System.IO.File.ReadAllText(@"D:\Учёба\8 сем\курсач\КП\new\Example\Example\script4.txt") + id + "))";

            con.Open();
            SqlCommand cmd = new SqlCommand(text, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            String str;
            List<String> listStr = new List<String>();
            while (sdr.Read())
            {
                str = sdr.GetInt32(0) + ";" + sdr.GetString(1) + ";" + sdr.GetString(2) + ";" + sdr.GetString(3) + ";" + sdr.GetString(4) +
                    ";" + sdr.GetInt32(5) + ";" + sdr.GetInt32(6) + ";" + sdr.GetString(7) + ";" + sdr.GetString(8) + ";" + sdr.GetString(9);
                listStr.Add(str);
            }
            sdr.Close();
            return listStr;
        }

        public void Registration(String login, String pass, String email)
        {
            string text = "INSERT INTO users VALUES ('" + login + "', '" + pass + "', '" + email + "')";

            con.Open();
            SqlCommand cmd = new SqlCommand(text, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            sdr.Close();
        }

        public int Enter(String login, String pass)
        {
            List<users> list = new List<users>();
            con.Open();
            String str = "SELECT * FROM users WHERE login = '" + login + "' AND password='" + pass + "'";
            SqlCommand cmd = new SqlCommand(str, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            while (sdr.Read())
            {
                users u = new users();
                u.id_user = sdr.GetInt32(0);
                u.login = sdr.GetString(1);
                u.password = sdr.GetString(2);
                u.email = sdr.GetString(3);
                list.Add(u);
            }
            sdr.Close();
            if (list.Count != 0)
                return 0;
            else return -1;
        }

        public List<String> GetListId()
        {
            string text = System.IO.File.ReadAllText(@"D:\Учёба\8 сем\курсач\КП\new\Example\Example\script.txt");

            con.Open();
            SqlCommand cmd = new SqlCommand(text, con);
            SqlDataReader sdr = cmd.ExecuteReader();
            String strId;
            List<String> listId = new List<String>();
            while (sdr.Read())
            {
                strId = sdr.GetInt32(0).ToString();
                listId.Add(strId);
            }
            sdr.Close();
            return listId;
        }

        public void AnalyticsRead(int id)
        {
            List<String> list = GetListId();
            int size = list.Count;
            int[,] mas = new int[size, 2];

            string[] lines = System.IO.File.ReadAllLines(@"D:\Учёба\8 сем\курсач\КП\new\Example\Example\AnalyticsRead.txt");

            if (lines.Length == 0)
            {
                Console.WriteLine("lines is empty!");
                for (int i = 0; i < size; i++)
                {
                    mas[i, 0] = Convert.ToInt32(list[i]);
                    mas[i, 1] = 0;
                }
            }
            else
            {
                for (int i = 0; i < size; i++)
                {
                    mas[i, 0] = Convert.ToInt32(list[i]);
                    mas[i, 1] = Convert.ToInt32(lines[i]);
                }
            }

            for (int i = 0; i < size; i++)
            {
                if (mas[i, 0] == id)
                    mas[i, 1]++;
            }

            string[] lines2 = new string[size];
            for (int i = 0; i < size; i++)
            {
                lines2[i] = mas[i, 1].ToString();
            }

            System.IO.File.WriteAllLines(@"D:\Учёба\8 сем\курсач\КП\new\Example\Example\AnalyticsRead.txt", lines2, System.Text.Encoding.Default);


        }

        public List<String> GetSortBook()
        {
            string[] lines = System.IO.File.ReadAllLines(@"D:\Учёба\8 сем\курсач\КП\new\Example\Example\AnalyticsRead.txt");
            
            List<String> list = GetAllBook();
            int[] mas = new int[lines.Length];

            int tmp;
            String tmpStr;

            if (lines.Length == 0)
            {
                return list;
            }
            else
            {
                for (int i = 0; i < lines.Length; i++)
                {
                    mas[i] = Convert.ToInt32(lines[i]);
                }

                for (int k = 0; k < lines.Length - 1; k++)
                {
                    for (int j = k + 1; j < lines.Length; j++)
                    {
                        if (mas[k] < mas[j])
                        {
                            tmp = mas[k];
                            tmpStr = list[k];
                            mas[k] = mas[j];
                            list[k] = list[j];
                            mas[j] = tmp;
                            list[j] = tmpStr;
                        }
                    }
                }
                return list;
            }
        }
    }
}
