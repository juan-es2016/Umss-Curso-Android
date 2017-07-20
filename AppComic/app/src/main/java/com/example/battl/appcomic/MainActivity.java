package com.example.battl.appcomic;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.battl.appcomic.models.Heroe;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.recycler_heroes)
    RecyclerView recyclerHeroes;
    AdapterHeroe adapterHeroe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        cargarReferencias();
    }

    public void cargarReferencias(){
        recyclerHeroes.addItemDecoration(new MarginDecorator(MainActivity.this));
        recyclerHeroes.setHasFixedSize(true);
        adapterHeroe = new AdapterHeroe(createList());
        recyclerHeroes.setAdapter(adapterHeroe);
        recyclerHeroes.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        recyclerHeroes.getAdapter().notifyDataSetChanged();
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

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

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
}
