package br.com.fs.dynamicdatamenu

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import br.com.fs.abstract_feature.AbstractFeatureWidget

class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind() {
        (itemView as? AbstractFeatureWidget)?.setData()
    }

}
