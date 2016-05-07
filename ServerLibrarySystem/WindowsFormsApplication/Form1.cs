using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.ServiceModel;

namespace WindowsFormsApplication
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            using (ServiceHost host = new ServiceHost(typeof(MyService)))
            {
                host.Open();
                Console.WriteLine("Server is up and running");
                Console.WriteLine("Press any key to terminate");
                Console.ReadKey();
                host.Close();
            }
        }
    }
}
