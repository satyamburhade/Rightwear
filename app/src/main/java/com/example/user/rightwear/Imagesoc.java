package com.example.user.rightwear;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Imagesoc extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Bundle data;
    String name1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagesoc);
        data = getIntent().getExtras();
        name1 = data.getString("name");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        getMenuInflater().inflate(R.menu.imagesoc, menu);
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

        if (id == R.id.nav_gallery) {
            Intent j=new Intent(Imagesoc.this,Gallery.class);
            startActivity(j);

            // Handle the camera action
        }  else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void r1(View view){
        Intent u=new Intent(Imagesoc.this,Order.class);
        u.putExtra("name",name1);
        u.putExtra("design","Suit");
        startActivity(u);
    }

    public void r2(View view){
        Intent u=new Intent(Imagesoc.this,Order.class);
        u.putExtra("design","Blazzer");
        u.putExtra("name",name1);
        startActivity(u);
    }

    public void r3(View view){
        Intent u=new Intent(Imagesoc.this,Order.class);
        u.putExtra("design","Sherwani");
        u.putExtra("name",name1);
        startActivity(u);
    }

    public void r4(View view){
        Intent u=new Intent(Imagesoc.this,Order.class);
        u.putExtra("design","Jodhpuri");
        u.putExtra("name",name1);
        startActivity(u);
    }

    public void r5(View view){
        Intent u=new Intent(Imagesoc.this,Order.class);
        u.putExtra("design","Safari");
        u.putExtra("name",name1);
        startActivity(u);
    }

    public void r6(View view){
        Intent u=new Intent(Imagesoc.this,Order.class);
        u.putExtra("design","Pathani");
        u.putExtra("name",name1);
        startActivity(u);
    }

    public void r7(View view){
        Intent u=new Intent(Imagesoc.this,Order.class);
        u.putExtra("design","Modi Jacket");
        u.putExtra("name",name1);
        startActivity(u);
    }

    public void r8(View view){
        Intent u=new Intent(Imagesoc.this,Order.class);
        u.putExtra("design","Shirt");
        u.putExtra("name",name1);
        startActivity(u);
    }

    public void r9(View view){
        Intent u=new Intent(Imagesoc.this,Order.class);
        u.putExtra("design","Pant");
        u.putExtra("name",name1);
        startActivity(u);
    }
}
