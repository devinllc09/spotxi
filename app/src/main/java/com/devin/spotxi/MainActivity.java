package com.devin.spotxi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    DatabaseReference reference;
    private RecyclerView recyclerView;
    CnAdapter cnAdapter;
//    private List<Object> mRecyclerViewItems;
//    FirebaseRecyclerAdapter<CustomAdapter,ItemViewHolder>firebaseRecyclerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_bar);
        tabLayout.selectTab(tabLayout.getTabAt(0));
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                if(tab.getText() == "Completed Matches"){
//                    mRecyclerViewItems.clear();
//
//                } else if(tab.getText() == "Live Matches"){
//                    mRecyclerViewItems.clear();
//                } else if(tab.getText() == "Upcoming Matches"){
//                    mRecyclerViewItems.clear();
//                }
//            }
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) { }
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) { }
//        });
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        FirebaseRecyclerOptions<CustomAdapter> options =
                new FirebaseRecyclerOptions.Builder<CustomAdapter>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Matches"), CustomAdapter.class)
                        .build();

        cnAdapter=new CnAdapter(options);
        recyclerView.setAdapter(cnAdapter);

//        String arr[]={"MI","DC","CSK","RR","KKR","SRH","KXIP","RCB"};

//        recyclerView.setAdapter(new ItemAdapter(arr));

    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        firebaseRecyclerAdapter.startListening();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        firebaseRecyclerAdapter.stopListening();
//    }
    // Recyclerview ViewHolder For Firebase Content
//    public static class ItemViewHolder extends RecyclerView.ViewHolder {
//        View Gview;
//        ItemViewHolder(View itemView) {
//            super(itemView);
//            Gview = itemView;
//        }
//        void setTeamA(String title) {
//            TextView Rtitle = (TextView) Gview.findViewById(R.id.team_a);
//            Rtitle.setText(title);
//        }
//        void setTeamB(String title) {
//            TextView Rtitle = (TextView) Gview.findViewById(R.id.team_b);
//            Rtitle.setText(title);
//        }
//        void setTime(String title) {
//            TextView Rtitle = (TextView) Gview.findViewById(R.id.time);
//            Rtitle.setText(title);
//        }
//        void setPlace(String title) {
//            TextView Rtitle = (TextView) Gview.findViewById(R.id.location);
//            Rtitle.setText(title);
//        }
//        void setImageA(String image) {
//            ImageView Rimage = (ImageView) Gview.findViewById(R.id.img_a);
//            switch (image) {
//
//                case "CSK":
//                    Rimage.setImageResource(R.drawable.csk);
//                    break;
//                case "DC":
//                    Rimage.setImageResource(R.drawable.dc);
//                    break;
//                case "SRH":
//                    Rimage.setImageResource(R.drawable.srh);
//                    break;
//                case "KKR":
//                    Rimage.setImageResource(R.drawable.kkr);
//                    break;
//                case "KXIP":
//                    Rimage.setImageResource(R.drawable.kip);
//                    break;
//                case "MI":
//                    Rimage.setImageResource(R.drawable.mi);
//                    break;
//                case "RCB":
//                    Rimage.setImageResource(R.drawable.rc);
//                    break;
//                case "RR":
//                    Rimage.setImageResource(R.drawable.rr);
//                    break;
//                default:
//                    Rimage.setImageResource(R.drawable.ic_launcher_background);
//                    break;
//            }
//        }
//        void setImageB(String image) {
//            ImageView Rimage = (ImageView) Gview.findViewById(R.id.img_b);
//            switch (image) {
//                case "CSK":
//                    Rimage.setImageResource(R.drawable.csk);
//                    break;
//                case "DC":
//                    Rimage.setImageResource(R.drawable.dc);
//                    break;
//                case "SRH":
//                    Rimage.setImageResource(R.drawable.srh);
//                    break;
//                case "KKR":
//                    Rimage.setImageResource(R.drawable.kkr);
//                    break;
//                case "KXIP":
//                    Rimage.setImageResource(R.drawable.kip);
//                    break;
//                case "MI":
//                    Rimage.setImageResource(R.drawable.mi);
//                    break;
//                case "RCB":
//                    Rimage.setImageResource(R.drawable.rc);
//                    break;
//                case "RR":
//                    Rimage.setImageResource(R.drawable.rr);
//                    break;
//                default:
//                    Rimage.setImageResource(R.drawable.ic_launcher_background);
//                    break;
//            }
//        }
//    }

    // Call Firebase Data And Show
//    private void readFirebaseData () {
//        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("Matches");
//        databaseReference.keepSynced(true);
//        DatabaseReference personsRef = FirebaseDatabase.getInstance().getReference().child("Matches");
//        Query personsQuery = personsRef.orderByKey();
//        FirebaseRecyclerOptions<CustomAdapter> personsOptions = new FirebaseRecyclerOptions.Builder<CustomAdapter>().setQuery(personsQuery, CustomAdapter.class).build();
//        firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<CustomAdapter, MainActivity.ItemViewHolder>(personsOptions) {
//            @Override
//            protected void onBindViewHolder(@NonNull MainActivity.ItemViewHolder holder, final int i, @NonNull final CustomAdapter model) {
//                holder.setTeamA(model.getTeamA());
//                holder.setTeamB(model.getTeamB());
//                holder.setImageA(model.getTeamA());
//                holder.setImageB(model.getTeamB());
//                holder.setTime(model.getTime());
//                holder.setPlace(model.getPlace());
//                holder.Gview.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        final String teamA = model.getTeamA();
//                        final String teamB = model.getTeamB();
//                        Intent intent = new Intent(MainActivity.this,TeamDetailActivity.class);
//                        intent.putExtra("TeamA", teamA);
//                        intent.putExtra("TeamB", teamB);
//                        startActivity(intent);
//                    }
//                });
//            }
//            @NonNull
//            @Override
//            public MainActivity.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//                View view = LayoutInflater.from(parent.getContext())
//                        .inflate(R.layout.item_cr, parent, false);
//                return new MainActivity.ItemViewHolder(view);
//            }
//        };
//        recyclerView.setAdapter(firebaseRecyclerAdapter);
//    }

    @Override
    protected void onStart() {
        super.onStart();
        cnAdapter.startListening();
    }
    @Override
    protected void onStop() {
        super.onStop();
        cnAdapter.stopListening();
    }
}