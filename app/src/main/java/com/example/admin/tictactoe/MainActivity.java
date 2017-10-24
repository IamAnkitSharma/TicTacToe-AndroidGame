package com.example.admin.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.lang.String;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView xwin = (TextView)findViewById(R.id.xwincount);
    TextView owin = (TextView)findViewById(R.id.player2name);

    int xwincount1=0;
    int owincount1=0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;

    int i,draw;
    TextView winner;
MediaPlayer winnersnd;
    MediaPlayer tic;
    MediaPlayer btnclick;

    TextView play1name;
    TextView play2name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
         b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);b7 = (Button)findViewById(R.id.b7);
        b8= (Button)findViewById(R.id.b8);
         b9 = (Button)findViewById(R.id.b9);


        Intent intent  = getIntent();
        String play1 = intent.getStringExtra("player1");
        String play2 = intent.getStringExtra("player2");

        play1name = (TextView)findViewById(R.id.player1name);
        play1name.setText(play1+"(X)");
        play1name.setTextColor(Color.RED);

        play2name = (TextView)findViewById(R.id.player2name);
        play2name.setText(play2+"(0)");

        MediaPlayer backgroundmus = MediaPlayer.create(this,R.raw.background);


         backgroundmus.start();



        btnclick =MediaPlayer.create(this, R.raw.button);
         tic =MediaPlayer.create(this, R.raw.tic);
         winnersnd =MediaPlayer.create(this, R.raw.winner);

        ImageView info = (ImageView)findViewById(R.id.info);
        info.animate().alpha(1).setDuration(4000);

        Button b1 = (Button)findViewById(R.id.b1);
        Button b2 = (Button)findViewById(R.id.b2);
        Button b3 = (Button)findViewById(R.id.b3);
        Button b4 = (Button)findViewById(R.id.b4);
        Button b5 = (Button)findViewById(R.id.b5);
        Button b6 = (Button)findViewById(R.id.b6);
        Button b7 = (Button)findViewById(R.id.b7);
        Button b8 = (Button)findViewById(R.id.b8);
        Button b9 = (Button)findViewById(R.id.b9);

        b1.animate().alpha(1).setDuration(4000);
        b2.animate().alpha(1).setDuration(4000);
        b3.animate().alpha(1).setDuration(4000);
        b4.animate().alpha(1).setDuration(4000);
        b5.animate().alpha(1).setDuration(4000);
        b6.animate().alpha(1).setDuration(4000);
        b7.animate().alpha(1).setDuration(4000);
        b8.animate().alpha(1).setDuration(4000);
        b9.animate().alpha(1).setDuration(4000);


        i=1;
        draw=1;
        winner = (TextView)findViewById(R.id.winner);
        winner.setText("");

    }
    public void setchance()
    {
        if(i%2==0)
        {
            play2name.setTextColor(Color.WHITE);
            play1name.setTextColor(Color.RED);
        }
        else
        {
            play2name.setTextColor(Color.RED);
            play1name.setTextColor(Color.WHITE);
        }
    }
    public void info(View v)

    {
        ImageView info = (ImageView)findViewById(R.id.info);
        info.animate().rotation(360).setDuration(500);
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
;    }

