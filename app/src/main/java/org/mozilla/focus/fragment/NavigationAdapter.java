package org.mozilla.focus.fragment;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import org.mozilla.focus.R;
import org.mozilla.focus.activity.NavItem;
import org.mozilla.focus.architecture.DataBindingAdapter;
import org.mozilla.focus.architecture.DataBingViewHolder;
import org.mozilla.focus.databinding.NavigationItemBinding;
import org.mozilla.focus.utils.ResUtils;

/**
 * Created by tomliu on 2018/1/13.
 */

public class NavigationAdapter extends DataBindingAdapter<NavItem, NavigationAdapter.NavigationVH> {

    public NavigationAdapter(Context context) {
        super(context);
    }

    @Override
    public NavigationVH createViewHolder(View view, int viewType) {
        return new NavigationVH(view);
    }

    @Override
    public View createView(Context context, ViewGroup parent, int viewType) {
        return LayoutInflater.from(context).inflate(R.layout.navigation_item, parent, false);
    }

    static class NavigationVH extends DataBingViewHolder<NavItem, NavigationItemBinding> {

        public NavigationVH(View itemView) {
            super(itemView);
        }

        @Override
        protected void onCreate() {
            super.onCreate();
        }

        @Override
        public void onBind(NavItem data) {
            Glide.with(itemView.getContext()).load(ResUtils.getImage(itemView.getContext(),
                    data.logo)).into(binding.navImg);
            binding.navTv.setText(data.name);
        }
    }
}
