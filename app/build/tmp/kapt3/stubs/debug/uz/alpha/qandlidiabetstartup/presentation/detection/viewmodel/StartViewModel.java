package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u000e\u00c0\u0006\u0001"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/viewmodel/StartViewModel;", "", "openDRFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "", "getOpenDRFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "openDiabetFlow", "getOpenDiabetFlow", "openFindRiscFlow", "getOpenFindRiscFlow", "openDRScreen", "openDiabetScreen", "openFindRiscScreen", "app_debug"})
public abstract interface StartViewModel {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> getOpenDiabetFlow();
    
    public abstract void openDiabetScreen();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> getOpenFindRiscFlow();
    
    public abstract void openFindRiscScreen();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> getOpenDRFlow();
    
    public abstract void openDRScreen();
}