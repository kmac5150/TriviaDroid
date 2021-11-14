package com.example.triviadroid;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

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
import java.util.Observable;
import java.util.Scanner;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.view.View;

public class leaderboard {
enum Action{
    Name,
    StartTimer,
}
    List<TextView> leaderboardTextViews = new ArrayLists<>();
    protected Observable<Action> leaderboardChecker(AppCompatActivity a){
        GameStatusDetails st = MainClient.getGameStatus();
        if(st.status.first == MainClient.GameStatus.Done || st.status.first == MainClient.GameStatus.InProgress
            || st.status.first == MainClient.GameStatus.Starting_{
            LinearLayout l = ctx.findViewById(R.id.textView7);
        StringBuilder s = new StringBuilder();
        s.append(leader.get("position"));
        s.append(leader.get("name"));
        s.append(leader.get("score"));

            ContextCompat.getMainExecutor((a).execute(new Runnable())){
                public void run(){
                    TextView T;
                    int Viewscurrently = Viewscurrently.get();
                    T = new TextView(a);

                }
            }

public static boolean leaderboardMessage(){

                sendMessage(String.format("type=get_leaderoard&token=%s"));
            }



        }




    }
}
