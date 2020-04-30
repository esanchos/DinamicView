package br.com.fs.core_feature_list

enum class FeatureType(val value: Int) {
    FILES(0),
    BATTERY(1);

    companion object {
        fun valueOf(value: Int) = values().find { it.value == value }
    }

}