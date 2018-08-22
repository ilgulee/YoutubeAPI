package ilgulee.com.youtubeapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button single=findViewById(R.id.btnPlaySingle);
        Button standAlone=findViewById(R.id.btnStandAlone);
        single.setOnClickListener(this);
        standAlone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=null;
        switch (view.getId()){
            case R.id.btnPlaySingle:
                intent=new Intent(this,YoutubeActivity.class);
                break;
            case R.id.btnStandAlone:
                intent=new Intent(this,StandaloneActivity.class);
                break;
                default:
        }
        if(intent!=null){
            startActivity(intent);
        }
    }
}
