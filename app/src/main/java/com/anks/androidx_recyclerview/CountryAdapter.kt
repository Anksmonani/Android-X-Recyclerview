package com.anks.androidx_recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_data.view.*



class CountryAdapter(private val mContext: Context) : RecyclerView.Adapter<ColorViewHolder>() {

    private var mCountryList: Array<String> = mContext.resources.getStringArray(R.array.countries_array)

    override fun onBindViewHolder(holder: ColorViewHolder, position: Int) {
        holder.mTvName?.text = mCountryList[position]
    }

    override fun getItemCount(): Int = mCountryList.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorViewHolder {
        return ColorViewHolder(LayoutInflater.from(mContext).inflate(R.layout.row_data, parent, false))
    }
}

class ColorViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val mTvName: AppCompatTextView? = view.tv_name
}
