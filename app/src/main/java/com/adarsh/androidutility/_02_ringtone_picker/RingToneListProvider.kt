package com.adarsh.androidutility._02_ringtone_picker

import android.content.Context
import android.media.RingtoneManager

object RingToneListProvider {

    private val ringtoneTitles = mutableListOf<String>()
    private val ringtoneUris = mutableListOf<String>()

    fun getRingtoneTitles(context: Context, ringtoneType: Int): Array<String> {
        init(context, ringtoneType)
        return ringtoneTitles.toTypedArray();
    }

    fun getRingtoneUris(context: Context, ringtoneType: Int): MutableList<String> {
        init(context, ringtoneType)
        return ringtoneUris
    }

    private fun init(context: Context, ringtoneType: Int) {
        if (ringtoneTitles.isEmpty()) {
            prepareNotificationList(context, ringtoneType)
        }
    }
    private fun prepareNotificationList(context: Context, ringtoneType: Int){
        val ringtoneManager = RingtoneManager(context)
        ringtoneManager.setType(ringtoneType)

        val cursor = ringtoneManager.cursor

        while (cursor.moveToNext()) {
            val ringtoneTitle = cursor.getString(RingtoneManager.TITLE_COLUMN_INDEX)
            val ringtoneUri = cursor.getString(RingtoneManager.URI_COLUMN_INDEX) + "/" +
                    cursor.getString(RingtoneManager.ID_COLUMN_INDEX)
            ringtoneTitles.add(ringtoneTitle)
            ringtoneUris.add(ringtoneUri)
        }

    }

}