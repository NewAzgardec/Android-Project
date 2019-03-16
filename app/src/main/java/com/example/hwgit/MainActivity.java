package com.example.hwgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

	Toast toast = Toast.makeText(getApplicationContext(), "Это самый важный текст в вашей жизни", Toast.LENGTH_SHORT);
	Toast secondToast = Toast.makeText(getApplicationContext(), "Правда важный", Toast.LENGTH_SHORT);
	toast.show();
	secondToast.show();


    }
}
