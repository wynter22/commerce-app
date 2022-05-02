import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
data class User(
    @Id
    @GeneratedValue
    var id: Long? = null,

    var email: String,

    var password: String,

    @CreationTimestamp
    var createdDate: LocalDateTime = LocalDateTime.now()
)
