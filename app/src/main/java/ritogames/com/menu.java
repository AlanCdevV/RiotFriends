package ritogames.com;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class menu extends AppCompatActivity {
    private int []arr={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i};
    List<Image> ImageList;

    String[]name;

    private RecyclerView recyclerView;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ImageList=new ArrayList<>();
        name= getResources().getStringArray(R.array.image_name);
        for (int i=0;i<name.length;i++)
        {
            Image image=new Image(arr[i],name[i]);
            ImageList.add(image);
        }

        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new Adapter(ImageList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
         super.onContextItemSelected(item);
        switch (item.getItemId())
        {
            case 101:
                Snackbar.make(findViewById(R.id.rootId),"eliminado",Snackbar.LENGTH_LONG).show();
                adapter.RemoveItem(item.getGroupId());
                return true;

        }
        return false;
    }
}