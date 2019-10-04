package example.technerd.com.fragmentswithrecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder>
{
        private ArrayList<Person>people;
        Itemclicked activity;


       public interface Itemclicked
       {
            void onItemClicked(int index);

       }

        public  PersonAdapter (Context context, ArrayList<Person> list)

        {
            people= list;
            activity =  (Itemclicked) context;
        }
        public class  ViewHolder extends RecyclerView.ViewHolder {
            TextView tvName;
            public ViewHolder(@NonNull View itemView) {
                super(itemView);

                tvName = itemView.findViewById(R.id.tvName);

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                     //   activity.onItemClicked(people.indexOf(Person) view.getTag());

                        activity.onItemClicked(people.indexOf((Person) view.getTag()));
                    }
                });
            }
        }


    @NonNull
    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);

            return new ViewHolder(view) ;
    }


    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(people.get(position));

        holder.tvName.setText(people.get(position).getName());
    }


    @Override
    public int getItemCount() {
        return people.size();
    }
}
