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
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;


    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new Profilefragment());


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


    /** when the user clicks on the bottom navigation bar, the fragment according to that is loaded up
     * and then inflated with the local method loadFragment();
     * all the fragment related code is in HomeActivity - home - search- cart and user
     *
     *
     * **/



/* case R.id.action_home:
                fragment = new HomeFragment();
                break;
            case R.id.action_search:
                fragment = new Profilefragment();
                break;

 */
