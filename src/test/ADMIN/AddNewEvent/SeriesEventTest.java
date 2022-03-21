package test.ADMIN.AddNewEvent;

import main.pageEvents.ADMIN.CreateNewEventPageEvents;
import main.pageEvents.ADMIN.EventsListingPageEvents;
import org.junit.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

@Test(groups = {"WEB"})
public class SeriesEventTest extends BaseTest {

    CreateNewEventPageEvents createNewEventPageEvents = new CreateNewEventPageEvents();
    EventsListingPageEvents eventsListingPageEvents = new EventsListingPageEvents();

    @Test(testName = "Verify Series - Structured Event Creation Flow", enabled = false)
    public void verifySeriesEvent_Structured(){
        createNewEventPageEvents.FillBasicInformation_Series_Structured();
        createNewEventPageEvents.FillDetails_Series_Structured();

        eventsListingPageEvents.clickEventsSideBar();

        Assert.assertTrue(createNewEventPageEvents.isEventListingPresent());
    }

    @Test(testName = "Verify Series - UnStructured Event Creation Flow", priority = 1)
    public void verifySeriesEvent_UnStructured(){
        createNewEventPageEvents.FillBasicInformation_Series_UnStructured();
        createNewEventPageEvents.FillTicketClass_Series_UnStructured();
        createNewEventPageEvents.FillDetails_Series_UnStructured();

        eventsListingPageEvents.clickEventsSideBar();

        Assert.assertTrue(createNewEventPageEvents.isEventListingPresent());
    }
}
