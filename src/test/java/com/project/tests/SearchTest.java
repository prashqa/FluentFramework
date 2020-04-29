package com.project.tests;

import org.testng.annotations.Test;

import com.project.pages.HomePage;
import static com.project.pages.HomePage.getHomePage;
import com.project.pages.SearchResultsPage;
import static com.project.pages.SearchResultsPage.getSearchResultsPage;
import com.project.pages.Title;
import com.project.pages.TravellerInformationPage;
import static com.project.pages.TravellerInformationPage.getTravellerInformationPage;

public class SearchTest extends BaseTest {
	HomePage home = getHomePage();
	SearchResultsPage searchResults = getSearchResultsPage();
	TravellerInformationPage travellerInformation = getTravellerInformationPage();

	@Test
	public void bookFlight() {

		home.enterOrigin()
			.enterDestination()
			.enterDate()
			.submit();

		searchResults.verifySearchResults();

		travellerInformation.enterName()
							.enterEmail()
							.enterTitle(Title.MR);

	}

}
