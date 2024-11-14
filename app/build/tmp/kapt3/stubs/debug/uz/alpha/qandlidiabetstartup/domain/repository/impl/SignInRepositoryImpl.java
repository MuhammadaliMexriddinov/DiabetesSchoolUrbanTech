package uz.alpha.qandlidiabetstartup.domain.repository.impl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Luz/alpha/qandlidiabetstartup/domain/repository/impl/SignInRepositoryImpl;", "Luz/alpha/qandlidiabetstartup/domain/repository/SignInRepository;", "()V", "api1", "Luz/alpha/qandlidiabetstartup/data/remote/api/API;", "sendData", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Luz/alpha/qandlidiabetstartup/data/remote/response/SignInResponse;", "user_device", "", "code", "pass", "name_app", "app_debug"})
public final class SignInRepositoryImpl implements uz.alpha.qandlidiabetstartup.domain.repository.SignInRepository {
    @org.jetbrains.annotations.NotNull()
    private final uz.alpha.qandlidiabetstartup.data.remote.api.API api1 = null;
    
    public SignInRepositoryImpl() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<kotlin.Result<uz.alpha.qandlidiabetstartup.data.remote.response.SignInResponse>> sendData(@org.jetbrains.annotations.NotNull()
    java.lang.String user_device, @org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.NotNull()
    java.lang.String name_app) {
        return null;
    }
}