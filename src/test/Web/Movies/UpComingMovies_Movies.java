package test.Web.Movies;

import main.pageEvents.MoviesPageEvents;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.BaseTest;

import static main.data.WEB.MoviesData.*;

@Test(groups = {"WEB"})
public class UpComingMovies_Movies extends BaseTest {

    MoviesPageEvents moviesPageEvents = new MoviesPageEvents();
    int actualCount, expectedCount;
    String actualText, expectedText;

//    @BeforeMethod
//    public void beforeMethodMethod() {
//        moviesPageEvents.clickMoviesFromHeader();
//    }

    @Test(testName = "Verify UpComing Movies Text")
    public void verifyUpComingMoviesText() {
        moviesPageEvents.clickMoviesFromHeader();

        actualText = moviesPageEvents.getUpComingMoviesText_UpComingMovies();
        expectedText = upComingMoviesText;

        Assert.assertEquals(actualText, expectedText, "UpComing Movies Heading Text should be '" + upComingMoviesText + "'");
    }

    @Test(testName = "Verify UpComing Movies List Items Count", priority = 1)
    public void verifyUpComingMoviesCount() {
        moviesPageEvents.clickMoviesFromHeader();

        actualCount = moviesPageEvents.getListItemsCount_UpComingMovies();

        expectedCount = moviesPageEvents.getMoviesCount_UpComingMovies_API();

        Assert.assertEquals(actualCount, expectedCount, "UpComing Movies List Items Count should be '" + expectedCount + "'");
    }

    @Test(testName = "Verify Movie Name from API response", priority = 2)
    public void verifyUpComingMovieName() {
        moviesPageEvents.clickMoviesFromHeader();

        actualText = moviesPageEvents.getFirstListItemName_UpComingMovies();
        expectedText = moviesPageEvents.getFirstItemName_UpComingMovies_API();

        Assert.assertEquals(actualText, expectedText, "UpComing Movies List Items Names should be the same as API");
    }

    @Test(testName = "Verify Movie Item is navigating to the Movie Details page", priority = 3)
    public void verifyMovieItemNavigation() {
        moviesPageEvents.clickMoviesFromHeader();

        moviesPageEvents.clickFirstListItem_UpComingMovies();

        actualText = moviesPageEvents.getTitle_MoviesDetails();
        expectedText = moviesPageEvents.getFirstItemName_UpComingMovies_API();

        Assert.assertEquals(actualText, expectedText, "Movie Detail Page Title Name should be equal to '" + expectedText + "'");
    }

    @Test(testName = "Verify See All Button Text", priority = 4)
    public void verifySeeAllBtnText() {
        moviesPageEvents.clickMoviesFromHeader();

        actualText = moviesPageEvents.getSeeAllButtonText_UpComingMovies();
        expectedText = seeAllText;

        Assert.assertEquals(actualText, expectedText, "See All Button Text should be equal to '" + expectedText + "'");
    }

    @Test(testName = "Verify See All Button Navigating to the View More Movies Page", priority = 5)
    public void verifySeeAllNavigation() {
        moviesPageEvents.clickMoviesFromHeader();

        moviesPageEvents.clickSeeAllButton_UpComingMovies();

        sleep(3000L);

        actualText = getCurrentURL();
        expectedText = viewMoreMoviesURL;

        Assert.assertEquals(actualText, expectedText, "See All Button should navigate to View More Movies Page");
    }

}
