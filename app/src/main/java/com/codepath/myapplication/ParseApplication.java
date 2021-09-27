package com.codepath.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("maZA0UeMnYTHkDiSF0rRBgVsNwuW0Uf38WbjH5CS")
                .clientKey("Lhu4FwhYeKz94GYYov6AG9CJAnmSOnTlAGiGCyAx")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