public void checkdraw()
{
    if (i==10&&draw==1)
    {
        winner.setText(" Match Drawn");
        MediaPlayer drawmus = MediaPlayer.create(this,R.raw.crowd);
    drawmus.start();

    }
}
    public void restart(View v)
    {
        play2name.setTextColor(Color.WHITE);
        play1name.setTextColor(Color.RED);
        i=1;
        winner.setText("");
        draw=1;
btnclick.start();
        winner.animate().alpha(1).setDuration(4000);


        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);


        b1.animate().alpha(1).setDuration(4000);
        b2.animate().alpha(1).setDuration(4000);
        b3.animate().alpha(1).setDuration(4000);
        b4.animate().alpha(1).setDuration(4000);
        b5.animate().alpha(1).setDuration(4000);
        b6.animate().alpha(1).setDuration(4000);
        b7.animate().alpha(1).setDuration(4000);
        b8.animate().alpha(1).setDuration(4000);
        b9.animate().alpha(1).setDuration(4000);

        b1.animate().rotation(-360).setDuration(1000);
        b2.animate().rotation(-360).setDuration(1000);
        b3.animate().rotation(-360).setDuration(1000);
        b4.animate().rotation(-360).setDuration(1000);
        b5.animate().rotation(-360).setDuration(1000);
        b6.animate().rotation(-360).setDuration(1000);
        b7.animate().rotation(-360).setDuration(1000);
        b8.animate().rotation(-360).setDuration(1000);
        b9.animate().rotation(-360).setDuration(1000);



        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        int i=1;


    }
    public void disable()
    {

        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);

    }
    public void xwins()
    {
        Toast.makeText(this," Player X Wins", Toast.LENGTH_SHORT).show();
        disable();
        TextView winner = (TextView)findViewById(R.id.winner);
winnersnd.start();
        winner.setText(play1name.getText()+" Wins");
        winner.animate().alpha(1).setDuration(4000);
        xwincount1++;
        xwin.setText(""+xwincount1);

    }
    public void owins()
    {
        Toast.makeText(this," Player 0 Wins", Toast.LENGTH_SHORT).show();
        disable();
        TextView winner = (TextView)findViewById(R.id.winner);
winnersnd.start();
        winner.setText(play2name.getText()+" Wins");
        winner.animate().alpha(1).setDuration(4000);
        owincount1++;
        owin.setText(""+owincount1);

    }

    public void checkwinner()
    {

        String s1=b1.getText().toString();
        String s2=b2.getText().toString();
        String s3=b3.getText().toString();
        String s4=b4.getText().toString();
        String s5=b5.getText().toString();
        String s6=b6.getText().toString();
        String s7=b7.getText().toString();
        String s8=b8.getText().toString();
        String s9=b9.getText().toString();




        if(s1=="x" && s2=="x" && s3=="x" || s4=="x" && s5=="x" && s6=="x" || s7=="x" && s8=="x" && s9=="x" || s1=="x" && s4=="x" && s7=="x"|| s2=="x" && s5=="x" && s8=="x"|| s3=="x" && s6=="x" && s9=="x" || s1=="x" && s5=="x" && s9=="x"|| s3=="x" && s5=="x" && s7=="x")
        {
            xwins();
            draw++;
            b1.animate().alpha(0).setDuration(4000);
            b2.animate().alpha(0).setDuration(4000);
            b3.animate().alpha(0).setDuration(4000);
            b4.animate().alpha(0).setDuration(4000);
            b5.animate().alpha(0).setDuration(4000);
            b6.animate().alpha(0).setDuration(4000);
            b7.animate().alpha(0).setDuration(4000);
            b8.animate().alpha(0).setDuration(4000);
            b9.animate().alpha(0).setDuration(4000);

        }
        else if(s1=="o" && s2=="o" && s3=="o" || s4=="o" && s5=="o" && s6=="o" || s7=="o" && s8=="o" && s9=="o" || s1=="o" && s4=="o" && s7=="o"|| s2=="o" && s5=="o" && s8=="o"|| s3=="o" && s6=="o" && s9=="o" || s1=="o" && s5=="o" && s9=="o"|| s3=="o" && s5=="o" && s7=="o")
        {
            owins();
            draw++;
            b1.animate().alpha(0).setDuration(4000);
            b2.animate().alpha(0).setDuration(4000);
            b3.animate().alpha(0).setDuration(4000);
            b4.animate().alpha(0).setDuration(4000);
            b5.animate().alpha(0).setDuration(4000);
            b6.animate().alpha(0).setDuration(4000);
            b7.animate().alpha(0).setDuration(4000);
            b8.animate().alpha(0).setDuration(4000);
            b9.animate().alpha(0).setDuration(4000);

        }


    }




    public void bt1(View v)
    {
        tic.start();

        setchance();

        b1.animate().rotation(360).setDuration(1000);

        i++;
        b1.setEnabled(false);
        if(i%2==0)
        {
            b1.setText("x");
        }
        else {
            b1.setText("o");
        }

        checkwinner();
        checkdraw();
    }
    public void bt2(View v)
    {
        tic.start();
        setchance();
  b2.animate().rotation(360).setDuration(1000);

        b2.setEnabled(false);

        i++;

        if(i%2==0)
        {
            b2.setText("x");
        }
        else {
            b2.setText("o");
        }

        checkwinner();
        checkdraw();
    }
    public void bt3(View v)
    {
        tic.start();
        setchance();

        Button b1 = (Button)findViewById(R.id.b1);
        Button b2 = (Button)findViewById(R.id.b2);
        Button b3 = (Button)findViewById(R.id.b3);
        Button b4 = (Button)findViewById(R.id.b4);
        Button b5 = (Button)findViewById(R.id.b5);
        Button b6 = (Button)findViewById(R.id.b6);
        Button b7 = (Button)findViewById(R.id.b7);
        Button b8 = (Button)findViewById(R.id.b8);
        Button b9 = (Button)findViewById(R.id.b9);

        b3.animate().rotation(360).setDuration(1000);


        i++;
        b3.setEnabled(false);

        if(i%2==0)
        {
            b3.setText("x");
        }
        else {
            b3.setText("o");
        }
        checkdraw();
        checkwinner();
    }
    public void bt4(View v)
    {
        tic.start();
        setchance();


        b4.animate().rotation(360).setDuration(1000);


        i++;
        b4.setEnabled(false);

        if(i%2==0)
        {
            b4.setText("x");
        }
        else {
            b4.setText("o");
        }

        checkdraw();
        checkwinner();
    }
    public void bt5(View v)
    {
        tic.start();
        setchance();



        b5.animate().rotation(360).setDuration(1000);

        i++;
        b5.setEnabled(false);

        if(i%2==0)
        {
            b5.setText("x");
        }
        else {
            b5.setText("o");
        }
        checkdraw();
        checkwinner();
    }
    public void bt6(View v)
    {
        tic.start();
        setchance();

        b6.animate().rotation(360).setDuration(1000);


        i++;
        b6.setEnabled(false);

        if(i%2==0)
        {
            b6.setText("x");
        }
        else {
            b6.setText("o");
        }

        checkdraw();
        checkwinner();
    }
    public void bt7(View v)
    {
        tic.start();
        setchance();

        i++;
        b7.setEnabled(false);

        b7.animate().rotation(360).setDuration(1000);


        if(i%2==0)
        {
            b7.setText("x");
        }
        else {
            b7.setText("o");
        }
        checkdraw();
        checkwinner();
    }
    public void bt8(View v)
    {
        tic.start();
        setchance();


        b8.animate().rotation(360).setDuration(1000);

        i++;
        b8.setEnabled(false);

        if(i%2==0)
        {
            b8.setText("x");
        }
        else {
            b8.setText("o");
        }
        checkdraw();
        checkwinner();
    }
    public void bt9(View v) {
        tic.start();
setchance();


        b9.animate().rotation(360).setDuration(2000);

        i++;

        b9.setEnabled(false);


        if (i % 2 == 0) {
            b9.setText("x");
        } else {
            b9.setText("o");
        }


        checkdraw();
        checkwinner();
    }

    }
