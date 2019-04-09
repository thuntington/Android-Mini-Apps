package tomHuntington.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickLoginFunction(View view) {

        Toast.makeText(MainActivity.this, "Hello" + textField.getText(), Toast.LENGTH_LONG).show();

        EditText textFieldUser = (EditText) findViewById(R.id.textFieldUser);
        EditText textFieldPass = (EditText) findViewById(R.id.textFieldPass);

        Log.i("Username:", textFieldUser.getText().toString());
        Log.i("Password:", textFieldPass.getText().toString());

        Log.i("info:", "Log-in Successful");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
