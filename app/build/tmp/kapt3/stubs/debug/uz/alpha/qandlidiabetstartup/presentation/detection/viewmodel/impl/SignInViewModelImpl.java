package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J(\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\b\u00a8\u0006\u0019"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/viewmodel/impl/SignInViewModelImpl;", "Luz/alpha/qandlidiabetstartup/presentation/detection/viewmodel/SignInViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "errorMessageSharedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getErrorMessageSharedFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "notConnectionSharedFlow", "", "getNotConnectionSharedFlow", "progressSharedFlow", "", "getProgressSharedFlow", "repository", "Luz/alpha/qandlidiabetstartup/domain/repository/impl/SignInRepositoryImpl;", "succesSharedFlow", "Luz/alpha/qandlidiabetstartup/data/remote/response/SignInResponse;", "getSuccesSharedFlow", "sendData", "user_device", "login", "pass", "name_app", "app_debug"})
public final class SignInViewModelImpl extends androidx.lifecycle.ViewModel implements uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.SignInViewModel {
    @org.jetbrains.annotations.NotNull()
    private final uz.alpha.qandlidiabetstartup.domain.repository.impl.SignInRepositoryImpl repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> errorMessageSharedFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> notConnectionSharedFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<uz.alpha.qandlidiabetstartup.data.remote.response.SignInResponse> succesSharedFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Boolean> progressSharedFlow = null;
    
    public SignInViewModelImpl() {
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
    public kotlinx.coroutines.flow.MutableSharedFlow<uz.alpha.qandlidiabetstartup.data.remote.response.SignInResponse> getSuccesSharedFlow() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Boolean> getProgressSharedFlow() {
        return null;
    }
    
    @java.lang.Override()
    public void sendData(@org.jetbrains.annotations.NotNull()
    java.lang.String user_device, @org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.NotNull()
    java.lang.String name_app) {
    }
}