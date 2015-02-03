package in.sohamv.androidbasicconcepts;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends Activity {
    private int[] Colors = { Color.BLACK, Color.BLUE, Color.CYAN,Color.GRAY, Color.GREEN,Color.MAGENTA, Color.RED,Color.YELLOW };
    private int buttonCount = 0, button2Count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPushMe(View view){
        Button btnPushMe = (Button)findViewById(R.id.button);
        TextView textView1 = (TextView)findViewById(R.id.textView);
        Random generator = new Random();
        buttonCount++;
        btnPushMe.setTextColor(Colors[generator.nextInt(Colors.length)]);
        textView1.setTextColor(Colors[generator.nextInt(Colors.length)]);
        btnPushMe.setText("I was clicked " + Integer.toString(buttonCount) + " times");
        Context context = getApplicationContext();
        CharSequence text = "Push Button Clicked!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onClickMe(View view){
        Button btnClickMe = (Button)findViewById(R.id.button2);
        TextView textView1 = (TextView)findViewById(R.id.textView);
        Random generator = new Random();
        button2Count++;
        btnClickMe.setTextColor(Colors[generator.nextInt(Colors.length)]);
        textView1.setTextColor(Colors[generator.nextInt(Colors.length)]);
        btnClickMe.setText("I was clicked " + Integer.toString(button2Count) + " times");
        Context context = getApplicationContext();
        CharSequence text = "Click Button Clicked!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
