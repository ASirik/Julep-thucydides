package com.julep.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

import static ch.lambdaj.Lambda.extract;
import static ch.lambdaj.Lambda.on;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DefaultUrl("http://wwwtest.julep.com")
public abstract class Common extends PageObject {

    protected static final Logger LOGGER = LoggerFactory.getLogger(Common.class);

    /** Static Pages */
    public static final String CATEGORY_LANDING_PAGE = "shop/plie-wand.html";
    public static final String SUBCATEGORY_LANDING_PAGE = "nail-polish/gift-sets.html";
    public static final String SEARCH_RESULT_NORESULT = "catalogsearch/result/?order=relevance&dir=desc&q=abrkadabra";
    public static final String SEARCH_RESULT_PAGE = "catalogsearch/result/?order=relevance&dir=desc&q=julep";
    public static final String PRODUCT_DETAILS_PAGE_CONFIGURED = "plie-wand-precision-brush.html";
    public static final String PRODUCT_DETAILS_PAGE_GIFT_CARD = "gift-card.html";
    public static final String CHECKOUT_CART_PAGE = "checkout/cart";
    public static final String CUSTOMER_ACCOUNT_LOGIN_PAGE = "customer/account/login/";
    public static final String FORGOT_PASSWORD_PAGE = "customer/account/forgotpassword/";
    public static final String NAUTICAL_WELCOME_BOX = "offer/box/nautical";
    public static final String HOW_IT_WORKS = "maven.html";
    public static final String STYLE_PROFILES = "maven-styles.html";
    public static final String MAVEN_FAQ_PAGE = "maven-faq.html";
    public static final String GIFT_OF_MAVEN_PAGE = "giftofmaven/";
    public static final String SECRET_SHOP_PAGE = "secret-store-closed.html";
    public static final String GET_YOUR_FIRST_BOX_PAGE = "offer/summerbrights";
    public static final String HOW_MAVEN_WORKS = "maven.html";
    public static final String TAKE_QUIZ_PAGE = "quiz/default";
    public static final String ABOUT_JULEP_PAGE = "about.html";

    /* WebDriver defaults settings */
//    public static BrowserType browser = BrowserType.CHROME;
    public static String baseUrl = "http://wwwtest.julep.com/";
    public static String baseUrlSecure;
    public static String baseUrlAdmin;
    public static String shopNailsUrl;
    public static String testResultsDirectory = System.getProperty("user.dir"); // This directory is where test results go!  Very important...
    public static boolean SSLEnabled = false;
    public static String mainWindowHandle; //unique identifier of browser, in case another window opens up

    public static final String PROD_INDICATOR = "www.julep.com";
    public static final String QA_INDICATOR = "qa.julep.com";
    public static final String LOCAL_INDICATOR = "local.julep.com";
    public static final int IMPLICIT_WAIT_TIME = 60; //default time to patiently wait for finding elements
    public static final String FAIL = "FAIL";
    public static final String PASS = "PASS";

    //credentials
    public static final String ADMIN_USERNAME = "qatest";
    public static final String ADMIN_PASSWORD = "julep123";
    public static final String AUTH_USERNAME = "jbidev";
    public static final String AUTH_PASSWORD = "jbidev";

    //Test User Information
    public static final String TEST_FIRST_NAME = "JulepAutoFN";
    public static final String TEST_LAST_NAME = "JulepAutoLN";
    public static final String CUSTOMER_EMAIL = "testy_testy@julep.com";
    public static final String CUSTOMER_PASSWORD = "julep123";

    /* Test credit card information */
    public static final String TEST_CARD_NUMBER = "4100280112345000";
    public static final String PRE_LIVE_CARD_NUMBER = "4012888888881881";
    public static final String TEST_CARD_TYPE = "Visa";
    public static final String TEST_CARD_MONTH = "01 - January";
    public static final String TEST_CARD_YEAR = "2017";

