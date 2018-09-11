package upump.info.downloader;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.net.URL;

import upump.info.downloader.model.Download;

public class DetailActivity extends AppCompatActivity {

    private DatabaseReference databaseReference;
    private EditText name, url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        databaseReference = FirebaseDatabase.getInstance().getReference();

        name = findViewById(R.id.detail_activity_edit_name);
        url = findViewById(R.id.detail_activity_edit_url);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               saveInFirebase();
            }
        });
    }

    private void saveInFirebase() {
        Download download = new Download();
        download.setName(name.getText().toString());
        download.setUrl(url.getText().toString());

        databaseReference.child("download").child(download.getUrl()).setValue(download);
        finish();
    }

    public static Intent createIntent(Context context, Download download) {
        //TODO
        Intent intent = new Intent(context, DetailActivity.class);
        return intent;

    }
}
