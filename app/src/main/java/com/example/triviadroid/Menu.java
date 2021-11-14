package com.example.triviadroid;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

  Leaderboard leaderboard = new Leaderboard();

  @Override
    protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      connect();
      MainClient.signInResponse response = MainClient.register(username);
      Intent intent = new Intent(this,Signin.class);
      intent.putExtra("response",response);
      startActivity(intent);

if(leaderboard.leaderboardCheckStooped.get()){
  leaderboard.startChecking(this);
}









  }

}
