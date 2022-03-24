package main.pageEvents.ADMIN;

import main.utils.CommonMethods;
import main.utils.FetchElement;
import main.utils.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import test.BaseTest;

import static main.data.ADMIN.CreateNewEventData.*;
import static main.pageObjects.ADMIN.CreateNewEventPageElements.*;
import static main.pageObjects.ADMIN.EventsListingPageElements.*;
import static main.utils.Constants.*;

public class CreateNewEventPageEvents extends CommonMethods {

    FetchElement fetchElement = new FetchElement();
    LogInPageEvents logInPageEvents = new LogInPageEvents();
    EventsListingPageEvents eventsListingPageEvents = new EventsListingPageEvents();

    private final int waitForElementSeconds = 15;
    private final long sleepSeconds = 1500l;

    /**************** Standard - Structured *************/

    public void FillBasicInformation_Standard_Structured() {
        preCreateEventFlow();

        clickStandardEvent();
        sleep(sleepSeconds);
        clickStructuredRadio();
        sleep(sleepSeconds);

        clickCreateEventButton();

        sleep(sleepSeconds);
        typeEventTitle(eventTitle_Standard_Structured);
        selectCurrency();
        sleep(sleepSeconds);
        selectCategories_Event();
        sleep(sleepSeconds);
        typeDescription(eventDescription_Standard_Structured);

        uploadBannerImage();
        sleep(sleepSeconds);
        typeEmail();
        sleep(sleepSeconds);
        typeMobile();
        sleep(sleepSeconds);

        clickSaveButton();

        isSavedMessagePresentAndVisible();
        clickNextButton();
    }

    public void FillDetails_Standard_Structured() {
        selectIsFeatured();
        selectIsTicketsPasswordProtected();
        sleep(sleepSeconds);

        clickEventStartDateTime();
        sleep(sleepSeconds);
        clickEventEndDateTime();
        sleep(sleepSeconds);
        clickEntryStartDateTime();
        sleep(sleepSeconds);
        clickEntryCloseDateTime();
        sleep(sleepSeconds);

        selectVenue();
        selectSeatingPlan();
        sleep(sleepSeconds);

        typeTicketPrices();

        uploadBannerImage_Details();
        sleep(sleepSeconds);

        clickSaveButton();
        sleep(sleepSeconds);

        clickOnlySaveButton();
    }

    /**************** Standard - UnStructured *************/

    public void FillBasicInformation_Standard_UnStructured() {
        preCreateEventFlow();

        clickStandardEvent();
        sleep(sleepSeconds);
        clickUnStructuredRadio();
        sleep(sleepSeconds);

        clickCreateEventButton();

        sleep(sleepSeconds);
        typeEventTitle(eventTitle_Standard_UnStructured);
        selectCurrency();
        sleep(sleepSeconds);
        selectCategories_Event();
        sleep(sleepSeconds);
        typeDescription(eventDescription_Standard_UnStructured);

        uploadBannerImage();
        sleep(sleepSeconds);
        typeEmail();
        sleep(sleepSeconds);
        typeMobile();
        sleep(sleepSeconds);

        clickSaveButton();

        isSavedMessagePresentAndVisible();
        clickNextButton();
    }

    public void FillTicketClass_Standard_UnStructured() {
//        clickAddMoreTicketClasses();
//        sleep(sleepSeconds);
//
//        typeTicketClassName();
//        sleep(sleepSeconds);
//        typeTicketClassColor();
        sleep(sleepSeconds);

        clickSaveButton();
        sleep(sleepSeconds);

        clickNextButton();
    }

