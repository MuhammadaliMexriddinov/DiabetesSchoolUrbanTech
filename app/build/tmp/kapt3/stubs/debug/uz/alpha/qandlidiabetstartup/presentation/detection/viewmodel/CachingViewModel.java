package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tH&J\b\u0010\u0011\u001a\u00020\u0004H&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\tH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0014\u00c0\u0006\u0001"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/viewmodel/CachingViewModel;", "", "addScreenLiveData", "Landroidx/lifecycle/LiveData;", "", "getAddScreenLiveData", "()Landroidx/lifecycle/LiveData;", "allnotes", "", "Luz/alpha/qandlidiabetstartup/data/local/room/DiseaseEntity;", "getAllnotes", "deleteNoteLiveData", "getDeleteNoteLiveData", "openUpdateLiveData", "getOpenUpdateLiveData", "deleteNote", "noteEntity", "openAddScreen", "updateInfo", "note", "app_debug"})
public abstract interface CachingViewModel {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getAddScreenLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity>> getAllnotes();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity> getDeleteNoteLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity> getOpenUpdateLiveData();
    
    public abstract void updateInfo(@org.jetbrains.annotations.NotNull()
    uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity note);
    
    public abstract void openAddScreen();
    
    public abstract void deleteNote(@org.jetbrains.annotations.NotNull()
    uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity noteEntity);
}