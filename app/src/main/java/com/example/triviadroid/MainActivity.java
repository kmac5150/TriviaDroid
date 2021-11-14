package com.example.triviadroid;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.io.*;
import java.net.*;
import android.widget.EditText;
import android.app.*;
import android.widget.TextView;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.view.View;

public class MainActivity {



    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState){
            setContentView(R.layout.activity_main);
        }


        public void signIn(View sender) {
            toggleButtons(false);
            connect();
            String username = ((EditText) findViewById(R.id.usernamebox)).getText().toString();
            String password = ((EditText) findViewById(R.id.passwordbox)).getText().toString();
            MainClient.signingIn(username, password);
            Intent intent = new Intent(this, TriviaMenuActivity.class);
            startActivity(intent);

        }


    }

}
