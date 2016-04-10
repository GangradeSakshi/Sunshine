package practise.sakshigangrade.com.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayAdapter<String> mForecastAdapter;

        //Create a sample weekly dummy list for weather forecast's ListView
        //represent day-weather-max/min

        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/40",
                "Weds - Cloudy - 72/63",
                "Thurs - Rain - 76/65",
                "Fri - Heavy Rain - 65/56",
                "Sat - Partial clouds - 60/51",
                "Sun - Sunny - 80/68"
        };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));

        //Creating an ArrayAdapter that will take data from source (weekForecast)
        //and use it to populate the ListView it is attached to
        mForecastAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item_forcast,
                R.id.list_item_forcast_textview, weekForecast);

        //Get reference to list view and attach this adapter to it

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.lvForecast);
        listView.setAdapter(mForecastAdapter);



        return rootView;
    }
}
