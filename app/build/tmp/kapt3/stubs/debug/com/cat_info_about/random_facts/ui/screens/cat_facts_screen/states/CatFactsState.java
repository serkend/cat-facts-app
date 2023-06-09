package com.cat_info_about.random_facts.ui.screens.cat_facts_screen.states;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/cat_info_about/random_facts/ui/screens/cat_facts_screen/states/CatFactsState;", "", "()V", "Error", "Loading", "Success", "Lcom/cat_info_about/random_facts/ui/screens/cat_facts_screen/states/CatFactsState$Error;", "Lcom/cat_info_about/random_facts/ui/screens/cat_facts_screen/states/CatFactsState$Loading;", "Lcom/cat_info_about/random_facts/ui/screens/cat_facts_screen/states/CatFactsState$Success;", "app_debug"})
public abstract class CatFactsState {
    
    private CatFactsState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/cat_info_about/random_facts/ui/screens/cat_facts_screen/states/CatFactsState$Loading;", "Lcom/cat_info_about/random_facts/ui/screens/cat_facts_screen/states/CatFactsState;", "()V", "app_debug"})
    public static final class Loading extends com.cat_info_about.random_facts.ui.screens.cat_facts_screen.states.CatFactsState {
        @org.jetbrains.annotations.NotNull()
        public static final com.cat_info_about.random_facts.ui.screens.cat_facts_screen.states.CatFactsState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/cat_info_about/random_facts/ui/screens/cat_facts_screen/states/CatFactsState$Success;", "Lcom/cat_info_about/random_facts/ui/screens/cat_facts_screen/states/CatFactsState;", "data", "", "Lcom/cat_info_about/random_facts/data/network/model/CatFactModel;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success extends com.cat_info_about.random_facts.ui.screens.cat_facts_screen.states.CatFactsState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.cat_info_about.random_facts.data.network.model.CatFactModel> data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.cat_info_about.random_facts.ui.screens.cat_facts_screen.states.CatFactsState.Success copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.cat_info_about.random_facts.data.network.model.CatFactModel> data) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.NotNull()
        java.util.List<com.cat_info_about.random_facts.data.network.model.CatFactModel> data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.cat_info_about.random_facts.data.network.model.CatFactModel> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.cat_info_about.random_facts.data.network.model.CatFactModel> getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/cat_info_about/random_facts/ui/screens/cat_facts_screen/states/CatFactsState$Error;", "Lcom/cat_info_about/random_facts/ui/screens/cat_facts_screen/states/CatFactsState;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Error extends com.cat_info_about.random_facts.ui.screens.cat_facts_screen.states.CatFactsState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.cat_info_about.random_facts.ui.screens.cat_facts_screen.states.CatFactsState.Error copy(@org.jetbrains.annotations.NotNull()
        java.lang.String error) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.String error) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
    }
}