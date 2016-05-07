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
using System.ServiceModel;

namespace winformAdminLibrarySystem
{
    public partial class Author : Form
    {
        public Author()
        {
            InitializeComponent();
        }

        MyServiceClient ms = new MyServiceClient();
        private void Author_Load(object sender, EventArgs e)
        {
            dataGridView1.DataSource = ms.GetAllAuthor();
            dataGridView1.Columns[0].HeaderText = "ID";
            dataGridView1.Columns[1].HeaderText = "Имя";
            dataGridView1.Columns[2].HeaderText = "Отчество";
            dataGridView1.Columns[3].HeaderText = "Фамилия";
            dataGridView1.Columns[4].HeaderText = "Год рождения";
            dataGridView1.Columns[5].HeaderText = "Год смерти";

        }

        private void btnCreate_Click_1(object sender, EventArgs e)
        {
            authors author = new authors
            {
                surname= textSurname.Text,
                name = textName.Text,
                patronymic = textPatr.Text,
                year_of_birth = textBirth.Text,
                year_of_death = textDeath.Text
            };
            ms.AddAuthor(author);
            dataGridView1.DataSource = ms.GetAllAuthor();
            textID.Text = "";
            textSurname.Text = "";
            textName.Text = "";
            textPatr.Text = "";
            textBirth.Text = "";
            textDeath.Text = "";
        }

        private void btnUpdate_Click_1(object sender, EventArgs e)
        {
            authors author = new authors();
            author.id_author = Convert.ToInt32(textID.Text);
            author.surname = textSurname.Text;
            author.name = textName.Text;
            author.patronymic = textPatr.Text;
            author.year_of_birth = textBirth.Text;
            author.year_of_death = textDeath.Text;
            ms.UpdateAuthor(author);
            dataGridView1.DataSource = ms.GetAllAuthor();
            textID.Text = "";
            textSurname.Text = "";
            textName.Text = "";
            textPatr.Text = "";
            textBirth.Text = "";
            textDeath.Text = "";
        }

        private void btnDelete_Click_1(object sender, EventArgs e)
        {
            ms.DeleteAuthor(Convert.ToInt32(textID.Text));
            dataGridView1.DataSource = ms.GetAllAuthor();
            textID.Text = "";
            textSurname.Text = "";
            textName.Text = "";
            textPatr.Text = "";
            textBirth.Text = "";
            textDeath.Text = "";
        }

        private void btnSearch_Click_1(object sender, EventArgs e)
        {
            String str = textSurname.Text;
            dataGridView1.DataSource = ms.SearchAuthor(str);
        }

        private void btnShow_Click_1(object sender, EventArgs e)
        {
            dataGridView1.DataSource = ms.GetAllAuthor();
            textID.Text = "";
            textSurname.Text = "";
            textName.Text = "";
            textPatr.Text = "";
            textBirth.Text = "";
            textDeath.Text = "";
        }

        private void dataGridView1_Click(object sender, EventArgs e)
        {
            authors a = ms.GetByIdAuthor(Convert.ToInt32(dataGridView1.SelectedCells[0].Value));
            textID.Text = a.id_author.ToString();
            textSurname.Text = a.surname;
            textName.Text = a.name;
            textPatr.Text = a.patronymic;
            textBirth.Text = a.year_of_birth;
            textDeath.Text = a.year_of_death;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Hide();
            MainForm mn = new MainForm();
            mn.Show();
        }


    }
}
