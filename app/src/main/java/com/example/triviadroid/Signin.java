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
 
public class Signin extends AppCompatActivity {
    private static final int BUFFER_SIZE = 512;
    //have username field and password field and submit button
    //receive token and store it
    //if login successful, send to menu activity
    //if failure, give error on screen
    public static final String SERVER_ADDRESS = "ec2-3-141-26-195.us-east-2.compute.amazonaws.com";
    public static final int SERVER_PORT = 6789;
    public static String NumStr = "";
    StringBuilder stringBuilder = new StringBuilder(100);

    protected void onCreate(Bundle savedInstanceState) throws IOException {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InetAddress ip = InetAddress.getByName(SERVER_ADDRESS);
        DatagramSocket Socket1 = new DatagramSocket();
        Socket1.connect(ip, SERVER_PORT);
        //get username and password info

        EditText username = findViewById(R.id.usernamebox);
        EditText password = findViewById(R.id.passwordbox);
        String usernameStr = username.getText().toString();
        String passwordStr = password.getText().toString();
        // usernameStr = text box
        // passwordStr = text box
        public void sendMessage(View view){
            // Do something in response to button click
            stringBuilder.append("type=sign_in&username=")// combine username and password, build signinString
            stringBuilder.append(usernameStr);
            stringBuilder.append("&password=");
            stringBuilder.append(passwordStr);
            String signinString = stringBuilder.toString();
            byte[] signinMessage = signinString.getBytes();
            int signinMsg_length = signinString.length();
            // signinString = type=sign_in&username=kellen&password=pass
            DatagramPacket signinPacket = new DatagramPacket(signinMessage, signinMsg_length, ip, SERVER_PORT);

            byte[] packetIncoming = new byte[BUFFER_SIZE];
            DatagramPacket packetReceive = new DatagramPacket(packetIncoming, packetIncoming.length);
            Socket1.receive(packetReceive);
            System.out.println("Message Recieved :");
            String ReceiveStr = new String(packetReceive.getData(), packetReceive.getOffset(), packetReceive.getLength());
            System.out.println(ReceiveStr);
            String[] token1 = ReceiveStr.split("type=");
            String[] token2 = ReceiveStr.split("&");
            String[] token3 = ReceiveStr.split("username=");
            String[] token4 = ReceiveStr.split("password=");
            for (String parseStr1 : token1)
                for (String parseStr2 : token2)
                    for (String parseStr3 : token3)
                        for (String parseStr4 : token4)
                            NumStr = parseStr4.replaceAll("[^\\d.]", ""); //stores token

        }




        private Activity getView() {
        }

        private void setContentView(int activity_main) {
        }


    }
