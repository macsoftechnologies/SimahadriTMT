package com.macsof.simhadritmt.activities;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.macsof.simhadritmt.R;
import com.macsof.simhadritmt.fragments.AboutUsFragment;
import com.macsof.simhadritmt.fragments.DealersFragment;
import com.macsof.simhadritmt.fragments.HomeFragment;
import com.macsof.simhadritmt.fragments.OrderProductsFragment;
import com.macsof.simhadritmt.fragments.PriceListFragment;
import com.macsof.simhadritmt.fragments.ProductsFragment;
import com.macsof.simhadritmt.fragments.RequestQuoteFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NavigationActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {



    @BindView(R.id.nav_view)
    NavigationView navigationView;

    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @BindView(R.id.img_menu1)
    ImageView imgMenu;

    public ActionBarDrawerToggle actionBarDrawerToggle;
    private WebView webFragment;
    int path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        ButterKnife.bind(this);

        if (getIntent() != null) {
            path = getIntent().getIntExtra("path",0 );
            if(path == 1){
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new AboutUsFragment()).commit();
            }else  if(path == 2){
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new ProductsFragment()).commit();
            }else  if(path == 3){
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new RequestQuoteFragment()).commit();
            }else  if(path == 4){
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new OrderProductsFragment()).commit();
            }else  if(path == 5){
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new DealersFragment()).commit();
            }else  if(path == 6){
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new PriceListFragment()).commit();
            }
        }

        imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigationView.setVisibility(View.VISIBLE);
                drawerLayout.openDrawer(Gravity.START);

            }
        });

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        if (savedInstanceState == null) {

        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_home:
               // getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new HomeFragment()).commit();
                Intent intent = new Intent(NavigationActivity.this, DashboardActivity.class);
                startActivity(intent);
                break;

            case R.id.nav_about_us:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new AboutUsFragment()).commit();

                break;

            case R.id.nav_products:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new ProductsFragment()).commit();

                break;

            case R.id.nav_request_quote:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new RequestQuoteFragment()).commit();

                break;

            case R.id.nav_order_products:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new OrderProductsFragment()).commit();

                break;

           case R.id.navdealers:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout , new DealersFragment()).commit();

                break;

            case R.id.nav_price:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout , new PriceListFragment()).commit();

                break;


        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;

    }



    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START) && (webFragment.canGoBack())) {
            drawerLayout.closeDrawer(GravityCompat.START);
            webFragment.goBack();
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    /*@Override
    public void onBackPressed() {
        if(webFragment.canGoBack()){
            webFragment.goBack();
        }else{
            super.onBackPressed();
        }

    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.drawer_menu, menu);

        MenuCompat.setGroupDividerEnabled(menu, true);

        return true;
    }
}
