package io.ljani.streamsupport.issue254;

import java8.util.concurrent.CompletableFuture;

public class MyFuture<T> extends CompletableFuture<T> {
    public MyFuture(int c) {
    }
}
