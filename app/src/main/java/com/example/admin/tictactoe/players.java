package com.example.admin.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class players extends AppCompatActivity {
    EditText player1;
    EditText player2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
        player1 = (EditText)findViewById(R.id.player2name);
        player1.requestFocus();
         player2= (EditText)findViewById(R.id.player2);
    }
    public void go(View view)
    {
        String pl1 = player1.getText().toString();
        String pl2 = player2.getText().toString();
        if(pl1.length()>0&& pl2.length()>0 )
        {

                Toast.makeText(this," Enter different names of 2 players", Toast.LENGTH_SHORT);
                  Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("player1", pl1);
                intent.putExtra("player2", pl2);

                startActivity(intent);

        }

    }

}
