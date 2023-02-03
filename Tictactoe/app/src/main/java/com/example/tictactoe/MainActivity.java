package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Integer num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClicked(View v)
    {
        num+=1;
        Button button = (Button) v;
        button.setEnabled(false);

        if(num%2 != 0)
        {
            button.setText("X");
        }else
        {
            button.setText("O");

        }



       // Toast.makeText(this, ""+buttonId, Toast.LENGTH_SHORT).show();
        
        //return buttonId;
    }


}