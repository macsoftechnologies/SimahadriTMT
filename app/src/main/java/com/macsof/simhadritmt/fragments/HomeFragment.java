package com.macsof.simhadritmt.fragments;


import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.macsof.simhadritmt.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    @BindView(R.id.about_us)
    ImageView llAboutUs;

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

    @BindView(R.id.nav_view)
    NavigationView navigationView;

    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @BindView(R.id.img_menu)
    ImageView imgMenu;

    public ActionBarDrawerToggle actionBarDrawerToggle;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home , container , false);
        ButterKnife.bind(view);
        ImageView imgAboutus = (ImageView)view.findViewById(R.id.about_us);
        ImageView imgProducts = (ImageView)view.findViewById(R.id.products);
        ImageView imgOrderProducts = (ImageView)view.findViewById(R.id.order_products);
        ImageView imgDealers = (ImageView)view.findViewById(R.id.dealers);
        ImageView imgPriceList = (ImageView)view.findViewById(R.id.price_list);
        ImageView imgRequestQuote = (ImageView)view.findViewById(R.id.price_list);

        //drawerLayout.setVisibility(View.GONE);
        //navigationView.setVisibility(View.GONE);
        imgAboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout , new AboutUsFragment());
                fragmentTransaction.commit();
            }
        });
        imgProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout , new ProductsFragment());
                fragmentTransaction.commit();
            }
        });
        imgOrderProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout , new OrderProductsFragment());
                fragmentTransaction.commit();
            }
        });
        imgDealers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout , new DealersFragment());
                fragmentTransaction.commit();
            }
        });
        imgPriceList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout , new PriceListFragment());
                fragmentTransaction.commit();
            }
        });

        imgRequestQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout , new RequestQuoteFragment());
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}