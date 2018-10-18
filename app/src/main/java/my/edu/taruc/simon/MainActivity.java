package my.edu.taruc.simon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main()  Function
        super.onCreate(savedInstanceState);
        //Display UI
        //R  = resource
        //layout is a folder
        setContentView(R.layout.activity_main);

        TextView textViewMsg;
        textViewMsg = findViewById(R.id.textViewMessage);
        textViewMsg.setText("Hello,<your name here>");
    }
    public void showMessage(View view){

    }
}
