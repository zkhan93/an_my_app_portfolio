package myappportfolio.io.github.zkhan93.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sportify_streamer:
                showMessage(getString(R.string.msg_spotify_streamer));
                break;
            case R.id.btn_score_app:
                showMessage(getString(R.string.msg_score_app));
                break;
            case R.id.btn_library_app:
                showMessage(getString(R.string.msg_library_app));
                break;
            case R.id.btn_build_it_bigger:
                showMessage(getString(R.string.msg_build_it_bigger));
                break;
            case R.id.btn_xyz_reader:
                showMessage(getString(R.string.msg_xyz_reader));
                break;
            case R.id.btn_capstone:
                showMessage(getString(R.string.msg_capstone));
                break;
            default:
        }
    }

    private void showMessage(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
