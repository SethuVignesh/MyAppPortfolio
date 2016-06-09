package com.newtra.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button mBtnPopularMovies,mBtnStockHawk,mBtnBuilItBigger,mBtnMakeYourAppMaterial,mBtnGoUbiquitous,mBtnCapstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnPopularMovies=(Button) findViewById(R.id.buttonPopularMovies);
        mBtnStockHawk=(Button) findViewById(R.id.buttonStockHawk);
        mBtnBuilItBigger=(Button) findViewById(R.id.buttonBuildItBigger);
        mBtnMakeYourAppMaterial=(Button) findViewById(R.id.buttonMakeYourAppMaterial);
        mBtnGoUbiquitous=(Button) findViewById(R.id.buttonGoUbiquitous);
        mBtnCapstone=(Button) findViewById(R.id.buttonCapstone);
        mBtnPopularMovies.setOnClickListener(this);
        mBtnStockHawk.setOnClickListener(this);
        mBtnBuilItBigger.setOnClickListener(this);
        mBtnMakeYourAppMaterial.setOnClickListener(this);
        mBtnGoUbiquitous.setOnClickListener(this);
        mBtnCapstone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.buttonPopularMovies:
                Toast.makeText(MainActivity.this,"This button will launch my popular movies app",Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonStockHawk:
                Toast.makeText(MainActivity.this,"This button will launch my stock hawk app",Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonBuildItBigger:
                Toast.makeText(MainActivity.this,"This button will launch my build it bigger app",Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonMakeYourAppMaterial:
                Toast.makeText(MainActivity.this,"This button will launch my make your app material app",Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonGoUbiquitous:
                Toast.makeText(MainActivity.this,"This button will launch my Go ubiquitous app",Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonCapstone:
                Toast.makeText(MainActivity.this,"This button will launch my capstone app",Toast.LENGTH_LONG).show();
                break;


        }
    }
}
