
package com.marcosaruj.testapp;

import android.app.Application;
import org.acra.ACRA;
import org.acra.annotation.ReportsCrashes;

@ReportsCrashes(formKey = "YOUR_FORM_KEY")
public class TestAppApplication
    extends Application
{


    @Override
    public void onCreate() {
        ACRA.init(this);
        super.onCreate();
    }

}
