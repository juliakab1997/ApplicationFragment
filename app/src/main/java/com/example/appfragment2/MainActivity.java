package com.example.appfragment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showText(String topImageText, String bottomImageText) {
        BottomFragment bottomFragment
                = (BottomFragment) this.getSupportFragmentManager()
                .findFragmentById(R.id.textView_fullName);
        bottomFragment.showText(topImageText, bottomImageText);
    }
}