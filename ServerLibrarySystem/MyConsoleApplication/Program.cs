using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel;

namespace MyConsoleApplication
{
    class Program
    {
        static void Main(string[] args)
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
