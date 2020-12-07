package com.ieti.googlemaps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ieti.googlemaps.model.Location;

public class AddLocationActivity extends AppCompatActivity {

    private TextView name;
    private TextView latitude;
    private TextView longitude;
    private TextView description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_added_location);
        this.name = (TextView) findViewById(R.id.new_loc_name);
        this.latitude = (TextView) findViewById(R.id.new_loc_latitude);
        this.longitude = (TextView) findViewById(R.id.new_loc_longitude);
        this.description = (TextView) findViewById(R.id.new_loc_desc);
    }

    public void onSaveButtonClicked(View view){

        Location currentLocation = new Location(this.name.getText().toString(), Long.parseLong(this.latitude.getText().toString()),
                Long.parseLong(this.longitude.getText().toString()), this.description.getText().toString());

        System.out.println(currentLocation);
        Intent intent=new Intent();
        intent.putExtra("Location", currentLocation);
        setResult(1,intent);
        finish();
    }

}
