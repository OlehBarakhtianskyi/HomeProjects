package com.onpu.homeprojects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

import static com.onpu.homeprojects.MainActivity.urlString;

public class MyUsersActivity extends AppCompatActivity {

    ArrayList<User> arrayListUsers = new ArrayList<>();

    EditText Index, UrlSearchEdit;
    TextView ArrayListRead, SearchUser;
    Button Del, Search, Data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_users);

        Index = findViewById(R.id.editText);
        UrlSearchEdit = findViewById(R.id.editText2);
        ArrayListRead = findViewById(R.id.textView);
        SearchUser = findViewById(R.id.textView2);
        Del = findViewById(R.id.button);
        Search = findViewById(R.id.button2);
        Data = findViewById(R.id.button3);
    }

    public void AddToList(View view){
        ArrayListRead.setText("");
        Date date = new Date();
        String dat = date.toString();
        arrayListUsers.add(new User(dat, urlString));
    }

    public void RemoveOfId(View view) {
        int indexDel = 0;
        String temp = Index.getText().toString();
        indexDel = Integer.parseInt(temp);
        indexDel = indexDel - 1;
        arrayListUsers.remove(indexDel);
    }

    public void SearchUser(View view){
        SearchUser.setText("");
        String searchOfUrl = UrlSearchEdit.getText().toString();
        int index = arrayListUsers.indexOf(searchOfUrl);
        SearchUser.setText(arrayListUsers.get(index) +  " с ID " + (index + 1));
    }

    public void ReadUsers(View view){
        String user = "";
        for (int i = 0; i < arrayListUsers.size(); i++) {
            user = user + arrayListUsers.get(i) + "\n";
        }
        ArrayListRead.setText("Запросы пользователей:\n" + user);
    }






}
