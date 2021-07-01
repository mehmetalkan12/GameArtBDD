package net.gameArt.pages;

import net.gameArt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//div[text()='Ali Baba’s Riches']")
    public WebElement aliBabaLink;

}
