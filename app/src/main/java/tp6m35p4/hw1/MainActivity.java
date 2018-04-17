package tp6m35p4.hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button submit;
    private EditText content;
    public Intent sendMessageIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button) findViewById(R.id.submit);
        content = (EditText) findViewById(R.id.content);
        submit.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessageIntent = new Intent(MainActivity.this, CalledActivity.class);
                sendMessageIntent.putExtra("content", content.getText().toString());
                startActivity(sendMessageIntent);
            }
        });




    }
}
