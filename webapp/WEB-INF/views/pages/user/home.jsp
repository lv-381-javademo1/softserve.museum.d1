<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="zxx" class="no-js">
<head>
    <!-- Mobile Specific Meta -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Favicon-->
    <link rel="shortcut icon" href="img/fav.png">
    <!-- Author Meta -->
    <meta name="author" content="codepixer">
    <!-- Meta Description -->
    <meta name="description" content="">
    <!-- Meta Keyword -->
    <meta name="keywords" content="">
    <!-- meta character set -->
    <meta charset="UTF-8">
    <!-- Site Title -->
    <title>Art Museum</title>

    <link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet">
    <!--
    CSS
    ============================================= -->
    <base href="${pageContext.request.contextPath}">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/linearicons.css' />"/>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/font-awesome.min.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/magnific-popup.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/nice-select.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/animate.min.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/owl.carousel.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/main.css' />">
</head>
<body>
<header id="header" id="home1">
    <div class="container header-top">
        <div class="row">
            <div class="col-6 top-head-left">
                <ul>
                    <li><a href="#">Visit Us</a></li>
                    <li><a href="#">Book Ticket</a></li>
                </ul>
            </div>
            <div class="col-6 top-head-right">
                <ul>
                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                    <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                    <li><a href="#"><i class="fa fa-behance"></i></a></li>
                </ul>
            </div>
        </div>
    </div>
    <hr>
    <div class="container">
        <div class="row align-items-center justify-content-between d-flex">
            <div id="logo">
                <a href="/"><img src="<c:url value="/resources/img/logo.png"></c:url>" alt="" title=""/></a>
            </div>
            <nav id="nav-menu-container">
                <ul class="nav-menu">
                    <li class="menu-active"><a href="/">Home</a></li>
                    <li><a href="/book_excursion">Book Ticket</a></li>
                </ul>
            </nav><!-- #nav-menu-container -->
        </div>
    </div>
</header><!-- #header -->


<!-- start banner Area -->
<section class="banner-area relative" id="home">
    <div class="overlay overlay-bg"></div>
    <div class="container">
        <div class="row fullscreen d-flex align-items-center justify-content-center">
            <div class="banner-content col-lg-8">
                <h6 class="text-white">Openning on 21st February, 2019</h6>
                <h1 class="text-white">
                    Exhibition on Modern Era
                </h1>
                <p class="pt-20 pb-20 text-white">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore
                    et dolore magna aliqua. Ut enim ad minim. sed do eiusmod tempor incididunt..
                </p>
            </div>
        </div>
    </div>
</section>
<!-- End banner Area -->

<!-- Start service Area -->
<section class="service-area pt-100" id="about">
    <div class="container">
        <div class="row">
            <div class="col-lg-4">
                <div class="single-service">
                    <span class="lnr lnr-clock"></span>
                    <h4>Openning Hours</h4>
                    <p>
                        Mon - Fri: 10.00am to 05.00pm
                        Sat: 12.00pm to 03.00 pm
                        Sunday Closed
                    </p>
                    <div class="overlay">
                        <div class="text">
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
                                incididunt ut labore
                                et dolore magna aliqua. Ut enim ad minim veniam.
                            </p>
                            <a href="/book_excursion" class="text-uppercase primary-btn">Book ticket</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-4">
                <div class="single-service">
                    <span class="lnr lnr-rocket"></span>
                    <h4>Ongoing Exhibitions</h4>
                    <p>
                        Mon - Fri: 10.00am to 05.00pm
                        Sat: 12.00pm to 03.00 pm
                        Sunday Closed
                    </p>
                    <div class="overlay">
                        <div class="text">
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
                                incididunt ut labore
                                et dolore magna aliqua. Ut enim ad minim veniam,.
                            </p>
                            <a href="/book_excursion" class="text-uppercase primary-btn">Book ticket</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-4">
                <div class="single-service">
                    <span class="lnr lnr-briefcase"></span>
                    <h4>Openning Events</h4>
                    <p>
                        Mon - Fri: 10.00am to 05.00pm
                        Sat: 12.00pm to 03.00 pm
                        Sunday Closed
                    </p>
                    <div class="overlay">
                        <div class="text">
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
                                incididunt ut labore
                                et dolore magna aliqua. Ut enim ad minim veniam.
                            </p>
                            <a href="/book_excursion" class="text-uppercase primary-btn">Book ticket</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End service Area -->

