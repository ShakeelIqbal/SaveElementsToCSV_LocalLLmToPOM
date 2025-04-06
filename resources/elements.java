@{model=qwen2.5-coder; created_at=2025-04-06T10:31:41.7914124Z; response=```java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObject {
    private WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    // Input elements
    public void enterSearch(String text) {
        driver.findElement(By.id("search")).sendKeys(text);
    }

    // Checkbox element
    public void toggleMenu() {
        driver.findElement(By.id("menu")).click();
    }

    // Link elements
    public void clickDiscord() {
        driver.findElement(By.xpath("//a[text()='Discord']")).click();
    }

    public void clickGitHub() {
        driver.findElement(By.xpath("//a[text()='GitHub']")).click();
    }

    public void clickModels() {
        driver.findElement(By.linkText("Models")).click();
    }

    public void clickSignIn() {
        driver.findElement(By.partialLinkText("Sign in")).click();
    }

    public void clickDownload() {
        driver.findElement(By.xpath("//a[text()='Download']")).click();
    }

    public void clickBlog() {
        driver.findElement(By.linkText("Blog")).click();
    }

    public void clickDocs() {
        driver.findElement(By.xpath("//a[contains(@href, '/docs')]")).click();
    }

    public void clickTwitter() {
        driver.findElement(By.xpath("//a[text()='X (Twitter)']")).click();
    }

    public void clickMeetups() {
        driver.findElement(By.linkText("Meetups")).click();
    }

    // Image elements
    public boolean isOllamaImagePresent() {
        return driver.findElements(By.xpath("//img[@src='/public/ollama.png']")).size() > 0;
    }
}
```; done=True; done_reason=stop; context=System.Object[]; total_duration=75584708800; load_duration=42950900; prompt_eval_count=1157; prompt_eval_duration=217000000; eval_count=350; eval_duration=75322000000}