    public void FillDetails_Standard_UnStructured() {
        selectIsFeatured();
        selectIsTicketsPasswordProtected();
        sleep(sleepSeconds);

        clickEventStartDateTime();
        sleep(sleepSeconds);
        clickEventEndDateTime();
        sleep(sleepSeconds);
        clickEntryStartDateTime();
        sleep(sleepSeconds);
        clickEntryCloseDateTime();
        sleep(sleepSeconds);

        selectVenue();
        sleep(sleepSeconds);

        typeBusinessAvailablePrice();
        sleep(sleepSeconds);
        typeStandardAvailablePrice();
        sleep(sleepSeconds);
        typeVIPAvailablePrice();
        sleep(sleepSeconds);

        typeBusinessSalePrice();
        sleep(sleepSeconds);
        typeStandardSalePrice();
        sleep(sleepSeconds);
        typeVIPSalePrice();
        sleep(sleepSeconds);

        typeBusinessBasePrice();
        sleep(sleepSeconds);
        typeStandardBasePrice();
        sleep(sleepSeconds);
        typeVIPBasePrice();
        sleep(sleepSeconds);

        uploadBannerImage_Details();
        sleep(sleepSeconds);

        clickSaveButton();
        sleep(sleepSeconds);

        clickOnlySaveButton();
    }

    /************** Series Event - Standard *************/

    public void FillBasicInformation_Series_Structured() {
        preCreateEventFlow();

        clickSeriesEvent();
        sleep(sleepSeconds);
        clickStructuredRadio();
        sleep(sleepSeconds);

        clickCreateEventButton();

        sleep(sleepSeconds);
        typeEventTitle(eventTitle_Series_Structured);
        selectCurrency();
        sleep(sleepSeconds);
        selectCategories_Event();
        sleep(sleepSeconds);
        typeDescription(eventDescription_Series_Structured);

        uploadBannerImage();
        sleep(sleepSeconds);
        typeEmail();
        sleep(sleepSeconds);
        typeMobile();
        sleep(sleepSeconds);

        clickSaveButton();

        isSavedMessagePresentAndVisible();
        clickNextButton();
    }

    public void FillDetails_Series_Structured() {
        clickAddSlotButton();
        sleep(sleepSeconds);
        clickStartDateTime_Slot();
        clickEndDateTime_Slot();
        clickEntryStartDateTime_Slot();
        clickEntryCloseDateTime_Slot();

        clickModalAddSlotButton();
        sleep(sleepSeconds);

        typeEventTitle(eventTitleSeries_Structured_Slot);
        typeEventAgenda_Slot(eventAgendaSeries_Structured_Slot);
        typeDescription(slotDescription_Series_Structured);
        sleep(sleepSeconds);

        typeTicketPrices();

        uploadBannerImage_Details();
        sleep(sleepSeconds);

        clickSaveButton();
        sleep(sleepSeconds);

        clickOnlySaveButton();
        sleep(sleepSeconds);
    }

    /************** Series Event - UnStandard *************/

    public void FillBasicInformation_Series_UnStructured() {
        preCreateEventFlow();

        clickSeriesEvent();
        sleep(sleepSeconds);
        clickUnStructuredRadio();
        sleep(sleepSeconds);

        clickCreateEventButton();

        sleep(sleepSeconds);
        typeEventTitle(eventTitle_Series_Structured);
        selectCurrency();
        sleep(sleepSeconds);
        selectCategories_Event();
        sleep(sleepSeconds);
        typeDescription(eventDescription_Series_Structured);

        uploadBannerImage();
        sleep(sleepSeconds);
        typeEmail();
        sleep(sleepSeconds);
        typeMobile();
        sleep(sleepSeconds);

        clickSaveButton();

        isSavedMessagePresentAndVisible();
        clickNextButton();
    }

    public void FillTicketClass_Series_UnStructured() {
        sleep(sleepSeconds);

        clickSaveButton();
        sleep(sleepSeconds);

        clickNextButton();
        sleep(sleepSeconds);
    }

