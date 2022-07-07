package com.syntax.class25;

public interface WebDriver {

    /*
     Create a WebDriver Interface that will have the
     following unimplemented behaviour: openBrowser(),
     closeBrowser(), maximizeWindow(), findElement().
     Create 2 classes that implements WebDriver interface:
      ChromeDriver and FirefoxDriver.
    */
    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();

    class ChromeDriver implements WebDriver {

        @Override
        public void openBrowser() {
            System.out.println("WebDriver opens the Chrome browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("WebDriver closes the Chrome browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("WebDriver maximizes the window in Chrome");
        }

        @Override
        public void findElement() {
            System.out.println("Finding the element in Google Chrome");
        }
    }


    class FirefoxDriver implements WebDriver {

        @Override
        public void openBrowser() {
            System.out.println("WebDriver opens the Firefox browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("WebDriver closes the Firefox browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("WebDriver maximizes the window in Firefox");
        }

        @Override
        public void findElement() {
            System.out.println("Finding the element in Firefox");
        }

        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.openBrowser();
            driver.maximizeWindow();
            driver.findElement();
            driver.closeBrowser();

            WebDriver driver1 = new ChromeDriver();
            driver1.openBrowser();
            driver1.maximizeWindow();
            driver1.findElement();
            driver1.closeBrowser();
        }
    }
}