using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace Example
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1cs" in both code and config file together.
    public class MyService : IMyService
    {
        public void Add(String str)
        {
            Console.WriteLine("String " + str);
        }
    }
}
