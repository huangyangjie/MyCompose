package com.example.mycompose.navigation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/example/mycompose/navigation/Routes;", "", "path", "", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "Detail", "Home", "Profile", "Lcom/example/mycompose/navigation/Routes$Detail;", "Lcom/example/mycompose/navigation/Routes$Home;", "Lcom/example/mycompose/navigation/Routes$Profile;", "app_debug"})
public abstract class Routes {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String path = null;
    
    private Routes(java.lang.String path) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPath() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/mycompose/navigation/Routes$Detail;", "Lcom/example/mycompose/navigation/Routes;", "()V", "app_debug"})
    public static final class Detail extends com.example.mycompose.navigation.Routes {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.mycompose.navigation.Routes.Detail INSTANCE = null;
        
        private Detail() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/mycompose/navigation/Routes$Home;", "Lcom/example/mycompose/navigation/Routes;", "()V", "app_debug"})
    public static final class Home extends com.example.mycompose.navigation.Routes {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.mycompose.navigation.Routes.Home INSTANCE = null;
        
        private Home() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/mycompose/navigation/Routes$Profile;", "Lcom/example/mycompose/navigation/Routes;", "()V", "app_debug"})
    public static final class Profile extends com.example.mycompose.navigation.Routes {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.mycompose.navigation.Routes.Profile INSTANCE = null;
        
        private Profile() {
        }
    }
}