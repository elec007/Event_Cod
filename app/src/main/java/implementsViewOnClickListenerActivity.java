import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.*;
import android.widget.Toast;


public class implementsViewOnClickListenerActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    View view;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"버튼에 출력",Toast.LENGTH_LONG).show();
    }
}
