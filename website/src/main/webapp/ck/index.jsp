<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML>
<html lang="zh">
<head>
<meta charset="UTF-8">
<base href="<%=basePath%>ck/" />
<title>${request.designs}</title>
<link rel="shortcut icon" type="image/x-icon" href="style/images/favicon.png" />
<link rel="stylesheet" type="text/css" href="style.css" media="all" />
<link rel="stylesheet" type="text/css" href="style/color/red.css" media="all" />
<link rel="stylesheet" type="text/css" media="screen" href="style/css/prettyPhoto.css"  />
<link rel="stylesheet" type="text/css" href="style/type/museo.css" media="all" />
<link rel="stylesheet" type="text/css" href="style/type/ptsans.css" media="all" />
<link rel="stylesheet" type="text/css" href="style/type/charis.css" media="all" />
<!--[if IE 7]>
<link rel="stylesheet" type="text/css" href="style/css/ie7.css" media="all" />
<![endif]-->
<!--[if IE 8]>
<link rel="stylesheet" type="text/css" href="style/css/ie8.css" media="all" />
<![endif]-->
<!--[if IE 9]>
<link rel="stylesheet" type="text/css" href="style/css/ie9.css" media="all" />
<![endif]-->
<script type="text/javascript" src="style/js/jquery-1.6.2.min.js"></script>
<script type="text/javascript" src="style/js/ddsmoothmenu.js"></script>
<script type="text/javascript" src="style/js/transify.js"></script>
<script type="text/javascript" src="style/js/jquery.aw-showcase.js"></script>
<script type="text/javascript" src="style/js/jquery.jcarousel.js"></script>
<script type="text/javascript" src="style/js/carousel.js"></script>
<script type="text/javascript" src="style/js/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="style/js/jquery.superbgimage.min.js"></script>
<script type="text/javascript" src="style/js/jquery.slickforms.js"></script>
<script type="text/javascript">
jQuery(document).ready(function($){
	$('.forms').dcSlickForms();
});
</script>
<script type="text/javascript">

$(document).ready(function()
{
	$("#showcase").awShowcase(
	{
		content_width:			900,
		content_height:			400,
		auto:					true,
		interval:				3000,
		continuous:				false,
		arrows:					true,
		buttons:				true,
		btn_numbers:			true,
		keybord_keys:			true,
		mousetrace:				false, /* Trace x and y coordinates for the mouse */
		pauseonover:			true,
		stoponclick:			false,
		transition:				'fade', /* hslide/vslide/fade */
		transition_delay:		0,
		transition_speed:		500,
		show_caption:			'onload' /* onload/onhover/show */
	});
});

</script>

</head>
<body>
<!-- Fullscreen backgrounds -->
<div id="thumbs">
<a href="style/images/art/bg1.jpg">1</a>
<a href="style/images/art/bg2.jpg">2</a>
<a href="style/images/art/bg3.jpg">3</a>
<a href="style/images/art/bg4.jpg">4</a>
<a href="style/images/art/bg5.jpg">5</a>
<a href="style/images/art/bg6.jpg">6</a>
</div>
<div id="superbgimage">
	<div class="scanlines"></div>
