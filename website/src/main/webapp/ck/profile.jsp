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
<title>Zeences Design</title>
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
<script type="text/javascript" src="style/js/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="style/js/jquery.superbgimage.min.js"></script>
<script type="text/javascript" src="style/js/jquery.slickforms.js"></script>
<script type="text/javascript">
jQuery(document).ready(function($){
	$('.forms').dcSlickForms();
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
    <div class="logo"><a href="index.html"><img src="style/images/logo.png" alt="" /></a></div>
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
    <div class="full-width">
      <div class="one-third"><img src="result/panzi.jpg" alt="" style="width:280px; height:350px" /></div>
      <div class="two-third last">
        <h2>关于我</h2>
        <p>
            我是一名信息工程大学印刷工程专业应届本科即将毕业的学员。
            我的性格偏于内向，为人坦率、热情、讲求原则；处事乐观、专心、细致、头脑清醒；富有责任心、乐于助人。
        </p>
        <br />
        <br />

        <h4>主要技能</h4>
        <p>
            1、了解电气工程与自动化专业和工商管理专业的理论知识; </p>
          <p>2、熟练应用各种常用专业软件，如 Matlab,EDA,CAD; </p>
          <p>3、有一定的创新意识，对数学建模有一定的应用。 </p>
        <br/>
          <br/>

        <h4>个人介绍</h4>
          <p> 1、喜欢和观念和物化材料打交道，研究具有复杂设计的各类机械设备及其原理。</p>
          <p>2、好奇心很强，喜欢钻研，有锲而不舍的精神，喜欢创造性的工作。</p>
          <p>3、善于在实际生活中发挥才干，乐于解决生活中的疑难问题。</p>
          <p>4、执着，认真，宽容，有理性，有恒心，有责任感，真诚对待他人。</p>
          <p> 5、擅长篮球，喜欢体育活动并通过参与活动结交朋友，有一定的组织能力。
        </p>
        <br />
        <!--<p>Aenean lacinia bibendum nulla sed consectetur. Vestibulum id ligula porta felis euismod semper. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Maecenas sed diam eget risus varius blandit sit amet non magna. Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
     -->
      </div>
      <div class="clear"></div>
    </div>
    <!-- End Full Width -->
    
    <div class="clear"></div>
    <div id="footer">
      <div class="footer-top"></div>
      <!-- Divider -->
      <div class="one-fourth">
        <h3>Latest Posts</h3>
        <ul class="latest-posts">
          <li><span class="date"><em class="day">22</em><em class="month">Jun</em></span> <a href="#">Vivamus soder pharetra libero atincidunt</a> </li>
          <li><span class="date"><em class="day">14</em><em class="month">May</em></span> <a href="#">Vivamus soder pharetra libero atincidunt</a> </li>
          <li><span class="date"><em class="day">11</em><em class="month">May</em></span> <a href="#">Vivamus soder pharetra libero atincidunt</a> </li>
          <li><span class="date"><em class="day">08</em><em class="month">Apr</em></span> <a href="#">Vivamus soder pharetra libero atincidunt</a> </li>
        </ul>
      </div>
      <div class="one-fourth">
        <h3>Flickr</h3>
        <ul class="flickr">
          <li><a href="#"><img src="style/images/art/f1.jpg" alt="" /></a></li>
          <li><a href="#"><img src="style/images/art/f2.jpg" alt="" /></a></li>
          <li><a href="#"><img src="style/images/art/f3.jpg" alt="" /></a></li>
          <li><a href="#"><img src="style/images/art/f4.jpg" alt="" /></a></li>
          <li><a href="#"><img src="style/images/art/f5.jpg" alt="" /></a></li>
          <li><a href="#"><img src="style/images/art/f6.jpg" alt="" /></a></li>
          <li><a href="#"><img src="style/images/art/f7.jpg" alt="" /></a></li>
          <li><a href="#"><img src="style/images/art/f8.jpg" alt="" /></a></li>
          <li><a href="#"><img src="style/images/art/f9.jpg" alt="" /></a></li>
        </ul>
      </div>
      <div class="one-fourth">
        <h3>About</h3>
        <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Integer posuere erat a ante venenatis dapibus posuere velit aliquet. Curabitur blandit tempus porttitor.</p> <br />
        <p>Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor.</p>
      </div>
      <div class="one-fourth last">
        <h3>Get in Touch</h3>
        <!-- Form -->
        <div class="form-container">
          <form class="forms" action="contact/form-handler.php" method="post">
            <fieldset>
              <ol>
                <li class="form-row text-input-row">
                  <label>Name*</label>
                  <input type="text" name="name" value="" class="text-input required" title="" />
                </li>
                <li class="form-row text-input-row">
                  <label>Email*</label>
                  <input type="text" name="email" value="" class="text-input required email" title="" />
                </li>
                <li class="form-row text-area-row">
                  <textarea name="message" class="text-area required"></textarea>
                </li>
                <li class="form-row hidden-row">
                  <input type="hidden" name="hidden" value="" />
                </li>
                <li class="button-row">
                  <input type="submit" value="Submit" name="submit" class="btn-submit" />
                </li>
              </ol>
              <input type="hidden" name="v_error" id="v-error" value="Required" />
              <input type="hidden" name="v_email" id="v-email" value="Enter a valid email" />
            </fieldset>
          </form>
          <div class="response"></div>
        </div>
        <!-- End Form --> 
      </div>
      <div class="clear"></div>
    </div>
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