    public void FillDetails_Series_UnStructured() {
        sleep(sleepSeconds);
        clickAddSlotButton();
        sleep(sleepSeconds);
        clickStartDateTime_Slot();
        clickEndDateTime_Slot();
        clickEntryStartDateTime_Slot();
        clickEntryCloseDateTime_Slot();

        clickModalAddSlotButton();
        sleep(sleepSeconds);

        typeEventTitle(eventTitleSeries_UnStructured_Slot);
        typeEventAgenda_Slot(eventAgendaSeries_UnStructured_Slot);
        typeDescription(slotDescription_Series_UnStructured);
        sleep(sleepSeconds);

        typeBusinessAvailablePrice();
        sleep(sleepSeconds);
        typeStandardAvailablePrice();
        sleep(sleepSeconds);
        typeVIPAvailablePrice();
        sleep(sleepSeconds);

        typeBusinessSalePrice();
        sleep(sleepSeconds);
        typeStandardSalePrice();
        sleep(sleepSeconds);
        typeVIPSalePrice();
        sleep(sleepSeconds);

        typeBusinessBasePrice();
        sleep(sleepSeconds);
        typeStandardBasePrice();
        sleep(sleepSeconds);
        typeVIPBasePrice();
        sleep(sleepSeconds);

        uploadBannerImage_Details();
        sleep(sleepSeconds);

        clickSaveButton();
        sleep(sleepSeconds);

        clickOnlySaveButton();
        sleep(sleepSeconds);
    }

    /************** Recurring Event - Standard ************/

    public void FillBasicInformation_Recurring_Structured() {
        preCreateEventFlow();

        clickRecurringEvent();
        sleep(sleepSeconds);
        clickStructuredRadio();
        sleep(sleepSeconds);

        clickCreateEventButton();

        sleep(sleepSeconds);
        typeEventTitle(eventTitle_Recurring_Structured);
        selectCurrency();
        sleep(sleepSeconds);
        selectCategories_Event();
        sleep(sleepSeconds);
        typeDescription(eventDescription_Recurring_Structured);

        uploadBannerImage();
        sleep(sleepSeconds);
        typeEmail();
        sleep(sleepSeconds);
        typeMobile();
        sleep(sleepSeconds);

        clickSaveButton();

        isSavedMessagePresentAndVisible();
        clickNextButton();
    }

    public void FillDetails_Recurring_Structured() {
        typeEventTitle(eventTitleRecurring_Standard_Details);
        typeEventAgenda_Slot(eventAgendaRecurring_Standard_Details);
        typeDescription(slotDescription_Recurring_Structured);
        sleep(sleepSeconds);

        clickStartDateTime_Slot_Details();
        sleep(sleepSeconds);
        clickEndDateTime_Slot_Details();
        sleep(sleepSeconds);


        sleep(sleepSeconds);

        typeTicketPrices();

        uploadBannerImage_Details();
        sleep(sleepSeconds);

        clickSaveButton();
        sleep(sleepSeconds);

        clickOnlySaveButton();
        sleep(sleepSeconds);
    }

    public void typeTicketPrices() {
        long sleepSeconds = 1000l;
        typeEconomySalePrice();
        sleep(sleepSeconds);
        typeGoldenSalePrice();
        sleep(sleepSeconds);
        typeBusinessSalePrice();
        sleep(sleepSeconds);
        typeBusinessTableSalePrice();
        sleep(sleepSeconds);
        typeVIPTableSalePrice();
        sleep(sleepSeconds);

        typeEconomyBasePrice();
        sleep(sleepSeconds);
        typeGoldenBasePrice();
        sleep(sleepSeconds);
        typeBusinessBasePrice();
        sleep(sleepSeconds);
        typeBusinessTableBasePrice();
        sleep(sleepSeconds);
        typeVIPTableBasePrice();
        sleep(sleepSeconds);
    }

    public void clickStandardEvent() {
        fetchElement.getWebElement(Locator.XPath, standardCardH5_XPath).click();
    }

    public void clickSeriesEvent() {
        fetchElement.getWebElement(Locator.XPath, seriesOfEventCardH5_XPath).click();
    }

