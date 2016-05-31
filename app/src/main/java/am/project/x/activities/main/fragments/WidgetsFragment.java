package am.project.x.activities.main.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import am.project.x.R;
import am.project.x.activities.widgets.gradienttabstrip.GradientTabStripActivity;
import am.project.x.activities.widgets.indicatortabstrip.IndicatorTabStripActivity;
import am.project.x.activities.widgets.shapeimageview.ShapeImageViewActivity;
import am.project.x.activities.widgets.tagtabstrip.TagTabStripActivity;

/**
 * 控件
 */
public class WidgetsFragment extends Fragment implements View.OnClickListener{

    public static WidgetsFragment newInstance() {
        return new WidgetsFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main_widgets, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.widget_btn_gradienttabstrip).setOnClickListener(this);
        view.findViewById(R.id.widget_btn_tagtabstrip).setOnClickListener(this);
        view.findViewById(R.id.widget_btn_indicatortabstrip).setOnClickListener(this);
        view.findViewById(R.id.widget_btn_shapeimageview).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.widget_btn_gradienttabstrip:
                GradientTabStripActivity.startActivity(getContext());
                break;
            case R.id.widget_btn_tagtabstrip:
                TagTabStripActivity.startActivity(getContext());
                break;
            case R.id.widget_btn_indicatortabstrip:
                IndicatorTabStripActivity.startActivity(getContext());
                break;
            case R.id.widget_btn_shapeimageview:
                ShapeImageViewActivity.startActivity(getContext());
                break;
        }
    }
}
