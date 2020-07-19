package lecture_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.myapp.R;

public class LifeCycleActivity extends AppCompatActivity {

    private final String TAG = "디버그";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d(TAG,"---------onCreate---------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"---------onStart---------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"---------onResume---------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"---------onPause---------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"---------onStop---------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"---------onDestroy---------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"---------onRestart---------");
    }
}