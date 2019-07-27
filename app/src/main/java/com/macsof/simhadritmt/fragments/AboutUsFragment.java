package com.macsof.simhadritmt.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.macsof.simhadritmt.R;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutUsFragment extends Fragment {

    @BindView(R.id.img_menu)
    ImageView imgMenu;

    @BindView(R.id.nav_view)
    NavigationView navigationView;

    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    private static AboutUsFragment mWebView;
    WebView webView;

    /*@BindView(R.id.web_view)
    WebView webView;
*/
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about_us, container, false);
        ImageView imgMenu = (ImageView)view.findViewById(R.id.img_menu);
//        final NavigationView navigationView = (NavigationView)view.findViewById(R.id.nav_view);
//        final DrawerLayout drawerLayout = (DrawerLayout) view.findViewById(R.id.drawer_layout);
//        imgMenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //navigationView.setVisibility(View.VISIBLE);
//                drawerLayout.openDrawer(Gravity.START);
//            }
//        });

       WebView webView = (WebView)view.findViewById(R.id.web_view);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.simhadritmt.com/admin/about.html ");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
    public static boolean canGoBack(){
        return mWebView.canGoBack();
    }

    public static void goBack(){
        mWebView.goBack();
    }
}
