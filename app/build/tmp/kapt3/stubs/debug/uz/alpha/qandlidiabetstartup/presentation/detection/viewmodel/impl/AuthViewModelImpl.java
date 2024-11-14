package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003Jh\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\b\u00a8\u0006!"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/viewmodel/impl/AuthViewModelImpl;", "Luz/alpha/qandlidiabetstartup/presentation/detection/viewmodel/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "errorMessageSharedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getErrorMessageSharedFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "notConnectionSharedFlow", "", "getNotConnectionSharedFlow", "progressSharedFlow", "", "getProgressSharedFlow", "repository", "Luz/alpha/qandlidiabetstartup/domain/repository/impl/AuthRepositoryImpl;", "succesSharedFlow", "Luz/alpha/qandlidiabetstartup/data/remote/response/AuthResponse;", "getSuccesSharedFlow", "sendData", "imya", "familiya", "otchestvo", "email", "work", "phone", "mobile_phone", "doljnost", "apps_name", "user_device", "role_name", "pass", "app_debug"})
public final class AuthViewModelImpl extends androidx.lifecycle.ViewModel implements uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.AuthViewModel {
    @org.jetbrains.annotations.NotNull()
    private final uz.alpha.qandlidiabetstartup.domain.repository.impl.AuthRepositoryImpl repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> errorMessageSharedFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> notConnectionSharedFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<uz.alpha.qandlidiabetstartup.data.remote.response.AuthResponse> succesSharedFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Boolean> progressSharedFlow = null;
    
    public AuthViewModelImpl() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> getErrorMessageSharedFlow() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getNotConnectionSharedFlow() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.MutableSharedFlow<uz.alpha.qandlidiabetstartup.data.remote.response.AuthResponse> getSuccesSharedFlow() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Boolean> getProgressSharedFlow() {
        return null;
    }
    
    @java.lang.Override()
    public void sendData(@org.jetbrains.annotations.NotNull()
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
    java.lang.String pass) {
    }
}