package uz.alpha.qandlidiabetstartup.data.local.room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u000b\u00c0\u0006\u0001"}, d2 = {"Luz/alpha/qandlidiabetstartup/data/local/room/DiseaseDao;", "", "delete", "", "data", "Luz/alpha/qandlidiabetstartup/data/local/room/DiseaseEntity;", "getAll", "Landroidx/lifecycle/LiveData;", "", "insert", "update", "app_debug"})
@androidx.room.Dao()
public abstract interface DiseaseDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity data);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity data);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity data);
    
    @androidx.room.Query(value = "SELECT*FROM DiseaseEntity")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity>> getAll();
}