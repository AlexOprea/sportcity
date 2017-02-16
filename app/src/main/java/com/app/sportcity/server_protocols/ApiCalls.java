package com.app.sportcity.server_protocols;

import com.app.sportcity.objects.ActiveMenuList;
import com.app.sportcity.objects.Category;
import com.app.sportcity.objects.Media;
import com.app.sportcity.objects.Menu;
import com.app.sportcity.objects.Post;
import com.app.sportcity.utils.CommonMethods;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by bugatti on 22/11/16.
 */

public interface ApiCalls {
//
//    @FormUrlEncoded
//    @POST("UserRegistration")
//    Call<>

//    @GET("menu_category")
//    Call<CategoryNewsListing> getMenuCategories();
//
//
//    @GET("home")
//    Call<HomeResponse> getHomeResponse();
//
//    @GET("category/{id}")
//    Call<MenuCategory> getCategoriesNewsById(@Path("id") long id);

    @GET(CommonMethods.UrlHelper.DATA+"categories?parent=0&per_page=15")
    Call<List<Category>> getCategories();

    @GET(CommonMethods.UrlHelper.DATA+"posts")
    Call<List<Post>> getPosts(@Query("categories") int id);

    @GET(CommonMethods.UrlHelper.MENU+"menus")
    Call<List<Menu>> getMenus();

    @GET(CommonMethods.UrlHelper.MENU+"menus/{id}")
    Call<ActiveMenuList> getActiveMenuList(@Path("id") int id);

    @GET(CommonMethods.UrlHelper.DATA+"media/{id}")
    Call<Media> getMedia(@Path("id") int id);

}