    public void clickRecurringEvent() {
        fetchElement.getWebElement(Locator.XPath, recurringEventCardH5_XPath).click();
    }

    public void waitForModalHeaderToPresentAndVisible() {
        waitForElementPresentAndVisible(BaseTest.driver, By.xpath(modalHeaderH5_XPath), waitForElementSeconds);
    }

    public void waitForEventsListing() {
        waitForElementPresentAndVisible(BaseTest.driver, By.name(categoriesSelect_Name), 15);
    }

    public void preCreateEventFlow() {
        logInPageEvents.logIn_Valid();
        logInPageEvents.waitForDashboardToLoad();

        sleep(sleepSeconds);
        eventsListingPageEvents.clickEventsSideBar();

        waitForEventsListing();
        sleep(sleepSeconds);

        eventsListingPageEvents.clickAddNewEventButton();
        sleep(sleepSeconds);
    }

    /******** Create Event Flow **********/

    public void clickStructuredRadio() {
        fetchElement.getWebElement(Locator.XPath, structuredRadioLabel_XPath).click();
    }

    public void clickUnStructuredRadio() {
        fetchElement.getWebElement(Locator.XPath, unStructuredRadioLabel_XPath).click();
    }

    public void clickCreateEventButton() {
        fetchElement.getWebElement(Locator.XPath, createEventButton_XPath).click();
        sleep(sleepSeconds);
    }

    public void clickCancelButton() {
        fetchElement.getWebElement(Locator.XPath, cancelButton_XPath).click();
    }

    /************ Basic Information ************/

    /*** Basic Info ***/

    public void typeEventTitle(String title) {
        typeWithSpeed(By.name(titleInput_Name), title, 10l);
    }

    public void selectCurrency() {
        Select element = new Select(fetchElement.getWebElement(Locator.Name, currencySelect_Name));
        element.selectByVisibleText(currency);
    }

    public void clickCategories() {
        fetchElement.getWebElement(Locator.XPath, categoriesSpan_XPath).click();
    }

    public void clickEventCategories() {
        fetchElement.getWebElement(Locator.XPath, eventsCategorySpan_XPath).click();
    }

    public void selectCategories_Event() {
        clickCategories();
        clickEventCategories();
        clickCategoriesText();
    }

    public void clickCategoriesText() {
        fetchElement.getWebElement(Locator.XPath, categoriesTextLabel_XPath).click();
        sleep(sleepSeconds);
    }

    public void typeDescription(String description) {
        typeWithSpeed(By.name(descriptionTextArea_Name), description, 1l);
    }

    public void typeIMDBRatingLink() {
        fetchElement.getWebElement(Locator.Name, imdbUrlInput_Name).sendKeys(imdbRatingLink);
    }

    public void uploadBannerImage() {
        fetchElement.getWebElement(Locator.XPath, bannerImgInput_XPath).sendKeys(bannerImageAbsolutePath);
    }

    /*** Event Contact Details ***/

    public void typeEmail() {
        scrollElementIntoView(By.xpath(emailInput_XPAth));
        typeWithSpeed(By.xpath(emailInput_XPAth), contactEmail, 150l);
    }

    public void typeMobile() {
        typeWithSpeed(By.name(mobileInput_Name), mobileNumber, 150l);
    }

    public void clickSaveButton() {
        fetchElement.getWebElement(Locator.XPath, saveButton_XPath).click();
    }

    public boolean isErrorPopupPresentAndVisible() {
        waitForElementPresentAndVisible(BaseTest.driver, By.xpath(errorPopupDiv_XPath), waitForElementSeconds);
        return IsElementPresentAndVisible(By.xpath(errorPopupDiv_XPath));
    }

    public void isSavedMessagePresentAndVisible() {
        waitForElementPresentAndVisible(BaseTest.driver, By.xpath(savedMessageDiv_XPath), waitForElementSeconds);
        IsElementPresentAndVisible(By.xpath(savedMessageDiv_XPath));
    }

