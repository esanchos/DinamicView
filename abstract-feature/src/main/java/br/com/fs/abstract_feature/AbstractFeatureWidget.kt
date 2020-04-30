package br.com.fs.abstract_feature

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.Nullable
import androidx.constraintlayout.widget.ConstraintLayout

abstract class AbstractFeatureWidget : ConstraintLayout {

    constructor(context: Context) : super(context)

    constructor(
        context: Context,
        @Nullable attrs: AttributeSet?
    ) : super(context, attrs)

    constructor(
        context: Context,
        @Nullable attrs: AttributeSet?,
        defStyleAttr: Int
    ) : super(context, attrs, defStyleAttr)

    abstract fun initialSetup(
        attrs: AttributeSet?,
        defStyle: Int
    )

    abstract fun setData()

}
