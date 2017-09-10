package com.gunghi.tgwing.hackerton9xd;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import com.gunghi.tgwing.hackerton9xd.fragment.MapFragment;
import com.gunghi.tgwing.hackerton9xd.fragment.RankingFragment;
import com.gunghi.tgwing.hackerton9xd.fragment.SwipeCafeFragment;
import com.gunghi.tgwing.hackerton9xd.util.LocationTracker;

import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions;

public class MainActivity extends AppCompatActivity {

    private Fragment currentSelectedFragment;
    private static final int RC_LOCATION_REQUEST = 8001;


    LocationManager locationManager;
    private Location currentLocation;

    private LocationListener mLocationListner = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {

            LocationTracker.setCurLoc(location);

        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestLocationPermission();
        initFragment();

    }

    private void initFragment() {

        MapFragment mapFragment = new MapFragment();
        SwipeCafeFragment swipeCafeFragment = new SwipeCafeFragment();
        RankingFragment rankingFragment = new RankingFragment();

        currentSelectedFragment = swipeCafeFragment;

        getSupportFragmentManager().beginTransaction().replace(R.id.container,currentSelectedFragment).commit();
    }

    private void requestGetMyLocation() {

        locationManager = (LocationManager) getApplicationContext().getSystemService(Context.LOCATION_SERVICE);
        if (locationManager != null) {
            boolean isNetworkEnabled = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
            boolean isGPSEnaabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);


            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, RC_LOCATION_REQUEST);
            } else {
                if (isGPSEnaabled) { // gps 가 켜져있다면
                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 1, mLocationListner);
                    currentLocation = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                }
                if(isNetworkEnabled) {
                    locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000, 1, mLocationListner);
                    if (currentLocation == null) {
                        currentLocation = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                    }
                }

                if (currentLocation != null) {
                    LocationTracker.setCurLoc(currentLocation);
                }

                if(!isGPSEnaabled && !isNetworkEnabled ) {
                    //show dialog to allow user to enable location settings
                    AlertDialog.Builder dialog = new AlertDialog.Builder(this);
                    dialog.setTitle("위치 정보 설정 ");
                    dialog.setMessage("위치 정보 권한을 활성화 시켜주세요.");

                    dialog.setPositiveButton("설정", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            startActivityForResult(new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS), 0);
                        }
                    });

                    dialog.setNegativeButton("취소", new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            //nothing to do
                        }
                    });
                    dialog.show();
                }
            }
        }
    }

    @AfterPermissionGranted(RC_LOCATION_REQUEST)
    private void requestLocationPermission() {
        if(EasyPermissions.hasPermissions(this, android.Manifest.permission.ACCESS_FINE_LOCATION)) {
            // TODO: 2017-06-01 위치 트랙킹
            requestGetMyLocation();

        } else {
            EasyPermissions.requestPermissions(this, "정확한 정보 제공을 위하여 위치 정보가 필요합니다.",
                    RC_LOCATION_REQUEST, android.Manifest.permission.ACCESS_FINE_LOCATION);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 0) {
            requestGetMyLocation();
        }
    }

}
