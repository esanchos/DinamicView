package br.com.fs.files_feature.repository

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class FilesRepositoryFake: FilesRepository {

    override suspend fun getFilesAsync(): Deferred<List<String>> = withContext(IO) {
        async {
            delay(1_000)
            listOf(
                "arquivo1.jpg",
                "arquivo2.jpg",
                "arquivo3.jpg",
                "arquivo4.jpg",
                "arquivo5.jpg",
                "arquivo6.jpg",
                "arquivo7.jpg"
            )
        }
    }

}