<!-- Start quote Area -->
<section class="quote-area section-gap">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 quote-left">
                <h1>
                    <span>Music</span> gives soul to the universe, <br>
                    wings to the <span>mind</span>, flight <br>
                    to the <span>imagination</span>.
                </h1>
            </div>
            <div class="col-lg-6 quote-right">
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore
                    et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
                    aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                    cillum dolore eu fugiat nulla pariatur.
                </p>
            </div>
        </div>
    </div>
</section>
<!-- End quote Area -->


<!-- Start upcoming-event Area -->
<section class="upcoming-event-area section-gap" id="events">
    <div class="container">
        <div class="row d-flex justify-content-center">
            <div class="menu-content pb-60 col-lg-10">
                <div class="title text-center">
                    <h1 class="mb-10">Checkout our Upcoming Events</h1>
                    <p>Who are in extremely love with eco friendly system.</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-6 event-left">
                <div class="single-events">
                    <img class="img-fluid" src="<c:url value="/resources/img/u1.jpg"></c:url>" alt="">
                    <a href="#"><h4>Event on the rock solid carbon</h4></a>
                    <h6><span>21st February</span> at Central government museum</h6>
                    <p>
                        inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct
                        standards especially.
                    </p>
                </div>
                <div class="single-events">
                    <img class="img-fluid" src="<c:url value="/resources/img/u3.jpg"></c:url>" alt="">
                    <a href="#"><h4>Event on the rock solid carbon</h4></a>
                    <h6><span>21st February</span> at Central government museum</h6>
                    <p>
                        inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct
                        standards especially.
                    </p>
                </div>
            </div>
            <div class="col-lg-6 event-right">
                <div class="single-events">
                    <a href="#"><h4>Event on the rock solid carbon</h4></a>
                    <h6><span>21st February</span> at Central government museum</h6>
                    <p>
                        inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct
                        standards especially.
                    </p>
                    <img class="img-fluid" src="<c:url value="/resources/img/u2.jpg"></c:url>" alt="">
                </div>
                <div class="single-events">

                    <a href="#"><h4>Event on the rock solid carbon</h4></a>
                    <h6><span>21st February</span> at Central government museum</h6>
                    <p>
                        inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct
                        standards especially.
                    </p>
                    <img class="img-fluid" src="<c:url value="/resources/img/u4.jpg"></c:url>" alt="">
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End upcoming-event Area -->


