package com.example.mvptest.view.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View


abstract class BaseViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
    abstract fun bind(itemBase: Any)
}