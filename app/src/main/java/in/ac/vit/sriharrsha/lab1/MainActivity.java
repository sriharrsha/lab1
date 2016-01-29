package in.ac.vit.sriharrsha.lab1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void Button1Clicked(View v){
        Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_SHORT).show();
         v.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        }
        public void Button2Clicked(View v){
            Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_SHORT).show();
            v.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        }
        public void Button3Clicked(View v){
            Toast.makeText(getApplicationContext(),"Right Answer",Toast.LENGTH_SHORT).show();
            v.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        }
  }

