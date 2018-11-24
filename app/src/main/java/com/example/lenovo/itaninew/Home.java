package com.example.lenovo.itaninew;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.lenovo.itaninew.KUR.FormKUR;
import com.example.lenovo.itaninew.KUR.Persyaratan1;
import com.example.lenovo.itaninew.Komoditas.Komoditas;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_home);

        CardView cv_kur = (CardView) findViewById(R.id.navigation_kur);
        CardView cv_komoditas = (CardView) findViewById(R.id.navigation_komoditas);


        cv_kur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_kur();
            }
        });

        cv_komoditas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_komoditas();
            }
        });

        final ImageView pengaturan = (ImageView) findViewById(R.id.setting);
        pengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creating the instance of PopupMenu
                PopupMenu popup = new PopupMenu(Home.this, pengaturan);
                //Inflating the Popup using xml file
                popup.getMenuInflater().inflate(R.menu.navigation, popup.getMenu());
                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getTitle().equals("Edit Profil")) {
                            Toast.makeText(Home.this, "You Clicked : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                            profil();
                        }else {
                            Toast.makeText(Home.this, "You Clicked : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                            keluar();
                        }
                        return true;
                    }
                });
                popup.show();//showing popup menu
            }
        });//closing the setOnClickListener method
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.navigation, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.profil){
            Toast.makeText(getApplicationContext(),"You Click "+item.getTitle(),Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == R.id.keluar) {
            Toast.makeText(getApplicationContext(),"You Click "+item.getTitle(),Toast.LENGTH_LONG).show();
        }
        return true;
    }

  public void activity_kur() {
      Intent intent = new Intent(this, Persyaratan1.class);
      startActivity(intent);
  }

    public void activity_komoditas() {
        Intent intent = new Intent(this, Komoditas.class);
        startActivity(intent);
    }

    public void profil() {
        Intent intent1 = new Intent(this, EditProfil.class);
        startActivity(intent1);
    }

    public void keluar() {
        Intent intent2 = new Intent(this, Login.class);
        startActivity(intent2);
    }


}
