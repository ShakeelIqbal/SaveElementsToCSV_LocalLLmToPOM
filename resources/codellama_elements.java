@{model=codellama; created_at=2025-04-06T11:05:53.782315Z; response=package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {
    private WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    // Define web elements here using By locators
    private final By searchInput = By.id("search");
    private final By menuInput = By.id("menu");
    private final By signInLink = By.linkText("Sign in...");
    private final By downloadLink = By.linkText("Download");
    private final By blogLink = By.linkText("Blog");
    private final By docsLink = By.linkText("Docs");
    private final By githubLink = By.linkText("GitHub");
    private final By discordLink = By.linkText("Discord");
    private final By twitterLink = By.linkText("X (Twitter)");
    private final By meetupsLink = By.linkText("Meetups");
    private final By ollamaLogo = By.xpath("//img[@alt='Ollama']");

    // Define methods to interact with web elements here
    public void search(String query) {
        WebElement searchInput = driver.findElement(this.searchInput);
        searchInput.sendKeys(query);
    }

    public void toggleMenu() {
        WebElement menuInput = driver.findElement(this.menuInput);
        menuInput.click();
    }

    public boolean isSignInLinkPresent() {
        return driver.findElements(signInLink).size() > 0;
    }

    public boolean isDownloadLinkPresent() {
        return driver.findElements(downloadLink).size() > 0;
    }

    public boolean isBlogLinkPresent() {
        return driver.findElements(blogLink).size() > 0;
    }

    public boolean isDocsLinkPresent() {
        return driver.findElements(docsLink).size() > 0;
    }

    public boolean isGithubLinkPresent() {
        return driver.findElements(githubLink).size() > 0;
    }

    public boolean isDiscordLinkPresent() {
        return driver.findElements(discordLink).size() > 0;
    }

    public boolean isTwitterLinkPresent() {
        return driver.findElements(twitterLink).size() > 0;
    }

    public boolean isMeetupsLinkPresent() {
        return driver.findElements(meetupsLink).size() > 0;
    }

    public void waitForPageLoad() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ollamaLogo));
    }
}

; done=True; done_reason=stop; context=System.Object[]; total_duration=276609847000; load_duration=7433396500; prompt_eval_count=1623; prompt_eval_duration=97099000000; eval_count=747; eval_duration=172069000000}
