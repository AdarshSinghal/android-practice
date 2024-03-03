package com.adarsh.androidutility._02_ringtone_picker

import android.app.Activity
import android.media.RingtoneManager
import android.widget.Button
import com.adarsh.androidutility.util.MyToast
import com.adarsh.androidutility.R

class NotificationPicker (private val activity: Activity) {

    fun pickOnClick(){
        val ringtoneType = RingtoneManager.TYPE_NOTIFICATION
        val ringtoneSelectionDialog = RingtoneSelectionDialog(activity)
        val selectRingtoneButton: Button = activity.findViewById(R.id.notification_picker)
        selectRingtoneButton.setOnClickListener {
            ringtoneSelectionDialog.showRingtoneSelectionDialog(ringtoneSelectedListener(), ringtoneType)
        }
    }

    private fun ringtoneSelectedListener() =
        object : RingtoneSelectionDialog.OnRingtoneSelectedListener {
            override fun onRingtoneSelected(ringtoneUri: String) {
                // Handle the selected ringtone URI
                // You can save it, play it, or perform any other actions here
                // For example, you might want to set the selected ringtone to a TextView
                // textView.text = ringtoneUri
                MyToast(activity).show("User selected ringtone ($ringtoneUri)")
            }

            override fun onRingtoneSelectionCanceled() {
                // Handle the case when the user cancels the ringtone selection
                MyToast(activity).show("User canceled ringtone selection")
            }
        }

}