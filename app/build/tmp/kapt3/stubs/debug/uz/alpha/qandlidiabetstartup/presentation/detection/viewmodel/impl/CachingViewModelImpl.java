package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fH\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\fH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\b\u00a8\u0006\u001a"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/viewmodel/impl/CachingViewModelImpl;", "Luz/alpha/qandlidiabetstartup/presentation/detection/viewmodel/CachingViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "addScreenLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getAddScreenLiveData", "()Landroidx/lifecycle/MutableLiveData;", "allnotes", "Landroidx/lifecycle/LiveData;", "", "Luz/alpha/qandlidiabetstartup/data/local/room/DiseaseEntity;", "getAllnotes", "()Landroidx/lifecycle/LiveData;", "dao", "Luz/alpha/qandlidiabetstartup/data/local/room/DiseaseDao;", "deleteNoteLiveData", "getDeleteNoteLiveData", "openUpdateLiveData", "getOpenUpdateLiveData", "deleteNote", "noteEntity", "openAddScreen", "updateInfo", "note", "app_debug"})
public final class CachingViewModelImpl extends androidx.lifecycle.ViewModel implements uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.CachingViewModel {
    @org.jetbrains.annotations.NotNull()
    private final uz.alpha.qandlidiabetstartup.data.local.room.DiseaseDao dao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> addScreenLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity>> allnotes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity> deleteNoteLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity> openUpdateLiveData = null;
    
    public CachingViewModelImpl() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getAddScreenLiveData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity>> getAllnotes() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity> getDeleteNoteLiveData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity> getOpenUpdateLiveData() {
        return null;
    }
    
    @java.lang.Override()
    public void openAddScreen() {
    }
    
    @java.lang.Override()
    public void deleteNote(@org.jetbrains.annotations.NotNull()
    uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity noteEntity) {
    }
    
    @java.lang.Override()
    public void updateInfo(@org.jetbrains.annotations.NotNull()
    uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity note) {
    }
}