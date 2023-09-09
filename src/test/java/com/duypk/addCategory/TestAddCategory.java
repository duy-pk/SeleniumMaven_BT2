package com.duypk.addCategory;

import com.duypk.common.BaseTest;
import com.duypk.locator.LocatorCMS;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TestAddCategory extends BaseTest {
    public static void main(String[] args) {
        createBrowser("Chrome");
        driver.get(LocatorCMS.cmsURL);

        //dang nhap tai khoan
        driver.findElement(By.xpath(LocatorCMS.loginInputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorCMS.loginInputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCMS.loginLoginButton)).click();

        //Chon den Category
        driver.findElement(By.xpath(LocatorCMS.mainMenuProducts)).click();
        driver.findElement(By.xpath(LocatorCMS.mainMenuCategory)).click();

        //Chon den Add new Category
        driver.findElement(By.xpath(LocatorCMS.categoryAddNewcategory)).click();

        //Nhap thong tin new Category
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryInputName)).sendKeys(categoryName);
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryParentDropdown)).click();
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryParentSearch)).sendKeys("Cake");
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryParentSearch)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryOrderingNumber)).sendKeys("9999");

        //Chon Image cho Banner
        driver.findElement((By.xpath(LocatorCMS.addNewCategoryBanner))).click();
        driver.findElement(By.xpath(LocatorCMS.bannerPopupSearch)).sendKeys("setBanhtrungthu1");
        driver.findElement(By.xpath(LocatorCMS.bannerPopupSearch)).sendKeys(Keys.ENTER);
        sleep(3);
        driver.findElement(By.xpath(LocatorCMS.bannerPopupSearchItem)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorCMS.bannerPopupAddFiles)).click();
        sleep(1);

        //Chon Image cho Icon
        driver.findElement((By.xpath(LocatorCMS.addNewCategoryIcon))).click();
        driver.findElement(By.xpath(LocatorCMS.iconPopupSearch)).sendKeys("setBanhtrungthu2");
        driver.findElement(By.xpath(LocatorCMS.iconPopupSearch)).sendKeys(Keys.ENTER);
        sleep(3);
        driver.findElement(By.xpath(LocatorCMS.iconPopupSearchItem)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorCMS.iconPopupAddFiles)).click();
        sleep(1);

        driver.findElement(By.xpath(LocatorCMS.addNewCategoryMetaTitle)).sendKeys("Banh Kinh Do");
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryMetaDescription)).sendKeys("Banh ngon cho gia dinh than yeu");
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryFilteringAttributesDropdown)).click();
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryFilteringAttributesDropdownSearch)).sendKeys("Size");
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryFilteringAttributesDropdownSearch)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryFilteringAttributesDropdown)).click();
        driver.findElement(By.xpath(LocatorCMS.addNewCategorySaveButton)).click();
        sleep(1);

        //Quay lai search trong trang Category
        driver.findElement(By.xpath(LocatorCMS.categorySearchButton)).sendKeys(categoryName);
        driver.findElement(By.xpath(LocatorCMS.categorySearchButton)).sendKeys(Keys.ENTER);
        String itemName = driver.findElement(By.xpath(LocatorCMS.categoryFirstSearchItem)).getText();
        if (itemName.equals(categoryName)){
            System.out.println("Add Category successfully");
        }
        else {
            System.out.println("Add Category failed");
        }
        closeBroser();
    }
}
