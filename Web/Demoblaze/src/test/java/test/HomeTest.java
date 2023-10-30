package test;

import org.testng.annotations.Test;
import pages.HomePage;
import utiils.BaseTest;

public final class HomeTest  extends BaseTest {
    private HomePage home;

    @Test
    public void openHomePage(){
        home = loadFirstPage();
        home.waitToBeClickable(home.getSingUpButton());
        home.getSingUpButton().click();
    }




}
