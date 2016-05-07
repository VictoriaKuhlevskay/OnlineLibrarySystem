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
    public partial class Genre : Form
    {
        public Genre()
        {
            InitializeComponent();
        }

        MyServiceClient ms = new MyServiceClient();

        private void Genre_Load(object sender, EventArgs e)
        {
            dataGridView1.DataSource = ms.GetAllGenre();
            dataGridView1.Columns[0].HeaderText = "ID";
            dataGridView1.Columns[1].HeaderText = "Название";
        }

        private void btnCreate_Click(object sender, EventArgs e)
        {
            genres genre = new genres
            {
                name_genre = textName.Text
            };
            ms.AddGenre(genre);
            dataGridView1.DataSource = ms.GetAllGenre();
            textID.Text = "";
            textName.Text = "";
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            genres genre = new genres();
            genre.id_genre = Convert.ToInt32(textID.Text);
            genre.name_genre = textName.Text;
            ms.UpdateGenre(genre);

            dataGridView1.DataSource = ms.GetAllGenre();
            textID.Text = "";
            textName.Text = "";
        }

        private void btnDelete_Click(object sender, EventArgs e)
        {
            ms.DeleteGenre(Convert.ToInt32(textID.Text));
            dataGridView1.DataSource = ms.GetAllGenre();
            textID.Text = "";
            textName.Text = "";
        }

        private void btnSearch_Click(object sender, EventArgs e)
        {
            String str = textName.Text;
            dataGridView1.DataSource = ms.SearchGenre(str);
            textID.Text = "";
            textName.Text = "";
        }

        private void btnShow_Click(object sender, EventArgs e)
        {
            dataGridView1.DataSource = ms.GetAllGenre();
            textID.Text = "";
            textName.Text = "";
        }

        private void dataGridView1_Click(object sender, EventArgs e)
        {
            genres g = ms.GetByIdGenre(Convert.ToInt32(dataGridView1.SelectedCells[0].Value));
            textID.Text = g.id_genre.ToString();
            textName.Text = g.name_genre;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Hide();
            MainForm mn = new MainForm();
            mn.Show();
        }
    }
}