    public boolean isEventSlotSavedSuccessfullyPresentAndVisible() {
        waitForElementPresentAndVisible(BaseTest.driver, By.xpath(eventSlotSavedSuccessfullyDiv_XPath), waitForElementSeconds);
        return IsElementPresentAndVisible(By.xpath(eventSlotSavedSuccessfullyDiv_XPath));
    }

    public boolean isEventListingPresent() {
        waitForElementPresentAndVisible(BaseTest.driver, By.className(listingTableDiv_Class), waitForElementSeconds);
        return IsElementPresentAndVisible(By.className(listingTableDiv_Class));
    }

    public void clickNextButton() {
        fetchElement.getWebElement(Locator.Id, nextButton_Id).click();
    }

    /*** Slot ***/

    public void clickAddSlotButton() {
        fetchElement.getWebElement(Locator.XPath, addSlotButton_XPath).click();
    }

    public void clickSlotModalHeading() {
        fetchElement.getWebElement(Locator.XPath, slotModalHeaderH5_XPath).click();
    }

    public void clickStartDateTime_Slot() {
        fetchElement.getWebElement(Locator.XPath, eventSlot_startDateTimeInput_XPath).click();
        sleep(sleepSeconds);
        fetchElement.getWebElement(Locator.XPath, eventSlot_startDateDayTd_XPath).click();
        clickSlotModalHeading();
    }

    public void clickEndDateTime_Slot() {
        clickSlotModalHeading();
        fetchElement.getWebElement(Locator.XPath, eventSlot_endDateTimeInput_XPath).click();
        sleep(sleepSeconds);
        fetchElement.getWebElement(Locator.XPath, eventSlot_endDateDayTd_XPath).click();
        clickSlotModalHeading();
    }

    public void clickEntryStartDateTime_Slot() {
        clickSlotModalHeading();
        fetchElement.getWebElement(Locator.XPath, eventSlot_entryStartDateTimeInput_XPath).click();
        sleep(sleepSeconds);
        fetchElement.getWebElement(Locator.XPath, eventSlot_entryStartDateDayTd_XPath).click();
        clickSlotModalHeading();
    }

    public void clickEntryCloseDateTime_Slot() {
        clickSlotModalHeading();
        fetchElement.getWebElement(Locator.XPath, eventSlot_entryCloseDateTimeInput_XPath).click();
        sleep(sleepSeconds);
        fetchElement.getWebElement(Locator.XPath, eventSlot_entryCloseDateDayTd_XPath).click();
        clickSlotModalHeading();
    }

    public void clickModalAddSlotButton() {
        fetchElement.getWebElement(Locator.XPath, modalAddSlotButton_XPath).click();
    }

    public void typeEventAgenda_Slot(String agenda) {
        typeWithSpeed(By.name(agendaSlotInput_Name), agenda, 100l);
    }

    /*************** Ticket Classes *************/

    public void clickAddMoreTicketClasses() {
        fetchElement.getWebElement(Locator.XPath, addMoreTicketClassButton_XPath).click();
    }

    public void typeTicketClassName() {
        typeWithSpeed(By.xpath(emptyNameTicketClassInput_XPath), ticketClassName, 100l);
    }

    public void typeTicketClassColor() {
        JavascriptExecutor js = (JavascriptExecutor) BaseTest.driver;
        WebElement ColorElement = BaseTest.driver.findElement(By.xpath(emptyColorTicketClassInput_XPath));
        js.executeScript("arguments[0].setAttribute('value', '#FF0000')", ColorElement);
        //fetchElement.getWebElement(Locator.XPath, emptyColorTicketClassInput_XPath).sendKeys(ticketClassColor);
    }

    /********** Details *********/

