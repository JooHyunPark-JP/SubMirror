package com.example.submirror.subMirrorNav

sealed class Screen(val route: String, val label: String) {
    data object Main : Screen("main", "OverView")

    data object SubscriptionListScreen : Screen("subscription_list_screen", "Subscriptions")
    data object SubscriptionReviewScreen : Screen("saved_address_add_screen", "Reivew/Trim(change later)")

/*    data object ReadNoteScreen : Screen("read_note_screen/{noteId}", "Read Note") {
        fun routeWithNoteId(noteId: Long?) = "read_note_screen/${noteId ?: -1L}"
    }*/
}