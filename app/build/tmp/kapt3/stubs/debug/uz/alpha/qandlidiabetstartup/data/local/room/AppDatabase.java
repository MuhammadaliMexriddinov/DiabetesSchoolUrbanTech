package uz.alpha.qandlidiabetstartup.data.local.room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Luz/alpha/qandlidiabetstartup/data/local/room/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "noteDao", "Luz/alpha/qandlidiabetstartup/data/local/room/DiseaseDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity.class}, version = 4)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private static uz.alpha.qandlidiabetstartup.data.local.room.AppDatabase instance;
    @org.jetbrains.annotations.NotNull()
    public static final uz.alpha.qandlidiabetstartup.data.local.room.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract uz.alpha.qandlidiabetstartup.data.local.room.DiseaseDao noteDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Luz/alpha/qandlidiabetstartup/data/local/room/AppDatabase$Companion;", "", "()V", "instance", "Luz/alpha/qandlidiabetstartup/data/local/room/AppDatabase;", "getInstance", "init", "", "ctx", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void init(@org.jetbrains.annotations.NotNull()
        android.content.Context ctx) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final uz.alpha.qandlidiabetstartup.data.local.room.AppDatabase getInstance() {
            return null;
        }
    }
}