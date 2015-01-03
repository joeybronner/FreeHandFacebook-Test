package fr.freehandfacebook.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

import com.robotium.solo.Solo;

import fr.freehandfacebook.InformationsActivity;
import fr.freehandfacebook.SettingsActivity;

@SuppressWarnings("deprecation")

public class SettingsActivityInformationButton extends ActivityInstrumentationTestCase2<SettingsActivity> {

	private Solo solo;
	
	public SettingsActivityInformationButton() {
		super("fr.freehandfacebook", SettingsActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	public void testClickButtonInformation() throws InterruptedException {
		solo.waitForActivity(SettingsActivity.class);
		solo.assertCurrentActivity("L'activité est bien SettingsActivity", SettingsActivity.class);

		solo.clickOnView((Button) solo.getView("buttonInfos"));
		solo.waitForActivity(InformationsActivity.class);
		solo.assertCurrentActivity("L'activité est bien SettingsActivity", InformationsActivity.class);
		solo.goBack();
	}

}
