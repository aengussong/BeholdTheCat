# BeholdTheCat
Instant app example

[Google documentation](https://developer.android.com/topic/google-play-instant/overview)

To instant apps work on the user devices - the instant app option should be enabled in the Google Play Store app 
(Settings -> General -> Google Play Instant -> Upgrade web links), otherwise the user won't see `Try Now` button and won't be able to open app links through the 
instant app.

# Enabling app links
To open instant apps through url-s app links should be [enabled for the application](https://developer.android.com/training/app-links). The 'assetlinks.json' 
file [should be created](https://developers.google.com/digital-asset-links/tools/generator) and placed in the appropriate place for the selected 
domain (https://[domain name]/.well-known/assetlinks.json). The applicationId of the application should be used, not of the instant app module. Also SHA256 
should be used from the Play Console if the Play App Signing is turned on (Setup -> App integrity -> App signing key certificate). Statement List Generator 
displays not very meaningful error messages, some better explanation could be found in the response in the Developer Tools Interface (usually opens by F12) of 
the browser.

App links **won't work instantly** after releaseing the instant app, I guess Play Console or Play Services on the device require some time for processing. In my case app links stared working after approximately 15 hours.

# Play Console
In order to release instant app **the Google Play Instant release type should be enabled for the project** (Release -> Setup -> Advanced settings -> Release types -> Add release type -> Google Play Instant), thus enabling instant app track for all release types, e.g. internal testing, closed testing, etc. (there will appear a dropdown near Create release/track button with Standard, Instant apps only options).

# Notes
I found out that Instant apps do not work properly on the Samsung devices (tested on Samsung S10), sometimes I got `Something went wrong. Try again.` error popup while trying to install instant app. If app links won't work - it's better to check at first if instant apps are working at all on the device (Vimeo provides good support for the instant app right now, so it is better to check on their application).
