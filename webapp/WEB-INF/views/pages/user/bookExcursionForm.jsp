<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <link rel="stylesheet" href="https://cdn.linearicons.com/free/1.0.0/icon-font.min.css">
    <!--
    CSS
    ============================================= -->
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
                    <li><a href="/login">Login</a></li>
                </ul>
            </nav><!-- #nav-menu-container -->
        </div>
    </div>
</header><!-- #header -->

<!-- start banner Area -->
<section class="banner-area relative" id="home">
    <div class="overlay overlay-bg"></div>
    <div class="container">
        <div class="row d-flex align-items-center justify-content-center">
            <div class="about-content col-lg-12">
                <h1 class="text-white">
                    Please fill form
                </h1>
                <p class="text-white link-nav"><a href="/">Home </a>
            </div>
        </div>
    </div>
</section>
<!-- End banner Area -->

<!-- Start contact-page Area -->
<section class="contact-page-area section-gap">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <form class="form-area " id="myForm" action="${pageContext.request.contextPath}/book_excursion_form"
                      method="post" class="contact-form text-right">
                    <div class="row">
                        <div class="col-lg-6 form-group" style="margin: auto;">
                            <input name="name" placeholder="Enter your name"
                                   required=""
                                   class="common-input mb-20 form-control"
                                   type="text">

                            <input name="email" placeholder="Enter email address"
                                   pattern="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{1,63}$"
                                   required=""
                                   class="common-input mb-20 form-control" type="email">
                            <c:if test="${error ne null}">
                                <div class="alert alert-danger alert-dismissible" role="alert">
                                    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span
                                            aria-hidden="true">&times;</span></button>
                                    <strong>Warning!</strong> ${error}
                                </div>
                            </c:if>
                            <button class="primary-btn mt-20 text-white" type="submit" style="float: right;">Book
                            </button>

                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
<!-- End contact-page Area -->

<!-- start footer Area -->
<footer class="footer-area section-gap" style="border-top: 4px #0b0b0b">
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


