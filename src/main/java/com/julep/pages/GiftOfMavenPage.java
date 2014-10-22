/*
* Copyright (c) 2014 Julep Beauty, Inc. (www.julep.com)
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
*/

package com.julep.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.*;

/**
 * A class, which contains implemented actions and verifications, which can be performed on Gift Of Maven Page
 *
 * @author julep team (tech@julep.com)
 */
@DefaultUrl("/giftofmaven")
public class GiftOfMavenPage extends Common {

//    private static final Logger LOGGER = LoggerFactory.getLogger(WebElementFacadeImpl.class);

    @FindBy(xpath="//button[@data-product-id='1770']")
    public static WebElement BUTTON_GIFT_TWO_BOXES;

    @FindBy(xpath="//button[@data-product-id='1771']")
    public static WebElement BUTTON_GIFT_FOUR_BOXES;

    @FindBy(xpath="//button[@data-product-id='1772']")
    public static WebElement BUTTON_GIFT_SIX_BOXES;

    @FindBy(id="to")
    public static WebElement FIELD_NAME_TO;

    @FindBy(id="email-to")
    public static WebElement FIELD_EMAIL_TO;

    @FindBy(id="from")
    public static WebElement FIELD_NAME_FROM;

    @FindBy(id="email-from")
    public static WebElement FIELD_EMAIL_FROM;

    @FindBy(id="message")
    public static WebElement FIELD_MESSAGE;

    @FindBy(id="calendar-inputField")
    public static WebElement DATE_FOR_WELCOME_EMAIL;

    @FindBy(id="add-gifting-product-button")
    public static WebElement BUTTON_ADD_TO_BAG;

    /* Data to input*/
    private static String GIFT_MESSAGE = String.format("Hi %s, remember me?? I am SO HAPPY to be giving you this lovely GIFT OF MAVEN!!!  YOUR BFF FOR-EVS!", TEST_FIRST_NAME);

    public GiftOfMavenPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Opens Gift Of Maven Page entering url into the address field.
     */
//    public void open() {
//        logger.info("Opening URL: " + Harness.baseUrl + PAGE_GIFT_OF_MAVEN);
//        driver.get(Harness.baseUrl + PAGE_GIFT_OF_MAVEN);
//        assertEquals("LOGIN/SIGN UP PAGE WAS NOT OPENED", harness.getSecureBaseURL() + PAGE_GIFT_OF_MAVEN, driver.getCurrentUrl());
//    }


    /**
     * Returns gift subscription button specified gift type.
     * @param boxes      String "6 boxes"|"4 boxes"|"2 boxes"
     * @return           WebElement || fails test
     */
    public WebElement getGiftButtonByName(String boxes){
        WebElement button = null;
        if(boxes.equals("6 boxes")){
            button = BUTTON_GIFT_SIX_BOXES;
        }else if (boxes.equals("4 boxes")){
            button = BUTTON_GIFT_FOUR_BOXES;
        }else if (boxes.equals("2 boxes")){
            button = BUTTON_GIFT_TWO_BOXES;
        }else {
            fail("UNKNOWN GIFT OF MAVEN TYPE");
        }
        return button;
    }

    /**
     * Selects gift subscription with optional gift type.
     * @param boxes      String "6 boxes"|"4 boxes"|"2 boxes"
     */
    public void selectGiftByName(String boxes) {
        $(getGiftButtonByName(boxes)).click();
    }

    /**
     * Adds gift subscription to bag with optional gift type.
     * @param boxes      String "6 boxes"|"4 boxes"|"2 boxes"
     */
    public void addGiftToBagByName(String boxes) {
        $(getGiftButtonByName(boxes)).click();
        $(FIELD_NAME_TO).type("Anyone");
        $(FIELD_EMAIL_TO).type(getUniqueEmailAddress());
        $(FIELD_NAME_FROM).type(TEST_FIRST_NAME);
        $(FIELD_EMAIL_FROM).type(getUniqueEmailAddress());
        $(FIELD_MESSAGE).type(GIFT_MESSAGE);
        $(BUTTON_ADD_TO_BAG).click();
        // wait???
    }
}