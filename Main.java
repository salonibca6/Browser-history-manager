public class Main {

    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory("google.com");

        browser.visit("youtube.com");
        browser.visit("github.com");
        browser.visit("chatgpt.com");

        System.out.println(browser.back());

        System.out.println(browser.back());

        System.out.println(browser.forward());

        System.out.println(browser.currentPage());

        browser.showHistory();

    }
}
