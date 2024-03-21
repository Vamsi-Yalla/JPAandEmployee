function validateForm() {
  let fristname = document.forms["myForm"]["fristName"].value;
  let lastname= document.forms["myForm"]["lastName"].value;
  let email= document.forms["myForm"]["email"].value;
  let location=document.forms["myForm"]["location"].value;
  
  if (fristname == "") {
    alert("Frist name is mandatory");
    return false;
  }
  if (lastname == "") {
    alert("Last name is mandatory");
    return false;
  }
  if (email == "") {
    alert("Envalid Emai format");
    return false;
  }
  if (location == "") {
    alert("location is required");
    return false;
  }
}