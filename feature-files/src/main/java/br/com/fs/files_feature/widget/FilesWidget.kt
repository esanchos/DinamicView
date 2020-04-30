package br.com.fs.files_feature.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.annotation.Nullable
import androidx.constraintlayout.widget.ConstraintLayout
import br.com.fs.abstract_feature.AbstractFeatureWidget
import br.com.fs.files_feature.R
import br.com.fs.files_feature.repository.FilesRepository
import kotlinx.android.synthetic.main.files_widget.view.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FilesWidget: AbstractFeatureWidget {

    private lateinit var repository: FilesRepository

    constructor(context: Context) : super(context) {
        initialSetup(null, 0)
    }

    constructor(
        context: Context,
        @Nullable attrs: AttributeSet?
    ) : super(context, attrs) {
        initialSetup(attrs, 0)
    }

    constructor(
        context: Context,
        @Nullable attrs: AttributeSet?,
        defStyleAttr: Int
    ) : super(context, attrs, defStyleAttr) {
        initialSetup(attrs, defStyleAttr)
    }

    override fun initialSetup(
        attrs: AttributeSet?,
        defStyle: Int
    ) {
        val view =
            View.inflate(context,
                R.layout.files_widget, null) as ConstraintLayout
        addView(view)
    }

    fun setRepository(repository: FilesRepository) {
        this.repository = repository
    }

    override fun setData() {
        titleTextView.text = "Arquivos"
        GlobalScope.launch(Dispatchers.Main) {
            filesRecyclerView.adapter = FilesAdapter(repository.getFilesAsync().await())
        }
    }

}
