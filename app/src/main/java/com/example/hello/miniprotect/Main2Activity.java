package com.example.hello.miniprotect;

import android.location.LocationListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity implements OnClickListener  {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=(Button)findViewById(R.id.clicko);
        b1.setOnClickListener(this);


    }
    GPSTracker gpsTracker = new GPSTracker(this);

    @Override
    public void onClick(View v) {

       if(v.getId()==R.id.clicko)
       {
           if (gpsTracker.getIsGPSTrackingEnabled())
           {
               double latitude;
               latitude=gpsTracker.getLatitude();

               Toast.makeText(this,""+latitude,Toast.LENGTH_SHORT).show();

               String stringLongitude = String.valueOf(gpsTracker.longitude);
               Toast.makeText(this,""+stringLongitude,Toast.LENGTH_SHORT).show();

               String country = gpsTracker.getCountryName(this);
               Toast.makeText(this,""+country,Toast.LENGTH_SHORT).show();

               String city = gpsTracker.getLocality(this);
               Toast.makeText(this,""+city,Toast.LENGTH_SHORT).show();



           }
           else
           {
               // can't get location
               // GPS or Network is not enabled
               // Ask user to enable GPS/network in settings
               gpsTracker.showSettingsAlert();
           }
       }
    }
}
