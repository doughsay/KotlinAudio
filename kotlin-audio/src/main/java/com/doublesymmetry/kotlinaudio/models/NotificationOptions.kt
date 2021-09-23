package com.doublesymmetry.kotlinaudio.models

import com.doublesymmetry.kotlinaudio.notification.NotificationManager

class NotificationOptions internal constructor(private val notificationManager: NotificationManager) {
    var actions: List<NotificationAction?> = emptyList()
        set(value) {
            field = value
            notificationManager.apply {
                actions.clear()
                actions.addAll(field)

                refresh()
            }
        }
}
