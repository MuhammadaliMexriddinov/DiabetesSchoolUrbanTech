package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001Jh\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u001d\u00c0\u0006\u0001"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/viewmodel/AuthViewModel;", "", "errorMessageSharedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getErrorMessageSharedFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "notConnectionSharedFlow", "", "getNotConnectionSharedFlow", "progressSharedFlow", "", "getProgressSharedFlow", "succesSharedFlow", "Luz/alpha/qandlidiabetstartup/data/remote/response/AuthResponse;", "getSuccesSharedFlow", "sendData", "imya", "familiya", "otchestvo", "email", "work", "phone", "mobile_phone", "doljnost", "apps_name", "user_device", "role_name", "pass", "app_debug"})
public abstract interface AuthViewModel {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> getErrorMessageSharedFlow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getNotConnectionSharedFlow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.MutableSharedFlow<uz.alpha.qandlidiabetstartup.data.remote.response.AuthResponse> getSuccesSharedFlow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Boolean> getProgressSharedFlow();
    
    public abstract void sendData(@org.jetbrains.annotations.NotNull()
    java.lang.String imya, @org.jetbrains.annotations.NotNull()
    java.lang.String familiya, @org.jetbrains.annotations.NotNull()
    java.lang.String otchestvo, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String work, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String mobile_phone, @org.jetbrains.annotations.NotNull()
    java.lang.String doljnost, @org.jetbrains.annotations.NotNull()
    java.lang.String apps_name, @org.jetbrains.annotations.NotNull()
    java.lang.String user_device, @org.jetbrains.annotations.NotNull()
    java.lang.String role_name, @org.jetbrains.annotations.NotNull()
    java.lang.String pass);
}