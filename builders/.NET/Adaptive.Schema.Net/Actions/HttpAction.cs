﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;

namespace Adaptive.Schema.Net
{
    /// <summary>
    /// HttpAction represents the properties needed to do an Http request. All input properties are available for use 
    /// via data binding. Properties can be data bound to the Uri and Body properties, allowing you to send a request 
    /// to an arbitrary url.
    /// </summary>
    public class HttpAction : Action
    {
        public HttpAction() : base() { }


        /// <summary>
        /// HttpMethod to use
        /// </summary>
        public HttpMethod Method { get; set; } = HttpMethod.Post;

        /// <summary>
        /// url to use (can have binding information)
        /// </summary>
        [JsonRequired]
        public string Url { get; set; }

        /// <summary>
        /// Object which represents headers Example: { "content-type":"application/json" }
        /// </summary>
        public object Headers { get; set; }

        /// <summary>
        /// Body with binding to send as content
        /// </summary>
        public string Body { get; set; }

        /// <summary>
        /// Message to display on success
        /// </summary>
        public string SuccessMessage { get; set; }

        /// <summary>
        /// Message to display on error
        /// </summary>
        public string ErrorMessage { get; set; }
    }
}