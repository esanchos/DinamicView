package br.com.fs.files_feature.repository

import kotlinx.coroutines.Deferred

interface FilesRepository {

    suspend fun getFilesAsync(): Deferred<List<String>>

}