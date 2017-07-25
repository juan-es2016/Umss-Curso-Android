package com.example.battl.appcomic.Activities;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.battl.appcomic.Adapters.ViewPagerAdapter;
import com.example.battl.appcomic.Fragments.FondoFragment;
import com.example.battl.appcomic.Fragments.HeroesFragmet;
import com.example.battl.appcomic.Models.Heroe;
import com.example.battl.appcomic.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TabLayout tabLayout;
    private int[] tabIcons = {R.drawable.ic_menu_send, R.drawable.ic_menu_camera};
    HeroesFragmet heroesFragmet;
    FondoFragment fondoFragment;

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        cargarReferencias();
        tab();
    }

    public void cargarReferencias(){
        heroesFragmet = new HeroesFragmet();
        fondoFragment = new FondoFragment();
    }

    @Override
    public void onBackPressed() {
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_marvel) {
            // Handle the camera action
        } else if (id == R.id.nav_personajes) {

        } else if (id == R.id.nav_comics) {

        } else if (id == R.id.nav_vs) {
            Intent intent = new Intent(MainActivity.this, VsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_perfil) {

        } else if (id == R.id.nav_salir) {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public List<Heroe> createList() {
        Heroe ironMan = new Heroe("IronMan", "Armadura Avanzada", getResources().getDrawable(R.drawable.iron_man));
        Heroe batman = new Heroe("batman", "Entrenamiento Avanzado", getResources().getDrawable(R.drawable.batman));
        Heroe superman = new Heroe("superman", "Super Fuerza", getResources().getDrawable(R.drawable.superman));
        Heroe capitan = new Heroe("capitan", "Mejora genetica", getResources().getDrawable(R.drawable.capitan_america));
        Heroe joker = new Heroe("joker", "ninguno", getResources().getDrawable(R.drawable.joker));

        List<Heroe> heroeList = new ArrayList<>();
        heroeList.add(ironMan);
        heroeList.add(batman);
        heroeList.add(superman);
        heroeList.add(capitan);
        heroeList.add(joker);
        heroeList.add(ironMan);
        heroeList.add(batman);
        heroeList.add(superman);
        heroeList.add(capitan);
        heroeList.add(joker);
        heroeList.add(ironMan);
        heroeList.add(batman);
        heroeList.add(superman);
        heroeList.add(joker);
        return heroeList;
    }

    public void tab(){
        setupViewPager();
        tabLayout.setupWithViewPager(viewPager);
        //setupTabIcons();
        tabLayout.setTabTextColors(ColorStateList.valueOf(getResources().getColor(R.color.blanco)));
    }

    public void setupViewPager(){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(heroesFragmet, "Menu");
        adapter.addFragment(fondoFragment, "FONDO");
        viewPager.setAdapter(adapter);
    }

    public void setupTabIcons(){
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);

    }
}
