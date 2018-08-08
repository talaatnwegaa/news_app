package com.talaat_nwegaa.news_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class NewsAdapter extends ArrayAdapter<News> {


    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }
        News currentNews = getItem(position);
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section_name);
        sectionView.setText(currentNews.getSection());


        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.US);
        try {
            Date date = dateFormat.parse(currentNews.getDate());

            String parseDate = dateFormat2.format(date);
            dateView.setText(parseDate);
        } catch (ParseException e) {
        }

        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(currentNews.getTitlt());

        TextView fieldsView = (TextView) listItemView.findViewById(R.id.fields);
        fieldsView.setText(currentNews.getFields());



        return listItemView;

    }


}