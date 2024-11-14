package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0088\u0001\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\b\u00a8\u0006$"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/viewmodel/impl/DiabetViewModelImpl;", "Luz/alpha/qandlidiabetstartup/presentation/detection/viewmodel/DiabetViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "errorMessageLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorMessageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "notConnectionLiveData", "", "getNotConnectionLiveData", "progressLiveData", "", "getProgressLiveData", "repository", "Luz/alpha/qandlidiabetstartup/domain/repository/impl/DiabeteRepositoryImpl;", "succesLiveData", "getSuccesLiveData", "sendData", "age", "gender", "polyuria", "polydipsia", "sudden_weight_loss", "weakness", "polyphagia", "genital_thrush", "visual_blurring", "itching", "irritability", "delayed_healing", "partial_paresis", "muscle_stiffness", "alopecia", "obesity", "app_debug"})
public final class DiabetViewModelImpl extends androidx.lifecycle.ViewModel implements uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.DiabetViewModel {
    @org.jetbrains.annotations.NotNull()
    private final uz.alpha.qandlidiabetstartup.domain.repository.impl.DiabeteRepositoryImpl repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorMessageLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> notConnectionLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> succesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> progressLiveData = null;
    
    public DiabetViewModelImpl() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<java.lang.String> getErrorMessageLiveData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getNotConnectionLiveData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<java.lang.String> getSuccesLiveData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<java.lang.Boolean> getProgressLiveData() {
        return null;
    }
    
    @java.lang.Override()
    public void sendData(@org.jetbrains.annotations.NotNull()
    java.lang.String age, @org.jetbrains.annotations.NotNull()
    java.lang.String gender, @org.jetbrains.annotations.NotNull()
    java.lang.String polyuria, @org.jetbrains.annotations.NotNull()
    java.lang.String polydipsia, @org.jetbrains.annotations.NotNull()
    java.lang.String sudden_weight_loss, @org.jetbrains.annotations.NotNull()
    java.lang.String weakness, @org.jetbrains.annotations.NotNull()
    java.lang.String polyphagia, @org.jetbrains.annotations.NotNull()
    java.lang.String genital_thrush, @org.jetbrains.annotations.NotNull()
    java.lang.String visual_blurring, @org.jetbrains.annotations.NotNull()
    java.lang.String itching, @org.jetbrains.annotations.NotNull()
    java.lang.String irritability, @org.jetbrains.annotations.NotNull()
    java.lang.String delayed_healing, @org.jetbrains.annotations.NotNull()
    java.lang.String partial_paresis, @org.jetbrains.annotations.NotNull()
    java.lang.String muscle_stiffness, @org.jetbrains.annotations.NotNull()
    java.lang.String alopecia, @org.jetbrains.annotations.NotNull()
    java.lang.String obesity) {
    }
}