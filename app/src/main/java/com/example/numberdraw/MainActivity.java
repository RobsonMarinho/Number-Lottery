package com.example.numberdraw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void raffleNumber(View view){
        //Faz a chamada e importações das propriedades
        TextView textResult = (TextView) findViewById(R.id.textResult);
        //Ao clicar no botão "play" insere número aleatorio de 0 à 10
        int X = new Random().nextInt(11);
        //Exibe o resultado
        textResult.setText("The selected number is: " + X);
    }


}
