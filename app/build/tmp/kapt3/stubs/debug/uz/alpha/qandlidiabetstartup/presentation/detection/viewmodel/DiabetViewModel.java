package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\bf\u0018\u00002\u00020\u0001J\u0088\u0001\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006 \u00c0\u0006\u0001"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/viewmodel/DiabetViewModel;", "", "errorMessageLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorMessageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "notConnectionLiveData", "", "getNotConnectionLiveData", "progressLiveData", "", "getProgressLiveData", "succesLiveData", "getSuccesLiveData", "sendData", "age", "gender", "polyuria", "polydipsia", "sudden_weight_loss", "weakness", "polyphagia", "genital_thrush", "visual_blurring", "itching", "irritability", "delayed_healing", "partial_paresis", "muscle_stiffness", "alopecia", "obesity", "app_debug"})
public abstract interface DiabetViewModel {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.MutableLiveData<java.lang.String> getErrorMessageLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.MutableLiveData<kotlin.Unit> getNotConnectionLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.MutableLiveData<java.lang.String> getSuccesLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.MutableLiveData<java.lang.Boolean> getProgressLiveData();
    
    public abstract void sendData(@org.jetbrains.annotations.NotNull()
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
    java.lang.String obesity);
}