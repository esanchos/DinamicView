package br.com.fs.files_feature

import android.content.Context
import br.com.fs.abstract_feature.AbstractFeature
import br.com.fs.files_feature.repository.FilesRepositoryFake
import br.com.fs.files_feature.widget.FilesWidget

class FilesFeature(private val type: Int) : AbstractFeature() {

    override fun getFeatureName() = "FilesFeature"

    override fun getType() = type

    companion object {
        fun getWidget(context: Context) =
            FilesWidget(context).apply {
                setRepository(FilesRepositoryFake())
            }
    }

}
