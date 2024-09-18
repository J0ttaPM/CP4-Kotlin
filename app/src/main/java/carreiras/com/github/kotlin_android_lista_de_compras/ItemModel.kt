package carreiras.com.github.kotlin_android_lista_de_compras
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlin.reflect.KFunction1

@Entity
data class ItemModel(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val onRemove: KFunction1<ItemModel, Unit>,
)