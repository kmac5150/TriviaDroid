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
public class Protocol {
    enum Registration{
        Name,
        Registered,
    }

    enum GameStatus{
        Name,
        Starting,
        InProgress,
    }
    enum QuestionAction{
        NextQuestion,
        GameOver,
    }
public static double updateTime(Activity a, Integer Seconds, Instant start, MainClient.GameStatus status){
        int sec = MainClient.secondsRemaining(Seconds,start)

                TextView t = a.findViewById(R.id.textView4);
        T.setText(millis + "seconds until game starts")


}


















}
