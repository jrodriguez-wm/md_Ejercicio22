package mx.com.webmaps.md_ejercicio22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup_id);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch(checkedId){
                    case R.id.radioButton1_id:{
                        Toast.makeText(getApplicationContext(),"RadioButton1 is checked",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.radioButton2_id:{
                        Toast.makeText(getApplicationContext(),"RadioButton2 is checked",Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }
        });

    }
}
