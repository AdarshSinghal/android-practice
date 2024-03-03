package com.adarsh.androidutility._02_ringtone_picker

import android.app.Dialog
import android.content.Context
import android.media.Ringtone
import android.media.RingtoneManager
import androidx.appcompat.app.AlertDialog

class RingtoneSelectionDialog(context: Context) : Dialog(context) {

    interface OnRingtoneSelectedListener {
        fun onRingtoneSelected(ringtoneUri: String)
        fun onRingtoneSelectionCanceled()
    }

    private var selectedRingtone: Ringtone? = null

    fun showRingtoneSelectionDialog(listener: OnRingtoneSelectedListener, ringtoneType: Int) {

        val ringtoneUris = RingToneListProvider.getRingtoneUris(context, ringtoneType)
        val items = RingToneListProvider.getRingtoneTitles(context, ringtoneType)

        val builder = AlertDialog.Builder(context)
        builder.setTitle("Select Ringtone")
            .setItems(items) { _, which ->
                val selectedRingtoneUri = ringtoneUris[which]
                listener.onRingtoneSelected(selectedRingtoneUri)

                // Play the selected ringtone
                selectedRingtone?.stop()
                selectedRingtone = RingtoneManager.getRingtone(context, android.net.Uri.parse(selectedRingtoneUri))
                selectedRingtone?.play()
            }
            .setNegativeButton("Cancel") { dialog, _ ->
                dialog.dismiss()
                listener.onRingtoneSelectionCanceled()
            }
        builder.show()
    }
}
