package com.example.makhamwan.myrics;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.makhamwan.myricsapp.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;

/**
 * Created by makhamwan on 5/17/2017 AD.
 */

public class TabNew extends Fragment {

    private Button add_button;
    private EditText url, title, artist, album, lyric;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_new_tab, container, false);
        url = (EditText) v.findViewById(R.id.url);
        title = (EditText) v.findViewById(R.id.title);
        artist = (EditText) v.findViewById(R.id.artist);
        album = (EditText) v.findViewById(R.id.album);
        lyric = (EditText) v.findViewById(R.id.lyric);

        add_button = (Button) v.findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button.setText("added");
                Uri file = Uri.fromFile(new File(url.getText().toString()));
                StorageReference riversRef = ((MainActivity) getActivity()).getStorageRef().child("images/rivers.jpg");

                riversRef.putFile(file)
                        .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                            @Override
                            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                                // Get a URL to the uploaded content
                                Uri downloadUrl = taskSnapshot.getDownloadUrl();
                                Toast.makeText(getActivity(), "Upload success", Toast.LENGTH_SHORT);
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception exception) {
                                // Handle unsuccessful uploads
                                Toast.makeText(getActivity(), "Fail", Toast.LENGTH_SHORT);
                            }
                        });
            }
        });
        return v;
    }
}