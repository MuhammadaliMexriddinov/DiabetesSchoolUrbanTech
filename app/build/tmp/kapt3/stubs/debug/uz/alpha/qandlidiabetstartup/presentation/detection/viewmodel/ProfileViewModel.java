package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0019\bf\u0018\u00002\u00020\u0001J\b\u0010\u001c\u001a\u00020\u0004H&J\b\u0010\u001d\u001a\u00020\u0004H&J\b\u0010\u001e\u001a\u00020\u0004H&J\b\u0010\u001f\u001a\u00020\u0004H&J\b\u0010 \u001a\u00020\u0004H&J\b\u0010!\u001a\u00020\u0004H&J\b\u0010\"\u001a\u00020\u0004H&J\b\u0010#\u001a\u00020\u0004H&J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0010H&J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0010H&J\b\u0010\'\u001a\u00020\u0004H&J\b\u0010(\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0006R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0006\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006)\u00c0\u0006\u0001"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/viewmodel/ProfileViewModel;", "", "aboutUsLiveData", "Landroidx/lifecycle/LiveData;", "", "getAboutUsLiveData", "()Landroidx/lifecycle/LiveData;", "backLiveData", "getBackLiveData", "changeImageLiveData", "getChangeImageLiveData", "changeNameLiveData", "getChangeNameLiveData", "contactLiveData", "getContactLiveData", "imageLiveData", "", "getImageLiveData", "informationLiveData", "getInformationLiveData", "languageLiveData", "getLanguageLiveData", "nameLiveData", "getNameLiveData", "shareLiveData", "getShareLiveData", "supportLiveData", "getSupportLiveData", "aboutClicked", "backClick", "changeImage", "changeName", "helpClicked", "info", "language", "setImage", "str", "setName", "name", "shareApp", "supportClicked", "app_debug"})
public abstract interface ProfileViewModel {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.String> getNameLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.String> getImageLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getBackLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getChangeNameLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getChangeImageLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getAboutUsLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getContactLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getSupportLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getLanguageLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getInformationLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getShareLiveData();
    
    public abstract void shareApp();
    
    public abstract void language();
    
    public abstract void info();
    
    public abstract void changeName();
    
    public abstract void changeImage();
    
    public abstract void aboutClicked();
    
    public abstract void helpClicked();
    
    public abstract void supportClicked();
    
    public abstract void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    public abstract void setImage();
    
    public abstract void backClick();
    
    public abstract void setImage(@org.jetbrains.annotations.NotNull()
    java.lang.String str);
}