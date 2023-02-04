package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Integer num = 0,playerX = 0, playerO = 0;
    Button[] buttons;
    Button btn00,btn01,btn02,btn10,btn11,btn12,btn20,btn21,btn22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Tic tac ");
    }
    public void buttonClicked(View v)
    {
        num+=1;

        Button button = (Button) v;
        button.setEnabled(false);
        String player = "X";

        if(num%2 != 0)
        {
            button.setText(player);
            playerX++;
        }else
        {
            player = "O";
            button.setText(player);
            playerO++;
        }
        check(player);

    }
    public void check(String player)
    {
        //winning combinations  {00,01,02},{00,10,20},{10,11,12},{20,21,22}
         btn00 = (Button) findViewById(R.id.btn00);
         btn01 = (Button) findViewById(R.id.btn01);
         btn02 = (Button) findViewById(R.id.btn02);

         btn10 = (Button) findViewById(R.id.btn10);
         btn11 = (Button) findViewById(R.id.btn11);
         btn12 = (Button) findViewById(R.id.btn12);

         btn20 = (Button) findViewById(R.id.btn20);
         btn21 = (Button) findViewById(R.id.btn21);
         btn22 = (Button) findViewById(R.id.btn22);
        buttons = new Button[]{btn00,btn01,btn02,btn10,btn11,btn12,btn20,btn21,btn22};

        if((btn00.getText().equals(player) && btn01.getText().equals(player) && btn02.getText().equals(player)) ||
                (btn10.getText().equals(player) && btn11.getText().equals(player) && btn12.getText().equals(player)) ||
                (btn20.getText().equals(player) && btn21.getText().equals(player) && btn22.getText().equals(player)) ||

                (btn00.getText().equals(player) && btn11.getText().equals(player) && btn22.getText().equals(player)) ||
                (btn02.getText().equals(player) && btn11.getText().equals(player) && btn20.getText().equals(player)) ||

                (btn00.getText().equals(player) && btn10.getText().equals(player) && btn20.getText().equals(player)) ||
                (btn01.getText().equals(player) && btn11.getText().equals(player) && btn21.getText().equals(player)) ||
                (btn02.getText().equals(player) && btn12.getText().equals(player) && btn22.getText().equals(player))

        )
        {
            Toast.makeText(this, "Player{ " +player+" } won this round", Toast.LENGTH_SHORT).show();
            for(int i = 0; i < buttons.length; i++)
            {
                buttons[i].setEnabled(false);
            }
        }

    }
    public void replay(View v)
    {

        for(int i = 0; i < buttons.length; i++)
        {
            buttons[i].setText("");
            buttons[i].setEnabled(true);
        }
        num =0;
    }
// method to execute after the player has played 3 times


}