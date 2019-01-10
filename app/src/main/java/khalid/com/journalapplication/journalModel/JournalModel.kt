package khalid.com.journalapplication.journalModel

import com.google.firebase.Timestamp
import com.google.firebase.firestore.ServerTimestamp

/**
 * Created by ${KhalidToak} on 1/8/2019.
 */
data class JournalModel(
    val title : String,
    val description : String,
    val imageUrl : String,
    @ServerTimestamp val timestamp: Timestamp
)