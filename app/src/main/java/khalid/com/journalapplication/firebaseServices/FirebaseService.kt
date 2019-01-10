package khalid.com.journalapplication.firebaseServices

import android.content.Context
import android.widget.Toast
import com.google.firebase.Timestamp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import khalid.com.journalapplication.journalModel.JournalModel

/**
 * Created by ${KhalidToak} on 1/9/2019.
 */
const val JOURNAL_COLLECTION_PATH= "Journals"
class FirebaseService(private val firebaseFirestore: FirebaseFirestore,
                      private val userId: String, private val context: Context){

    fun addJournal(title:String, journalContent:String, journalImage:String, timestamp: Timestamp){
        val documentReference = firebaseFirestore.collection(JOURNAL_COLLECTION_PATH)
            .document(userId)
        documentReference.set(JournalModel(title, journalContent, journalImage, timestamp), SetOptions.merge())
            .addOnCompleteListener {
                if (it.isSuccessful)
                    Toast.makeText(context, "Upload was successful",Toast.LENGTH_LONG).show()
                else
                    Toast.makeText(context, "Upload was successful",Toast.LENGTH_LONG).show()
            }
    }
}