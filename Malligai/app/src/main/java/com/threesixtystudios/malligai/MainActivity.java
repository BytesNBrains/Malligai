package com.threesixtystudios.malligai;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;

    Button mupdate,mlogout;
    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigation = findViewById(R.id.bottomNavigationView);



    }


    private boolean loadFragment(Fragment fragment) {
        //swtichfragment
        if (fragment != null) {
            getSupportFragmentManager().
                    beginTransaction().
                    replace(R.id.fragment_container, fragment).
                    commit();
            return true;

        }
        return false;

    }


}




/* case R.id.action_home:
                fragment = new HomeFragment();
                break;
            case R.id.action_search:
                fragment = new Profilefragment();
                break;





                ///hhvaschvshdc


                  loadFragment(new Profilefragment());

        setContentView(R.layout.fragment_profile);

        mupdate = (Button) findViewById(R.id.update);
        mlogout = (Button) findViewById(R.id.logout);

        mupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , details.class);
                startActivity(intent);
            }
        });

 */
