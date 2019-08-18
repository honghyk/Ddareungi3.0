package com.example.ddareungi.bookmark

import com.example.ddareungi.data.Bookmark
import com.example.ddareungi.data.source.DataRepository
import java.util.*

interface BookmarkContract {

    interface View {
        var presenter: Presenter

        fun showBookmarkedList(bookmarks: ArrayList<Bookmark>)

        fun showNoBookmark(bookmarks: ArrayList<Bookmark>)

        fun showCheckNetwork()

        fun showLoadingIndicator(active: Boolean, hideAll: Boolean)

        fun showWeatherView(dustText: String, imageId: Int)

        fun showLoadDataError()

        fun showClickedBookmarkInMapFrag(dataRepository: DataRepository, clickedRentalOffice: String)

        fun initLocation(locationPermissionGranted: Boolean)

    }

    interface Presenter {

        fun start()

        fun loadData()

        fun deleteBookmark(deletedBookmarkPosition: Int)

        fun openMapFrag(clickedRentalOffice: String)

        fun processLocation(locality: String, neighborhood: String, weatherFile: Scanner, dustFile: Scanner)
    }
}