    public void selectIsFeatured() {
        Select element = new Select(fetchElement.getWebElement(Locator.Name, isFeaturedSelect_Name));
        element.selectByVisibleText(yesText);
    }

    public void selectIsTicketsPasswordProtected() {
        Select element = new Select(fetchElement.getWebElement(Locator.Name, isTicketsPasswordProtectedSelect_Name));
        element.selectByVisibleText(yesText);
    }

    public void clickStartDateTime_Slot_Details() {
        clickEventStartDateLabel();
        fetchElement.getWebElement(Locator.XPath, eventStart_Details_DateInput_XPath).click();
        sleep(sleepSeconds);
        fetchElement.getWebElement(Locator.XPath, eventStart_Details_DateDayTd_XPath).click();
        clickEventStartDateLabel();
    }

    public void clickEndDateTime_Slot_Details() {
        clickEventStartDateLabel();
        fetchElement.getWebElement(Locator.XPath, eventEnd_Details_DateInput_XPath).click();
        sleep(sleepSeconds);
        fetchElement.getWebElement(Locator.XPath, eventEnd_Details_DateDayTd_XPath).click();
        clickEventStartDateLabel();
    }

    public void clickEventStartDateLabel(){
        fetchElement.getWebElement(Locator.XPath, eventStart_Details_Label_XPath).click();
        sleep(500l);
    }

    /*** Schedule ***/

    public void clickScheduleText() {
        fetchElement.getWebElement(Locator.XPath, scheduleH4_XPath).click();
    }

    public void clickEventStartDateTime() {
        clickScheduleText();
        fetchElement.getWebElement(Locator.XPath, eventStartDateInput_XPath).click();
        sleep(sleepSeconds);
        fetchElement.getWebElement(Locator.XPath, eventStartDateDayTd_XPath).click();
        clickScheduleText();
    }

    public void clickEventEndDateTime() {
        clickScheduleText();
        fetchElement.getWebElement(Locator.XPath, eventEndDateInput_XPath).click();
        sleep(sleepSeconds);
        fetchElement.getWebElement(Locator.XPath, eventEndDateDayTd_XPath).click();
        clickScheduleText();
    }

    public void clickEntryStartDateTime() {
        clickScheduleText();
        fetchElement.getWebElement(Locator.XPath, entryStartDateInput_XPath).click();
        sleep(sleepSeconds);
        fetchElement.getWebElement(Locator.XPath, entryStartDateDayTd_XPath).click();
        clickScheduleText();
    }

    public void clickEntryCloseDateTime() {
        clickScheduleText();
        fetchElement.getWebElement(Locator.XPath, entryCloseDateInput_XPath).click();
        sleep(sleepSeconds);
        fetchElement.getWebElement(Locator.XPath, entryCloseDateDayTd_XPath).click();
        clickScheduleText();
    }

    /*** Venue ***/

    public void selectVenue() {
        Select element = new Select(fetchElement.getWebElement(Locator.Name, venueSelect_Name));
        element.selectByVisibleText(zaidiStudioText);
    }

    /*** Seating Plan ***/

    public void selectSeatingPlan() {
        Select element = new Select(fetchElement.getWebElement(Locator.Name, seatingPlanSelect_Name));
        element.selectByVisibleText(zaidisStudioText);
    }

    /*** Available Tickets ***/

    public void typeBusinessAvailablePrice() {
        clearAndTypeIfPresentAndVisible(businessTicketAvailableTicketsInput_XPath, businessAvailablePrice);
    }

    public void typeStandardAvailablePrice() {
        clearAndTypeIfPresentAndVisible(standardTicketAvailableTicketsInput_XPath, standardAvailablePrice);
    }

    public void typeVIPAvailablePrice() {
        clearAndTypeIfPresentAndVisible(vipTicketAvailableTicketsInput_XPath, vipAvailablePrice);
    }

    /*** Sale Price ***/

