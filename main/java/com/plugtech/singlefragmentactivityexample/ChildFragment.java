package com.plugtech.singlefragmentactivityexample;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by miker on 6/2/2017.
 */

public class ChildFragment extends Fragment implements View.OnClickListener {

    TextView textViewTitle;
    TextView textViewBody;
    Button buttonClickToCount;
    TextView textViewClickCount;

    int clickCount;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        clickCount = 0;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_child, container, false);

        textViewTitle = (TextView) view.findViewById(R.id.fragment_child_text_view_title);
        textViewBody = (TextView) view.findViewById(R.id.fragment_child_text_view_body);
        buttonClickToCount = (Button) view.findViewById(R.id.fragment_child_button_click_to_count);
        textViewClickCount = (TextView) view.findViewById(R.id.fragment_child_text_view_count);

        textViewBody.setOnClickListener(this);
        textViewBody.setOnClickListener(this);
        buttonClickToCount.setOnClickListener(this);
        textViewClickCount.setOnClickListener(this);

        textViewTitle.setText(R.string.app_title);


        textViewBody.setTextSize(10);
        textViewBody.setText(R.string.app_explanation);
        updateClickCountTextView();

        return view;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.fragment_child_text_view_body:
                break;
            case R.id.fragment_child_button_click_to_count:
                buttonClick();
                break;
            case R.id.fragment_child_text_view_count:
                break;
            default:
                break;
        }
    }

    private void updateClickCountTextView() {
        textViewClickCount.setText(String.valueOf(clickCount));
    }

    private void buttonClick() {
        clickCount++;
        updateClickCountTextView();
    }
}
