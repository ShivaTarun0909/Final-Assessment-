function validate()
        {
            var FirstName=document.forms["myform"] ["fname"].value;
            var lname=document.forms["myform"] ["fname"].value;
            var email=document.forms["myform"] ["fname"].value;
            var password=document.forms["myform"] ["fname"].value;
            var cpass=document.forms["myform"] ["fname"].value;


            if(fname==" ")
            {
                alert("Please enter first name")
                return false;
            }

            if(lname==" ")
            {
                alert("Please enter last name")
                return false;
            }

            var at = email.indexOf(“@”);
            var dot = email.lastIndexOf(“.”);
            if(at<1||dot<at+2||dot+2 >= email.lenght)
            {
             alert(“please enter valid mail”);

            return false;

            }
            if(!password==cpass)
            {
                alert("passwords doesn't match");
                return false;
            }

        }