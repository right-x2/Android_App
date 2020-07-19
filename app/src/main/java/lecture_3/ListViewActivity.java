package lecture_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import com.example.myapp.R;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private Context context;
    private ArrayList<Item> arr;
    private ListView listView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        this.context = getApplicationContext();

        listView = (ListView)findViewById(R.id.list_order);

        arr = new ArrayList<Item>();
        arr = generateItemList();
        adapter = new MyAdapter(context, arr);
        listView.setAdapter(adapter);
    }

    private ArrayList<Item> generateItemList(){
        String itemNames[] = getResources().getStringArray(R.array.items_name);
        String itemDescriptions[] = getResources().getStringArray(R.array.items_description);

        ArrayList<Item> list = new ArrayList<>();

        for (int i = 0; i < itemNames.length; i++){
            list.add(new Item(itemNames[i],itemDescriptions[i]));
        }
        return list;
    }
}