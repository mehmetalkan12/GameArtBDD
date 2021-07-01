package net.gameArt.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.gameArt.pages.AliBabaPage;
import net.gameArt.utilities.BrowserUtils;
import net.gameArt.utilities.Driver;

public class AliBabaRiches {

    AliBabaPage aliBabaPage = new AliBabaPage();

    @Given("Open Ali baba riches game on {string}")
    public void open_Ali_baba_riches_game_on(String string) {
        aliBabaPage.aliBabaLink.click();
        BrowserUtils.waitFor(3);
        aliBabaPage.playDemoButton.click();
        BrowserUtils.waitFor(15);
        Driver.get().switchTo().frame(aliBabaPage.frame);
        BrowserUtils.waitFor(3);
        aliBabaPage.gameStartClick.click();


    }

    @When("make a spin")
    public void make_a_spin() {

    }

    @When("Open the autoplay menu")
    public void open_the_autoplay_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("set number of spins to {int}")
    public void set_number_of_spins_to(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Raise Coin Value to {int}.05€")
    public void raise_Coin_Value_to_05€(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Enable »Fast Spin«")
    public void enable_Fast_Spin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Start autoplay")
    public void start_autoplay() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Once autoplay is finished")
    public void once_autoplay_is_finished() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Mute sound")
    public void mute_sound() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Open info pages")
    public void open_info_pages() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Close info pages")
    public void close_info_pages() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Open Settings")
    public void open_Settings() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Close Settings")
    public void close_Settings() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Make another {int} spins with manually stopping the reels \\(Press »Spin« once reels start spinning)")
    public void make_another_spins_with_manually_stopping_the_reels_Press_Spin_once_reels_start_spinning(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

    }
}