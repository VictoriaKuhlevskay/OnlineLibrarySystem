using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using winformAdminLibrarySystem.LibraryService;

namespace winformAdminLibrarySystem
{
    public partial class Book : Form
    {
        class MyData
        {
            public int id { get; set; }
            public String name { get; set; }
            public String genre { get; set; }
            public String author { get; set; }
            public String publ { get; set; }
            public int date { get; set; }
            public int pages { get; set; }
            public String about { get; set; }
            public String text { get; set; }
            public String image { get; set; }

            public MyData(int Id, String Name, String Genre, String Author, String Publ, int Date, int Pages, String About, String Text, String Image)
            {
                id = Id;
                name = Name;
                genre = Genre;
                author = Author;
                publ = Publ;
                date = Date;
                pages = Pages;
                about = About;
                text = Text;
                image = Image;
            }
        }
        public Book()
        {
            InitializeComponent();
        }

        MyServiceClient ms = new MyServiceClient();

        public void Grid()
        {
            String[] list;
            list = ms.GetAllBook();

            List<MyData> myList = new List<MyData>();
            for (int i = 0; i < list.Length; i++)
            {
                Console.WriteLine(list[i]);
                String[] mas;
                mas = list[i].Split(';');
                myList.Add(new MyData(Convert.ToInt32(mas[0]), mas[1], mas[2], mas[3], mas[4], Convert.ToInt32(mas[5]), Convert.ToInt32(mas[6]), mas[7], mas[8], mas[9]));
            }
            dataGridView1.DataSource = myList;
        }

        private void Book_Load(object sender, EventArgs e)
        {
            // TODO: This line of code loads data into the 'libraryDataSet2.authors' table. You can move, or remove it, as needed.
            this.authorsTableAdapter.Fill(this.libraryDataSet2.authors);
            // TODO: This line of code loads data into the 'libraryDataSet1.genres' table. You can move, or remove it, as needed.
            this.genresTableAdapter.Fill(this.libraryDataSet1.genres);
            // TODO: This line of code loads data into the 'libraryDataSet.publishers' table. You can move, or remove it, as needed.
            this.publishersTableAdapter.Fill(this.libraryDataSet.publishers);

            Grid();
            dataGridView1.Columns[0].HeaderText = "ID";
            dataGridView1.Columns[1].HeaderText = "Название";
            dataGridView1.Columns[2].HeaderText = "Жанр";
            dataGridView1.Columns[3].HeaderText = "Автор";
            dataGridView1.Columns[4].HeaderText = "Издательство";
            dataGridView1.Columns[5].HeaderText = "Год издания";
            dataGridView1.Columns[6].HeaderText = "Количество страниц";
            dataGridView1.Columns[7].HeaderText = "Описание";
            dataGridView1.Columns[8].HeaderText = "Текст";
            dataGridView1.Columns[9].HeaderText = "Обложка";
            listAuthor.ClearSelected();
            listGenre.ClearSelected();
        }

        

        private void btnText_Click(object sender, EventArgs e)
        {
            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                text.Text = openFileDialog1.FileName;
            }
        }

