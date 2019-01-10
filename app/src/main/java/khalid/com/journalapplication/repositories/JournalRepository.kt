package khalid.com.journalapplication.repositories

import com.google.firebase.Timestamp
import khalid.com.journalapplication.firebaseServices.FirebaseService

/**
 * Created by ${KhalidToak} on 1/9/2019.
 */
class JournalRepository(private val firebaseService: FirebaseService){
    fun addJournal(title:String, journalContent:String, journalImage:String, timestamp: Timestamp){
        firebaseService.addJournal(title,journalContent,journalImage, timestamp)
    }
}