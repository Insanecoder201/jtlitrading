<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Jtli Associates Admin</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">
  
  <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
		rel="stylesheet">
		
	<!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Roboto:100,300,400,500,700|Philosopher:400,400i,700,700i" rel="stylesheet">
	

	<link href="css/admin.css" rel="stylesheet">
 
  
  
  </head>
  
  <body>
  <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <div class="container">
    <div class="row">
        <div class="form_bg">
            <form method="post">
                 <h2 class="text-center">Login Page</h2>
                <br/>
                <div class="form-group">
                    <input type="email" class="form-control" name="email" id="userid" placeholder="User id">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" id="pwd" name="password" placeholder="Password">
                </div>
                <br/>
                <font color="red">${errorMessage}</font>
                <br/>
                <div class="align-center">
                    <input type="submit" class="btn btn-default" id="login"/>
                </div>
            </form>
        </div>
    </div>
</div>
  
  </body>
  
  </html>
  
 