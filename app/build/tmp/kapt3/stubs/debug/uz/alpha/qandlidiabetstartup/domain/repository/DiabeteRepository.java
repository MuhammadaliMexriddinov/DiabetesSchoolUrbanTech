package uz.alpha.qandlidiabetstartup.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J\u0094\u0001\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0016\u00c0\u0006\u0001"}, d2 = {"Luz/alpha/qandlidiabetstartup/domain/repository/DiabeteRepository;", "", "sendData", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "age", "gender", "polyuria", "polydipsia", "sudden_weight_loss", "weakness", "polyphagia", "genital_thrush", "visual_blurring", "itching", "irritability", "delayed_healing", "partial_paresis", "muscle_stiffness", "alopecia", "obesity", "app_debug"})
public abstract interface DiabeteRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> sendData(@org.jetbrains.annotations.NotNull()
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