package com.example.mydev.repository

import com.example.mydev.api.AWSS3Api
import com.example.mydev.model.AWSS3Response
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response

class AWSS3RepositoryImpl(private val api: AWSS3Api) : AWSS3Repository {

    override suspend fun getPreSignedUrl(fileName: String): Response<AWSS3Response> {
        return api.getPreSignedUrl(fileName)
    }

    override suspend fun uploadImageToS3(
        preSignedUrl: String,
        file: RequestBody
    ): Response<Void> {
        return api.uploadImageToS3(preSignedUrl, file)
    }
}
