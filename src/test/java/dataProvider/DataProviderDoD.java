package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.List;

public class DataProviderDoD {

    @DataProvider(name = "credentials")
    public Object[][] getCredentials() {
        return new Object[][]{
                // Customer_ID, Status, Default_Trigger, Start_Date_Probation_Period, End_Date_Probation_Period, Day_PAst_Due,Due_Date_Forborne, Start_Date_Default,Due_Date, Sum_Obligo_Default, Sum_Arrear_Default, Status_Change_Date,Status_Change_Date_Ultimo, Start_Date_Probation_Forborne, End_Date_Probation_Forborne
                {"student", "Password123"},
                {"student", "Password123"},
                {"Student", "Password123"}
        };
    }






}
