package it.curati.cmail.core.notifications

import java.time.DayOfWeek
import java.time.LocalTime

/**
 * C Mail notification policy for a single mail account.
 *
 * Synchronization is deliberately not represented here: silent periods only
 * suppress user notifications and must never stop IMAP synchronization.
 */
data class NotificationSchedule(
    val enabled: Boolean = true,
    val activeDays: Set<DayOfWeek> = DayOfWeek.entries.toSet(),
    val activeFrom: LocalTime = LocalTime.MIN,
    val activeUntil: LocalTime = LocalTime.MAX,
) {
    fun allowsNotification(day: DayOfWeek, time: LocalTime): Boolean {
        if (!enabled || day !in activeDays) return false
        return if (activeFrom <= activeUntil) {
            time >= activeFrom && time <= activeUntil
        } else {
            time >= activeFrom || time <= activeUntil
        }
    }
}
