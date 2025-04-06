@{model=llama3.2; created_at=2025-04-06T11:08:21.4933966Z; response=```java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    private WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    // Search input element
    public WebElement searchInput() {
        return new WebElement(driver, By.id("search"));
    }

    // Menu checkbox element
    public WebElement menuCheckbox() {
        return new WebElement(driver, By.id("menu"));
    }

    // Link elements
    public WebElement homeLink() {
        return new WebElement(driver, By.href("/"));
    }

    public WebElement discordLink() {
        return new WebElement(driver, By.href("https://discord.com/invite/ollama"));
    }

    public WebElement githubLink() {
        return new WebElement(driver, By.href("https://github.com/ollama/ollama"));
    }

    public WebElement modelsLink() {
        return new WebElement(driver, By.href("/models"));
    }

    public WebElement signinLink() {
        return new WebElement(driver, By.href("/signin"));
    }

    public WebElement downloadLink() {
        return new WebElement(driver, By.href("/download"));
    }

    public WebElement libraryLlama33Link() {
        return new WebElement(driver, By.linkText("Llama 3.3"));
    }

    public WebElement libraryDeepSeekR1Link() {
        return new WebElement(driver, By.linkText("DeepSeek-R1"));
    }

    public WebElement libraryPhi4Link() {
        return new WebElement(driver, By.linkText("Phi-4"));
    }

    public WebElement libraryMistralLink() {
        return new WebElement(driver, By.linkText("Mistral"));
    }

    public WebElement libraryGemma3Link() {
        return new WebElement(driver, By.linkText("Gemma 3"));
    }
}
```; done=True; done_reason=stop; context=System.Object[]; total_duration=76547616600; load_duration=4319163100; prompt_eval_count=1139; prompt_eval_duration=32498000000; eval_count=378; eval_duration=39716000000}
