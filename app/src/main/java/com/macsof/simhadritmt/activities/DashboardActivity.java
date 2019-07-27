package com.macsof.simhadritmt.activities;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import com.macsof.simhadritmt.R;
import com.macsof.simhadritmt.fragments.AboutUsFragment;
import com.macsof.simhadritmt.fragments.DealersFragment;
import com.macsof.simhadritmt.fragments.ProductsFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DashboardActivity extends AppCompatActivity {
    @BindView(R.id.about_us)
    ImageView imgAboutUs;

    @BindView(R.id.products)
    ImageView imgProducts;

    @BindView(R.id.order_products)
    ImageView imgOrderProducts;

    @BindView(R.id.request_quote)
    ImageView imgRequestQuote;

    @BindView(R.id.dealers)
    ImageView imgDealers;

    @BindView(R.id.price_list)
    ImageView imgPriceList;

    /*@BindView(R.id.img_menu)
    ImageView imgMenu;

    @BindView(R.id.nav_view)
    NavigationView navigationView;

    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;*/




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_dashboard);
        ButterKnife.bind(this);

        /*imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.START);
            }
        });*/

        imgAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this , NavigationActivity.class);
                i.putExtra("path" , 1);
                startActivity(i);
                /*FragmentManager fragmentManager = getSupportFragmentManager();
                AboutUsFragment fragment = new AboutUsFragment();
                fragmentManager.beginTransaction().replace(R.id.frame_layout, fragment).commit();*/
            }
        });
        imgProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this , NavigationActivity.class);
                i.putExtra("path" , 2);
                startActivity(i);
            }
        });
        imgRequestQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this , NavigationActivity.class);
                i.putExtra("path" , 3);
                startActivity(i);
            }
        });

        imgOrderProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this , NavigationActivity.class);
                i.putExtra("path" , 4);
                startActivity(i);
            }
        });
        imgDealers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(DashboardActivity.this , NavigationActivity.class);
                i.putExtra("path" , 5);
                startActivity(i);
            }
        });
        imgPriceList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this , NavigationActivity.class);
                i.putExtra("path" , 6);
                startActivity(i);
            }
        });


    }
}
