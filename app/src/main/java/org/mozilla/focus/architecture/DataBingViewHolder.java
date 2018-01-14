package org.mozilla.focus.architecture;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.CallSuper;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by tomliu on 2018/1/13.
 */

public abstract class DataBingViewHolder<T,DataBindingType extends ViewDataBinding> extends RecyclerView.ViewHolder{

    protected DataBindingType binding;

    public DataBingViewHolder(View itemView) {
        super(itemView);
        binding = DataBindingUtil.bind(itemView);
    }

    protected void onCreate() {

    }

    public abstract void onBind(T data);
}
