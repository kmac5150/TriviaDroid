package com.example.triviadroid;

import android.os.Bundle;

import androidx.annotation.Nullable;
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




public class MainClient {
private static DatagramSocket mSocket;
public static final int PORT = 6789;
public static final int BUFFER_SIZE = 512;
private static final String HOST_NAME = "ec2-3-141-26-195.us-east-2.compute.amazonaws.com";



public static MainClient instance;

fj.function.Effect1<DatagramPacket> newQuestionCallback;
protected boolean tryToHandlePacket(DatagramPacket p, @Nullable String typeExpected){
    Map<String, String> field = fields(p);
    String type = field.get("type");
    return true;
    }
}

public static void connect() throws IOException {
InetAddress addr = InetAddress.getByName(HOST_NAME);
mSocket = new DatagramSocket();
mSocket.connect(addr,PORT);

}



protected static GameStatusDetails handleGameStatusResponse(DatagramPacket p) {

    Instant start = Instant.now();
    Map<String, String> s = fields(p);
    String value = s.get("value");

    if(value.equals("starting")) {
        int millis = Integer.parseInt(s.get("wait_time_remaining"));
    }


}


if (value.equals("starting")){
        int millis = Integer.parseInt(s.get("wait_time_remaining"));
        String message = ("Starting in "+ millis/1000 + "seconds");
        }

if (value.equals("in_progress")){
        int millis=Integer.parseInt(s.get("game_time_remaining"));
        String questions = s.get("questions_remaining");
        Sring message = ("in progress with" +questions + "remaining");
        return GameStatusDetails(Pair.create(GameStatus.InProgress,start),millis,message);
        }

public StatusDetails<Pair<String, Instant>> getQuestion(fj.function.Effect2<String, Integer>e, @Nullable DatagramPacket p) {


    String[] b = {"answers"};
    Instant start = Instant.now();


}







public static void signingIn(String username, String password) {

    sendMessage(String.format("type=sign_in&username=%s&password=%s",username, password));
    DatagramPacket r = recieveResponse();
    Map<String, String> received = fields(r);

}
public static signInResponse register(String username) {
sendMessage(String.format("tpye=register&username=%s",username));
DatagramPacket r = receivedResponse();
Map<String, String> received = fields(r);
}






}
