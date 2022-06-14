package ve.develop.photogallery.api

import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "e716bdc74162f7e4a63d5acb4c3fcbc6"

interface FlickrApi {

    @GET("services/rest/?method=flickr.interestingness.getList")
    suspend fun fetchPhotos(): FlickrResponse

    @GET("services/rest?method=flickr.photos.search")
    suspend fun searchPhotos(@Query("text") query: String): FlickrResponse
}