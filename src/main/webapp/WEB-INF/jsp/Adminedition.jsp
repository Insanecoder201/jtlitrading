<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Jtli Associates Call Info</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">
  
  <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
		rel="stylesheet">
		
	<!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Roboto:100,300,400,500,700|Philosopher:400,400i,700,700i" rel="stylesheet">
	
	<!-- Libraries CSS Files -->
  <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="lib/owlcarousel/assets/owl.theme.default.min.css" rel="stylesheet">
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="lib/modal-video/css/modal-video.min.css" rel="stylesheet">
  
  <!-- Main Stylesheet File -->
  <link href="css/style.css" rel="stylesheet">
  <!-- <link href="css/form.css" rel="stylesheet"> -->
  
  
  </head>
  
  <body>
  <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<section id="contact" class="padd-section wow fadeInUp">

    <div class="container">
      <div class="section-title text-center">
        <h2>Welcome Associate..!</h2>
        <p class="separator">Enter your calls in the text area below and click submit..!</p>
      </div>
    </div>

    <div class="container">
      <div class="row justify-content-center">

        <div class="col-lg-3 col-md-4">
			<div class="info">
	            <div>
	              <i class="fa fa-exchange"></i>
	              <p>Intraday Call</p>
	            </div>
            </div>
        </div>

      

        <div class="col-lg-3 col-md-4">
          <div class="form">
            <div id="sendmessage">Your message has been sent. Thank you!</div>
            
            <form action="" method="post" role="form" class="contactForm">
              <div class="form-group">
                <textarea class="form-control" name="intraday" rows="15" placeholder="Intraday call"></textarea>
                <div class="validation"></div>
              </div>
              <div class="text-center"><input type="submit" class="btn btn-default" id="submit"></div>
            </form>
            <font color="green">${intradaymessage}</font>
          </div>
        </div>
      </div>
    </div>
  </section>
	
	
  <section id="contact" class="padd-section wow fadeInUp">

    <div class="container">
      <div class="row justify-content-center">

        <div class="col-lg-3 col-md-4">
			<div class="info">
	            <div>
	              <i class="fa fa-exchange"></i>
	              <p>Short term Call</p>
	            </div>
            </div>
        </div>

      

        <div class="col-lg-3 col-md-4">
          <div class="form">
            <div id="sendmessage">Your message has been sent. Thank you!</div>
            
            <form action="" method="post" role="form" class="contactForm">
              <div class="form-group">
                <textarea class="form-control" name="shortterm" rows="15" placeholder="Short term call"></textarea>
                <div class="validation"></div>
              </div>
              <div class="text-center"><input type="submit" class="btn btn-default" id="submit"></div>
            </form>
            <font color="green">${shorttermmessage}</font>
          </div>
        </div>
      </div>
    </div>
  </section>
  
  
  <section id="contact" class="padd-section wow fadeInUp">
   <div class="container">
      <div class="row justify-content-center">

        <div class="col-lg-3 col-md-4">
			<div class="info">
	            <div>
	              <i class="fa fa-exchange"></i>
	              <p>Long term SIP Call</p>
	            </div>
            </div>
        </div>

      

        <div class="col-lg-3 col-md-4">
          <div class="form">
            <div id="sendmessage">Your message has been sent. Thank you!</div>
            
            <form action="" method="post" role="form" class="contactForm">
              <div class="form-group">
                <textarea class="form-control" name="longterm" rows="15" placeholder="Long Term SIP call"></textarea>
                <div class="validation"></div>
              </div>
              <div class="text-center"><input type="submit" class="btn btn-default" id="submit"></div>
            </form>
            <font color="green">${longtermmessage}</font>
          </div>
        </div>
      </div>
    </div>
  </section>
	</body>
	</html>