package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\t\u00c0\u0006\u0001"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/viewmodel/MainPageViewModel;", "", "eventSharedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getEventSharedFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "manageState", "", "app_debug"})
public abstract interface MainPageViewModel {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Boolean> getEventSharedFlow();
    
    public abstract void manageState();
}