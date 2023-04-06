<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Orbitron&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Anton&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="style.css">

    </head>
    <body>

      <nav class="navbar navbar-expand-lg navbar-main nav-font">
        <a class="navbar-brand" href="#">
          <img src="./assets/images/logo.png" alt="" class="logo"></a>
        <a class="navbar-brand nav-font" href="Index.jsp">Bumble BEE</a>

        <div class="collapse navbar-collapse" id="navbarNavDropdown">
          <ul class="navbar-nav mr-auto nav-font">
            <li class="nav-item">
              <a class="nav-link nav-font" href="#">Shop</a>
            </li>
            <li class="nav-item">
              <a class="nav-link nav-font" href="#">About</a>
            </li>
            <li class="nav-item">
              <a class="nav-link nav-font" href="verzen.html">Contact</a>
            </li>
            </ul>  
        </div>

      <span class="navbar-text">
        <div class="dropdown">
          <button class="btn dropdown-toggle nav-font" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            Sign in/Sign up
          </button>
          <div class="dropdown-menu">
            <a class="dropdown-item" href="login.jsp">Admin</a>
            <a class="dropdown-item" href="register.jsp">User</a>
          </div>
        </div>
      </span>    
    </nav>
                 
    <div class="container cont-main">
        <div class="row">
          <div class="card-deck">
            <div class="card">
              <div class="card-block shadow">
                <img class="card-img-top c-img" src="./assets/images/boo.jpg" alt="Card image cap">
                <div class="card-body p-3 mb-5 bg-white rounded">
                  <h4 class="card-title">Books and Magazines</h4>
                  <p class="card-text">
                    Books have the power to improve vocabulary by introducing new words...
                  </p>
                  <a href="#!" class="btn btn-check">Go for it..</a>
                </div>
              </div>
            </div>
            <div class="card">
              <div class="card-block shadow">
                <img class="card-img-top c-img" src="./assets/images/clothing.jpg" alt="Card image cap">
                <div class="card-body p-3 mb-5 bg-white rounded">
                  <h4 class="card-title">Fashion and Clothing</h4>
                  <p class="card-text">
                    Fashion is a changeable aspect, as it changes every now and then..... 
                  </p>
                  <a href="#!" class="btn btn-check ">Go for it..</a>
                </div>
              </div>
            </div>
            <div class="card">
              <div class="card-block shadow">
                <img class="card-img-top c-img" src="./assets/images/mobile.png" alt="Card image cap">
                <div class="card-body p-3 mb-5 bg-white rounded">
                  <h4 class="card-title">Mobile Phones</h4>
                  <p class="card-text">
                    Watch different tutorials in Youtube. Take a trol and get some knowledge..... 
                  </p>
                  <a href="youtube.html" class="btn btn-check">Go for it..</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        <br><br>
        <div class="row">
          <div class="card-deck">
            <div class="card">
              <div class="card-block shadow">
                <img class="card-img-top c-img" src="./assets/images/tv.jpg" alt="Card image cap">
                <div class="card-body p-3 mb-5 bg-white rounded">
                  <h4 class="card-title">Televisions</h4>
                  <p class="card-text">
                    A good dictionary can help you understand your subject better... 
                  </p>
                  <a href="#!" class="btn btn-check">Go for it..</a>
                </div>
              </div>
            </div>
            <div class="card">
              <div class="card-block shadow">
                <img class="card-img-top c-img" src="./assets/images/tv.jpg" alt="Card image cap">
                <div class="card-body p-3 mb-5 bg-white rounded">
                  <h4 class="card-title">Home Needs</h4>
                  <p class="card-text">
                    Encyclopedias will give introductory information to broaden or narrow a topic..... 
                  </p>
                  <a href="#!" class="btn btn-check ">Go for it..</a>
                </div>
              </div>
            </div>
            <div class="card">
              <div class="card-block shadow">
                <img class="card-img-top c-img" src="./assets/images/tv.jpg" alt="Card image cap">
                <div class="card-body p-3 mb-5 bg-white rounded">
                  <h4 class="card-title">Jewelries</h4>
                  <p class="card-text">
                    Get some fun, yet still learn. Watch your favorite movies here..... 
                  </p>
                  <a href="#!" class="btn btn-check">Go for it..</a>
                </div>
              </div>
            </div>
          </div>
        </div>
    </div>
}

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>

