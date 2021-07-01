package net.gameArt.pages;

import net.gameArt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AliBabaPage extends BasePage {

    public AliBabaPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "(//a[@title='Play demo'])[1]")
    public WebElement playDemoButton;

    @FindBy(xpath = "//div[@id='openfl-content']")
    public WebElement gameStartClick;

    @FindBy(xpath = "//iframe[@class='fancybox-iframe']")
    public WebElement frame;

   public String frameName = "fancybox-frame1625141670166";


}
