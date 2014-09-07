package com.example.agriculturalhelpline;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

@SuppressLint("NewApi")
public class AgricultureMapView extends Activity {
	GoogleMap agriculture;
    @SuppressLint("NewApi")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agriculture_map_view);
        agriculture = ((MapFragment) getFragmentManager().findFragmentById(R.id.agriculture_map)).getMap();
        agriculture.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        
        agriculture.setMyLocationEnabled(true);
       
      
        
        agriculture.addMarker(new MarkerOptions().position(new LatLng(22.8038187,89.531661))
        		.title("Khulna University").snippet("Region: 1")
        		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        
        agriculture.addMarker(new MarkerOptions().position(new LatLng(22.3683858,88.9901916))
        		.title("Satkhira").snippet("Region: 2")
        		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        
        agriculture.addMarker(new MarkerOptions().position(new LatLng(22.3683858,88.9901916))
        		.title("Jessore").snippet("Region: 3")
        		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        
        
        
    }}