        private void btnImage_Click(object sender, EventArgs e)
        {
            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                textImage.Text = openFileDialog1.FileName;
            }
        }

        private void btnShow_Click(object sender, EventArgs e)
        {
            Grid();
            textName.Text = "";
            textDate.Text = "";
            textPage.Text = "";
            textAbout.Text = "";
            text.Text = "";
            textImage.Text = "";
            listAuthor.ClearSelected();
            listGenre.ClearSelected();
        }

        private void btnCreate_Click(object sender, EventArgs e)
        {
            books book = new books
            {
                name_book = textName.Text,
                id_publisher = comboBox1.SelectedIndex + 1,
                imprint_date = Convert.ToInt32(textDate.Text),
                pages = Convert.ToInt32(textPage.Text),
                about = textAbout.Text,
                text = text.Text,
                image = textImage.Text
            };
            ms.AddBook(book);

            int i = listAuthor.Items.Count;
            for (int j = 0; j < i; j++)
            {
                if (listAuthor.GetSelected(j) == true)
                {
                    authors_books ab = new authors_books
                    {
                        id_author = j + 1,
                        id_book = ms.GetLastIdBook()
                    };
                    Console.WriteLine(ab.id_author + "    " + ab.id_book);
                    ms.AddAB(ab);
                }
            }

            int k = listGenre.Items.Count;
            for (int j = 0; j < k; j++)
            {
                if (listGenre.GetSelected(j) == true)
                {
                    genres_books gb = new genres_books
                    {
                        id_genre = j + 1,
                        id_book = ms.GetLastIdBook()
                    };
                    ms.AddGB(gb);
                }
            }
           
            Grid();
            textName.Text = "";
            textDate.Text = "";
            textPage.Text = "";
            textAbout.Text = "";
            text.Text = "";
            textImage.Text = "";
            listAuthor.ClearSelected();
            listGenre.ClearSelected();
        }

        private void dataGridView1_Click(object sender, EventArgs e)
        {
            books b = ms.GetByIdBook(Convert.ToInt32(dataGridView1.SelectedCells[0].Value));
            textID.Text = b.id_book.ToString();
            textName.Text = b.name_book;
            comboBox1.SelectedIndex = 0;
            textDate.Text = b.imprint_date.ToString();
            textPage.Text = b.pages.ToString();
            textAbout.Text = b.about;
            text.Text = b.text;
            textImage.Text = b.image;

            listAuthor.ClearSelected();
            listGenre.ClearSelected();
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            books b = new books();
            b.id_book = Convert.ToInt32(textID.Text);
            b.name_book = textName.Text;
            b.id_publisher = comboBox1.SelectedIndex + 1;
            b.imprint_date = Convert.ToInt32(textDate.Text);
            b.pages = Convert.ToInt32(textPage.Text);
            b.about = textAbout.Text;
            b.text = text.Text;
            b.image = textImage.Text;

            ms.UpdateBook(b);

            int l = Convert.ToInt32(textID.Text);
            ms.DeleteABId(l);
            ms.DeleteGBId(l);
            int i = listAuthor.Items.Count;
            for (int j = 0; j < i; j++)
            {
                if (listAuthor.GetSelected(j) == true)
                {
                    authors_books ab = new authors_books
                    {
                        id_author = j + 1,
                        id_book = l
                    };
                    Console.WriteLine(ab.id_author + "    " + ab.id_book);
                    ms.AddAB(ab);
                }
            }

            int k = listGenre.Items.Count;
            for (int j = 0; j < k; j++)
            {
                if (listGenre.GetSelected(j) == true)
                {
                    genres_books gb = new genres_books
                    {
                        id_genre = j + 1,
                        id_book = l
                    };
                    ms.AddGB(gb);
                }
            }

            Grid();
        }

        private void btnDelete_Click(object sender, EventArgs e)
        {
            ms.DeleteABId(Convert.ToInt32(textID.Text));
            ms.DeleteGBId(Convert.ToInt32(textID.Text));

            ms.DeleteBook(Convert.ToInt32(textID.Text));


            Grid();
            textName.Text = "";
            textDate.Text = "";
            textPage.Text = "";
            textAbout.Text = "";
            text.Text = "";
            textImage.Text = "";
            listAuthor.ClearSelected();
            listGenre.ClearSelected();
        }

        private void btnSearch_Click(object sender, EventArgs e)
        {
            String str = textName.Text;
            String[] list;
            list = ms.SearchBook(str);

            List<MyData> myList = new List<MyData>();
            for (int i = 0; i < list.Length; i++)
            {
                Console.WriteLine(list[i]);
                String[] mas;
                mas = list[i].Split(';');
                myList.Add(new MyData(Convert.ToInt32(mas[0]), mas[1], mas[2], mas[3], mas[4], Convert.ToInt32(mas[5]), Convert.ToInt32(mas[6]), mas[7], mas[8], mas[9]));
            }
            dataGridView1.DataSource = myList;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Hide();
            MainForm mn = new MainForm();
            mn.Show();
        }

    }
}
