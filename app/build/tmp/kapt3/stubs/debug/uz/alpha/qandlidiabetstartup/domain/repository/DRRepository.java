package uz.alpha.qandlidiabetstartup.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\b\u00c0\u0006\u0001"}, d2 = {"Luz/alpha/qandlidiabetstartup/domain/repository/DRRepository;", "", "uploadImage", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "image", "Lokhttp3/MultipartBody$Part;", "app_debug"})
public abstract interface DRRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> uploadImage(@org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part image);
}