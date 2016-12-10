package com.app.sportcity.utils;

import android.app.Activity;
import android.content.Intent;

import com.app.sportcity.activities.CategoryNewsList;
import com.app.sportcity.activities.SplashScreen;
import com.app.sportcity.activities.BaseActivity;
import com.app.sportcity.activities.ForgotPasswordActivity;
import com.app.sportcity.activities.LoginActivity;
import com.app.sportcity.activities.RegisterActivity;
import com.app.sportcity.objects.Category;

/**
 * Created by Robz on 6/29/2016.
 */
public class Opener {
    static Intent i;


    public static void LoginActivity(Activity activity) {
        startActivity(activity, LoginActivity.class);
    }

    public static void SplashActivity(Activity activity) {
        startActivity(activity, SplashScreen.class);
    }

    public static void BaseActivity(Activity activity) {
        startActivity(activity, BaseActivity.class);
    }

    /**
     * Starts the given activity
     *
     * @param activity      : instance of the current activity
     * @param activityClass : Activity to be opened
     */
    private static void startActivity(Activity activity, Class<?> activityClass) {
        i = new Intent(activity, activityClass);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        activity.startActivity(i);
    }

    public static void RegisterActivity(Activity activity) {
        startActivity(activity, RegisterActivity.class);
    }

    public static void ForgotPwdActivity(Activity activity) {
        startActivity(activity, ForgotPasswordActivity.class);
    }

    public static void CategoryNewsListing(Activity activity, Category category) {
        i = new Intent(activity, CategoryNewsList.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.putExtra("category", category);
        activity.startActivity(i);
    }
}