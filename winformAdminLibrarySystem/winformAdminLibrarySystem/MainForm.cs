using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace winformAdminLibrarySystem
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
            cmbCh.SelectedItem = "Авторы";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Hide();
            if (cmbCh.SelectedIndex == 0)
            {
                Author a = new Author();
                a.Show();
            }
            if (cmbCh.SelectedIndex == 1)
            {
                Genre g = new Genre();
                g.Show();
            }
            if(cmbCh.SelectedIndex == 2)
            { 
                Publisher p = new Publisher();
                p.Show();
            }
            if (cmbCh.SelectedIndex == 3)
            {
                Book b = new Book();
                b.Show();
            }    
            
        }
    }
}
