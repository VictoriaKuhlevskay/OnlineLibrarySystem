using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using winformAdminLibrarySystem.LibraryService;

namespace winformAdminLibrarySystem
{
    public partial class Publisher : Form
    {
        public Publisher()
        {
            InitializeComponent();
        }


        MyServiceClient ms = new MyServiceClient();

        private void Form1_Load(object sender, EventArgs e)
        {
            dataGridView1.DataSource = ms.GetAllPublisher();
            textID.Text = "";
            textName.Text = "";
            dataGridView1.Columns[0].HeaderText = "ID";
            dataGridView1.Columns[1].HeaderText = "Название";
        }

        private void btnCreate_Click(object sender, EventArgs e)
        {
            publishers publisher = new publishers
            {
                name_publisher = textName.Text
            };
            ms.AddPublisher(publisher);
            dataGridView1.DataSource = ms.GetAllPublisher();
            textID.Text = "";
            textName.Text = "";
        }

        private void dataGridView1_Click(object sender, EventArgs e)
        {
            publishers p = ms.GetByIdPublisher(Convert.ToInt32(dataGridView1.SelectedCells[0].Value));
            textID.Text = p.id_publisher.ToString();
            textName.Text = p.name_publisher;
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            publishers publisher = new publishers();
            publisher.id_publisher = Convert.ToInt32(textID.Text);
            publisher.name_publisher = textName.Text;
            ms.UpdatePublisher(publisher);
            dataGridView1.DataSource = ms.GetAllPublisher();
            textID.Text = "";
            textName.Text = "";
        }

        private void btnDelete_Click(object sender, EventArgs e)
        {
            ms.DeletePublisher(Convert.ToInt32(textID.Text));
            dataGridView1.DataSource = ms.GetAllPublisher();
            textID.Text = "";
            textName.Text = "";
        }

        private void btnSearch_Click(object sender, EventArgs e)
        {
            String str = textName.Text;
            dataGridView1.DataSource = ms.SearchPublisher(str);
        }

        private void btnShow_Click(object sender, EventArgs e)
        {
            dataGridView1.DataSource = ms.GetAllPublisher();
            textID.Text = "";
            textName.Text = "";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Hide();
            MainForm mn = new MainForm();
            mn.Show();
        }        
    }
}
