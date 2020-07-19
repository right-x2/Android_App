package lecture_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapp.R;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Item>arr;

    public MyAdapter(Context context, ArrayList<Item> arr) {

        this.context = context;
        this.arr = arr;

    }
    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int i) {
        return arr.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_item, parent,false);
        }

        Item currentItem = (Item) getItem(position);

        TextView textViewItemName = (TextView)convertView.findViewById(R.id.text_view_item_name);
        TextView textViewItemDescription = (TextView)convertView.findViewById(R.id.text_view_item_description);

        textViewItemName.setText(currentItem.getItemName());
        textViewItemDescription.setText(currentItem.getItemDescription());

        return convertView;
    }

}
