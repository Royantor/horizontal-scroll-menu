package com.example.mrroy.activites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.darwindeveloper.horizontalscrollmenulibrary.custom_views.HorizontalScrollMenuView;
import com.darwindeveloper.horizontalscrollmenulibrary.extras.MenuItem;
import com.example.mrroy.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import static com.example.mrroy.R.string.*;

public class HomeActivity extends AppCompatActivity  {


    HorizontalScrollMenuView menu;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        menu=(HorizontalScrollMenuView)findViewById(R.id.menu);
        textView=(TextView)findViewById(R.id.textview);

        initMenu();
/*
        BottomNavigationView bottomNavigationView = findViewById(R.id.headerBar);
        bottomNavigationView.setSelectedItemId(R.id.button1);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.button1:
                        return true;
                    case R.id.button2:
                        startActivity(new Intent(getApplicationContext(),
                                VarsityActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.button3:
                        startActivity(new Intent(getApplicationContext(),
                                InspirasationActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.button4:
                        startActivity(new Intent(getApplicationContext(),
                                CareerActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.button5:
                        startActivity(new Intent(getApplicationContext(),
                                VariousActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.button6:
                        startActivity(new Intent(getApplicationContext(),
                                LifeActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.button7:
                        startActivity(new Intent(getApplicationContext(),
                                SkillActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });*/

    }

    private void initMenu() {
        menu.addItem(getString(R.string.buttonone),R.drawable.text);
        menu.addItem(getString(R.string.bottontwo),R.drawable.text);
        menu.addItem(getString(R.string.bottonthree),R.drawable.text);
        menu.addItem(getString(R.string.bottontfour),R.drawable.text);
        menu.addItem(getString(R.string.bottonfive),R.drawable.text);
        menu.addItem(getString(R.string.bottonsix),R.drawable.text);
        menu.addItem(getString(R.string.bottonseven),R.drawable.text);

        menu.setOnHSMenuClickListener(new HorizontalScrollMenuView.OnHSMenuClickListener() {
            @Override
            public void onHSMClick(MenuItem menuItem, int position) {

                Toast.makeText(HomeActivity.this, "item " + position, Toast.LENGTH_SHORT).show();

                textView.setText(menuItem.getText());
            }
        });

    }


    private void layoutAnimation(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        LayoutAnimationController layoutAnimationController =
                AnimationUtils.loadLayoutAnimation(context, R.anim.layout_slide_right);
        recyclerView.setLayoutAnimation(layoutAnimationController);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }


}