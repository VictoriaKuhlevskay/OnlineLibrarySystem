//------------------------------------------------------------------------------
// <auto-generated>
//    This code was generated from a template.
//
//    Manual changes to this file may cause unexpected behavior in your application.
//    Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace MyConsoleApplication.Model
{
    using System;
    using System.Collections.Generic;
    using System.Runtime.Serialization;

    [DataContract]    
    public partial class download
    {
        [DataMember]
        public int id_download { get; set; }

        [DataMember]
        public int id_user { get; set; }

        [DataMember]
        public int id_book { get; set; }

        [DataMember]
        public virtual books books { get; set; }

        [DataMember]
        public virtual users users { get; set; }
    }
}