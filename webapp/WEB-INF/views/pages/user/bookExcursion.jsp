<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                    <li><a href="#">Buy Ticket</a></li>
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
                <a href="index.html"><img src="img/logo.png" alt="" title="" /></a>
            </div>
            <nav id="nav-menu-container">
                <ul class="nav-menu">
                    <li class="menu-active"><a href="index.html">Home</a></li>
                    <li><a href="about.html">About</a></li>
                    <li><a href="gallery.html">Gallery</a></li>
                    <li><a href="event.html">Events</a></li>
                    <li><a href="ticket.html">Ticket</a></li>
                    <li><a href="blog-home.html">Blog</a></li>
                    <li><a href="contact.html">Contact</a></li>
                    <li class="menu-has-children"><a href="">Pages</a>
                        <ul>
                            <li><a href="blog-single.html">Blog Single</a></li>
                            <li><a href="category.html">Category</a></li>
                            <li><a href="elements.html">Elements</a></li>
                        </ul>
                    </li>
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
                    Buy Tickets
                </h1>
                <p class="text-white link-nav"><a href="index.html">Home </a>  <span class="lnr lnr-arrow-right"></span>  <a href="ticket.html"> Tickets</a></p>
            </div>
        </div>
    </div>
</section>
<!-- End banner Area -->


<!-- Start upcoming-exibition Area -->
<section class="upcoming-exibition-area section-gap">
    <div class="container">
        <div class="row d-flex justify-content-center">
            <div class="menu-content pb-70 col-lg-8">
                <div class="title text-center">
                    <h1 class="mb-10">Ongoing Exhibitions from the scratch</h1>
                    <p>Who are in extremely love with eco friendly system.</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4 col-md-6 single-exhibition">
                <div class="thumb">
                    <img class="img-fluid" src="img/pages/ex1.jpg" alt="">
                </div>
                <p class="date">10 Jan 2018</p>
                <a href="#"><h4>Blind Artist Draws Colorful Paintings</h4></a>
                <p>
                    Lorem ipsum dolor sit amet, consec teturadip isicing elit, sed do eiusmod tempor.
                </p>
                <div class="meta-bottom d-flex justify-content-start">
                    <p class="price">$45.00</p>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 single-exhibition">
                <div class="thumb">
                    <img class="img-fluid" src="img/pages/ex2.jpg" alt="">
                </div>
                <p class="date">10 Jan 2018</p>
                <a href="#"><h4>Blind Artist Draws Colorful Paintings</h4></a>
                <p>
                    Lorem ipsum dolor sit amet, consec teturadip isicing elit, sed do eiusmod tempor.
                </p>
                <div class="meta-bottom d-flex justify-content-start">
                    <p class="price">$45.00</p>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 single-exhibition">
                <div class="thumb">
                    <img class="img-fluid" src="img/pages/ex3.jpg" alt="">
                </div>
                <p class="date">10 Jan 2018</p>
                <a href="#"><h4>Blind Artist Draws Colorful Paintings</h4></a>
                <p>
                    Lorem ipsum dolor sit amet, consec teturadip isicing elit, sed do eiusmod tempor.
                </p>
                <div class="meta-bottom d-flex justify-content-start">
                    <p class="price">$45.00</p>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 single-exhibition">
                <div class="thumb">
                    <img class="img-fluid" src="img/pages/ex4.jpg" alt="">
                </div>
                <p class="date">10 Jan 2018</p>
                <a href="#"><h4>Blind Artist Draws Colorful Paintings</h4></a>
                <p>
                    Lorem ipsum dolor sit amet, consec teturadip isicing elit, sed do eiusmod tempor.
                </p>
                <div class="meta-bottom d-flex justify-content-start">
                    <p class="price">$45.00</p>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 single-exhibition">
                <div class="thumb">
                    <img class="img-fluid" src="img/pages/ex5.jpg" alt="">
                </div>
                <p class="date">10 Jan 2018</p>
                <a href="#"><h4>Blind Artist Draws Colorful Paintings</h4></a>
                <p>
                    Lorem ipsum dolor sit amet, consec teturadip isicing elit, sed do eiusmod tempor.
                </p>
                <div class="meta-bottom d-flex justify-content-start">
                    <p class="price">$45.00</p>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 single-exhibition">
                <div class="thumb">
                    <img class="img-fluid" src="img/pages/ex6.jpg" alt="">
                </div>
                <p class="date">10 Jan 2018</p>
                <a href="#"><h4>Blind Artist Draws Colorful Paintings</h4></a>
                <p>
                    Lorem ipsum dolor sit amet, consec teturadip isicing elit, sed do eiusmod tempor.
                </p>
                <div class="meta-bottom d-flex justify-content-start">
                    <p class="price">$45.00</p>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End upcoming-exibition Area -->