    //Test Address information
    public static final String GUEST_STREET_1 = "111 N QUEEN ANNE AVE";
    public static final String GUEST_STREET_2 = "STE 200";
    public static final String GUEST_CITY = "Seattle";
    public static final String GUEST_STATE = "Washington";
    public static final String GUEST_COUNTRY = "United States";
    public static final String GUEST_ZIP = "98109";
    public static final String GUEST_PHONE = "555.555.5555";
    public static final String WA_GUEST_STREET_1 = "111 N QUEEN ANNE AVE";
    public static final String WA_GUEST_STREET_2 = "STE 200";
    public static final String WA_GUEST_CITY = "Seattle";
    public static final String WA_GUEST_STATE = "Washington";
    public static final String WA_GUEST_COUNTRY = "United States";
    public static final String WA_GUEST_ZIP = "98109";
    public static final String WA_GUEST_PHONE = "555.555.5555";
    public static final String NJ_GUEST_STREET_1 = "128 High Street";
    public static final String NJ_GUEST_STREET_2 = "Cell 53";
    public static final String NJ_GUEST_CITY = "Mount Holy Township";
    public static final String NJ_GUEST_STATE = "New Jersey";
    public static final String NJ_GUEST_COUNTRY = "United States";
    public static final String NJ_GUEST_ZIP = "08060";
    public static final String NJ_GUEST_PHONE = "555.555.5555";
    public static final String NY_GUEST_STREET_1 = "Liberty Island";
    public static final String NY_GUEST_STREET_2 = "THE BIG STATUE";
    public static final String NY_GUEST_CITY = "New York";
    public static final String NY_GUEST_STATE = "New York";
    public static final String NY_GUEST_COUNTRY = "United States";
    public static final String NY_GUEST_ZIP = "10004";
    public static final String NY_GUEST_PHONE = "555.555.5555";
    public static final String COL_GUEST_STREET_1 = "13655 E Broncos Pkwy";
    public static final String COL_GUEST_STREET_2 = "THE DENVER BRONCOS";
    public static final String COL_GUEST_CITY = "Englewood";
    public static final String COL_GUEST_STATE = "Colorado";
    public static final String COL_GUEST_COUNTRY = "United States";
    public static final String COL_GUEST_ZIP = "80112";
    public static final String COL_GUEST_PHONE = "555.555.5555";
    public static final String OH_GUEST_STREET_1 = "13655 E Browns Pkwy";
    public static final String OH_GUEST_STREET_2 = "THE CLEVELAND BROWNS";
    public static final String OH_GUEST_CITY = "Cleveland";
    public static final String OH_GUEST_STATE = "Ohio";
    public static final String OH_GUEST_COUNTRY = "United States";
    public static final String OH_GUEST_ZIP = "12345";
    public static final String OH_GUEST_PHONE = "555.555.5555";

    // TAX rates
    public static final double WASHINGTON_TAX_RATE = .095;
    public static final double NEW_JERSEY_TAX_RATE = .07;
    public static final double NEW_YORK_TAX_RATE = .0888;
    public static final double OHIO_TAX_RATE = .08;
    public static final double COLORADO_TAX_RATE = 0.0;

    //Shipping Rates
    public static double economyShippingRate = 2.99;
    public static double expressShippingRate = 14.99;
    public static double overnightShippingRate = 24.99;

    // Jules
    public static final String julesAwardedBuyingFullPricedSubscription = "300 Jules";

    // js scripts that come in handy
    public static final String scrollScript = "window.scrollTo(0,Math.max(document.documentElement.scrollHeight," + "document.body.scrollHeight,document.documentElement.clientHeight));";
    public static final String scrollToTopScript = "window.scroll(0,0);";

    /* Pages Paths */
    public static final String mavenExclusivePage = "maven-exclusive.html";
    public static final String myJulesRewardsPage = "rewards/customer";
    public static final String mavenSubscriptionPage = "maven-subscription.html";
    public static final String siteMapPage = "sitemap.xml";
    public static final String googleTagManger = "www.googletagmanager.com";

    //common unique web element identifiers
//    public static final By pageErrorMessage = By.cssSelector("h2[class~='system-error']");
//    public static final By webPageTodoMessage = By.xpath("//div[@class='std' and contains(text(),'todo')]");
//    public static final By mavenWindow = By.xpath("//div[@class = 'responsive-tabs-maven-label']");
//    public static final By maven_monthly_button = By.xpath("//a[contains(@id, 'adjust-button-left')]");
//    public static final String maven_monthly_button_id = "adjust-button-left";
//    public static final String maven_monthly_button_righty_id = "adjust-button-right";
//    public static final By pick_me_monthly_link = By.xpath("//a[@class='organic-funnel-btn add_to_cart_monthly']");
//    public static final By julesSummary = By.xpath("//span[@class = 'points-summary-emphasize']");
//    public static final By submitAddOnsButton = By.id("submit-addons");
//    public static final By newMavenAddOnsModal = By.id("new-maven-addons");
//    public static final By editMyBox = By.linkText("Edit My Box");
//    public static final By try_new_style = By.xpath("//a[contains(@class, 'show-all button new-style-button')]");
//    public static final By save_selections = By.xpath("//a[contains(@class, 'button btn-primary btn-large left maven-save')]");
//    public static By checkoutNow = By.id("submit-form");


    @FindBy(name="search")
    private WebElement searchTerms;

    @FindBy(name="go")
    private WebElement lookupButton;

    @FindBy(css="ol li")
    private List<WebElement> definitionList;

    public Common(WebDriver driver) {
        super(driver);
    }

    public void enter_keywords(String keyword) {
        $(searchTerms).type(keyword);
    }

    public void lookup_terms() {
        $(lookupButton).click();
    }

    public Iterable<String> getDefinitions() {
        return extract(definitionList, on(WebElement.class).getText());
    }

    /**
     * Method to generate a random email user. This returns a julep address.
     * @return          String random email address
     */
    public String getUniqueEmailAddress() {
        return getUniqueEmailAddress("testy_testy");
    }

    /**
     * Method to generate a random email user. This returns a julep address.
     * @param login     String first part of email address
     * @return          String random email address
     */
    public String getUniqueEmailAddress(String login) {
        int randomNumber;
        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(Integer.MAX_VALUE);
        return login.concat(Integer.toString(randomNumber)).concat("@julep.com");
    }
}