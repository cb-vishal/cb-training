/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validateform(){  
var email=document.myform.email.value;  
var password=document.myform.pass.value;  
  
if (email==null || email==""){  
  alert("Email can't be blank");  
  return false;  
}else if(password==null || password==""){  
  alert("Password can't be blank.");  
  return false;  
  }  
}  



