package uz.alpha.qandlidiabetstartup.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\bf\u0018\u00002\u00020\u0001Jt\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0013\u00c0\u0006\u0001"}, d2 = {"Luz/alpha/qandlidiabetstartup/domain/repository/AuthRepository;", "", "sendData", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Luz/alpha/qandlidiabetstartup/data/remote/response/AuthResponse;", "imya", "", "familiya", "otchestvo", "email", "work", "phone", "mobile_phone", "doljnost", "apps_name", "user_device", "role_name", "pass", "app_debug"})
public abstract interface AuthRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<uz.alpha.qandlidiabetstartup.data.remote.response.AuthResponse>> sendData(@org.jetbrains.annotations.NotNull()
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