</div>
<!-- End Fullscreen backgrounds -->
<!-- Begin Wrapper -->
<div id="wrapper">
  <div id="header">

    <div class="logo opacity"><a href="index.html"><img src="style/images/logo.png" alt="" /></a></div>

    <div class="social">
        <%@ include file="social.jsp"%>
    </div>
  </div>
  <div class="clear"></div>

  <!-- Begin Menu -->
  <%@include file="nav.jsp"%>
  <!-- End Menu --> 
  
  <!-- Begin Container -->
  <div id="container" class="opacity"> 
    
    <!-- Begin Showcase -->
    <div id="showcase" class="showcase">

      <c:forEach items="${designs}" var="d">
          <div class="showcase-slide">
              <div class="showcase-content">
                  <img src="result/${d.src}" alt="${d.alt}" style="height:100%; width:100%;" />
              </div>

              <c:if test="${null != d.caption && '' != d.caption}">
              <div class="showcase-caption">
                  ${d.caption}
              </div>
              </c:if>
          </div>
      </c:forEach>

    </div>
    <!-- End Showcase -->
    
    <div class="intro">Aenean fringilla aliquam est, a porttitor arcu euismod et. Maecenas rutrum erat at arcu porta interdum. Cras convallis ligula ac risus imperdiet placerat.</div>
    <div class="hr2"></div>
    <!-- Divider --> 

    <!-- Begin Top Columns -->
    <!--<h2>What We Do</h2>
    <div class="two-third">
      <p>Vivamus sodales pharetra libero, a tincidunt nisi condimentum a. Quisque non sodales nislero. Integer a tellus eget arcu fringilla molestie quis vel eros. Praesent fermentum vulputate purusa ornare. Vivamus imperdiet, quam et adipiscing placerat, nibh odio scelerisque risus, vitaere accumsan mi justo et quam. Pellentesque quis felis quis tortor porttitor lobortis nec ac risus.</p>
    </div>
    <div class="one-third last">
      <ul>
        <li>Vivamus at magna non ipsum.</li>
        <li>Etiam pharetra pretium eros.</li>
        <li>Curabitur porttitor ipsum nec magna.</li>
        <li>Maecenas cursus arcu a nulla tristique.</li>
      </ul>
    </div>-->
    <!-- End Top Columns -->
    
    <div class="clear"></div>
    <br />
    <br />
    <br />
    
    <!-- Begin 4 Columns -->
    
    <!--<div class="one-fourth"> <img src="style/images/icon1.png" alt="" class="center" /><br />
      <h4 class="center">Web Design</h4>
      <p class="center">Vivamus soder pharetra libero atincidunt, nisi condimentum Quisque non sodales nislero.</p>
    </div>
    <div class="one-fourth"> <img src="style/images/icon2.png" alt="" class="center" /><br />
      <h4 class="center">Photography</h4>
      <p class="center">Vivamus soder pharetra libero atincidunt, nisi condimentum Quisque non sodales nislero.</p>
    </div>
    <div class="one-fourth"> <img src="style/images/icon3.png" alt="" class="center" /><br />
      <h4 class="center">Motion Graphic</h4>
      <p class="center">Vivamus soder pharetra libero atincidunt, nisi condimentum Quisque non sodales nislero.</p>
    </div>
    <div class="one-fourth last"> <img src="style/images/icon4.png" alt="" class="center" /><br />
      <h4 class="center">Optimization</h4>
      <p class="center">Vivamus soder pharetra libero atincidunt, nisi condimentum Quisque non sodales nislero.</p>
    </div>
    <div class="clear"></div>
    <div class="hr1"></div>-->
    <!-- Divider --> 
    
    <!-- Begin Latest Works -->
    <h2>Latest Works</h2>
    <div class="carousel">
      <div id="carousel-scroll"><a href="#" id="prev">Prev</a><a href="#" id="next">Next</a></div>
      <ul>
        <li> <a href="#"> <span class="overlay details"></span><img src="style/images/art/c1.jpg" alt="" /> </a> </li>
        <li> <a href="#"> <span class="overlay details"></span><img src="style/images/art/c2.jpg" alt="" /> </a> </li>
        <li> <a href="#"> <span class="overlay details"></span><img src="style/images/art/c3.jpg" alt="" /> </a> </li>
        <li> <a href="#"> <span class="overlay details"></span><img src="style/images/art/c4.jpg" alt="" /> </a> </li>
        <li> <a href="#"> <span class="overlay details"></span><img src="style/images/art/c5.jpg" alt="" /> </a> </li>
        <li> <a href="#"> <span class="overlay details"></span><img src="style/images/art/c6.jpg" alt="" /> </a> </li>
      </ul>
    </div>
    <!-- End Latest Works -->
    
    <!-- Footer -->
    <%--<%@include file="footer.jsp" %>--%>
    <!-- End Footer -->
  </div>
  <!-- End Container -->
  
  <div id="copyright" class="opacity">
    <p>© 2011 Zeences Design. All Right Reserved.</p>
  </div>
</div>
<!-- End Wrapper --> 

<script type="text/javascript" src="style/js/scripts.js"></script>
</body>
</html>