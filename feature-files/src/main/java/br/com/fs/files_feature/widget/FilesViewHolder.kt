package br.com.fs.files_feature.widget

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.files_file_list_item.view.*

class FilesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(value: String) {
        itemView.filenameTextView.text = value
    }

}
