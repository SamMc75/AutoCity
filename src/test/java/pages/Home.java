package pages;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class Home extends Page {
    private static final String URl = "https://www.citypizza.ru/";

    public void open(){
        open(URl);
    }

    public WebElement clickCityButton(){ return $( "#select-city .popup .ok-btn"); }

    public WebElement getCategory(String name){
        return $("//div[@class='menu-categories']//ul//li//a[contains(text(), '%s')]",name);
    }
}
