package tp6m35p4.hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalledActivity extends AppCompatActivity {
    private TextView show;
    public Intent calledIntent;
    private String showIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_called);
        show = (TextView) findViewById(R.id.show);
        calledIntent = getIntent();
        if(calledIntent.hasExtra("content")) {
            showIn = "B10430016:"+calledIntent.getStringExtra("content");
            show.setText(showIn);
        }





    }
}