<!-- Start blog Area -->
<section class="blog-area section-gap" id="blog">
    <div class="container">
        <div class="row d-flex justify-content-center">
            <div class="menu-content pb-70 col-lg-8">
                <div class="title text-center">
                    <h1 class="mb-10">Latest From Our Blog</h1>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore  et dolore magna aliqua.</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-3 col-md-6 single-blog">
                <div class="thumb">
                    <img class="img-fluid" src="img/b1.jpg" alt="">
                </div>
                <p class="date">10 Jan 2018</p>
                <a href="#"><h4>Addiction When Gambling
                    Becomes A Problem</h4></a>
                <p>
                    inappropriate behavior ipsum dolor sit amet, consectetur.
                </p>
                <div class="meta-bottom d-flex justify-content-between">
                    <p><span class="lnr lnr-heart"></span> 15 Likes</p>
                    <p><span class="lnr lnr-bubble"></span> 02 Comments</p>
                </div>
            </div>
            <div class="col-lg-3 col-md-6 single-blog">
                <div class="thumb">
                    <img class="img-fluid" src="img/b2.jpg" alt="">
                </div>
                <p class="date">10 Jan 2018</p>
                <a href="#"><h4>Addiction When Gambling
                    Becomes A Problem</h4></a>
                <p>
                    inappropriate behavior ipsum dolor sit amet, consectetur.
                </p>
                <div class="meta-bottom d-flex justify-content-between">
                    <p><span class="lnr lnr-heart"></span> 15 Likes</p>
                    <p><span class="lnr lnr-bubble"></span> 02 Comments</p>
                </div>
            </div>
            <div class="col-lg-3 col-md-6 single-blog">
                <div class="thumb">
                    <img class="img-fluid" src="img/b3.jpg" alt="">
                </div>
                <p class="date">10 Jan 2018</p>
                <a href="#"><h4>Addiction When Gambling
                    Becomes A Problem</h4></a>
                <p>
                    inappropriate behavior ipsum dolor sit amet, consectetur.
                </p>
                <div class="meta-bottom d-flex justify-content-between">
                    <p><span class="lnr lnr-heart"></span> 15 Likes</p>
                    <p><span class="lnr lnr-bubble"></span> 02 Comments</p>
                </div>
            </div>
            <div class="col-lg-3 col-md-6 single-blog">
                <div class="thumb">
                    <img class="img-fluid" src="img/b4.jpg" alt="">
                </div>
                <p class="date">10 Jan 2018</p>
                <a href="#"><h4>Addiction When Gambling
                    Becomes A Problem</h4></a>
                <p>
                    inappropriate behavior ipsum dolor sit amet, consectetur.
                </p>
                <div class="meta-bottom d-flex justify-content-between">
                    <p><span class="lnr lnr-heart"></span> 15 Likes</p>
                    <p><span class="lnr lnr-bubble"></span> 02 Comments</p>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End blog Area -->

<!-- start footer Area -->
<footer class="footer-area section-gap">
    <div class="container">
        <div class="row">
            <div class="col-lg-5 col-md-6 col-sm-6">
                <div class="single-footer-widget">
                    <h6>About Us</h6>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore dolore magna aliqua.
                    </p>
                    <p class="footer-text">
                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                    </p>
                </div>
            </div>
            <div class="col-lg-5  col-md-6 col-sm-6">
                <div class="single-footer-widget">
                    <h6>Newsletter</h6>
                    <p>Stay update with our latest</p>
                    <div class="" id="mc_embed_signup">
                        <form target="_blank" novalidate="true" action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01" method="get" class="form-inline">
                            <input class="form-control" name="EMAIL" placeholder="Enter Email" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter Email '" required="" type="email">
                            <button class="click-btn btn btn-default"><span class="lnr lnr-arrow-right"></span></button>
                            <div style="position: absolute; left: -5000px;">
                                <input name="b_36c4fd991d266f23781ded980_aefe40901a" tabindex="-1" value="" type="text">
                            </div>

                            <div class="info"></div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-lg-2 col-md-6 col-sm-6 social-widget">
                <div class="single-footer-widget">
                    <h6>Follow Us</h6>
                    <p>Let us be social</p>
                    <div class="footer-social d-flex align-items-center">
                        <a href="#"><i class="fa fa-facebook"></i></a>
                        <a href="#"><i class="fa fa-twitter"></i></a>
                        <a href="#"><i class="fa fa-dribbble"></i></a>
                        <a href="#"><i class="fa fa-behance"></i></a>
                    </div>
                </div>
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
<script src="<c:url value='/resources/js/mail-script.js' />"></script>
<script src="<c:url value='/resources/js/main.js' />"></script>
</body>
</html>

