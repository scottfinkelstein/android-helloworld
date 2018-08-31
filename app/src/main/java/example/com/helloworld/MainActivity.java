package example.com.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public Button mSayHiButton;
    public Button mNextActivityButton;
    public TextView mHelloWorldTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSayHiButton = (Button)findViewById(R.id.say_hi_button);
        mNextActivityButton = (Button)findViewById(R.id.next_activity_button);
        mHelloWorldTextView = (TextView)findViewById(R.id.hello_textview);

        mSayHiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.hello_world, Toast.LENGTH_LONG).show();
                mHelloWorldTextView.setText(R.string.hello_world);
            }
        });

        mNextActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NextActivity.class);

                // This was the part I neglected to do in class. Don't code rushed!
                startActivity(intent);
            }
        });
    }
}
