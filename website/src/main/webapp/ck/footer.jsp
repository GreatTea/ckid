<%@ page language="java" pageEncoding="UTF-8" %>
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
