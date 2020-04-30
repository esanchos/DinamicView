package br.com.fs.dynamicdatamenu

import br.com.fs.core_feature_list.FeatureList
import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        setup()
    }

    private fun setup() {
        val feature = FeatureList()
        println(feature.featureList)
    }

}
