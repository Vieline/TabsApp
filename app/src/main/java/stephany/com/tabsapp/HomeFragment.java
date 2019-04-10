package stephany.com.tabsapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    TextView txtResult;
    Button buttonHome;
    int counter=0;

    @BindView(R.id.txtResult2)
    TextView txtResult2;

    int counter2= 0;

    @BindView(R.id.imgOnline)
    ImageView imgOnline;

    public HomeFragment() {
        // Required empty public constructor
    }

    @OnClick(R.id.buttonHome2)
    public void buttonClicked()
    {
        counter2++;
        txtResult2.setText(counter2+"");

        String url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZjVLtJDgMTOExfMHsTZuT4G5cAmaRT0N0vnoVbblrTTKkwSOb";

        Picasso.get().load(url).into(imgOnline);

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_home, container, false);

        ButterKnife.bind(this,v);

        txtResult = v.findViewById(R.id.txtResults);
        buttonHome = v.findViewById(R.id.buttonHome);

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                txtResult.setText(counter+"");
            }
        });

        return v;
    }

}