    public void typeEconomySalePrice() {
        clearAndTypeIfPresentAndVisible(economyTicketSalePriceInput_XPath, economySalePrice);
    }

    public void typeGoldenSalePrice() {
        clearAndTypeIfPresentAndVisible(goldenTicketSalePriceInput_XPath, goldenSalePrice);
    }

    public void typeBusinessSalePrice() {
        clearAndTypeIfPresentAndVisible(businessTicketSalePriceInput_XPath, businessSalePrice);
    }

    public void typeBusinessTableSalePrice() {
        clearAndTypeIfPresentAndVisible(businessTableTicketSalePriceInput_XPath, businessTableSalePrice);
    }

    public void typeVIPTableSalePrice() {
        clearAndTypeIfPresentAndVisible(vipTableTicketSalePriceInput_XPath, vipSalePrice);
    }

    public void typeStandardSalePrice() {
        clearAndTypeIfPresentAndVisible(standardTicketSalePriceInput_XPath, vipTableSalePrice);
    }

    public void typeVIPSalePrice() {
        clearAndTypeIfPresentAndVisible(vipTicketSalePriceInput_XPath, standardSalePrice);
    }

    public void typeCustomTicketSalePrice() {
        clearAndTypeIfPresentAndVisible(customTicketSalePriceInput_XPath, customTicketSalePrice);
    }

    /*** Base Price ***/

    public void typeEconomyBasePrice() {
        clearAndTypeIfPresentAndVisible(economyTicketBasePriceInput_XPath, economyBasePrice);
    }

    public void typeGoldenBasePrice() {
        clearAndTypeIfPresentAndVisible(goldenTicketBasePriceInput_XPath, goldenBasePrice);
    }

    public void typeBusinessBasePrice() {
        clearAndTypeIfPresentAndVisible(businessTicketBasePriceInput_XPath, businessBasePrice);
    }

    public void typeBusinessTableBasePrice() {
        clearAndTypeIfPresentAndVisible(businessTableTicketBasePriceInput_XPath, businessTableBasePrice);
    }

    public void typeVIPTableBasePrice() {
        clearAndTypeIfPresentAndVisible(vipTableTicketBasePriceInput_XPath, vipBasePrice);
    }

    public void typeStandardBasePrice() {
        clearAndTypeIfPresentAndVisible(standardTicketBasePriceInput_XPath, vipTableBasePrice);
    }

    public void typeVIPBasePrice() {
        clearAndTypeIfPresentAndVisible(vipTicketBasePriceInput_XPath, standardBasePrice);
    }

    public void typeCustomTicketBasePrice() {
        clearAndTypeIfPresentAndVisible(customTicketBasePriceInput_XPath, customTicketBasePrice);
    }

    /*** Banner Image - Details ***/

    public void uploadBannerImage_Details() {
        fetchElement.getWebElement(Locator.XPath, detailsPageBannerImageInput_XPath).sendKeys(bannerImageAbsolutePath_Details);
    }

    public void clickOnlySaveButton() {
        waitForElementPresentAndVisible(BaseTest.driver, By.xpath(onlySaveEventButton_XPath), waitForElementSeconds);
        fetchElement.getWebElement(Locator.XPath, onlySaveEventButton_XPath).click();
    }

    public void clickSaveAndPublishButton() {
        waitForElementPresentAndVisible(BaseTest.driver, By.xpath(saveAndPublishEventButton_XPath), waitForElementSeconds);
        fetchElement.getWebElement(Locator.XPath, saveAndPublishEventButton_XPath).click();
    }

    /*********** Helper Methods ********/

    public void clearAndTypeIfPresentAndVisible(String locatorXPath, String value) {
        if (IsElementPresentAndVisible(By.xpath(locatorXPath))) {
            fetchElement.getWebElement(Locator.XPath, locatorXPath).clear();
            fetchElement.getWebElement(Locator.XPath, locatorXPath).sendKeys(value);
        }
    }

}