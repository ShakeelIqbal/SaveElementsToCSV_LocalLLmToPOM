@{model=qwen2.5-coder; created_at=2025-04-06T09:52:07.8630788Z; response=```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OllamaPage {

    private WebDriver driver;

    public OllamaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "search")
    private WebElement searchInput;

    @FindBy(xpath = "//a[text()='Models']")
    private WebElement modelsLink;

    @FindBy(xpath = "//a[@href='https://discord.com/invite/ollama']")
    private WebElement discordLink;

    @FindBy(xpath = "//a[@href='https://github.com/ollama/ollama']")
    private WebElement githubLink;

    @FindBy(xpath = "//a[text()='Sign in']")
    private WebElement signInLink;

    @FindBy(xpath = "//a[text()='Download']")
    private WebElement downloadLink;

    @FindBy(xpath = "//a[@href='/library/llama3.3']")
    private WebElement llama3_3LibraryLink;

    @FindBy(xpath = "//a[@href='/library/deepseek-r1']")
    private WebElement deepseekR1LibraryLink;

    @FindBy(xpath = "//a[text()='Blog']")
    private WebElement blogLink;

    @FindBy(xpath = "//a[@href='https://github.com/ollama/ollama/tree/main/docs']")
    private WebElement docsLink;

    @FindBy(xpath = "//a[@href='https://twitter.com/ollama']")
    private WebElement twitterLink;

    @FindBy(xpath = "//a[@href='https://lu.ma/ollama']")
    private WebElement meetupsLink;

    @FindBy(xpath = "//img[@src='/public/ollama.png' and contains(@class, 'w-8')]")
    private WebElement ollamaIconSmall;

    @FindBy(xpath = "//img[@src='/public/ollama.png' and contains(@class, 'w-16')]")
    private WebElement ollamaLogoLarge;

    // Getters for the web elements
    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getModelsLink() {
        return modelsLink;
    }

    public WebElement getDiscordLink() {
        return discordLink;
    }

    public WebElement getGithubLink() {
        return githubLink;
    }

    public WebElement getSignInLink() {
        return signInLink;
    }

    public WebElement getDownloadLink() {
        return downloadLink;
    }

    public WebElement getLlama3_3LibraryLink() {
        return llama3_3LibraryLink;
    }

    public WebElement getDeepseekR1LibraryLink() {
        return deepseekR1LibraryLink;
    }

    public WebElement getBlogLink() {
        return blogLink;
    }

    public WebElement getDocsLink() {
        return docsLink;
    }

    public WebElement getTwitterLink() {
        return twitterLink;
    }

    public WebElement getMeetupsLink() {
        return meetupsLink;
    }

    public WebElement getOllamaIconSmall() {
        return ollamaIconSmall;
    }

    public WebElement getOllamaLogoLarge() {
        return ollamaLogoLarge;
    }
}
```; done=True; done_reason=stop; context=System.Object[]; total_duration=273804679900; load_duration=7836549300; prompt_eval_count=1157; prompt_eval_duration=122592000000; eval_count=667; eval_duration=143355000000}
