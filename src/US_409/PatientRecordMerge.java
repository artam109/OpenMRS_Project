package US_409;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PatientRecordMerge extends BaseDriver {
    String usernameStr = "admin";
    String passwordStr = "Admin123";

    @Test()
    public void patientRecordMerge() {
        // Login procedure
        ome.mySendKeys(ome.usernamePlc, usernameStr);
        ome.mySendKeys(ome.passwordPlc, passwordStr);
        ome.myClick(ome.inpatientWard);
        ome.myClick(ome.loginButton);

        // Click "Register a Patient" button
        ome.myClick(ome.registerAPatient);

        // Patient full name info
        ome.mySendKeys(ome.givenNamePlc, "Roshaunda");
        ome.mySendKeys(ome.middleNamePlc, "Kenyanna");
        ome.mySendKeys(ome.familyNamePlc, "Petitt");

        ome.myClick(ome.nextButton);

        // Select Gender
        Select genderSelect = new Select(ome.genderSelect);
        genderSelect.selectByIndex(1);

        // Enter birthdate information
        ome.mySendKeys(ome.birthDay, "05");
        Select monthSelect = new Select(ome.birthMonthSelect);
        monthSelect.selectByIndex(8);
        ome.mySendKeys(ome.birthYear, "1998");

        ome.myClick(ome.nextButton);

        // Patient address information
        ome.mySendKeys(ome.address1, "Readers St 2423, Andersonville, Malawi, 326145");
        ome.mySendKeys(ome.cityVillage, "Nenana");
        ome.mySendKeys(ome.stateProvince, "Gig Harbor");
        ome.mySendKeys(ome.country, "France");
        ome.mySendKeys(ome.postalCode, "73438");

        ome.myClick(ome.nextButton);

    }


}
