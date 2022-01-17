package com.example.farmers_app_nic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VolunteerHomePage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volunteer_homepage);

        Button existing_farmer_btn, sign_out_btn, existing_trader_btn, new_trader_btn;
        existing_farmer_btn = findViewById(R.id.existing_farmer_button);
        sign_out_btn = findViewById(R.id.sign_out_button);
        existing_trader_btn = findViewById(R.id.existing_trader_btn);
        new_trader_btn = findViewById(R.id.new_trader_button);

        //existing farmer
        existing_farmer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), view_farmer_list.class);
                startActivity(intent);
            }
        });
        //new trader
        new_trader_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), TraderDetails.class);
                startActivity(intent);
            }
        });
        //existing trader
        existing_trader_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), view_trader_details.class);
                startActivity(intent);
            }
        });
        //sign out
        sign_out_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
