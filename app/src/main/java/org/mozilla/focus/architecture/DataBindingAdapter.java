package org.mozilla.focus.architecture;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomliu on 2018/1/13.
 */

public abstract class DataBindingAdapter<T, VH extends DataBingViewHolder> extends RecyclerView.Adapter<VH> {

    @NonNull
    protected List<T> datas = new ArrayList();
    private Context context;

    public DataBindingAdapter(Context context) {
        this.context = context;
    }

    public OnItemClickListener<T> onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener<T> onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }


    public void setDatas(List<T> data) {
        datas.clear();
        datas.addAll(data);
    }

    public void append(@NonNull T data) {
        datas.add(data);
    }

    public List<T> getData() {
        return datas;
    }

    public void clear() {
        datas.clear();
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = createView(context, parent, viewType);
        final VH  vh = createViewHolder(view, viewType);
        vh.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = vh.getAdapterPosition();
                if (onItemClickListener != null && position != -1) {
                    onItemClickListener.onClick(getItem(position), view, position);
                }
            }
        });
        vh.onCreate();
        return vh;
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        holder.onBind(getItem(position));
    }

    public T getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public abstract VH createViewHolder(View view, int viewType);

    public abstract View createView(Context context, ViewGroup parent, int viewType);

    public interface OnItemClickListener<T> {
        void onClick(T value, View view, int position);
    }

}