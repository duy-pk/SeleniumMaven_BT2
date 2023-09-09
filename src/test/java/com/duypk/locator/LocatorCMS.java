package com.duypk.locator;

import com.duypk.common.BaseTest;

public class LocatorCMS {

    public static String cmsURL = "https://cms.anhtester.com/login";

    //Login Page
    public static String loginHeader = "//h1[normalize-space()='Welcome to Active eCommerce CMS']";
    public static String loginInputEmail = "//input[@id='email']";
    public static String loginInputPassword = "//input[@id='password']";
    public static String loginRememberCheckbox = "//span[@class='aiz-square-check']";
    public static String loginRememberCheckboxText = "//span[normalize-space()='Remember Me']";
    public static String loginForgotPasswordButton = "//a[normalize-space()='Forgot password ?']";
    public static String loginLoginButton = "//button[normalize-space()='Login']";

    //Main Page
    public static String mainSearchButton = "//input[@id='menu-search']";
    public static String mainMenuProducts = "//span[normalize-space()='Products']";
    public static String mainMenuAddNewProduct = "//span[normalize-space()='Add New Product']";
    public static String mainMenuAllProducts = "//span[normalize-space()='All products']";
    public static String mainMenuDigitalProducts = "//span[normalize-space()='Digital Products']";
    public static String mainMenuCategory = "//span[normalize-space()='Category']";
    public static String mainMenuProductReview = "//span[normalize-space()='Product Reviews']";
    public static String mainMenuUploadFiles = "//span[normalize-space()='Uploaded Files']";
    public static String mainMenuCustomers = "//span[normalize-space()='Customers']";
    public static String mainMenuCustomerList = "//span[normalize-space()='Customer list']";
    public static String mainPageButton = "//img[@alt='Active eCommerce CMS']";

    //Category Page
    public static String categoryHeader = "//h1[normalize-space()='All categories']";
    public static String categoryAddNewcategory = "//span[normalize-space()='Add New category']";
    public static String categorySearchButton = "//div[@class='card']//input[@id='search']";
    public static String categoryFirstSearchItem = "//td[@class='footable-first-visible']";

    //Add New Category Page
    public static String addNewCategoryHeader = "//h5[normalize-space()='Category Information']";
    public static String addNewCategoryInputName = "//input[@id='name']";
    public static String addNewCategoryParentDropdown = "//label[normalize-space()='Parent Category']/following-sibling::div//button[@type='button']";
    public static String addNewCategoryParentSearch = "//div[@class='dropdown-menu show']//input[@aria-label='Search']";
    public static String addNewCategoryOrderingNumber = "//input[@id='order_level']";
    public static String addNewCategoryTypeDropdown = "//label[normalize-space()='Type']/following-sibling::div//button[@type='button']";
    public static String addNewCategoryTypePhysical = "//span[normalize-space()='Physical']";
    public static String addNewCategoryTypeDigital = "//span[normalize-space()='Digital']";
    public static String addNewCategoryBanner = "//div[@class='card-body']//form//label[contains(.,'Banner')]/following-sibling::div//div[normalize-space()='Choose File']";
        //Banner Popup
        public static String bannerPopupSearch = "//div[@id='aiz-select-file']//input[@type='text']";
        public static String bannerPopupSearchItem = "//div[@class='card-file-thumb']";
        public static String bannerPopupAddFiles = "//button[normalize-space()='Add Files']";
    public static String addNewCategoryIcon = "//div[@class='card-body']//form//label[contains(.,'Icon')]/following-sibling::div//div[normalize-space()='Choose File']";
        //Icon Popup
        public static String iconPopupSearch = "//div[@id='aiz-select-file']//input[@type='text']";
        public static String iconPopupSearchItem = "//div[@class='card-file-thumb']";
        public static String iconPopupAddFiles = "//button[normalize-space()='Add Files']";
    public static String addNewCategoryMetaTitle = "//input[@name='meta_title']";
    public static String addNewCategoryMetaDescription = "//textarea[@name='meta_description']";
    public static String addNewCategoryFilteringAttributesDropdown = "//label[normalize-space()='Filtering Attributes']/following-sibling::div//button";
    public static String addNewCategoryFilteringAttributesDropdownSearch ="//label[normalize-space()='Filtering Attributes']/following-sibling::div//input[@type='search']";
    public static String addNewCategorySaveButton = "//div[@class='card']//button[normalize-space()='Save']";

}
