<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="register.css">
        
    </head>

    <body>
        
        <form action="<%= request.getContextPath() %>/newregister" method="post" >
            <div class="container">
              <h1>Bumble Bee</h1>
              <p>Please fill in this form to register an account.</p>
              <hr>
                <label for="fullname"><b>Fullname</b></label>
                <input type="text" name="fullname" id="fullname" class="form-control">
                
                <label for="date_of_birth"><b>Date of Birth</b></label>
                <input type="date" name="date_of_birth" id="date_of_birth" class="form-control">
                <br>
              
              <label for="email"><b>Email</b></label>
              <input type="text" name="email" id="email" class="form-control">
              
              <label for="username"><b>Username</b></label>
              <input type="text" name="username" id="username" class="form-control">

              <label for="password"><b>Password</b></label>
              <input type="password" name="password" id="password" class="form-control">

              <label for="confirm"><b>Repeat Password</b></label>
              <input type="password" name="confirm" id="confirm" class="form-control">
               <hr>
              <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

              <button type="submit" class="registerbtn" >Register</button>
            </div>
            <br>
            <div class="container signin">
              <p>Already have an account? <a href="#">Sign in</a>.</p>
            </div>
            <br>
          </form>

    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

    </body>

</html>