<!-- Start gallery Area -->
<section class="gallery-area section-gap" id="gallery">
    <div class="container">
        <div class="row d-flex justify-content-center">
            <div class="menu-content pb-70 col-lg-8">
                <div class="title text-center">
                    <h1 class="mb-10 text-white">Our Exhibition Gallery</h1>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua.</p>
                </div>
            </div>
        </div>
        <div id="grid-container" class="row">
            <a class="single-gallery" href="<c:url value="/resources/img/g1.jpg"></c:url>"><img class="grid-item"
                                                                                                src="<c:url value="/resources/img/g1.jpg"></c:url>"></a>
            <a class="single-gallery" href="<c:url value="/resources/img/g2.jpg"></c:url>"><img class="grid-item"
                                                                                                src="<c:url value="/resources/img/g2.jpg"></c:url>"></a>
            <a class="single-gallery" href="<c:url value="/resources/img/g3.jpg"></c:url>"><img class="grid-item"
                                                                                                src="<c:url value="/resources/img/g3.jpg"></c:url>"></a>
            <a class="single-gallery" href="<c:url value="/resources/img/g4.jpg"></c:url>"><img class="grid-item"
                                                                                                src="<c:url value="/resources/img/g4.jpg"></c:url>"></a>
            <a class="single-gallery" href="<c:url value="/resources/img/g5.jpg"></c:url>"><img class="grid-item"
                                                                                                src="<c:url value="/resources/img/g5.jpg"></c:url>"></a>
            <a class="single-gallery" href="<c:url value="/resources/img/g6.jpg"></c:url>"><img class="grid-item"
                                                                                                src="<c:url value="/resources/img/g6.jpg"></c:url>"></a>
            <a class="single-gallery" href="<c:url value="/resources/img/g7.jpg"></c:url>"><img class="grid-item"
                                                                                                src="<c:url value="/resources/img/g7.jpg"></c:url>"></a>
            <a class="single-gallery" href="<c:url value="/resources/img/g8.jpg"></c:url>"><img class="grid-item"
                                                                                                src="<c:url value="/resources/img/g8.jpg"></c:url>"></a>
            <a class="single-gallery" href="<c:url value="/resources/img/g9.jpg"></c:url>"><img class="grid-item"
                                                                                                src="<c:url value="/resources/img/g9.jpg"></c:url>"></a>
            <a class="single-gallery" href="<c:url value="/resources/img/g10.jpg"></c:url>"><img class="grid-item"
                                                                                                 src="<c:url value="/resources/img/g10.jpg"></c:url>"></a>
            <a class="single-gallery" href="<c:url value="/resources/img/g11.jpg"></c:url>"><img class="grid-item"
                                                                                                 src="<c:url value="/resources/img/g11.jpg"></c:url>"></a>
            <a class="single-gallery" href="<c:url value="/resources/img/g12.jpg"></c:url>"><img class="grid-item"
                                                                                                 src="<c:url value="/resources/img/g12.jpg"></c:url>"></a>
            <a class="single-gallery" href="<c:url value="/resources/img/g4.jpg"></c:url>"><img class="grid-item"
                                                                                                src="<c:url value="/resources/img/g4.jpg"></c:url>"></a>
            <a class="single-gallery" href="<c:url value="/resources/img/g5.jpg"></c:url>"><img class="grid-item"
                                                                                                src="<c:url value="/resources/img/g5.jpg"></c:url>"></a>
        </div>
    </div>
</section>
<!-- End gallery Area -->


<!-- start footer Area -->
<footer class="footer-area section-gap">
    <div class="container">
        <div class="row">
            <div class="col-lg-5 col-md-6 col-sm-6">
                <div class="single-footer-widget">
                    <h6>About Us</h6>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut
                        labore dolore magna aliqua.
                    </p>

                </div>
            </div>
            <div class="col-lg-5  col-md-6 col-sm-6"></div>
            <div class="col-lg-2 col-md-6 col-sm-6 social-widget">
            </div>
        </div>
    </div>
</footer>
<!-- End footer Area -->

<script src="<c:url value='/resources/js/vendor/jquery-2.2.4.min.js' />"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="<c:url value='/resources/js/vendor/bootstrap.min.js' />"></script>
<script type="text/javascript"
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA"></script>
<script src="<c:url value='/resources/js/easing.min.js' />"></script>
<script src="<c:url value='/resources/js/hoverIntent.js' />"></script>
<script src="<c:url value='/resources/js/superfish.min.js' />"></script>
<script src="<c:url value='/resources/js/jquery.ajaxchimp.min.js' />"></script>
<script src="<c:url value='/resources/js/jquery.magnific-popup.min.js' />"></script>
<script src="<c:url value='/resources/js/owl.carousel.min.js' />"></script>
<script src="<c:url value='/resources/js/imagesloaded.pkgd.min.js' />"></script>
<script src="<c:url value='/resources/js/justified.min.js' />"></script>
<script src="<c:url value='/resources/js/jquery.sticky.js' />"></script>
<script src="<c:url value='/resources/js/jquery.nice-select.min.js' />"></script>
<script src="<c:url value='/resources/js/parallax.min.js' />"></script>
<script src="<c:url value='/resources/js/main.js' />"></script>
</body>
</html>


