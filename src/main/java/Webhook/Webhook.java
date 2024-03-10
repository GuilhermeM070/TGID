package Webhook;

public class WebHook {

    private String url;

    public WebHook(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}