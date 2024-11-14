package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020\u0006H\u0016J\b\u0010!\u001a\u00020\u0006H\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J\b\u0010&\u001a\u00020\u0006H\u0016J\b\u0010\'\u001a\u00020\u0006H\u0016J\u0010\u0010\'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0012H\u0016J\u0010\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0012H\u0016J\b\u0010+\u001a\u00020\u0006H\u0016J\b\u0010,\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\b\u00a8\u0006-"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/viewmodel/impl/ProfileViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Luz/alpha/qandlidiabetstartup/presentation/detection/viewmodel/ProfileViewModel;", "()V", "aboutUsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getAboutUsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "backLiveData", "getBackLiveData", "changeImageLiveData", "getChangeImageLiveData", "changeNameLiveData", "getChangeNameLiveData", "contactLiveData", "getContactLiveData", "imageLiveData", "", "getImageLiveData", "informationLiveData", "getInformationLiveData", "languageLiveData", "getLanguageLiveData", "nameLiveData", "getNameLiveData", "shareLiveData", "getShareLiveData", "sharedPreference", "Luz/alpha/qandlidiabetstartup/data/local/SharedPref;", "supportLiveData", "getSupportLiveData", "aboutClicked", "backClick", "changeImage", "changeName", "helpClicked", "info", "language", "setImage", "str", "setName", "name", "shareApp", "supportClicked", "app_debug"})
public final class ProfileViewModelImpl extends androidx.lifecycle.ViewModel implements uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.ProfileViewModel {
    @org.jetbrains.annotations.NotNull()
    private final uz.alpha.qandlidiabetstartup.data.local.SharedPref sharedPreference = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> nameLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> imageLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> backLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> changeNameLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> changeImageLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> aboutUsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> contactLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> supportLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> languageLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> informationLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> shareLiveData = null;
    
    public ProfileViewModelImpl() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<java.lang.String> getNameLiveData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<java.lang.String> getImageLiveData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getBackLiveData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getChangeNameLiveData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getChangeImageLiveData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getAboutUsLiveData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getContactLiveData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getSupportLiveData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getLanguageLiveData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getInformationLiveData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getShareLiveData() {
        return null;
    }
    
    @java.lang.Override()
    public void shareApp() {
    }
    
    @java.lang.Override()
    public void language() {
    }
    
    @java.lang.Override()
    public void info() {
    }
    
    @java.lang.Override()
    public void changeName() {
    }
    
    @java.lang.Override()
    public void changeImage() {
    }
    
    @java.lang.Override()
    public void aboutClicked() {
    }
    
    @java.lang.Override()
    public void helpClicked() {
    }
    
    @java.lang.Override()
    public void supportClicked() {
    }
    
    @java.lang.Override()
    public void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @java.lang.Override()
    public void setImage() {
    }
    
    @java.lang.Override()
    public void setImage(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
    }
    
    @java.lang.Override()
    public void backClick() {
    }
}