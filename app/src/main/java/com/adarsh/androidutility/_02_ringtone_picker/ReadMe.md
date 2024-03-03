### Components Used
* Button
  * Text -> Notification Picker
* RingtoneManager
  * RingtoneManager.TYPE_NOTIFICATION
  * ringtoneManager.cursor -> Navigate through each ringtone and prepare list.
* Dialog
* AlertDialog

### Description
Open Ringtone Selection Dialog when button "Notification Picker" is clicked

* If any ringtone is clicked
  * Play sound
  * close the dialog
  * show toast with selected ringtone uri
* If cancel is pressed
  * close the dialog
  * show toast with cancelled message