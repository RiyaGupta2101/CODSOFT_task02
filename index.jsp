<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>

    <style>
          input{
             width:350px;
             height:40px;
             
          }
          
          .sub{
             
            margin-left:425px;
             
          }
          
          
          
    </style>
</head>
<body>
      <form action ="GradeCalculatorServlet" method="post">
      
          <table border="2px" style="margin:0 auto"> 
             <tr>
                 <th colspan="2"><h1>Student Marks Calculator</h1></th>
             </tr>
                 
             <tr>
                <th></th>
                <th>Marks</th>
             </tr>
             
             <tr>
                <td>Marks1</td>
                <td><input type="number" name="num1"></td>
             </tr>
             
             <tr>
                <td>Marks2</td>
                <td><input type="number" name="num2"></td>
             </tr>
             
             <tr>
                <td>Marks3</td>
                <td><input type="number" name="num3"></td>
             </tr>
          </table>
          
          <br><br><br><br>
          <div class="sub" >
          <input  type="submit" value="Submit" style="background-color:#008080"> <br><br>
          
          <input  type="reset" value="Cancel" style="background-color:#DE3163">  <br><br>
          </div>
      </form>
</body>
</html>